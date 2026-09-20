package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zu71 {

    /* JADX INFO: renamed from: a */
    public final String f286383a;

    /* JADX INFO: renamed from: b */
    public final int f286384b;

    /* JADX INFO: renamed from: c */
    public final int f286385c;

    public zu71(String str, int i, int i2) {
        this.f286383a = str;
        this.f286384b = i;
        this.f286385c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m97012a() {
        return this.f286385c;
    }

    /* JADX INFO: renamed from: b */
    public final int m97013b() {
        return this.f286384b;
    }

    /* JADX INFO: renamed from: c */
    public final String m97014c() {
        return this.f286383a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu71)) {
            return false;
        }
        zu71 zu71Var = (zu71) obj;
        return wj50.m88271j(this.f286383a, zu71Var.f286383a) && this.f286384b == zu71Var.f286384b && this.f286385c == zu71Var.f286385c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f286385c) + mt60.m62800g(this.f286384b, this.f286383a.hashCode() * 31, 31);
    }
}
