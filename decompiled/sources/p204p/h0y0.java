package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h0y0 {

    /* JADX INFO: renamed from: a */
    public final int f86383a;

    /* JADX INFO: renamed from: b */
    public final String f86384b;

    public h0y0(int i, String str) {
        this.f86383a = i;
        this.f86384b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m46372a() {
        return this.f86383a;
    }

    /* JADX INFO: renamed from: b */
    public final String m46373b() {
        return this.f86384b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0y0)) {
            return false;
        }
        h0y0 h0y0Var = (h0y0) obj;
        return this.f86383a == h0y0Var.f86383a && wj50.m88271j(this.f86384b, h0y0Var.f86384b);
    }

    public final int hashCode() {
        return this.f86384b.hashCode() + (Integer.hashCode(this.f86383a) * 31);
    }
}
