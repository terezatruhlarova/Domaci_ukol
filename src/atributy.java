
    enum TypZvirete {
        KOCKA,
        PES,
        PTAK,
        JINE
    }

    class Zvire {
        private String jmeno;
        private int vek;
        private TypZvirete typ;


        public Zvire(String jmeno, int vek, TypZvirete typ) {
            this.jmeno = jmeno;
            this.vek = vek;
            this.typ = typ;
        }


        public String getJmeno() {
            return jmeno;
        }

        public int getVek() {
            return vek;
        }

        public TypZvirete getTyp() {
            return typ;
        }
    }


