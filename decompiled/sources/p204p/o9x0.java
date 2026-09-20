package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o9x0 implements p9x0 {

    /* JADX INFO: renamed from: a */
    public final String f163160a;

    /* JADX INFO: renamed from: b */
    public final jda1 f163161b;

    public o9x0(String str, jda1 jda1Var) {
        this.f163160a = str;
        this.f163161b = jda1Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m66498a() {
        return this.f163160a;
    }

    /* JADX INFO: renamed from: b */
    public final jda1 m66499b() {
        return this.f163161b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9x0)) {
            return false;
        }
        o9x0 o9x0Var = (o9x0) obj;
        return wj50.m88271j(this.f163160a, o9x0Var.f163160a) && wj50.m88271j(this.f163161b, o9x0Var.f163161b);
    }

    public final int hashCode() {
        return this.f163161b.hashCode() + (this.f163160a.hashCode() * 31);
    }
}
