package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rsc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f202285a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f202286b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ssc1 f202287c;

    /* JADX INFO: renamed from: d */
    public int f202288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsc1(ssc1 ssc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f202287c = ssc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202286b = obj;
        this.f202288d |= Integer.MIN_VALUE;
        return this.f202287c.m79196d(false, this);
    }
}
