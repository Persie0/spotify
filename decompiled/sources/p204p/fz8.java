package p204p;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fz8 extends BasePendingResult implements gz8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz8(lh51 lh51Var, r3f1 r3f1Var) {
        super(r3f1Var);
        ig31.m50507y(r3f1Var, "GoogleApiClient must not be null");
        ig31.m50507y(lh51Var, "Api must not be null");
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo42286k0(o35 o35Var);

    /* JADX INFO: renamed from: l0 */
    public final void m43174l0(o35 o35Var) throws DeadObjectException {
        try {
            mo42286k0(o35Var);
        } catch (DeadObjectException e) {
            m43175m0(new Status(8, e.getLocalizedMessage(), null, null));
            throw e;
        } catch (RemoteException e2) {
            m43175m0(new Status(8, e2.getLocalizedMessage(), null, null));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m43175m0(Status status) {
        ig31.m50497o("Failed result must not be success", !status.m1489k());
        m1493a(mo1492Z(status));
    }
}
