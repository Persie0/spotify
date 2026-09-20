package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mq50 implements hr50 {

    /* JADX INFO: renamed from: a */
    public final j0r0 f146180a;

    /* JADX INFO: renamed from: b */
    public final boolean f146181b;

    public mq50(j0r0 j0r0Var, boolean z) {
        this.f146180a = j0r0Var;
        this.f146181b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq50)) {
            return false;
        }
        mq50 mq50Var = (mq50) obj;
        return wj50.m88271j(this.f146180a, mq50Var.f146180a) && this.f146181b == mq50Var.f146181b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146181b) + (this.f146180a.hashCode() * 31);
    }
}
