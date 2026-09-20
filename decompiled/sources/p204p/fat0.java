package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fat0 {

    /* JADX INFO: renamed from: a */
    public final j8t0 f67637a;

    /* JADX INFO: renamed from: b */
    public final f5b0 f67638b;

    /* JADX INFO: renamed from: c */
    public final String f67639c;

    public fat0(j8t0 j8t0Var, f5b0 f5b0Var, String str) {
        this.f67637a = j8t0Var;
        this.f67638b = f5b0Var;
        this.f67639c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fat0)) {
            return false;
        }
        fat0 fat0Var = (fat0) obj;
        return this.f67637a == fat0Var.f67637a && wj50.m88271j(this.f67638b, fat0Var.f67638b) && wj50.m88271j(this.f67639c, fat0Var.f67639c);
    }

    public final int hashCode() {
        return this.f67639c.hashCode() + ((this.f67638b.hashCode() + (this.f67637a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ fat0(j8t0 j8t0Var, int i) {
        this((i & 1) != 0 ? j8t0.f109999a : j8t0Var, new f5b0(), "");
    }
}
