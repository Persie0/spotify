package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yg8 implements bh8 {

    /* JADX INFO: renamed from: a */
    public final String f272510a;

    /* JADX INFO: renamed from: b */
    public final lc8 f272511b;

    public yg8(String str, lc8 lc8Var) {
        this.f272510a = str;
        this.f272511b = lc8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yg8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        yg8 yg8Var = (yg8) obj;
        return wj50.m88271j(this.f272510a, yg8Var.f272510a) && wj50.m88271j(this.f272511b, yg8Var.f272511b);
    }

    public final int hashCode() {
        return this.f272511b.hashCode() + (this.f272510a.hashCode() * 31);
    }
}
