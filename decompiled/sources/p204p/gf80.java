package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gf80 extends ibk {

    /* JADX INFO: renamed from: a */
    public ts80 f79298a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f79299b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nf80 f79300c;

    /* JADX INFO: renamed from: d */
    public int f79301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf80(nf80 nf80Var, ibk ibkVar) {
        super(ibkVar);
        this.f79300c = nf80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f79299b = obj;
        this.f79301d |= Integer.MIN_VALUE;
        return nf80.m64329e(this.f79300c, null, this);
    }
}
