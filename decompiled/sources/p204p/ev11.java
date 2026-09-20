package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ev11 {

    /* JADX INFO: renamed from: a */
    public final boolean f63125a;

    /* JADX INFO: renamed from: b */
    public final String f63126b;

    public ev11(boolean z, String str) {
        this.f63125a = z;
        this.f63126b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev11)) {
            return false;
        }
        ev11 ev11Var = (ev11) obj;
        return this.f63125a == ev11Var.f63125a && wj50.m88271j(this.f63126b, ev11Var.f63126b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f63125a) * 31;
        String str = this.f63126b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
