package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final String f154855a;

    /* JADX INFO: renamed from: b */
    public final lzu0 f154856b;

    public nkd(String str, lzu0 lzu0Var) {
        this.f154855a = str;
        this.f154856b = lzu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkd)) {
            return false;
        }
        nkd nkdVar = (nkd) obj;
        return wj50.m88271j(this.f154855a, nkdVar.f154855a) && this.f154856b == nkdVar.f154856b;
    }

    public final int hashCode() {
        return this.f154856b.hashCode() + (this.f154855a.hashCode() * 31);
    }
}
