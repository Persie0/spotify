package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ve30 implements we30 {

    /* JADX INFO: renamed from: a */
    public final String f240588a;

    /* JADX INFO: renamed from: b */
    public final int f240589b;

    public ve30(String str, int i) {
        this.f240588a = str;
        this.f240589b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve30)) {
            return false;
        }
        ve30 ve30Var = (ve30) obj;
        return wj50.m88271j(this.f240588a, ve30Var.f240588a) && this.f240589b == ve30Var.f240589b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f240589b) + (this.f240588a.hashCode() * 31);
    }
}
