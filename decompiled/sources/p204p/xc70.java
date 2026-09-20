package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xc70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260117a;

    /* JADX INFO: renamed from: b */
    public final zc70 f260118b;

    public /* synthetic */ xc70(zc70 zc70Var, int i) {
        this.f260117a = i;
        this.f260118b = zc70Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f260117a) {
            case 0:
                return new yc70(this.f260118b);
            default:
                return this.f260118b.m25522A();
        }
    }
}
