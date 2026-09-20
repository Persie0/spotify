package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ajv0 implements pmj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16359a = 1;

    /* JADX INFO: renamed from: b */
    public final String f16360b;

    /* JADX INFO: renamed from: c */
    public final iw4 f16361c;

    /* JADX INFO: renamed from: d */
    public final boolean f16362d;

    /* JADX INFO: renamed from: e */
    public final qw4 f16363e;

    /* JADX INFO: renamed from: f */
    public final Object f16364f;

    public ajv0(String str, iw4 iw4Var, iw4 iw4Var2, ow4 ow4Var, boolean z) {
        this.f16360b = str;
        this.f16361c = iw4Var;
        this.f16363e = iw4Var2;
        this.f16364f = ow4Var;
        this.f16362d = z;
    }

    @Override // p204p.pmj
    /* JADX INFO: renamed from: a */
    public final hej mo26175a(r9b0 r9b0Var, u8b0 u8b0Var, oz8 oz8Var) {
        switch (this.f16359a) {
            case 0:
                return new ziv0(r9b0Var, oz8Var, this);
            default:
                return new kmw0(r9b0Var, oz8Var, this);
        }
    }

    public String toString() {
        switch (this.f16359a) {
            case 0:
                return "RectangleShape{position=" + this.f16363e + ", size=" + ((qw4) this.f16364f) + '}';
            default:
                return super.toString();
        }
    }

    public ajv0(String str, qw4 qw4Var, hw4 hw4Var, iw4 iw4Var, boolean z) {
        this.f16360b = str;
        this.f16363e = qw4Var;
        this.f16364f = hw4Var;
        this.f16361c = iw4Var;
        this.f16362d = z;
    }
}
