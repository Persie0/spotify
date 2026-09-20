package p204p;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class rof1 extends m4h1 {

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ Uri f201250X0;

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ int f201251Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rof1(r3f1 r3f1Var, Uri uri, int i) {
        super(r3f1Var);
        this.f201250X0 = uri;
        this.f201251Y0 = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: Z */
    public final /* bridge */ /* synthetic */ d7x0 mo1492Z(Status status) {
        return new eqf1(status, 0);
    }

    @Override // p204p.fz8
    /* JADX INFO: renamed from: k0 */
    public final void mo42286k0(o35 o35Var) {
        o1g1 o1g1Var = (o1g1) ((ldg1) o35Var).m37438q();
        lag1 lag1Var = new lag1(this, 0);
        Parcel parcelM43604d2 = o1g1Var.m43604d2();
        int i = qmf1.f190217a;
        parcelM43604d2.writeStrongBinder(lag1Var);
        qmf1.m73273c(parcelM43604d2, this.f201250X0);
        parcelM43604d2.writeInt(this.f201251Y0);
        o1g1Var.m43603c2(41, parcelM43604d2);
    }
}
