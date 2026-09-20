package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wkj {

    /* JADX INFO: renamed from: a */
    public final String f252251a;

    /* JADX INFO: renamed from: b */
    public final String f252252b;

    public wkj(String str, String str2) {
        this.f252251a = str;
        this.f252252b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkj)) {
            return false;
        }
        wkj wkjVar = (wkj) obj;
        return wj50.m88271j(this.f252251a, wkjVar.f252251a) && wj50.m88271j(this.f252252b, wkjVar.f252252b);
    }

    public final int hashCode() {
        return this.f252252b.hashCode() + (this.f252251a.hashCode() * 31);
    }
}
