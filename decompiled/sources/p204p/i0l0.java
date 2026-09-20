package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i0l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Boolean f97261a;

    /* JADX INFO: renamed from: b */
    public boolean f97262b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f97263c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ k0l0 f97264d;

    /* JADX INFO: renamed from: e */
    public int f97265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0l0(k0l0 k0l0Var, ibk ibkVar) {
        super(ibkVar);
        this.f97264d = k0l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97263c = obj;
        this.f97265e |= Integer.MIN_VALUE;
        return this.f97264d.setValue((Boolean) null, false, (d850) null, (fbk) this);
    }
}
