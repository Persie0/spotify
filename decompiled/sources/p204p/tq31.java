package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tq31 {

    /* JADX INFO: renamed from: a */
    public final sq31 f222666a;

    /* JADX INFO: renamed from: b */
    public final rq31 f222667b;

    /* JADX INFO: renamed from: c */
    public final boolean f222668c;

    public tq31(sq31 sq31Var, rq31 rq31Var, boolean z) {
        this.f222666a = sq31Var;
        this.f222667b = rq31Var;
        this.f222668c = z;
    }

    /* JADX INFO: renamed from: a */
    public static tq31 m81296a(tq31 tq31Var, boolean z) {
        sq31 sq31Var = tq31Var.f222666a;
        rq31 rq31Var = tq31Var.f222667b;
        tq31Var.getClass();
        return new tq31(sq31Var, rq31Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq31)) {
            return false;
        }
        tq31 tq31Var = (tq31) obj;
        return wj50.m88271j(this.f222666a, tq31Var.f222666a) && wj50.m88271j(this.f222667b, tq31Var.f222667b) && this.f222668c == tq31Var.f222668c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f222668c) + ((this.f222667b.hashCode() + (this.f222666a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ tq31(sq31 sq31Var, rq31 rq31Var, boolean z, int i) {
        this((i & 1) != 0 ? snq0.f210993Q0 : sq31Var, (i & 2) != 0 ? mmq0.f145204Q0 : rq31Var, (i & 4) != 0 ? false : z);
    }
}
