package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ai40 implements ci40 {

    /* JADX INFO: renamed from: a */
    public final String f15874a;

    /* JADX INFO: renamed from: b */
    public final iv50 f15875b;

    /* JADX INFO: renamed from: c */
    public final eay f15876c;

    public ai40(String str, iv50 iv50Var, eay eayVar) {
        this.f15874a = str;
        this.f15875b = iv50Var;
        this.f15876c = eayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai40)) {
            return false;
        }
        ai40 ai40Var = (ai40) obj;
        return wj50.m88271j(this.f15874a, ai40Var.f15874a) && wj50.m88271j(this.f15875b, ai40Var.f15875b) && this.f15876c == ai40Var.f15876c;
    }

    public final int hashCode() {
        return this.f15876c.hashCode() + ((this.f15875b.hashCode() + (this.f15874a.hashCode() * 31)) * 31);
    }
}
