package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xc6 {

    /* JADX INFO: renamed from: a */
    public final String f260101a;

    /* JADX INFO: renamed from: b */
    public final String f260102b;

    /* JADX INFO: renamed from: c */
    public final boolean f260103c;

    public xc6(String str, String str2, boolean z) {
        this.f260101a = str;
        this.f260102b = str2;
        this.f260103c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc6)) {
            return false;
        }
        xc6 xc6Var = (xc6) obj;
        return wj50.m88271j(this.f260101a, xc6Var.f260101a) && wj50.m88271j(this.f260102b, xc6Var.f260102b) && this.f260103c == xc6Var.f260103c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260103c) + s571.m77243b(this.f260101a.hashCode() * 31, 31, this.f260102b);
    }
}
