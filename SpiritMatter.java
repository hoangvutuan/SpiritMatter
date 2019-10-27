import java.util.Set;
import java.util.HashSet;
import java.util.Date;


public class SpiritMatter {
    public static class Spirit {
        Set<String> spirits = new HashSet<>();
        public Spirit(String[] arr) {
            for (String str : arr) {
                this.spirits.add(str);
            }
        }
    }

    public static class Matter {
        int n = 7;
        Spirit[][] matter = new Spirit[n][n];
        public Matter() {

        }

    }

    public static class History {
        Matter[][] matters = new Matter[7][7];
        Date startDate;
        Date endDate;
        public History() {

        }
    }

    private static Spirit[] joinRandom(Spirit[] arr) {
        Spirit[] res = new Spirit[7];
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        String[] spiritReligionsArr = new String[]{"Catholic", "Buddist", "NoReligion", "Veda"};
        String[] spiritCountryCulturesArr = new String[]{"India", "US", "Thailand", "Korea"};
        Spirit spiritReligions = new Spirit(spiritReligionsArr);
        Spirit spiritCountryCutures = new Spirit(spiritCountryCulturesArr);
        String[] spiritTraumaArr = new String[] {"Disppointed", "Worry", "Sad", "Angry"};
        String[] spiritAffectedPeopleArr = new String[] {"Jesus",
                "MotherTeresa", "Hitler", "BillGate", "Laozi", "Maharishi", "BillGate","WarrenBuffet"};
        String[] spiritFactorsArr = new String[] {"Money", "Fame", "Power", "Love", "Sex", "Politic", "Goal1", "Goal2"};
        String[] spiritPureConsicousnessArr = new String[] {"Happy", "Foriveness", "Love"};
        Spirit  spiritAffectedPeople = new Spirit(spiritAffectedPeopleArr);
        Spirit  spiritFactors = new Spirit(spiritFactorsArr);
        Spirit spiritTrauma = new Spirit(spiritTraumaArr);
        Spirit spiritPureConsicousness = new Spirit(spiritPureConsicousnessArr);
        Spirit[] arrSpirit = new Spirit[]{spiritReligions, spiritCountryCutures};
        Spirit[] spiritJoin1 = joinRandom(arrSpirit);
        Spirit[][] matter = new Spirit[490][490];
        //...
        //...
    }
}
