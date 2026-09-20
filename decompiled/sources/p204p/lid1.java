package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lid1 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f133778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ th00 f133779c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f133780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lid1(kqi0 kqi0Var, th00 th00Var, gh00 gh00Var, int i) {
        super(2);
        this.f133777a = i;
        this.f133778b = kqi0Var;
        this.f133779c = th00Var;
        this.f133780d = gh00Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f133777a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                kqi0 kqi0Var = this.f133778b;
                kqi0Var.setValue(uid1.m83195a((uid1) kqi0Var.getValue(), false, iIntValue, 1));
                Integer numValueOf = Integer.valueOf(iIntValue);
                th00 th00Var = this.f133779c;
                lb81 lb81Var = lb81.f131600a;
                th00Var.invoke(lb81Var, numValueOf);
                this.f133780d.invoke(new o7g0(lb81Var, iIntValue, zBooleanValue));
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                kqi0 kqi0Var2 = this.f133778b;
                kqi0Var2.setValue(uid1.m83195a((uid1) kqi0Var2.getValue(), false, iIntValue2, 1));
                Integer numValueOf2 = Integer.valueOf(iIntValue2);
                th00 th00Var2 = this.f133779c;
                lb81 lb81Var2 = lb81.f131601b;
                th00Var2.invoke(lb81Var2, numValueOf2);
                this.f133780d.invoke(new o7g0(lb81Var2, iIntValue2, zBooleanValue2));
                break;
        }
        return w2a1.f247311a;
    }
}
