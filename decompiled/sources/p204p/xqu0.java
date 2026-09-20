package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xqu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f265118a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yqu0 f265119b;

    /* JADX INFO: renamed from: c */
    public int f265120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqu0(yqu0 yqu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f265119b = yqu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f265118a = obj;
        this.f265120c |= Integer.MIN_VALUE;
        return yqu0.m94394a(this.f265119b, null, 0, 0, false, 0L, 0L, this);
    }
}
