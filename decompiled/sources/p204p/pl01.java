package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pl01 implements sl01 {

    /* JADX INFO: renamed from: a */
    public final String f178606a;

    /* JADX INFO: renamed from: b */
    public final lzu0 f178607b;

    public pl01(String str, lzu0 lzu0Var) {
        this.f178606a = str;
        this.f178607b = lzu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl01)) {
            return false;
        }
        pl01 pl01Var = (pl01) obj;
        return wj50.m88271j(this.f178606a, pl01Var.f178606a) && this.f178607b == pl01Var.f178607b;
    }

    public final int hashCode() {
        return this.f178607b.hashCode() + (this.f178606a.hashCode() * 31);
    }
}
