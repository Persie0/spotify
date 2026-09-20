package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class if80 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f101708a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f101709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nf80 f101710c;

    /* JADX INFO: renamed from: d */
    public int f101711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if80(nf80 nf80Var, ibk ibkVar) {
        super(ibkVar);
        this.f101710c = nf80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f101709b = obj;
        this.f101711d |= Integer.MIN_VALUE;
        return nf80.m64331g(this.f101710c, null, this);
    }
}
