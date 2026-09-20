package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j9j extends k9j {

    /* JADX INFO: renamed from: a */
    public final int f110185a;

    /* JADX INFO: renamed from: b */
    public final String f110186b;

    public j9j(int i, String str) {
        this.f110185a = i;
        this.f110186b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9j)) {
            return false;
        }
        j9j j9jVar = (j9j) obj;
        return this.f110185a == j9jVar.f110185a && wj50.m88271j(this.f110186b, j9jVar.f110186b);
    }

    public final int hashCode() {
        return this.f110186b.hashCode() + (Integer.hashCode(this.f110185a) * 31);
    }
}
