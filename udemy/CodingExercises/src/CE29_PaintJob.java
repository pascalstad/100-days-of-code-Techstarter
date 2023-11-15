public class CE29_PaintJob {

    public static void main(String[] args) {

        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println();
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println();
        System.out.println(getBucketCount(-3.4, 1.5));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double bucketCount = (double) (width * height) / areaPerBucket;

        return (int) Math.ceil(bucketCount) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double bucketCount = (double) (width * height) / areaPerBucket;

        return (int) Math.ceil(bucketCount);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double bucketCount = (double) area / areaPerBucket;

        return (int) Math.ceil(bucketCount);
    }

    /*          other solutions

    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
    if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0) return -1;
    return (int)Math.ceil((height*width)/areaPerBucket)-extraBuckets;
    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket,0);
    }
    public static int getBucketCount(double area,double areaPerBucket){
        return getBucketCount(area,1,areaPerBucket);//area=width*height
    }

##########################################################################################


    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) return -1;
        return (int) Math.ceil(width*height/areaPerBucket-extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(width*height/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(area/areaPerBucket);
    }

#########################################################################################

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        return (width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) ? -1 : (int) Math.ceil(width*height/areaPerBucket-extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return (width<=0 || height<=0 || areaPerBucket<=0) ? -1 : (int) Math.ceil(width*height/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        return (area<=0 || areaPerBucket<=0) ? -1 : (int) Math.ceil(area/areaPerBucket);
    }

##########################################################################################


    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) return -1;
        return (int) Math.ceil(width*height/areaPerBucket-extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        // if(width<=0 || height<=0 || areaPerBucket<=0) return -1;
        // return (int) Math.ceil(width*height/areaPerBucket);
        return getBucketCount(width, height, areaPerBucket, 0); // call first method
    }

    public static int getBucketCount(double area, double areaPerBucket){
        // if(area<=0 || areaPerBucket<=0) return -1;
        // return (int) Math.ceil(area/areaPerBucket);
        return getBucketCount(area, 1, areaPerBucket, 0); // call first method where width*height = area is the same as area*1 = area
    }
     */
}
