package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h670 implements j670 {

    /* JADX INFO: renamed from: a */
    public final String f88022a;

    /* JADX INFO: renamed from: b */
    public final String f88023b;

    public h670(String str, String str2) {
        this.f88022a = str;
        this.f88023b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h670)) {
            return false;
        }
        h670 h670Var = (h670) obj;
        return wj50.m88271j(this.f88022a, h670Var.f88022a) && wj50.m88271j(this.f88023b, h670Var.f88023b);
    }

    public final int hashCode() {
        return this.f88023b.hashCode() + (this.f88022a.hashCode() * 31);
    }
}
