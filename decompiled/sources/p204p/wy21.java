package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wy21 extends bz21 {

    /* JADX INFO: renamed from: a */
    public final int f256178a;

    /* JADX INFO: renamed from: b */
    public final String f256179b;

    public wy21(int i, String str) {
        this.f256178a = i;
        this.f256179b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy21)) {
            return false;
        }
        wy21 wy21Var = (wy21) obj;
        return this.f256178a == wy21Var.f256178a && wj50.m88271j(this.f256179b, wy21Var.f256179b);
    }

    public final int hashCode() {
        return this.f256179b.hashCode() + (Integer.hashCode(this.f256178a) * 31);
    }
}
