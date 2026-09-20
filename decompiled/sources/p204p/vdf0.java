package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vdf0 {

    /* JADX INFO: renamed from: a */
    public final int f240404a;

    /* JADX INFO: renamed from: b */
    public final String f240405b;

    public vdf0(int i, String str) {
        this.f240404a = i;
        this.f240405b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdf0)) {
            return false;
        }
        vdf0 vdf0Var = (vdf0) obj;
        return this.f240404a == vdf0Var.f240404a && wj50.m88271j(this.f240405b, vdf0Var.f240405b);
    }

    public final int hashCode() {
        return this.f240405b.hashCode() + (Integer.hashCode(this.f240404a) * 31);
    }
}
