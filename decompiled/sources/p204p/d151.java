package p204p;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes3.dex */
public final class d151 extends BasePendingResult {

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ int f44169X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d151(Looper looper) {
        super(looper);
        this.f44169X0 = 0;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: Z */
    public final d7x0 mo1492Z(Status status) {
        switch (this.f44169X0) {
            case 0:
                return status;
            case 1:
                return new eif1(this, status);
            default:
                ura0 ura0Var = obc.f163599m;
                return status;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d151(r3f1 r3f1Var, int i) {
        super(r3f1Var);
        this.f44169X0 = i;
    }
}
