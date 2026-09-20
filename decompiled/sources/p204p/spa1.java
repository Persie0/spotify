package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class spa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f212790a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zpa1 f212791b;

    /* JADX INFO: renamed from: c */
    public int f212792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spa1(zpa1 zpa1Var, ibk ibkVar) {
        super(ibkVar);
        this.f212791b = zpa1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f212790a = obj;
        this.f212792c |= Integer.MIN_VALUE;
        return zpa1.m96679g(this.f212791b, null, this);
    }
}
