
    class Lagu {
        String judul;
        Lagu next;

        public Lagu(String judul) {
            this.judul = judul;
            this.next = null;
        }
    }

    class DaftarPutar {
        private Lagu head;

        public DaftarPutar() {
            this.head = null;
        }


        public void addLagu(String title) {
            Lagu newLagu = new Lagu(title);
            if (head == null) {
                head = newLagu;
            } else {
                Lagu current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newLagu;
            }
        }

        public void displayPlaylist() {
            if (head != null) {
                System.out.println("playlist kosong.");
                return;
            }
            Lagu current = head;
            while (current != null) {
                System.out.println(current.judul);
                current = current.next;
            }
        }
    }
     class Main {
        public static void main(String[] args) {
            DaftarPutar playlist = new DaftarPutar();

            // Menambahkan lagu ke playlist
            playlist.addLagu("Lagu 1");
            playlist.addLagu("Lagu 2");
            playlist.addLagu("Lagu 3");

            // Menampilkan semua lagu dalam playlist
            System.out.println("Daftar Lagu dalam Playlist:");
            playlist.displayPlaylist();
        }
    }





