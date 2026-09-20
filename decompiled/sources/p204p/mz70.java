package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mz70 {

    /* JADX INFO: renamed from: a */
    public final int f148637a;

    /* JADX INFO: renamed from: b */
    public final String f148638b;

    public mz70(int i, String str) {
        this.f148637a = i;
        this.f148638b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz70)) {
            return false;
        }
        mz70 mz70Var = (mz70) obj;
        return this.f148637a == mz70Var.f148637a && wj50.m88271j(this.f148638b, mz70Var.f148638b);
    }

    public final int hashCode() {
        return this.f148638b.hashCode() + (Integer.hashCode(this.f148637a) * 31);
    }
}
