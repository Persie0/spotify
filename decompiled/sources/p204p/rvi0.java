package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rvi0 {

    /* JADX INFO: renamed from: a */
    public final String f203088a;

    /* JADX INFO: renamed from: b */
    public final String f203089b;

    public rvi0(String str, String str2) {
        this.f203088a = str;
        this.f203089b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvi0)) {
            return false;
        }
        rvi0 rvi0Var = (rvi0) obj;
        return wj50.m88271j(this.f203088a, rvi0Var.f203088a) && wj50.m88271j(this.f203089b, rvi0Var.f203089b);
    }

    public final int hashCode() {
        return this.f203089b.hashCode() + (this.f203088a.hashCode() * 31);
    }
}
