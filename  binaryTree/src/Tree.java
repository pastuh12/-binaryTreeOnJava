public class Tree {
    Leaf el;
    Tree R;
    Tree L;
    Tree(Leaf el) {
        this.el = el;
    }

    public void setR(Tree r) {
        R = r;
    }

    public void setL(Tree l) {
        L = l;
    }

    public Leaf getEl() {
        return el;
    }

    public Tree getR() {
        return R;
    }

    public Tree getL() {
        return L;
    }

    boolean compare(Leaf el2){
        int long1;
        int char1, char2;
        int res = 0;
        int whoIsShorter = 0;
        boolean f = false;
        if (this.getEl().getEngWord().equalsIgnoreCase(el2.getEngWord())){
            f = true;
        } else {
            if (this.getEl().LongEngWord() > el2.LongEngWord()) {
                long1 = el2.LongEngWord();
                whoIsShorter = 2;
            } else {
                long1 = this.getEl().LongEngWord();
                whoIsShorter = 1;
            }
            for (int i = 0; i < long1; i++) {
                if ((char1 = (int) this.getEl().getChar(i)) < (char2 = (int) el2.getChar(i))) {
                    res = 1;
                    f = true;
                } else if ((char1 = (int) this.getEl().getChar(i)) < (char2 = (int) el2.getChar(i))) {
                    res = 2;
                    f = false;
                }
            }
            if (res == 0)
                if (whoIsShorter == 1)
                    f = true;
                else f = false;

        }
        return f;
    }

    void add(Tree t, Leaf x) {
        if (t.compare((x))) {
            if (t.getL() == null){ // t.getL() == t.L
                Tree l = new Tree(x);
                t.setL(l);
            } else t.add(t.getL(), x);
        }
        else {
            if (t.getR() == null){
                Tree r = new Tree(x);
                t.setR(r);
            } else t.add(t.getR(), x);
        }

    }

    public String Search (Tree t, String key){
        String value = "";
        if (t != null){
            if (t.getEl().getEngWord().equalsIgnoreCase(key)){
                value = t.getEl().getRusWord();
                return value;
            } else {
                value = t.Search(t.getR(), key) + t.Search(t.getL(), key);
            }
        }
        return value;


    }
//
//
//
//    public void Delete(Tree x){
//
//    }


}
