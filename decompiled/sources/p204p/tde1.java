package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tde1 extends ibk {

    /* JADX INFO: renamed from: a */
    public ae50 f219297a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f219298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vde1 f219299c;

    /* JADX INFO: renamed from: d */
    public int f219300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tde1(vde1 vde1Var, ibk ibkVar) {
        super(ibkVar);
        this.f219299c = vde1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219298b = obj;
        this.f219300d |= Integer.MIN_VALUE;
        return this.f219299c.m85224a(null, null, null, this);
    }
}
