package p204p;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes3.dex */
public final class d4f1 extends BasePendingResult {

    /* JADX INFO: renamed from: X0 */
    public final Status f45154X0;

    public d4f1(Status status) {
        super((r3f1) null);
        this.f45154X0 = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: Z */
    public final d7x0 mo1492Z(Status status) {
        return this.f45154X0;
    }
}
