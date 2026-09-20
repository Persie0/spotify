package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g400 {

    /* JADX INFO: renamed from: a */
    public final String f76309a;

    /* JADX INFO: renamed from: b */
    public final String f76310b;

    public g400(String str, String str2) {
        this.f76309a = str;
        this.f76310b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g400)) {
            return false;
        }
        g400 g400Var = (g400) obj;
        return wj50.m88271j(this.f76309a, g400Var.f76309a) && wj50.m88271j(this.f76310b, g400Var.f76310b);
    }

    public final int hashCode() {
        return this.f76310b.hashCode() + (this.f76309a.hashCode() * 31);
    }
}
