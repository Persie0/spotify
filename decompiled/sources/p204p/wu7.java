package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wu7 {

    /* JADX INFO: renamed from: a */
    public final String f255113a;

    /* JADX INFO: renamed from: b */
    public final boolean f255114b;

    public wu7(String str, boolean z) {
        this.f255113a = str;
        this.f255114b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu7)) {
            return false;
        }
        wu7 wu7Var = (wu7) obj;
        return wj50.m88271j(this.f255113a, wu7Var.f255113a) && this.f255114b == wu7Var.f255114b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255114b) + (this.f255113a.hashCode() * 31);
    }
}
