package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pep extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f176829b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pep(kqi0 kqi0Var, int i) {
        super(0);
        this.f176828a = i;
        this.f176829b = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f176828a;
        w2a1 w2a1Var = w2a1.f247311a;
        kqi0 kqi0Var = this.f176829b;
        switch (i) {
            case 0:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 1:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 2:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 3:
                return (List) kqi0Var.getValue();
            case 4:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 5:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 6:
                float f = hfs.f90797a;
                ((eh00) kqi0Var.getValue()).invoke();
                return w2a1Var;
            case 7:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 8:
                eh00 eh00Var = (eh00) kqi0Var.getValue();
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                return w2a1Var;
            case 9:
                eh00 eh00Var2 = (eh00) kqi0Var.getValue();
                if (eh00Var2 != null) {
                    eh00Var2.invoke();
                }
                return w2a1Var;
            case 10:
                Boolean bool = (Boolean) kqi0Var.getValue();
                bool.getClass();
                return bool;
            case 11:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 12:
                kqi0Var.setValue(null);
                return w2a1Var;
            case 13:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 14:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 15:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 16:
                float f2 = of10.f164616a;
                kqi0Var.setValue(odt.f164246b);
                return w2a1Var;
            case 17:
                float f3 = of10.f164616a;
                kqi0Var.setValue(odt.f164247c);
                return w2a1Var;
            case 18:
                return (wb61) kqi0Var.getValue();
            case 19:
                kqi0Var.setValue(Boolean.valueOf(!((Boolean) kqi0Var.getValue()).booleanValue()));
                return w2a1Var;
            case 20:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 21:
                kqi0Var.setValue(null);
                return w2a1Var;
            case 22:
                eh00 eh00Var3 = (eh00) kqi0Var.getValue();
                if (eh00Var3 != null) {
                    eh00Var3.invoke();
                }
                kqi0Var.setValue(null);
                return w2a1Var;
            case 23:
                ((gh00) kqi0Var.getValue()).invoke(dw60.f53626a);
                return w2a1Var;
            case 24:
                ((gh00) kqi0Var.getValue()).invoke(bw60.f31565a);
                return w2a1Var;
            case 25:
                ((gh00) kqi0Var.getValue()).invoke(lw60.f137459a);
                return w2a1Var;
            case 26:
                kqi0Var.setValue(f6i0.f66415a);
                return w2a1Var;
            case 27:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 28:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            default:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
        }
    }
}
