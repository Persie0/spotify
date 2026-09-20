package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ne31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f152911a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ue31 f152912b;

    /* JADX INFO: renamed from: c */
    public int f152913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne31(ue31 ue31Var, ibk ibkVar) {
        super(ibkVar);
        this.f152912b = ue31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f152911a = obj;
        this.f152913c |= Integer.MIN_VALUE;
        return this.f152912b.m82880d(null, null, this);
    }
}
