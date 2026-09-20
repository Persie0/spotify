package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class msk0 {

    /* JADX INFO: renamed from: a */
    public final String f146827a;

    /* JADX INFO: renamed from: b */
    public final boolean f146828b;

    public msk0(String str, boolean z) {
        this.f146827a = str;
        this.f146828b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msk0)) {
            return false;
        }
        msk0 msk0Var = (msk0) obj;
        return wj50.m88271j(this.f146827a, msk0Var.f146827a) && this.f146828b == msk0Var.f146828b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146828b) + (this.f146827a.hashCode() * 31);
    }
}
