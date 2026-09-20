package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class k391 implements vwf {

    /* JADX INFO: renamed from: a */
    public final j391 f118816a;

    /* JADX INFO: renamed from: b */
    public final boolean f118817b;

    public k391(j391 j391Var, boolean z) {
        this.f118816a = j391Var;
        this.f118817b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k391)) {
            return false;
        }
        k391 k391Var = (k391) obj;
        return this.f118816a.equals(k391Var.f118816a) && this.f118817b == k391Var.f118817b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f118817b) + (this.f118816a.hashCode() * 31);
    }
}
