package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kvh0 implements cwh0 {

    /* JADX INFO: renamed from: a */
    public final muh0 f126867a;

    /* JADX INFO: renamed from: b */
    public final int f126868b;

    public kvh0(muh0 muh0Var, int i) {
        this.f126867a = muh0Var;
        this.f126868b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvh0)) {
            return false;
        }
        kvh0 kvh0Var = (kvh0) obj;
        return this.f126867a.equals(kvh0Var.f126867a) && this.f126868b == kvh0Var.f126868b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f126868b) + (this.f126867a.hashCode() * 31);
    }
}
