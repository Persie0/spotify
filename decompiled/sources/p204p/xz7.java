package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xz7 extends t3l {

    /* JADX INFO: renamed from: a */
    public final String f267532a;

    /* JADX INFO: renamed from: b */
    public final int f267533b;

    /* JADX INFO: renamed from: c */
    public final List f267534c;

    public xz7(String str, int i, List list) {
        this.f267532a = str;
        this.f267533b = i;
        this.f267534c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t3l) {
            xz7 xz7Var = (xz7) ((t3l) obj);
            if (this.f267532a.equals(xz7Var.f267532a) && this.f267533b == xz7Var.f267533b && this.f267534c.equals(xz7Var.f267534c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f267532a.hashCode() ^ 1000003) * 1000003) ^ this.f267533b) * 1000003) ^ this.f267534c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f267532a + ", importance=" + this.f267533b + ", frames=" + this.f267534c + "}";
    }
}
