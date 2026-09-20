package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class d8n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f46489a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f46490b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g8n0 f46491c;

    /* JADX INFO: renamed from: d */
    public int f46492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8n0(g8n0 g8n0Var, ibk ibkVar) {
        super(ibkVar);
        this.f46491c = g8n0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46490b = obj;
        this.f46492d |= Integer.MIN_VALUE;
        return this.f46491c.m43964e(null, null, this);
    }
}
