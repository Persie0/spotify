package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class guk0 {

    /* JADX INFO: renamed from: a */
    public final String f84499a;

    /* JADX INFO: renamed from: b */
    public final String f84500b;

    public guk0(String str, String str2) {
        this.f84499a = str;
        this.f84500b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guk0)) {
            return false;
        }
        guk0 guk0Var = (guk0) obj;
        return wj50.m88271j(this.f84499a, guk0Var.f84499a) && wj50.m88271j(this.f84500b, guk0Var.f84500b);
    }

    public final int hashCode() {
        return this.f84500b.hashCode() + (this.f84499a.hashCode() * 31);
    }
}
