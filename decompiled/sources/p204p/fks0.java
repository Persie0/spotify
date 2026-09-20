package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fks0 {

    /* JADX INFO: renamed from: a */
    public final String f70616a;

    /* JADX INFO: renamed from: b */
    public final String f70617b;

    public fks0(String str, String str2) {
        this.f70616a = str;
        this.f70617b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fks0)) {
            return false;
        }
        fks0 fks0Var = (fks0) obj;
        return wj50.m88271j(this.f70616a, fks0Var.f70616a) && wj50.m88271j(this.f70617b, fks0Var.f70617b);
    }

    public final int hashCode() {
        return this.f70617b.hashCode() + (this.f70616a.hashCode() * 31);
    }
}
