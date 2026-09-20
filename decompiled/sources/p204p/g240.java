package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g240 extends ibk {

    /* JADX INFO: renamed from: a */
    public lsi0 f75830a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f75831b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h240 f75832c;

    /* JADX INFO: renamed from: d */
    public int f75833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g240(h240 h240Var, ibk ibkVar) {
        super(ibkVar);
        this.f75832c = h240Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75831b = obj;
        this.f75833d |= Integer.MIN_VALUE;
        return h240.m46470a(this.f75832c, this);
    }
}
