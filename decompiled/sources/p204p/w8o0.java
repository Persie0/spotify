package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w8o0 {

    /* JADX INFO: renamed from: a */
    public final ctk0 f248974a;

    /* JADX INFO: renamed from: b */
    public final olr f248975b;

    /* JADX INFO: renamed from: c */
    public final int f248976c;

    /* JADX INFO: renamed from: d */
    public final String f248977d;

    public w8o0(ctk0 ctk0Var, olr olrVar, int i, String str) {
        this.f248974a = ctk0Var;
        this.f248975b = olrVar;
        this.f248976c = i;
        this.f248977d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8o0)) {
            return false;
        }
        w8o0 w8o0Var = (w8o0) obj;
        return this.f248974a.equals(w8o0Var.f248974a) && this.f248975b.equals(w8o0Var.f248975b) && this.f248976c == w8o0Var.f248976c && this.f248977d.equals(w8o0Var.f248977d);
    }

    public final int hashCode() {
        return this.f248977d.hashCode() + f710.m40938f(this.f248976c, (this.f248975b.hashCode() + (this.f248974a.hashCode() * 31)) * 31, 31);
    }
}
