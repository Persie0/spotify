package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ue80 implements xe80 {

    /* JADX INFO: renamed from: a */
    public final String f229458a;

    /* JADX INFO: renamed from: b */
    public final int f229459b;

    public ue80(String str, int i) {
        this.f229458a = str;
        this.f229459b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue80)) {
            return false;
        }
        ue80 ue80Var = (ue80) obj;
        return wj50.m88271j(this.f229458a, ue80Var.f229458a) && this.f229459b == ue80Var.f229459b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f229459b) + (this.f229458a.hashCode() * 31);
    }
}
