/**
 * 使用 Apache Common VFS 取回各式資源範例
 */
public class Ch3Coz1 {


    public static void main(String[] args){

        // 北捷列車到站資料 API
        // @see http://taipeicity.github.io/traffic_realtime/
        // @see http://data.taipei/opendata/datalist/datasetMeta?oid=6556e1e8-c908-42d5-b984-b3f7337b139b
//        String api = "http://data.taipei/opendata/datalist/apiAccess?scope=resourceAquire&rid=55ec6d6e-dc5c-4268-a725-d04cc262172b";

        //臺北市-大臺北地區捷運車站出入口
        String api = "http://data.taipei/opendata/datalist/apiAccess?scope=resourceAquire&rid=981c68fe-03bb-4d03-9f17-eca887273c5a";
        System.out.println("develop");
        // call remote api
        System.out.println(CrawlerPack.getFromRemote(api));

    }
}
