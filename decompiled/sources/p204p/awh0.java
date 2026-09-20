package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class awh0 {

    /* JADX INFO: renamed from: a */
    public final boolean f20540a;

    /* JADX INFO: renamed from: b */
    public final String f20541b;

    public awh0(boolean z, String str) {
        this.f20540a = z;
        this.f20541b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awh0)) {
            return false;
        }
        awh0 awh0Var = (awh0) obj;
        return this.f20540a == awh0Var.f20540a && wj50.m88271j(this.f20541b, awh0Var.f20541b);
    }

    public final int hashCode() {
        return this.f20541b.hashCode() + (Boolean.hashCode(this.f20540a) * 31);
    }
}
