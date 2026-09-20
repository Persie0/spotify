package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class g3k0 extends h3k0 {

    /* JADX INFO: renamed from: a */
    public final String f76225a;

    /* JADX INFO: renamed from: b */
    public final String f76226b;

    public g3k0(String str, String str2) {
        this.f76225a = str;
        this.f76226b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3k0)) {
            return false;
        }
        g3k0 g3k0Var = (g3k0) obj;
        return wj50.m88271j(this.f76225a, g3k0Var.f76225a) && wj50.m88271j(this.f76226b, g3k0Var.f76226b);
    }

    public final int hashCode() {
        return this.f76226b.hashCode() + (this.f76225a.hashCode() * 31);
    }
}
