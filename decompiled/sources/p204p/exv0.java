package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class exv0 {

    /* JADX INFO: renamed from: a */
    public final String f63862a;

    /* JADX INFO: renamed from: b */
    public final int f63863b;

    /* JADX INFO: renamed from: c */
    public final boolean f63864c;

    public exv0(String str, int i, boolean z) {
        this.f63862a = str;
        this.f63863b = i;
        this.f63864c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exv0)) {
            return false;
        }
        exv0 exv0Var = (exv0) obj;
        return wj50.m88271j(this.f63862a, exv0Var.f63862a) && this.f63863b == exv0Var.f63863b && this.f63864c == exv0Var.f63864c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63864c) + mt60.m62800g(this.f63863b, this.f63862a.hashCode() * 31, 31);
    }
}
