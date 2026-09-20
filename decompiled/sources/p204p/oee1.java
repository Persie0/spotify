package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oee1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f164408a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f164409b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pee1 f164410c;

    /* JADX INFO: renamed from: d */
    public int f164411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oee1(pee1 pee1Var, ibk ibkVar) {
        super(ibkVar);
        this.f164410c = pee1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f164409b = obj;
        this.f164411d |= Integer.MIN_VALUE;
        return this.f164410c.m69722a(null, this);
    }
}
