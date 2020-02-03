package a_creational.builder_demo;

public class Human {

    //wymagane parametry
    private String SEX;
    private String NAME;
    private String AGE;

    //parametry opcjonalne
    private boolean didCommitSin;
    private boolean isWorshiper;


    public String getSEX() { return SEX; }
    public String getNAME() { return NAME; }
    public String getAGE() { return AGE; }
    public boolean isDidCommitSin() { return didCommitSin; }
    public boolean isWorshiper() { return isWorshiper; }

    private Human(HumanBuilder builder) {
        this.SEX = builder.SEX;
        this.NAME = builder.NAME;
        this.AGE = builder.AGE;
        this.didCommitSin = builder.didCommitSin;
        this.isWorshiper = builder.isWorshiper;
    }

    @Override
    public String toString() {
        return "Human{" +
                "SEX='" + SEX + '\'' +
                ", NAME='" + NAME + '\'' +
                ", AGE='" + AGE + '\'' +
                ", didCommitSin=" + didCommitSin +
                ", isWorshiper=" + isWorshiper +
                '}';
    }

    static class HumanBuilder{

        //wymagane parametry
        private String SEX;
        private String NAME;
        private String AGE;

        //parametry opcjonalne
        private boolean didCommitSin;
        private boolean isWorshiper;

        HumanBuilder(String SEX, String NAME, String AGE) {
            this.SEX = SEX;
            this.NAME = NAME;
            this.AGE = AGE;
        }

        HumanBuilder didCommitSin(boolean didCommitSin){
            this.didCommitSin = didCommitSin;
            return this;
        }

        HumanBuilder isWorshiper(boolean isWorshiper){
            this.isWorshiper = isWorshiper;
            return this;
        }

        public Human buid(){ return new Human(this);}


    }

}



