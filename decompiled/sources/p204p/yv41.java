package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yv41 extends ibk {

    /* JADX INFO: renamed from: a */
    public niz f276567a;

    /* JADX INFO: renamed from: b */
    public fw41 f276568b;

    /* JADX INFO: renamed from: c */
    public tf60 f276569c;

    /* JADX INFO: renamed from: d */
    public Object f276570d;

    /* JADX INFO: renamed from: e */
    public Object f276571e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f276572f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zv41 f276573g;

    /* JADX INFO: renamed from: h */
    public int f276574h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv41(zv41 zv41Var, fbk fbkVar) {
        super(fbkVar);
        this.f276573g = zv41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276572f = obj;
        this.f276574h |= Integer.MIN_VALUE;
        this.f276573g.collect(null, this);
        return yuk.f276404a;
    }
}
