package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bqm0 {

    /* JADX INFO: renamed from: a */
    public final String f29853a;

    /* JADX INFO: renamed from: b */
    public final String f29854b;

    public bqm0(String str, String str2) {
        this.f29853a = str;
        this.f29854b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqm0)) {
            return false;
        }
        bqm0 bqm0Var = (bqm0) obj;
        return wj50.m88271j(this.f29853a, bqm0Var.f29853a) && wj50.m88271j(this.f29854b, bqm0Var.f29854b);
    }

    public final int hashCode() {
        return this.f29854b.hashCode() + (this.f29853a.hashCode() * 31);
    }
}
