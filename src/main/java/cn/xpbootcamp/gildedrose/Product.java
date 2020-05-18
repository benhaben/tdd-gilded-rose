package cn.xpbootcamp.gildedrose;

abstract public class Product {

    public final int MAX_QUALITY = 50;

    /**
     * 商品距离过期的天数
     */
    protected int sellIn;

    /**
     * 代表商品的价值
     */
    protected int quality;

    /**
     * 经过时间
     */
    protected int dayPass;

    public Product(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    /**
     * 计算后的价值
     *
     * @return 价值
     */
    abstract public int getQuality();

    public int getSellIn() {
        return sellIn - dayPass;
    }

    public void passDay(int dayPass) {
        this.dayPass = dayPass;
    }

}
