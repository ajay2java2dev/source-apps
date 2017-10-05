class Example {     
    static void main(String[] args) {        
        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"];      
        println(mp.containsKey("TopicName"));        
        println(mp.containsKey("Topic"));

        def arr = []
        def arr1 = [1,2,3,4,5]
        def arr2 = [5,4,3,2,1]
        
        def mp1 = [:]
        for (int i = 0 ; i < arr1.size() ; i++) {
            println arr1[i]
            mp1.put ("Index_"+i,arr1[i]);
        }

        def mp2 = [:]
        for (int i = 0 ; i < arr2.size() ; i++) {
            println arr2[i]
            mp2.put ("Index_"+i,arr2[i]);
        }

        arr.add(mp1)
        arr.add(mp2)    
        println arr
    }  

}?