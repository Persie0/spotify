package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class epk0 {

    /* JADX INFO: renamed from: a */
    public final nqa1 f61665a;

    /* JADX INFO: renamed from: b */
    public final fyj f61666b;

    /* JADX INFO: renamed from: c */
    public final f8t0 f61667c;

    /* JADX INFO: renamed from: d */
    public final boolean f61668d;

    public epk0(nqa1 nqa1Var, fyj fyjVar, f8t0 f8t0Var, boolean z) {
        this.f61665a = nqa1Var;
        this.f61666b = fyjVar;
        this.f61667c = f8t0Var;
        this.f61668d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epk0)) {
            return false;
        }
        epk0 epk0Var = (epk0) obj;
        return wj50.m88271j(this.f61665a, epk0Var.f61665a) && wj50.m88271j(this.f61666b, epk0Var.f61666b) && wj50.m88271j(this.f61667c, epk0Var.f61667c) && this.f61668d == epk0Var.f61668d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61668d) + s571.m77245d((this.f61666b.hashCode() + (this.f61665a.hashCode() * 31)) * 31, 31, this.f61667c.f67084a);
    }
}
