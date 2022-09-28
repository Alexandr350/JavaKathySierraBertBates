import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;

public class PhraseOMatic {
    String[] wordListOne = {"круглосуточный","трех-звенный",
            "30000-футовый","взаимный","обоюдный выигрыш","фронтед",
            "на основе веб-технологий","проникающий","умный","шесть сигм",
            "метод критического пути","динамичный"};
    String[] wordListTwo = {"уполномоченный","трудный","чистый продукт",
            "орентированный","центральный","распределенный","кластеризированный",
            "фирменный","нестандартный ум","позиционированный","сетевой","сфокусированный",
            "использованный с выгодой","выровненный","нацеленный на","общий","совместный","ускоренный"};
    String[] getWordListThree = {"процесс","пункт разгрузки","выход из положения","тип структуры",
            "талант","подход","уровень завоеванного внимания","портал","период времени","обзор",
            "образец","пункт следования"};
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = getWordListThree.length;

    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);
    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + getWordListThree[rand3];

    public void  print(String phrase){
        System.out.println("Все, что нам нужно, - это " + phrase);
    }
}
