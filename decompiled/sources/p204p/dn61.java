package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dn61 implements mn61 {

    /* JADX INFO: renamed from: a */
    public final String f50694a;

    /* JADX INFO: renamed from: b */
    public final int f50695b;

    public dn61(String str, int i) {
        this.f50694a = str;
        this.f50695b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn61)) {
            return false;
        }
        dn61 dn61Var = (dn61) obj;
        return wj50.m88271j(this.f50694a, dn61Var.f50694a) && this.f50695b == dn61Var.f50695b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50695b) + (this.f50694a.hashCode() * 31);
    }
}
