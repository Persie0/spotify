package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ro7 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ so7 f201157b;

    /* JADX INFO: renamed from: c */
    public int f201158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro7(so7 so7Var, ibk ibkVar) {
        super(ibkVar);
        this.f201157b = so7Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201156a = obj;
        this.f201158c |= Integer.MIN_VALUE;
        return so7.m78628a(this.f201157b, null, this);
    }
}
