package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ote1 {

    /* JADX INFO: renamed from: a */
    public final int f169049a;

    /* JADX INFO: renamed from: b */
    public final String f169050b;

    public ote1(int i, String str) {
        this.f169049a = i;
        this.f169050b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ote1)) {
            return false;
        }
        ote1 ote1Var = (ote1) obj;
        return this.f169049a == ote1Var.f169049a && wj50.m88271j(this.f169050b, ote1Var.f169050b);
    }

    public final int hashCode() {
        return this.f169050b.hashCode() + (Integer.hashCode(this.f169049a) * 31);
    }
}
