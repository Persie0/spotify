package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jf80 extends ibk {

    /* JADX INFO: renamed from: a */
    public cf80 f111838a;

    /* JADX INFO: renamed from: b */
    public String f111839b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f111840c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ nf80 f111841d;

    /* JADX INFO: renamed from: e */
    public int f111842e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf80(nf80 nf80Var, ibk ibkVar) {
        super(ibkVar);
        this.f111841d = nf80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f111840c = obj;
        this.f111842e |= Integer.MIN_VALUE;
        return nf80.m64332h(this.f111841d, null, this);
    }
}
