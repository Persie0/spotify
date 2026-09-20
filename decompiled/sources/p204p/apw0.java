package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class apw0 {

    /* JADX INFO: renamed from: a */
    public final String f18027a;

    /* JADX INFO: renamed from: b */
    public final ffj0 f18028b;

    public apw0(String str, ffj0 ffj0Var) {
        this.f18027a = str;
        this.f18028b = ffj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apw0)) {
            return false;
        }
        apw0 apw0Var = (apw0) obj;
        return wj50.m88271j(this.f18027a, apw0Var.f18027a) && this.f18028b == apw0Var.f18028b;
    }

    public final int hashCode() {
        String str = this.f18027a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ffj0 ffj0Var = this.f18028b;
        return iHashCode + (ffj0Var != null ? ffj0Var.hashCode() : 0);
    }
}
