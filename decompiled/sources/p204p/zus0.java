package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zus0 {

    /* JADX INFO: renamed from: a */
    public final int f286515a;

    /* JADX INFO: renamed from: b */
    public final int f286516b;

    public /* synthetic */ zus0(int i) {
        this((i & 1) != 0 ? 1 : 2, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zus0)) {
            return false;
        }
        zus0 zus0Var = (zus0) obj;
        return this.f286515a == zus0Var.f286515a && this.f286516b == zus0Var.f286516b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f286516b) + (edb.m38547C(this.f286515a) * 31);
    }

    public zus0(int i, int i2) {
        this.f286515a = i;
        this.f286516b = i2;
    }
}
