package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class imp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lmp0 f103765b;

    /* JADX INFO: renamed from: c */
    public int f103766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imp0(lmp0 lmp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f103765b = lmp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103764a = obj;
        this.f103766c |= Integer.MIN_VALUE;
        return this.f103765b.mo25628g(null, this);
    }
}
