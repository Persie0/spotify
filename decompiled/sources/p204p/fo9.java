package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fo9 extends ibk {

    /* JADX INFO: renamed from: a */
    public tf60 f71472a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f71473b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ go9 f71474c;

    /* JADX INFO: renamed from: d */
    public int f71475d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo9(go9 go9Var, ibk ibkVar) {
        super(ibkVar);
        this.f71474c = go9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71473b = obj;
        this.f71475d |= Integer.MIN_VALUE;
        return this.f71474c.m45330e(null, this);
    }
}
