package p204p;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class p5f1 extends kv30 implements u5f1 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f174162l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ q5f1 f174163m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5f1(q5f1 q5f1Var, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 1);
        this.f174162l = i;
        this.f174163m = q5f1Var;
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: a2 */
    public final boolean mo46686a2(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                throw new UnsupportedOperationException();
            case 102:
                mo69171p1((Status) m5f1.m60863a(parcel, Status.CREATOR));
                break;
            case 103:
                mo69170h1((Status) m5f1.m60863a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // p204p.u5f1
    /* JADX INFO: renamed from: h1 */
    public void mo69170h1(Status status) {
        switch (this.f174162l) {
            case 1:
                this.f174163m.m1493a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p204p.u5f1
    /* JADX INFO: renamed from: p1 */
    public void mo69171p1(Status status) {
        switch (this.f174162l) {
            case 0:
                this.f174163m.m1493a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
