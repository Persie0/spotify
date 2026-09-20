package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uxq0 extends byq0 {

    /* JADX INFO: renamed from: a */
    public final String f235028a;

    /* JADX INFO: renamed from: b */
    public final boolean f235029b;

    public uxq0(String str, boolean z) {
        this.f235028a = str;
        this.f235029b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxq0)) {
            return false;
        }
        uxq0 uxq0Var = (uxq0) obj;
        return wj50.m88271j(this.f235028a, uxq0Var.f235028a) && this.f235029b == uxq0Var.f235029b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f235029b) + (this.f235028a.hashCode() * 31);
    }
}
