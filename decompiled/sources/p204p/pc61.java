package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pc61 {

    /* JADX INFO: renamed from: a */
    public final qf40 f175968a;

    /* JADX INFO: renamed from: b */
    public final String f175969b;

    /* JADX INFO: renamed from: c */
    public final int f175970c;

    public pc61(AbstractC2524w8 abstractC2524w8, String str, int i) {
        this.f175968a = abstractC2524w8;
        this.f175969b = str;
        this.f175970c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc61)) {
            return false;
        }
        pc61 pc61Var = (pc61) obj;
        return wj50.m88271j(this.f175968a, pc61Var.f175968a) && wj50.m88271j(this.f175969b, pc61Var.f175969b) && this.f175970c == pc61Var.f175970c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f175970c) + s571.m77243b(this.f175968a.hashCode() * 31, 31, this.f175969b);
    }
}
