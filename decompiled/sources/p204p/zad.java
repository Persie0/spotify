package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zad implements abd {

    /* JADX INFO: renamed from: a */
    public final int f281039a;

    /* JADX INFO: renamed from: b */
    public final int f281040b;

    public zad(int i, int i2) {
        this.f281039a = i;
        this.f281040b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zad)) {
            return false;
        }
        zad zadVar = (zad) obj;
        return this.f281039a == zadVar.f281039a && this.f281040b == zadVar.f281040b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f281040b) + (edb.m38547C(this.f281039a) * 31);
    }
}
