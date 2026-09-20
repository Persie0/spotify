package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vyh0 implements xyh0 {

    /* JADX INFO: renamed from: a */
    public final String f246115a;

    /* JADX INFO: renamed from: b */
    public final int f246116b;

    public vyh0(String str, int i) {
        this.f246115a = str;
        this.f246116b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyh0)) {
            return false;
        }
        vyh0 vyh0Var = (vyh0) obj;
        return wj50.m88271j(this.f246115a, vyh0Var.f246115a) && this.f246116b == vyh0Var.f246116b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f246116b) + (this.f246115a.hashCode() * 31);
    }
}
