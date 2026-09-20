package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bod0 implements wfq0 {

    /* JADX INFO: renamed from: a */
    public final String f29095a;

    /* JADX INFO: renamed from: b */
    public final vnd0 f29096b;

    public bod0(String str, vnd0 vnd0Var) {
        this.f29095a = str;
        this.f29096b = vnd0Var;
    }

    @Override // p204p.wfq0
    public final boolean apply(Object obj) {
        fod0 fod0Var = (fod0) obj;
        return fod0Var != null && fod0Var.mo42271b(this.f29095a) && fod0.f71516b.contains(this.f29096b);
    }
}
