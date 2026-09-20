package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ah00 {

    /* JADX INFO: renamed from: a */
    public final String f15568a;

    /* JADX INFO: renamed from: b */
    public final csc1 f15569b;

    public ah00(String str, csc1 csc1Var) {
        this.f15568a = str;
        this.f15569b = csc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah00)) {
            return false;
        }
        ah00 ah00Var = (ah00) obj;
        return wj50.m88271j(this.f15568a, ah00Var.f15568a) && this.f15569b == ah00Var.f15569b;
    }

    public final int hashCode() {
        return this.f15569b.hashCode() + (this.f15568a.hashCode() * 31);
    }
}
