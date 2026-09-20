package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class lxj extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f137826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f137827c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f137828d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kqi0 f137829e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ kqi0 f137830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxj(eh00 eh00Var, float f, gh00 gh00Var, kqi0 kqi0Var, kqi0 kqi0Var2, int i) {
        super(1);
        this.f137825a = i;
        this.f137826b = eh00Var;
        this.f137827c = f;
        this.f137828d = gh00Var;
        this.f137829e = kqi0Var;
        this.f137830f = kqi0Var2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f137825a) {
            case 0:
                db71 db71Var = (db71) obj;
                if (db71Var.m35533d()) {
                    if (((Boolean) this.f137829e.getValue()).booleanValue()) {
                        kqi0 kqi0Var = this.f137830f;
                        if (((Integer) kqi0Var.getValue()) == null && this.f137826b != null) {
                            kqi0Var.setValue(Integer.valueOf(n1h1.m63499i(db71Var, this.f137827c)));
                        }
                    }
                    this.f137828d.invoke(new exj(true));
                }
                break;
            case 1:
                db71 db71Var2 = (db71) obj;
                if (db71Var2.m35533d()) {
                    kqi0 kqi0Var2 = this.f137829e;
                    if (!((Boolean) kqi0Var2.getValue()).booleanValue() && this.f137826b != null) {
                        kqi0Var2.setValue(Boolean.TRUE);
                        this.f137830f.setValue(Integer.valueOf(n1h1.m63499i(db71Var2, this.f137827c)));
                        this.f137828d.invoke(new exj(true));
                    }
                }
                break;
            default:
                db71 db71Var3 = (db71) obj;
                Boolean boolValueOf = Boolean.valueOf(db71Var3.m35533d());
                kqi0 kqi0Var3 = this.f137829e;
                kqi0Var3.setValue(boolValueOf);
                if (((Boolean) kqi0Var3.getValue()).booleanValue()) {
                    kqi0 kqi0Var4 = this.f137830f;
                    if (((Integer) kqi0Var4.getValue()) == null && this.f137826b != null) {
                        z6i0 z6i0Var = db71Var3.f47231b;
                        int i = z6i0Var.f279922f;
                        long j = db71Var3.f47232c;
                        Iterator it = n0e1.m63417Y(0, i).iterator();
                        Object obj2 = null;
                        while (((a450) it).f12141c) {
                            Object next = ((t350) it).next();
                            if (z6i0Var.m95495b(((Number) next).intValue()) <= ((int) (4294967295L & j))) {
                                obj2 = next;
                            }
                        }
                        Integer num = (Integer) obj2;
                        int iIntValue = num != null ? num.intValue() : i - 1;
                        float f = (int) (j >> 32);
                        float f2 = this.f137827c;
                        int iCeil = ((int) Math.ceil(f2 / f)) - 1;
                        if (iCeil < 0) {
                            iCeil = 0;
                        }
                        int i2 = iIntValue - iCeil;
                        int i3 = i2 >= 0 ? i2 : 0;
                        float f3 = f2 - ((iIntValue - i3) * f);
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                        int iM95496c = z6i0Var.m95496c(i3, true);
                        int iM35538i = db71Var3.m35538i(i3);
                        if (iM35538i <= iM95496c) {
                            while (true) {
                                if (f - db71Var3.m35534e(iM95496c, true) >= f3) {
                                    iM35538i = iM95496c;
                                } else if (iM95496c != iM35538i) {
                                    iM95496c--;
                                }
                            }
                        }
                        kqi0Var4.setValue(Integer.valueOf(iM35538i));
                    }
                }
                this.f137828d.invoke(new lg11(((Boolean) kqi0Var3.getValue()).booleanValue()));
                break;
        }
        return w2a1.f247311a;
    }
}
