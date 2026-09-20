package p204p;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class q5f1 extends fz8 {

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ int f185525X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5f1(r3f1 r3f1Var, int i) {
        super(dg7.f48745a, r3f1Var);
        this.f185525X0 = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: Z */
    public final /* bridge */ /* synthetic */ d7x0 mo1492Z(Status status) {
        int i = this.f185525X0;
        return status;
    }

    @Override // p204p.fz8
    /* JADX INFO: renamed from: k0 */
    public final void mo42286k0(o35 o35Var) {
        switch (this.f185525X0) {
            case 0:
                o5f1 o5f1Var = (o5f1) o35Var;
                v5f1 v5f1Var = (v5f1) o5f1Var.m37438q();
                p5f1 p5f1Var = new p5f1(this, 0);
                GoogleSignInOptions googleSignInOptions = o5f1Var.f161962B;
                Parcel parcelM43600C = v5f1Var.m43600C();
                int i = m5f1.f140220a;
                parcelM43600C.writeStrongBinder(p5f1Var);
                m5f1.m60864b(parcelM43600C, googleSignInOptions);
                v5f1Var.m43610v1(102, parcelM43600C);
                break;
            default:
                o5f1 o5f1Var2 = (o5f1) o35Var;
                v5f1 v5f1Var2 = (v5f1) o5f1Var2.m37438q();
                p5f1 p5f1Var2 = new p5f1(this, 1);
                GoogleSignInOptions googleSignInOptions2 = o5f1Var2.f161962B;
                Parcel parcelM43600C2 = v5f1Var2.m43600C();
                int i2 = m5f1.f140220a;
                parcelM43600C2.writeStrongBinder(p5f1Var2);
                m5f1.m60864b(parcelM43600C2, googleSignInOptions2);
                v5f1Var2.m43610v1(103, parcelM43600C2);
                break;
        }
    }
}
