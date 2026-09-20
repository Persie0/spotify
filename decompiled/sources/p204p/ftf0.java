package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes9.dex */
public final class ftf0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f73208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f73209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ftf0(kqi0 kqi0Var, int i) {
        super(0);
        this.f73208a = i;
        this.f73209b = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        n6q n6qVar;
        int i = this.f73208a;
        w2a1 w2a1Var = w2a1.f247311a;
        kqi0 kqi0Var = this.f73209b;
        switch (i) {
            case 0:
                kqi0Var.setValue(vsf0.f244429a);
                return w2a1Var;
            case 1:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 2:
                ((gh00) kqi0Var.getValue()).invoke(z5i0.f279577a);
                return w2a1Var;
            case 3:
                lg21 lg21Var = (lg21) kqi0Var.getValue();
                if (lg21Var != null) {
                    lg21Var.m58929h();
                }
                kqi0Var.setValue(null);
                return w2a1Var;
            case 4:
                lg21 lg21Var2 = (lg21) kqi0Var.getValue();
                if (lg21Var2 != null) {
                    lg21Var2.m58929h();
                }
                kqi0Var.setValue(null);
                return w2a1Var;
            case 5:
                ((gh00) kqi0Var.getValue()).invoke(osk0.f168833a);
                return w2a1Var;
            case 6:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 7:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 8:
                kqi0Var.setValue(null);
                return w2a1Var;
            case 9:
                kqi0Var.setValue(null);
                return w2a1Var;
            case 10:
                kqi0Var.setValue(u9j0.f228216a);
                return w2a1Var;
            case 11:
                fda fdaVar = (fda) kqi0Var.getValue();
                if (fdaVar == null || (n6qVar = fdaVar.f68408f) == null) {
                    return null;
                }
                return n6qVar.f150936a;
            case 12:
                kqi0Var.setValue(Boolean.valueOf(!((Boolean) kqi0Var.getValue()).booleanValue()));
                return w2a1Var;
            case 13:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 14:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 15:
                kqi0Var.setValue(null);
                return w2a1Var;
            case 16:
                return sam.m77645B(Boolean.valueOf(((String) kqi0Var.getValue()).length() == 4));
            case 17:
                wjf1.m88302m(kqi0Var, true);
                return w2a1Var;
            case 18:
                wjf1.m88302m(kqi0Var, false);
                return w2a1Var;
            case 19:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 20:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 21:
                ((gh00) kqi0Var.getValue()).invoke(u8u0.f228018a);
                return w2a1Var;
            case 22:
                ((gh00) kqi0Var.getValue()).invoke(r8u0.f196839a);
                return w2a1Var;
            case 23:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 24:
                kqi0Var.setValue(Boolean.valueOf(!((Boolean) kqi0Var.getValue()).booleanValue()));
                return w2a1Var;
            case 25:
                return new Offset(((Offset) kqi0Var.getValue()).f493a);
            case 26:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 27:
                eh00 eh00Var = (eh00) kqi0Var.getValue();
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                return w2a1Var;
            case 28:
                eh00 eh00Var2 = (eh00) kqi0Var.getValue();
                if (eh00Var2 != null) {
                    eh00Var2.invoke();
                }
                return w2a1Var;
            default:
                float f = joy0.f114530a;
                return Long.valueOf(((boy0) kqi0Var.getValue()).f29277a.f284600c);
        }
    }
}
