package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gfb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f79321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hfb1 f79322b;

    /* JADX INFO: renamed from: c */
    public int f79323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfb1(hfb1 hfb1Var, ibk ibkVar) {
        super(ibkVar);
        this.f79322b = hfb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f79321a = obj;
        this.f79323c |= Integer.MIN_VALUE;
        return hfb1.m47337a(this.f79322b, null, this);
    }
}
