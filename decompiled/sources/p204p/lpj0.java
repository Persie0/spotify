package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lpj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f135782a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f135783b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ npj0 f135784c;

    /* JADX INFO: renamed from: d */
    public int f135785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpj0(npj0 npj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f135784c = npj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f135783b = obj;
        this.f135785d |= Integer.MIN_VALUE;
        return this.f135784c.setValue((Boolean) null, false, (d850) null, (fbk) this);
    }
}
