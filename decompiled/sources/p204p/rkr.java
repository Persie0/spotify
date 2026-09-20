package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rkr extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f200143a;

    /* JADX INFO: renamed from: b */
    public int f200144b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f200145c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tkr f200146d;

    /* JADX INFO: renamed from: e */
    public int f200147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkr(tkr tkrVar, ibk ibkVar) {
        super(ibkVar);
        this.f200146d = tkrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200145c = obj;
        this.f200147e |= Integer.MIN_VALUE;
        return this.f200146d.setValue((Boolean) null, false, (d850) null, (fbk) this);
    }
}
