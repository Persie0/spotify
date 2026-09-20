package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jyd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f117381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tyd0 f117382b;

    /* JADX INFO: renamed from: c */
    public int f117383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyd0(tyd0 tyd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f117382b = tyd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f117381a = obj;
        this.f117383c |= Integer.MIN_VALUE;
        return tyd0.m81958b(this.f117382b, null, null, this);
    }
}
