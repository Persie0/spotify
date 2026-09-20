package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ac30 {

    /* JADX INFO: renamed from: a */
    public final String f14230a;

    /* JADX INFO: renamed from: b */
    public final String f14231b;

    public ac30(String str, String str2) {
        this.f14230a = str;
        this.f14231b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac30)) {
            return false;
        }
        ac30 ac30Var = (ac30) obj;
        return wj50.m88271j(this.f14230a, ac30Var.f14230a) && wj50.m88271j(this.f14231b, ac30Var.f14231b);
    }

    public final int hashCode() {
        return this.f14231b.hashCode() + (this.f14230a.hashCode() * 31);
    }
}
