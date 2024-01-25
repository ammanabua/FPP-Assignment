package Assignment.Assignment6;

public class MyTable {
    private Entry[] entries;

    public MyTable(){
        entries = new Entry[26];
    }

    public String get(char c){
        int index = c - 'a';
        if (index >= 0 && index < 26 && entries[index] != null){
            return entries[index].getValue();
        }
        return null;
    }

    public void add(char c, String s){
        int index = c - 'a';
        if (index >= 0 && index < 26){
            entries[index] = new Entry(c, s);
        }
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();

        for(Entry entry: entries){
            if (entry != null){
                str.append(entry.toString()).append("\n");
            }
        }
        return str.toString();
    }


    private class Entry{
        char c;
        String str;

        Entry(char c, String str){
            this.c = c;
            this.str = str;
        }

        @Override
        public String toString(){
            return c + "->" + str;
        }

        public String getValue(){
            return str;
        }
    }
}
