//Inheritance (pewarisan)
public class CD extends product {
        private String artist;
        private int numsong;
        private String label;

        public CD() {
            super(); //constructor dari superclass
            artist = "Lady Gaga";
            numsong = 10;
            label = "Sony Music";
        }

        public String getArtist() {
            return this.artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public int getNumsong() {
            return this.numsong;
        }

        public void setNumsong(int numsong) {
            this.numsong = numsong;
        }

        public String getLabel() {
            return this.label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

       //Override
       public void print() {
          super.print();
          System.out.println("Artist\t\t:" + artist);
          System.out.println("Total Song\t:" + numsong);
          System.out.println("Label\t\t:" + label);
       }
        
    }

   
        
    

