package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zqh extends pph {

    /* JADX INFO: renamed from: c */
    public final fk60 f285395c;

    /* JADX INFO: renamed from: d */
    public int f285396d;

    public zqh(hg50 hg50Var, fk60 fk60Var) {
        super(hg50Var);
        this.f285395c = fk60Var;
    }

    @Override // p204p.pph
    /* JADX INFO: renamed from: a */
    public final void mo70575a() {
        this.f180044a = true;
        this.f285396d++;
    }

    @Override // p204p.pph
    /* JADX INFO: renamed from: b */
    public final void mo70576b() {
        this.f180044a = false;
        m70582h("\n");
        int i = this.f285396d;
        for (int i2 = 0; i2 < i; i2++) {
            m70582h(this.f285395c.f70477a.f189470g);
        }
    }

    @Override // p204p.pph
    /* JADX INFO: renamed from: c */
    public final void mo70577c() {
        if (this.f180044a) {
            this.f180044a = false;
        } else {
            mo70576b();
        }
    }

    @Override // p204p.pph
    /* JADX INFO: renamed from: k */
    public final void mo70585k() {
        m70579e(' ');
    }

    @Override // p204p.pph
    /* JADX INFO: renamed from: l */
    public final void mo70586l() {
        this.f285396d--;
    }
}
