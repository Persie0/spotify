package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qr70 extends ibk {

    /* JADX INFO: renamed from: a */
    public float f191753a;

    /* JADX INFO: renamed from: b */
    public float f191754b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f191755c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ur70 f191756d;

    /* JADX INFO: renamed from: e */
    public int f191757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr70(ur70 ur70Var, ibk ibkVar) {
        super(ibkVar);
        this.f191756d = ur70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191755c = obj;
        this.f191757e |= Integer.MIN_VALUE;
        return this.f191756d.m83842g(0.0f, 0.0f, this);
    }
}
