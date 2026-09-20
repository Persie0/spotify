package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rde1 {

    /* JADX INFO: renamed from: a */
    public final String f198109a;

    /* JADX INFO: renamed from: b */
    public final fjr0 f198110b;

    public rde1(String str, fjr0 fjr0Var) {
        this.f198109a = str;
        this.f198110b = fjr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rde1)) {
            return false;
        }
        rde1 rde1Var = (rde1) obj;
        return wj50.m88271j(this.f198109a, rde1Var.f198109a) && wj50.m88271j(this.f198110b, rde1Var.f198110b);
    }

    public final int hashCode() {
        return this.f198110b.f70389a.hashCode() + (this.f198109a.hashCode() * 31);
    }
}
