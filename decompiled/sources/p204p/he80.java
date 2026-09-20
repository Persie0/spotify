package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class he80 {

    /* JADX INFO: renamed from: a */
    public final boolean f90351a;

    /* JADX INFO: renamed from: b */
    public final ny5 f90352b;

    /* JADX INFO: renamed from: c */
    public final int f90353c;

    public he80(boolean z, ny5 ny5Var, int i) {
        this.f90351a = z;
        this.f90352b = ny5Var;
        this.f90353c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he80)) {
            return false;
        }
        he80 he80Var = (he80) obj;
        return this.f90351a == he80Var.f90351a && wj50.m88271j(this.f90352b, he80Var.f90352b) && this.f90353c == he80Var.f90353c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90353c) + ((this.f90352b.hashCode() + (Boolean.hashCode(this.f90351a) * 31)) * 31);
    }
}
