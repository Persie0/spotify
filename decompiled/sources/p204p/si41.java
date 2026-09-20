package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class si41 implements ti41 {

    /* JADX INFO: renamed from: a */
    public final oi41 f209357a;

    public si41(oi41 oi41Var) {
        this.f209357a = oi41Var;
    }

    @Override // p204p.ti41
    /* JADX INFO: renamed from: a */
    public final oi41 mo72853a() {
        return this.f209357a;
    }

    @Override // p204p.ti41
    /* JADX INFO: renamed from: b */
    public final xi41 mo72854b() {
        return wi41.f251495a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si41) && wj50.m88271j(this.f209357a, ((si41) obj).f209357a);
    }

    public final int hashCode() {
        return this.f209357a.hashCode();
    }
}
