package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xdm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f260507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bem0 f260508b;

    /* JADX INFO: renamed from: c */
    public int f260509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdm0(bem0 bem0Var, ibk ibkVar) {
        super(ibkVar);
        this.f260508b = bem0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260507a = obj;
        this.f260509c |= Integer.MIN_VALUE;
        return this.f260508b.m28949c(this);
    }
}
