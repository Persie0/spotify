package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lq11 extends ibk {

    /* JADX INFO: renamed from: a */
    public nq11 f135929a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f135930b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nq11 f135931c;

    /* JADX INFO: renamed from: d */
    public int f135932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq11(nq11 nq11Var, ibk ibkVar) {
        super(ibkVar);
        this.f135931c = nq11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f135930b = obj;
        this.f135932d |= Integer.MIN_VALUE;
        return this.f135931c.setValue((Boolean) null, false, (d850) null, (fbk) this);
    }
}
