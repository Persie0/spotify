package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kmp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public ju61 f124193a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f124194b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmp0 f124195c;

    /* JADX INFO: renamed from: d */
    public int f124196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmp0(lmp0 lmp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f124195c = lmp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124194b = obj;
        this.f124196d |= Integer.MIN_VALUE;
        return this.f124195c.mo25625d(null, this);
    }
}
