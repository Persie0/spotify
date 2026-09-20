package p204p;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
public final class oof1 extends m4h1 {

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ Uri f167586X0;

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ int f167587Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oof1(r3f1 r3f1Var, Uri uri, int i) {
        super(r3f1Var);
        this.f167586X0 = uri;
        this.f167587Y0 = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: Z */
    public final d7x0 mo1492Z(Status status) {
        return new rfo(new DataHolder(DataHolder.f1860X, status.f1842a));
    }

    @Override // p204p.fz8
    /* JADX INFO: renamed from: k0 */
    public final /* bridge */ /* synthetic */ void mo42286k0(o35 o35Var) {
        ((o1g1) ((ldg1) o35Var).m37438q()).m66069l2(new lag1(this, 4), this.f167586X0, this.f167587Y0);
    }
}
