public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<>();
        HashMap<String, List<String>> hashTable = new HashMap<>();

        for(String str : strs) {
            String[] tempString = str.split("");
            Arrays.sort(tempString);
            List<String> tempListString = hashTable.getOrDefault(String.join("",tempString), null);
            if ( tempListString == null ) {
                tempListString = new ArrayList<>();
            }
            tempListString.add(str);

            hashTable.put(String.join("",tempString) , tempListString);

        }

        for(String key : hashTable.keySet()) {
            results.add(hashTable.get(key));
        }
        return results;
}