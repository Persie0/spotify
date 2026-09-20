package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eh40 implements ih40 {

    /* JADX INFO: renamed from: a */
    public final String f59498a;

    /* JADX INFO: renamed from: b */
    public final iv50 f59499b;

    public eh40(String str, iv50 iv50Var) {
        this.f59498a = str;
        this.f59499b = iv50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh40)) {
            return false;
        }
        eh40 eh40Var = (eh40) obj;
        return wj50.m88271j(this.f59498a, eh40Var.f59498a) && wj50.m88271j(this.f59499b, eh40Var.f59499b);
    }

    public final int hashCode() {
        return this.f59499b.hashCode() + (this.f59498a.hashCode() * 31);
    }
}
