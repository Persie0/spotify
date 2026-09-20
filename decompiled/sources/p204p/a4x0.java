package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a4x0 extends ibk {

    /* JADX INFO: renamed from: a */
    public fjt f12343a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f12344b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rwt0 f12345c;

    /* JADX INFO: renamed from: d */
    public int f12346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4x0(rwt0 rwt0Var, ibk ibkVar) {
        super(ibkVar);
        this.f12345c = rwt0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12344b = obj;
        this.f12346d |= Integer.MIN_VALUE;
        return this.f12345c.m76585h(null, this);
    }
}
