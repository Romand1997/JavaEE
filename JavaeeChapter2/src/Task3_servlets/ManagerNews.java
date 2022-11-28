package Task3_servlets;

import java.util.ArrayList;

public class ManagerNews {
    private static ArrayList<News> news=new ArrayList<>();
    private static Long id=8L;
    static {
        news.add(new News(1L,"World's largest coloring book unveiled at Texas dog walking event","The event featured the release of Becoming Kaxan, a new children's book based on the life of Kaxan, the official 'spokesdog' of KXAN-TV, one of the event's sponsors.","Author: AldiYar","sport"));
        news.add(new News(2L,"World's largest coloring book unveiled at Texas dog walking event","The event featured the release of Becoming Kaxan, a new children's book based on the life of Kaxan, the official 'spokesdog' of KXAN-TV, one of the event's sponsors.","Author: AldiYar","culture"));
        news.add(new News(3L,"World's largest coloring book unveiled at Texas dog walking event","The event featured the release of Becoming Kaxan, a new children's book based on the life of Kaxan, the official 'spokesdog' of KXAN-TV, one of the event's sponsors.","Author: AldiYar","cinema"));
        news.add(new News(4L,"World's largest coloring book unveiled at Texas dog walking event","The event featured the release of Becoming Kaxan, a new children's book based on the life of Kaxan, the official 'spokesdog' of KXAN-TV, one of the event's sponsors.","Author: AldiYar","sport"));
        news.add(new News(5L,"World's largest coloring book unveiled at Texas dog walking event","The event featured the release of Becoming Kaxan, a new children's book based on the life of Kaxan, the official 'spokesdog' of KXAN-TV, one of the event's sponsors.","Author: AldiYar","culture"));
        news.add(new News(6L,"World's largest coloring book unveiled at Texas dog walking event","The event featured the release of Becoming Kaxan, a new children's book based on the life of Kaxan, the official 'spokesdog' of KXAN-TV, one of the event's sponsors.","Author: AldiYar","cinema"));
        news.add(new News(7L,"World's largest coloring book unveiled at Texas dog walking event","The event featured the release of Becoming Kaxan, a new children's book based on the life of Kaxan, the official 'spokesdog' of KXAN-TV, one of the event's sponsors.","Author: AldiYar","sport"));
    }
    public static ArrayList<News> getNews() {
    return news;
    }
    public static ArrayList<News> getNewsByCategory(String category){
        ArrayList<News> sortNews=new ArrayList<>();
        for (News novost: news){
            if (novost.getCategory().equals(category)){
                sortNews.add(novost);
            }
        }
        return sortNews;
    }
}
