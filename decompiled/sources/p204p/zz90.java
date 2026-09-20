package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zz90 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ niz f287924a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z990 f287925b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f287926c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h990 f287927d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f287928e;

    public zz90(niz nizVar, z990 z990Var, String str, h990 h990Var, long j) {
        this.f287924a = nizVar;
        this.f287925b = z990Var;
        this.f287926c = str;
        this.f287927d = h990Var;
        this.f287928e = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        yz90 yz90Var;
        if (fbkVar instanceof yz90) {
            yz90Var = (yz90) fbkVar;
            int i = yz90Var.f277734b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yz90Var.f277734b = i - Integer.MIN_VALUE;
            } else {
                yz90Var = new yz90(this, fbkVar);
            }
        } else {
            yz90Var = new yz90(this, fbkVar);
        }
        Object obj2 = yz90Var.f277733a;
        int i2 = yz90Var.f277734b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            pqm0 pqm0Var = (pqm0) obj;
            String str = (String) pqm0Var.f180350a;
            String str2 = (String) pqm0Var.f180351b;
            String str3 = this.f287925b.f280723a;
            w990 w990Var = (str == null || str2 == null) ? null : new w990(str, str2);
            h990 h990Var = this.f287927d;
            o990 o990Var = new o990(str3, this.f287926c, w990Var, h990Var.f88901a, h990Var.f88902b, this.f287928e);
            yz90Var.f277734b = 1;
            Object objEmit = this.f287924a.emit(o990Var, yz90Var);
            yuk yukVar = yuk.f276404a;
            if (objEmit == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
