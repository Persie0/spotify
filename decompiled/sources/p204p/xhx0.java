package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xhx0 implements aix0 {

    /* JADX INFO: renamed from: a */
    public final String f261729a;

    /* JADX INFO: renamed from: b */
    public final float f261730b;

    public xhx0(String str, float f) {
        this.f261729a = str;
        this.f261730b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhx0)) {
            return false;
        }
        xhx0 xhx0Var = (xhx0) obj;
        return wj50.m88271j(this.f261729a, xhx0Var.f261729a) && Float.compare(this.f261730b, xhx0Var.f261730b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f261730b) + (this.f261729a.hashCode() * 31);
    }
}
