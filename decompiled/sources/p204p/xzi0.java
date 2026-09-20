package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xzi0 extends a0j0 {

    /* JADX INFO: renamed from: a */
    public final String f267673a;

    /* JADX INFO: renamed from: b */
    public final String f267674b;

    public xzi0(String str, String str2) {
        this.f267673a = str;
        this.f267674b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzi0)) {
            return false;
        }
        xzi0 xzi0Var = (xzi0) obj;
        return wj50.m88271j(this.f267673a, xzi0Var.f267673a) && wj50.m88271j(this.f267674b, xzi0Var.f267674b);
    }

    public final int hashCode() {
        return this.f267674b.hashCode() + (this.f267673a.hashCode() * 31);
    }
}
