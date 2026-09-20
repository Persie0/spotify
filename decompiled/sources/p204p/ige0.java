package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ige0 {

    /* JADX INFO: renamed from: a */
    public final int f101973a;

    /* JADX INFO: renamed from: b */
    public final String f101974b;

    public ige0(int i, String str) {
        this.f101973a = i;
        this.f101974b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ige0)) {
            return false;
        }
        ige0 ige0Var = (ige0) obj;
        return this.f101973a == ige0Var.f101973a && this.f101974b.equals(ige0Var.f101974b);
    }

    public final int hashCode() {
        return this.f101974b.hashCode() + (edb.m38547C(this.f101973a) * 31);
    }
}
