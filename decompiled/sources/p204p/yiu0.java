package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yiu0 implements gju0 {

    /* JADX INFO: renamed from: a */
    public final String f273204a;

    /* JADX INFO: renamed from: b */
    public final int f273205b;

    public yiu0(String str, int i) {
        this.f273204a = str;
        this.f273205b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yiu0)) {
            return false;
        }
        yiu0 yiu0Var = (yiu0) obj;
        return wj50.m88271j(this.f273204a, yiu0Var.f273204a) && this.f273205b == yiu0Var.f273205b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f273205b) + (this.f273204a.hashCode() * 31);
    }
}
