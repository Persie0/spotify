package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class roc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201224a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uoc0 f201225b;

    /* JADX INFO: renamed from: c */
    public int f201226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roc0(uoc0 uoc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f201225b = uoc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201224a = obj;
        this.f201226c |= Integer.MIN_VALUE;
        return uoc0.m83609a(this.f201225b, this);
    }
}
