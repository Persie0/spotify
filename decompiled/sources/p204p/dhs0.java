package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class dhs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f49148a;

    /* JADX INFO: renamed from: b */
    public final String f49149b;

    public dhs0(String str, String str2) {
        this.f49148a = str;
        this.f49149b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhs0)) {
            return false;
        }
        dhs0 dhs0Var = (dhs0) obj;
        return wj50.m88271j(this.f49148a, dhs0Var.f49148a) && wj50.m88271j(this.f49149b, dhs0Var.f49149b);
    }

    public final int hashCode() {
        return this.f49149b.hashCode() + (this.f49148a.hashCode() * 31);
    }
}
