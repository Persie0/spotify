package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aju0 implements gju0 {

    /* JADX INFO: renamed from: a */
    public final String f16356a;

    /* JADX INFO: renamed from: b */
    public final int f16357b;

    public aju0(String str, int i) {
        this.f16356a = str;
        this.f16357b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aju0)) {
            return false;
        }
        aju0 aju0Var = (aju0) obj;
        return wj50.m88271j(this.f16356a, aju0Var.f16356a) && this.f16357b == aju0Var.f16357b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16357b) + (this.f16356a.hashCode() * 31);
    }
}
