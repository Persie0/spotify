package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ck3 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38791a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f38792b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f38793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck3(kqi0 kqi0Var, kqi0 kqi0Var2, int i) {
        super(1);
        this.f38791a = i;
        this.f38792b = kqi0Var;
        this.f38793c = kqi0Var2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f38791a;
        w2a1 w2a1Var = w2a1.f247311a;
        kqi0 kqi0Var = this.f38793c;
        kqi0 kqi0Var2 = this.f38792b;
        switch (i) {
            case 0:
                return new bk3(kqi0Var2, kqi0Var, 0);
            case 1:
                return new bk3(kqi0Var2, kqi0Var, 1);
            case 2:
                dvc1 dvc1Var = (dvc1) obj;
                kqi0Var2.setValue(Boolean.TRUE);
                ((gh00) kqi0Var.getValue()).invoke(new ywc(dvc1Var.f53420a, dvc1Var.f53421b, dvc1Var.f53422c));
                return w2a1Var;
            case 3:
                db71 db71Var = (db71) obj;
                kqi0Var2.setValue(new g450(db71Var.f47232c));
                kqi0Var.setValue(Float.valueOf(db71Var.m35535f(0)));
                return w2a1Var;
            case 4:
                jo70 jo70Var = (jo70) obj;
                ydj.m93453l(jo70Var.mo30046x(0L), kqi0Var2);
                kqi0Var.setValue(new g450(jo70Var.mo30018b()));
                return w2a1Var;
            case 5:
                dvc1 dvc1Var2 = (dvc1) obj;
                String str = dvc1Var2.f53420a;
                kqi0Var2.setValue(Boolean.valueOf(!wl51.m88460J0(str)));
                ((gh00) kqi0Var.getValue()).invoke(new rw60(str, dvc1Var2.f53421b, dvc1Var2.f53422c));
                return w2a1Var;
            case 6:
                ((gh00) kqi0Var2.getValue()).invoke(new hsc0((dvc1) obj, (gtc0) kqi0Var.getValue()));
                return w2a1Var;
            case 7:
                ny51 ny51Var = ((sm6) obj).f210571b;
                kqi0Var2.setValue(Integer.valueOf(ny51Var.f159718a.mo68988d()));
                kqi0Var.setValue(Integer.valueOf(ny51Var.f159718a.mo68986b()));
                return w2a1Var;
            case 8:
                ny51 ny51Var2 = ((sm6) obj).f210571b;
                kqi0Var2.setValue(Integer.valueOf(ny51Var2.f159718a.mo68988d()));
                kqi0Var.setValue(Integer.valueOf(ny51Var2.f159718a.mo68986b()));
                return w2a1Var;
            case 9:
                float f = vue0.f244931a;
                kqi0Var2.setValue(Boolean.TRUE);
                kqi0Var.setValue((d850) obj);
                return w2a1Var;
            case 10:
                ((gh00) kqi0Var2.getValue()).invoke((dvc1) obj);
                ((gh00) kqi0Var.getValue()).invoke(z5i0.f279577a);
                return w2a1Var;
            case 11:
                jo70 jo70Var2 = (jo70) obj;
                ydj.m93453l(jo70Var2.mo30006K(0L), kqi0Var2);
                kqi0Var.setValue(new g450(jo70Var2.mo30018b()));
                return w2a1Var;
            case 12:
                o971 o971Var = (o971) obj;
                kqi0Var2.setValue(o971Var);
                kqi0Var.setValue(o971Var.f162953a.f107641b);
                return w2a1Var;
            case 13:
                mpz0 mpz0Var = (mpz0) obj;
                if (((Boolean) kqi0Var2.getValue()).booleanValue()) {
                    xrb1 xrb1Var = new xrb1(kqi0Var, 14);
                    qr60[] qr60VarArr = jpz0.f114758a;
                    mpz0Var.mo62511a(toz0.f222354i, new C1811ee(null, xrb1Var));
                }
                return w2a1Var;
            default:
                if (!((Boolean) obj).booleanValue() && !((Boolean) kqi0Var2.getValue()).booleanValue()) {
                    aq7.m26751i(kqi0Var, true);
                }
                return w2a1Var;
        }
    }
}
