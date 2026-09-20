package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class d661 implements ezx0 {

    /* JADX INFO: renamed from: a */
    public final u561 f45612a;

    /* JADX INFO: renamed from: b */
    public final String f45613b;

    /* JADX INFO: renamed from: c */
    public boolean f45614c;

    public d661(u561 u561Var, String str) {
        this.f45612a = u561Var;
        this.f45613b = str;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: A */
    public void mo24840A() {
        m35056a();
    }

    /* JADX INFO: renamed from: a */
    public final void m35056a() {
        if (this.f45614c) {
            mif1.m61859L(21, "statement is closed");
            throw null;
        }
    }

    @Override // p204p.ezx0
    public void reset() {
        m35056a();
    }
}
