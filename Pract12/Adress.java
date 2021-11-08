package Pract12;

import java.util.StringTokenizer;

class Address {
    private String country, region, city, street, house, housing, flat;

    public Address(String stringToParse, boolean multiDivider){
        if(stringToParse == null) throw new NullPointerException();
        String[] s;
        if(multiDivider){
            StringTokenizer st = new StringTokenizer(stringToParse, ",.;");
            s = new String[st.countTokens()];
            int i = 0;
            while(st.hasMoreTokens()) s[i++] = st.nextToken();
        }else{
            s = stringToParse.split(",");
        }

        if(s.length < 7) throw new IllegalArgumentException("Строка содержит недостаточно данных!");
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();
    }

    @Override
    public String toString() {
        return "Адрес: " +
                "страна='" + country + '\'' +
                ", регион='" + region + '\'' +
                ", город='" + city + '\'' +
                ", улица='" + street + '\'' +
                ", дом='" + house + '\'' +
                ", корпус='" + housing + '\'' +
                ", квартира='" + flat + '\'';
    }

    public static void main(String[] args) {
        Address a1 = new Address("Россия, МО, Москва, Севастопольский проспект, 78, 7, 28", false);
        Address a2 = new Address("Россия, Ленинградская область, Санкт-Петербург, Невсий проспект, 234, 1, 23", true);
        Address a3 = new Address("США, Нью-Йорк, Нью-Йорк, Вуд стрит, 9211, 1, 32", false);
        Address a4 = new Address("Россия, Калининградская область, Калининград, Серпуховская, 21, 1, 65", true);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

    }
}
