package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class px80 extends ibk {

    /* JADX INFO: renamed from: a */
    public aps f182228a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f182229b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vx80 f182230c;

    /* JADX INFO: renamed from: d */
    public int f182231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px80(vx80 vx80Var, ibk ibkVar) {
        super(ibkVar);
        this.f182230c = vx80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f182229b = obj;
        this.f182231d |= Integer.MIN_VALUE;
        return this.f182230c.m86646d(null, this);
    }
}
