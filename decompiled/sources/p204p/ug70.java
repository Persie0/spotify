package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ug70 {

    /* JADX INFO: renamed from: a */
    public final ef70 f230009a;

    /* JADX INFO: renamed from: b */
    public final boolean f230010b;

    public ug70(ef70 ef70Var, boolean z) {
        this.f230009a = ef70Var;
        this.f230010b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug70)) {
            return false;
        }
        ug70 ug70Var = (ug70) obj;
        return wj50.m88271j(this.f230009a, ug70Var.f230009a) && this.f230010b == ug70Var.f230010b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230010b) + (this.f230009a.hashCode() * 31);
    }
}
