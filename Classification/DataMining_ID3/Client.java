package DataMing_ID3;

/**
 * ID3�����������㷨���Գ�����
 * @author lyq
 *
 */
public class Client {
	public static void main(String[] args){
		System.out.println(System.getProperty("user.dir"));//user.dirָ���˵�ǰ��·��
		String filePath =System.getProperty("user.dir")+ "\\out\\production\\Classification\\DataMing_ID3\\input.txt";
		
		ID3Tool tool = new ID3Tool(filePath);
		tool.startBuildingTree(true);
	}
}
