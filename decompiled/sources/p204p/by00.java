package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class by00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cy00 f32033b;

    /* JADX INFO: renamed from: c */
    public int f32034c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by00(cy00 cy00Var, ibk ibkVar) {
        super(ibkVar);
        this.f32033b = cy00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32032a = obj;
        this.f32034c |= Integer.MIN_VALUE;
        return cy00.m34335a(this.f32033b, null, this);
    }
}
