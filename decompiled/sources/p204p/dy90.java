package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dy90 implements ey90 {

    /* JADX INFO: renamed from: a */
    public final String f54250a;

    /* JADX INFO: renamed from: b */
    public final boolean f54251b;

    public dy90(String str, boolean z) {
        this.f54250a = str;
        this.f54251b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy90)) {
            return false;
        }
        dy90 dy90Var = (dy90) obj;
        return wj50.m88271j(this.f54250a, dy90Var.f54250a) && this.f54251b == dy90Var.f54251b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54251b) + (this.f54250a.hashCode() * 31);
    }
}
