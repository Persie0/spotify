package p204p;

import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class clg1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39282a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ffd0 f39283b;

    public /* synthetic */ clg1(ffd0 ffd0Var, int i) {
        this.f39282a = i;
        this.f39283b = ffd0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m33274a(d7x0 d7x0Var) {
        eif1 eif1Var = (eif1) d7x0Var;
        switch (this.f39282a) {
            case 0:
                ffd0 ffd0Var = this.f39283b;
                ffd0Var.getClass();
                Status status = eif1Var.getStatus();
                int i = status.f1842a;
                if (i != 0) {
                    ((ura0) ffd0Var.f68975b).m83850c(ikc0.m50939k("Error fetching queue items, statusCode=", ", statusMessage=", i, status.f1843b), new Object[0]);
                }
                ffd0Var.f68984k = null;
                if (!((ArrayDeque) ffd0Var.f68981h).isEmpty()) {
                    ywh0 ywh0Var = (ywh0) ffd0Var.f68982i;
                    xhc1 xhc1Var = (xhc1) ffd0Var.f68983j;
                    ywh0Var.removeCallbacks(xhc1Var);
                    ywh0Var.postDelayed(xhc1Var, 500L);
                }
                break;
            default:
                Status status2 = eif1Var.getStatus();
                int i2 = status2.f1842a;
                ffd0 ffd0Var2 = this.f39283b;
                if (i2 != 0) {
                    ((ura0) ffd0Var2.f68975b).m83850c(ikc0.m50939k("Error fetching queue item ids, statusCode=", ", statusMessage=", i2, status2.f1843b), new Object[0]);
                }
                ffd0Var2.f68985l = null;
                if (!((ArrayDeque) ffd0Var2.f68981h).isEmpty()) {
                    ywh0 ywh0Var2 = (ywh0) ffd0Var2.f68982i;
                    xhc1 xhc1Var2 = (xhc1) ffd0Var2.f68983j;
                    ywh0Var2.removeCallbacks(xhc1Var2);
                    ywh0Var2.postDelayed(xhc1Var2, 500L);
                }
                break;
        }
    }
}
