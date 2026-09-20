package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vs2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f244318a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ws2 f244319b;

    /* JADX INFO: renamed from: c */
    public int f244320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs2(ws2 ws2Var, ibk ibkVar) {
        super(ibkVar);
        this.f244319b = ws2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f244318a = obj;
        this.f244320c |= Integer.MIN_VALUE;
        return this.f244319b.m88873a(null, this);
    }
}
