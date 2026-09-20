package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class apf extends mb61 implements vh00 {

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ int f17927L0;

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ boolean f17928M0;

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ boolean f17929N0;

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ boolean f17930O0;

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ boolean f17931X;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f17932Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f17933Z;

    /* JADX INFO: renamed from: a */
    public int f17934a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ niz f17935b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f17936c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f17937d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f17938e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f17939f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f17940g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f17941h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f17942i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean f17943t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apf(fbk fbkVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, boolean z11, boolean z12, boolean z13) {
        super(3, fbkVar);
        this.f17937d = z;
        this.f17938e = z2;
        this.f17939f = z3;
        this.f17940g = z4;
        this.f17941h = z5;
        this.f17942i = z6;
        this.f17943t = z7;
        this.f17931X = z8;
        this.f17932Y = z9;
        this.f17933Z = z10;
        this.f17927L0 = i;
        this.f17928M0 = z11;
        this.f17929N0 = z12;
        this.f17930O0 = z13;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        apf apfVar = new apf((fbk) obj3, this.f17937d, this.f17938e, this.f17939f, this.f17940g, this.f17941h, this.f17942i, this.f17943t, this.f17931X, this.f17932Y, this.f17933Z, this.f17927L0, this.f17928M0, this.f17929N0, this.f17930O0);
        apfVar.f17935b = (niz) obj;
        apfVar.f17936c = (Object[]) obj2;
        return apfVar.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        niz nizVar = this.f17935b;
        Object[] objArr = this.f17936c;
        int i = this.f17934a;
        if (i == 0) {
            bga.m29073P(obj);
            ebf0 ebf0Var = (ebf0) objArr[0];
            Object obj2 = objArr[1];
            s8k s8kVar = obj2 instanceof s8k ? (s8k) obj2 : null;
            zbr zbrVar = (zbr) objArr[2];
            Object obj3 = objArr[3];
            r1y r1yVar = new r1y(ebf0Var, s8kVar, zbrVar, obj3 instanceof z4m ? (z4m) obj3 : null, this.f17937d, this.f17938e, this.f17939f, this.f17940g, this.f17941h, this.f17942i, this.f17943t, this.f17931X, this.f17932Y, this.f17933Z, this.f17927L0, (v1p0) objArr[4], (mgz0) objArr[5], this.f17928M0, this.f17929N0, this.f17930O0);
            this.f17935b = null;
            this.f17936c = null;
            this.f17934a = 1;
            Object objEmit = nizVar.emit(r1yVar, this);
            yuk yukVar = yuk.f276404a;
            if (objEmit == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }
}
