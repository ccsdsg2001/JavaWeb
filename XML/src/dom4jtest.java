package XML.src;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @author cc
 * @date 2022年08月18日 15:32
 */
public class dom4jtest {
    @Test
    public void test1() throws DocumentException {
        //创建一个saxReader输入流,去读入xml配置文件,生成dom对象
        SAXReader saxReader = new SAXReader();

        Document read = saxReader.read("src/books.xml");

    }

    @Test
    public void test2() throws  Exception{
        //读取xml文件生成book类
        SAXReader saxReader = new SAXReader();
        //通过Document对象获取根元素
        Document read = saxReader.read("src/books.xml");
        Element rootElement = read.getRootElement();
        //通过根元素获取book标签对象
        //element和elements通过标签名查找子元素
        List<Element> book = rootElement.elements("book");
        //遍历,
        for(Element book1:book){
            //asxml()把标签对象转为字符串
            Element name = book1.element("name");
            //gettext():可以获取标签中的文本内容
            String text = name.getText();
            //直接获取指定标签中的文本内容
            String price = book1.elementText("price");
            System.out.println(price);

            new book("", "", "", "");
        }

    }
}
