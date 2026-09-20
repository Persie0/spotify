package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w701 {

    /* JADX INFO: renamed from: a */
    public final be01 f248505a;

    /* JADX INFO: renamed from: b */
    public final String f248506b;

    /* JADX INFO: renamed from: c */
    public final String f248507c;

    /* JADX INFO: renamed from: d */
    public final q701 f248508d;

    /* JADX INFO: renamed from: e */
    public final eh00 f248509e;

    /* JADX INFO: renamed from: f */
    public final boolean f248510f;

    public w701(be01 be01Var, String str, String str2, q701 q701Var, eh00 eh00Var, boolean z) {
        this.f248505a = be01Var;
        this.f248506b = str;
        this.f248507c = str2;
        this.f248508d = q701Var;
        this.f248509e = eh00Var;
        this.f248510f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w701)) {
            return false;
        }
        w701 w701Var = (w701) obj;
        return wj50.m88271j(this.f248505a, w701Var.f248505a) && wj50.m88271j(this.f248506b, w701Var.f248506b) && wj50.m88271j(this.f248507c, w701Var.f248507c) && wj50.m88271j(this.f248508d, w701Var.f248508d) && wj50.m88271j(this.f248509e, w701Var.f248509e) && this.f248510f == w701Var.f248510f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248510f) + p1v.m68853j((this.f248508d.hashCode() + s571.m77243b(s571.m77243b(this.f248505a.f26239a.hashCode() * 31, 31, this.f248506b), 31, this.f248507c)) * 31, this.f248509e, 31);
    }
}
