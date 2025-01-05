package DataMing_ID3;

/**
 * ID3决策树分类算法测试场景类
 * @author lyq
 *
 */
public class Client {
	public static void main(String[] args){
		System.out.println(System.getProperty("user.dir"));//user.dir指定了当前的路径
		String filePath =System.getProperty("user.dir")+ "\\out\\production\\Classification\\DataMing_ID3\\input.txt";
		
		ID3Tool tool = new ID3Tool(filePath);
		tool.startBuildingTree(true);
	}
}
