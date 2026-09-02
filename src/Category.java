public class Category {
    private String categories;   // String of what the category name is

    public static final Category History = new Category("History");
    public static final Category Reality_TV = new Category("Reality TV");
    public static final Category Art = new Category("Art");
    public static final Category Computers = new Category("Computers");


    public Category(String categories) {            // sets up category names ie history, reality tv
        this.categories = categories;
    }
    public String getCategories() {             // Category stores the categories and is called upon when needed
        return categories;
    }
}
