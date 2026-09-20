package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gy10 {

    /* JADX INFO: renamed from: a */
    public final Object f85403a;

    /* JADX INFO: renamed from: b */
    public final int f85404b;

    public gy10(u4y u4yVar, int i) {
        this.f85403a = u4yVar;
        this.f85404b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy10)) {
            return false;
        }
        gy10 gy10Var = (gy10) obj;
        return wj50.m88271j(this.f85403a, gy10Var.f85403a) && this.f85404b == gy10Var.f85404b;
    }

    public final int hashCode() {
        Object obj = this.f85403a;
        return Integer.hashCode(this.f85404b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
