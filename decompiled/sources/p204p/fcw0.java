package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fcw0 implements jcw0 {

    /* JADX INFO: renamed from: a */
    public final String f68267a;

    /* JADX INFO: renamed from: b */
    public final boolean f68268b;

    public fcw0(String str, boolean z) {
        this.f68267a = str;
        this.f68268b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcw0)) {
            return false;
        }
        fcw0 fcw0Var = (fcw0) obj;
        return wj50.m88271j(this.f68267a, fcw0Var.f68267a) && this.f68268b == fcw0Var.f68268b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68268b) + (this.f68267a.hashCode() * 31);
    }
}
