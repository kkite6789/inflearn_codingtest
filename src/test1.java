public class test1 {
    public static void main(String[] args) {

        String svcStringText="<html> <head> </head> <body> <p><b>Question</b></p> <p>정확한 원인 분석을 위해서 질문에 답변해 주세요. 1. 발생한 문제는 어떤 현상인가요? 충전 안됨 2. 배터리 소모가 빨라졌을 때, 어떤 기능을 사용 중이었나요? 인터넷/SNS 3. 충전 문제가 생겼을 때, 어떠한 충전기를 사용하셨나요? 정품 유선 충전기 ERMS TEST </p><br> <p><b>Question_Time(GMT + 0)</b></p> <p>2023-03-16 02:02:53</p><br> <p><b>Build_No</b></p> <p>TP1A</p><br> <p><b>Device_Name</b></p> <p>Galaxy S21</p><br> <p><b>Model_No</b></p> <p>SM-G991N</p><br> <p><b>Network</b></p> <p>samsung/</p><br> <p><b>Release_No</b></p> <p>13</p><br> <p><b>App Name</b></p> <p>Samsung Members</p><br></body> </html>";

        String removeHtmlTag = svcStringText.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", "");

        System.out.println("svcStringText : [" + svcStringText + "]");
        System.out.println("removeHtmlTag : [" + removeHtmlTag + "]");
    }
}
