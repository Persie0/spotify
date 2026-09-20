package p204p;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dr4 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52164a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f52165b;

    public /* synthetic */ dr4(kqi0 kqi0Var, int i) {
        this.f52164a = i;
        this.f52165b = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f52164a) {
            case 0:
                jo70 jo70Var = (jo70) this.f52165b.getValue();
                if (jo70Var != null) {
                    return jo70Var;
                }
                pt40.m70894d("Required value was null.");
                throw new KotlinNothingValueException();
            case 1:
                jo70 jo70Var2 = (jo70) this.f52165b.getValue();
                if (jo70Var2 != null) {
                    return jo70Var2;
                }
                pt40.m70894d("Required value was null.");
                throw new KotlinNothingValueException();
            case 2:
                kqi0 kqi0Var = this.f52165b;
                if (kqi0Var != null) {
                    return (List) kqi0Var.getValue();
                }
                return null;
            case 3:
                Boolean bool = (Boolean) this.f52165b.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                kqi0 kqi0Var2 = this.f52165b;
                w2a1 w2a1Var = w2a1.f247311a;
                kqi0Var2.setValue(w2a1Var);
                return w2a1Var;
            case 5:
                kqi0 kqi0Var3 = this.f52165b;
                ((rnx) kqi0Var3.getValue()).getClass();
                kqi0Var3.setValue(new rnx());
                return w2a1.f247311a;
            case 6:
                return new ks70((gh00) this.f52165b.getValue());
            case 7:
                return (iv70) ((eh00) this.f52165b.getValue()).invoke();
            case 8:
                return new mw70((gh00) this.f52165b.getValue());
            case 9:
                return new ay70((gh00) this.f52165b.getValue());
            case 10:
                jo70 jo70Var3 = (jo70) this.f52165b.getValue();
                if (jo70Var3 != null) {
                    return jo70Var3;
                }
                pt40.m70894d("Required value was null.");
                throw new KotlinNothingValueException();
            default:
                return (jo70) this.f52165b.getValue();
        }
    }
}
