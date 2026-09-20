package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xb6 {

    /* JADX INFO: renamed from: a */
    public final String f259844a;

    /* JADX INFO: renamed from: b */
    public final String f259845b;

    public xb6(String str, String str2) {
        this.f259844a = str;
        this.f259845b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb6)) {
            return false;
        }
        xb6 xb6Var = (xb6) obj;
        return wj50.m88271j(this.f259844a, xb6Var.f259844a) && wj50.m88271j(this.f259845b, xb6Var.f259845b);
    }

    public final int hashCode() {
        return this.f259845b.hashCode() + (this.f259844a.hashCode() * 31);
    }
}
