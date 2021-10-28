package testpackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Sorts;

public class MongoDBTest {

	public static void main(String[] args) throws Throwable {
		System.out.println("Start MongoDB Testing!!");
		
		String client_url = "mongodb://admin:elqtlrmsjfadmin1!@125.138.183.62:40022/admin";

		MongoClient mongoClient = MongoClients.create(client_url);

		// db select
		MongoDatabase mongoDatabase = mongoClient.getDatabase("deep_signal_dataextraction");

		// collection select
		MongoCollection<Document> collection = mongoDatabase.getCollection("extraction_content");

		System.out.println("Success to connect MongoDB!!");
		
		Document findCondition = new Document();
//		findCondition.put("agentid", 473779);
//		findCondition.put("_id", new Document().append("$gt", new ObjectId("616784566e73290c5a9bb9f1")));
		findCondition.put("create_date", new Document().append("$gt", LocalDate.now() + " 00:00:00"));

		System.out.println("Start to find MongoDB!!");
		
		List<Document> findList = new ArrayList<>();
		collection.find(findCondition).sort(Sorts.ascending("_id")).into(findList);
		
		System.out.println("findList.size() - " + findList.size());

//		Path path = Paths.get(TestClass.class.getResource("/").getPath().substring(1) + "condition.txt");
//		Stream<String> lines = Files.lines(path);
//		String[] conditions = lines.collect(Collectors.joining(System.lineSeparator())).replace("\r", "").split("\n");
//		
//		for(String condition : conditions) {
//			String[] splitByTab = condition.split("\t");
//			
//			System.out.println(splitByTab[0] + "\t" + splitByTab[1]);
//			
//			Document findCondition = new Document();
//			findCondition.put("agentid", Integer.parseInt(splitByTab[0]));
//			findCondition.put("_id", new Document().append("$gt", new ObjectId(splitByTab[1])));
//			findCondition.put("create_date", new Document().append("$lt", LocalDate.now() + " 16:00:00"));
//			
//			List<Document> findList = new ArrayList<>();
//			collection.find(findCondition).sort(Sorts.ascending("_id")).into(findList);
//			
//			System.out.println(condition + " - " + findList.size());
//		}
		
		mongoClient.close();
	}

}
