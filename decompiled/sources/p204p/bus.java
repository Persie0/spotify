package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes9.dex */
public final class bus extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f31203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bus(kqi0 kqi0Var, int i) {
        super(1);
        this.f31202a = i;
        this.f31203b = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f31202a;
        boolean z = false;
        w2a1 w2a1Var = w2a1.f247311a;
        kqi0 kqi0Var = this.f31203b;
        switch (i) {
            case 0:
                kqi0Var.setValue(Boolean.valueOf(((kqz) obj).m57129b()));
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                kqi0Var.setValue(bool);
                break;
            case 2:
                kqi0Var.setValue((cey) obj);
                break;
            case 3:
                kqi0Var.setValue((cey) obj);
                break;
            case 4:
                kqi0Var.setValue((c450) obj);
                break;
            case 5:
                kqi0Var.setValue((c450) obj);
                break;
            case 6:
                kqi0Var.setValue(new g450(((g450) obj).f76347a));
                break;
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                kqi0Var.setValue(bool2);
                break;
            case 8:
                kqi0Var.setValue((String) obj);
                break;
            case 9:
                jo70 jo70Var = (jo70) obj;
                tiv0 tiv0VarMo30001I = pwg1.m71280o(jo70Var).mo30001I(jo70Var, true);
                if (!tiv0VarMo30001I.equals((tiv0) kqi0Var.getValue())) {
                    kqi0Var.setValue(tiv0VarMo30001I);
                }
                break;
            case 10:
                jo70 jo70Var2 = (jo70) obj;
                tiv0 tiv0VarMo30001I2 = pwg1.m71280o(jo70Var2).mo30001I(jo70Var2, true);
                if (!tiv0VarMo30001I2.equals((tiv0) kqi0Var.getValue())) {
                    kqi0Var.setValue(tiv0VarMo30001I2);
                }
                break;
            case 11:
                kqi0Var.setValue((tiv0) obj);
                break;
            case 12:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                kqi0Var.setValue(bool3);
                break;
            case 13:
                kqi0Var.setValue(Boolean.valueOf(((float) ((Number) obj).intValue()) > 0.5f));
                break;
            case 14:
                kqi0Var.setValue((Integer) obj);
                break;
            case 15:
                kqi0Var.setValue((Integer) obj);
                break;
            case 16:
                kqi0Var.setValue((edx) obj);
                break;
            case 17:
                ((vc80) obj).f240072a = new vi1(8, null, kqi0Var);
                break;
            case 18:
                kqi0Var.setValue((jo70) obj);
                break;
            case 19:
                kqi0Var.setValue(Boolean.valueOf(((kqz) obj).m57129b()));
                break;
            case 20:
                fdx0 fdx0Var = (fdx0) obj;
                float f = x3z.f257917a;
                fdx0Var.m41396v(Float.intBitsToFloat((int) (((Offset) kqi0Var.getValue()).f493a >> 32)));
                fdx0Var.m41397w(Float.intBitsToFloat((int) (((Offset) kqi0Var.getValue()).f493a & 4294967295L)));
                fdx0Var.m41390m(1.1f);
                fdx0Var.m41391o(1.1f);
                break;
            case 21:
                kqi0Var.setValue(Boolean.valueOf(((kqz) obj).m57129b()));
                break;
            case 22:
                kqz kqzVar = (kqz) obj;
                if (kqzVar.m57129b() && kqzVar.m57128a()) {
                    z = true;
                }
                kqi0Var.setValue(Boolean.valueOf(z));
                break;
            case 23:
                kqi0Var.setValue((gh00) obj);
                break;
            case 24:
                kqi0Var.setValue(new g450(((g450) obj).f76347a));
                break;
            case 25:
                kqi0Var.setValue(new g450(((g450) obj).f76347a));
                break;
            case 26:
                ny51 ny51Var = ((sm6) obj).f210571b;
                p340 p340Var = ny51Var.f159718a;
                p340 p340Var2 = ny51Var.f159718a;
                kqi0Var.setValue((p340Var.mo68988d() == -1 || p340Var2.mo68986b() == -1) ? new pqm0(1, 1) : new pqm0(Integer.valueOf(p340Var2.mo68988d()), Integer.valueOf(p340Var2.mo68986b())));
                break;
            case 27:
                kqi0Var.setValue(new g450(((jo70) obj).mo30018b()));
                break;
            case 28:
                long j = ((Offset) obj).f493a;
                ((eh00) kqi0Var.getValue()).invoke();
                break;
            default:
                ((gh00) kqi0Var.getValue()).invoke((ada) obj);
                break;
        }
        return w2a1Var;
    }
}
