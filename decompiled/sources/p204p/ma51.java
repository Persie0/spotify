package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ma51 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f141477a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f141478b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ na51 f141479c;

    /* JADX INFO: renamed from: d */
    public int f141480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma51(na51 na51Var, ibk ibkVar) {
        super(ibkVar);
        this.f141479c = na51Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141478b = obj;
        this.f141480d |= Integer.MIN_VALUE;
        return this.f141479c.m63951a(0, this);
    }
}
