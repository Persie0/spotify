package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nr8 {

    /* JADX INFO: renamed from: a */
    public final String f157470a;

    /* JADX INFO: renamed from: b */
    public final String f157471b;

    /* JADX INFO: renamed from: c */
    public final p8e0 f157472c;

    public nr8(String str, String str2, p8e0 p8e0Var) {
        this.f157470a = str;
        this.f157471b = str2;
        this.f157472c = p8e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr8)) {
            return false;
        }
        nr8 nr8Var = (nr8) obj;
        return wj50.m88271j(this.f157470a, nr8Var.f157470a) && wj50.m88271j(this.f157471b, nr8Var.f157471b) && wj50.m88271j(this.f157472c, nr8Var.f157472c);
    }

    public final int hashCode() {
        return this.f157472c.hashCode() + s571.m77243b(this.f157470a.hashCode() * 31, 31, this.f157471b);
    }
}
