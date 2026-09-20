package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ekn0 implements hkn0 {

    /* JADX INFO: renamed from: a */
    public final int f60478a;

    /* JADX INFO: renamed from: b */
    public final String f60479b;

    public ekn0(int i, String str) {
        this.f60478a = i;
        this.f60479b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekn0)) {
            return false;
        }
        ekn0 ekn0Var = (ekn0) obj;
        return this.f60478a == ekn0Var.f60478a && wj50.m88271j(this.f60479b, ekn0Var.f60479b);
    }

    public final int hashCode() {
        return this.f60479b.hashCode() + (Integer.hashCode(this.f60478a) * 31);
    }
}
