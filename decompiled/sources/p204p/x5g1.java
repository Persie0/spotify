package p204p;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class x5g1 implements gz8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258410a;

    /* JADX INFO: renamed from: b */
    public final ev61 f258411b;

    public /* synthetic */ x5g1(int i, ev61 ev61Var) {
        this.f258410a = i;
        this.f258411b = ev61Var;
    }

    @Override // p204p.gz8
    /* JADX INFO: renamed from: a */
    public final void mo46192a(Object obj) {
        switch (this.f258410a) {
            case 0:
                c6g1 c6g1Var = (c6g1) obj;
                boolean zM1489k = c6g1Var.f34536a.m1489k();
                ev61 ev61Var = this.f258411b;
                if (!zM1489k) {
                    ev61Var.m40096a(uqe1.m83767f(c6g1Var.f34536a));
                } else {
                    ev61Var.m40097b(c6g1Var.f34537b);
                }
                break;
            case 1:
                Status status = (Status) obj;
                int i = status.f1842a;
                ev61 ev61Var2 = this.f258411b;
                if (i == 0) {
                    ev61Var2.m40097b(Boolean.TRUE);
                } else if (i != 4002) {
                    ev61Var2.m40096a(new ApiException(status));
                } else {
                    ev61Var2.m40097b(Boolean.FALSE);
                }
                break;
            default:
                Status status2 = (Status) obj;
                int i2 = status2.f1842a;
                ev61 ev61Var3 = this.f258411b;
                if (i2 == 0 || i2 == 4001) {
                    ev61Var3.m40097b(null);
                } else {
                    ev61Var3.m40096a(new ApiException(status2));
                }
                break;
        }
    }
}
