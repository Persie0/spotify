package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tg60 {

    /* JADX INFO: renamed from: a */
    public final cx50 f220127a;

    /* JADX INFO: renamed from: b */
    public final wj60 f220128b;

    /* JADX INFO: renamed from: c */
    public final boolean f220129c;

    public tg60(cx50 cx50Var, wj60 wj60Var, boolean z) {
        this.f220127a = cx50Var;
        this.f220128b = wj60Var;
        this.f220129c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg60)) {
            return false;
        }
        tg60 tg60Var = (tg60) obj;
        return wj50.m88271j(this.f220127a, tg60Var.f220127a) && this.f220128b == tg60Var.f220128b && this.f220129c == tg60Var.f220129c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220129c) + ((this.f220128b.hashCode() + (this.f220127a.hashCode() * 31)) * 31);
    }
}
