package Model;

import interfaces.Contohinterface;

public class Perhitungan implements Contohinterface {
    private int a;
    private int b;
    private int hasil;

    //Method Return Hasil Tambah dengan parameter
    public Perhitungan (int a, int b, int _hasil){
        this.a = a;
        this.b = b;
        _hasil = 0;
        this.hasil =_hasil;
        PrintJudulClass("Print Judul Dalam Method Perching");
    }

    private void PrintJudulClass(String judul){System.out.println(judul);
    }

    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("Judul Menggunakan Interfaces");
    }

    @Override
    public void HitungTambah() {
        // TODO Auto-generated method stub
        this.hasil=this.a + this.b;

    }


    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
        this.hasil=this.a * this.b;
    }
    //Method Return dari hasiltambah dengan parameter
    public int hasiltambah(int a1,int b2){
        this.a = a1;
        this.b = b2;
        HitungTambah();
        return this.hasil;
    }

    //Method return dari hasilkali
    public int hasilkali(int _a,int _b){
        this.a = _a;
        this.b = _b;
        HitungKali();
        return this.hasil;
    }
}


