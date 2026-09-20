package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qi41 implements ti41 {

    /* JADX INFO: renamed from: a */
    public final oi41 f188935a;

    /* JADX INFO: renamed from: b */
    public final ui41 f188936b;

    public qi41(oi41 oi41Var, ui41 ui41Var) {
        this.f188935a = oi41Var;
        this.f188936b = ui41Var;
    }

    @Override // p204p.ti41
    /* JADX INFO: renamed from: a */
    public final oi41 mo72853a() {
        return this.f188935a;
    }

    @Override // p204p.ti41
    /* JADX INFO: renamed from: b */
    public final xi41 mo72854b() {
        return this.f188936b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi41)) {
            return false;
        }
        qi41 qi41Var = (qi41) obj;
        return this.f188935a.equals(qi41Var.f188935a) && this.f188936b.equals(qi41Var.f188936b);
    }

    public final int hashCode() {
        return this.f188936b.f230597a.hashCode() + (this.f188935a.hashCode() * 31);
    }
}
