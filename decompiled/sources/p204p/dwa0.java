package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dwa0 extends j9g1 {

    /* JADX INFO: renamed from: e */
    public final String f53651e;

    /* JADX INFO: renamed from: f */
    public final String f53652f;

    public dwa0(String str, String str2) {
        this.f53651e = str;
        this.f53652f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwa0)) {
            return false;
        }
        dwa0 dwa0Var = (dwa0) obj;
        return wj50.m88271j(this.f53651e, dwa0Var.f53651e) && wj50.m88271j(this.f53652f, dwa0Var.f53652f);
    }

    public final int hashCode() {
        return this.f53652f.hashCode() + (this.f53651e.hashCode() * 31);
    }
}
