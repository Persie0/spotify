package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ho7 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93469a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f93470b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xre f93471c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho7(gh00 gh00Var, xre xreVar, int i) {
        super(0);
        this.f93469a = i;
        this.f93470b = gh00Var;
        this.f93471c = xreVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f93469a) {
            case 0:
                this.f93470b.invoke(new co7(this.f93471c != null ? System.currentTimeMillis() : 0L));
                break;
            case 1:
                this.f93470b.invoke(new d3i(this.f93471c != null ? System.currentTimeMillis() : 0L));
                break;
            case 2:
                this.f93470b.invoke(new pv20(this.f93471c != null ? System.currentTimeMillis() : 0L));
                break;
            case 3:
                this.f93470b.invoke(new tzp0(this.f93471c != null ? System.currentTimeMillis() : 0L));
                break;
            default:
                this.f93470b.invoke(new m6b1(this.f93471c != null ? System.currentTimeMillis() : 0L));
                break;
        }
        return w2a1.f247311a;
    }
}
