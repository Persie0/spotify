package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rvz0 {

    /* JADX INFO: renamed from: a */
    public final String f203165a;

    /* JADX INFO: renamed from: b */
    public final int f203166b;

    public rvz0(String str, int i) {
        this.f203165a = str;
        this.f203166b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvz0)) {
            return false;
        }
        rvz0 rvz0Var = (rvz0) obj;
        return wj50.m88271j(this.f203165a, rvz0Var.f203165a) && this.f203166b == rvz0Var.f203166b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f203166b) + (this.f203165a.hashCode() * 31);
    }
}
