package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h150 {

    /* JADX INFO: renamed from: a */
    public final String f86516a;

    /* JADX INFO: renamed from: b */
    public final String f86517b;

    public h150(String str, String str2) {
        this.f86516a = str;
        this.f86517b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h150)) {
            return false;
        }
        h150 h150Var = (h150) obj;
        return wj50.m88271j(this.f86516a, h150Var.f86516a) && wj50.m88271j(this.f86517b, h150Var.f86517b);
    }

    public final int hashCode() {
        return this.f86517b.hashCode() + (this.f86516a.hashCode() * 31);
    }
}
