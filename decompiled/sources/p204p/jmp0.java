package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jmp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113923a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lmp0 f113924b;

    /* JADX INFO: renamed from: c */
    public int f113925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmp0(lmp0 lmp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f113924b = lmp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113923a = obj;
        this.f113925c |= Integer.MIN_VALUE;
        return this.f113924b.m59458j(null, this);
    }
}
