package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ql7 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f189744a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kkr0 f189745b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g301 f189746c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ w201 f189747d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ig40 f189748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql7(lyi0 lyi0Var, kkr0 kkr0Var, g301 g301Var, w201 w201Var, ig40 ig40Var, shc1 shc1Var) {
        super(1);
        this.f189745b = kkr0Var;
        this.f189746c = g301Var;
        this.f189747d = w201Var;
        this.f189748e = ig40Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f189744a) {
            case 0:
                w201 w201Var = this.f189747d;
                ig40 ig40Var = this.f189748e;
                return new sl7(this.f189745b, this.f189746c, w201Var, (zl7) obj, ig40Var);
            default:
                ig40 ig40Var2 = this.f189748e;
                return new sl7(this.f189745b, this.f189746c, this.f189747d, yl7.f273926a, ig40Var2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql7(kkr0 kkr0Var, g301 g301Var, w201 w201Var, ig40 ig40Var, shc1 shc1Var) {
        super(1);
        this.f189745b = kkr0Var;
        this.f189746c = g301Var;
        this.f189747d = w201Var;
        this.f189748e = ig40Var;
    }
}
