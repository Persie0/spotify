package p204p;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class kgf1 extends v0f1 implements gy30 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f122391l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ ev61 f122392m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgf1(thf1 thf1Var, ev61 ev61Var, int i) {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
        this.f122391l = i;
        this.f122392m = ev61Var;
    }

    @Override // p204p.gy30
    /* JADX INFO: renamed from: U0 */
    public final void mo46119U0(Status status) {
        switch (this.f122391l) {
            case 0:
                oqg1.m67643l(status, null, this.f122392m);
                break;
            case 1:
                oqg1.m67643l(status, Boolean.TRUE, this.f122392m);
                break;
            default:
                oqg1.m67643l(status, null, this.f122392m);
                break;
        }
    }

    @Override // p204p.v0f1
    /* JADX INFO: renamed from: a2 */
    public final boolean mo56334a2(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) x3f1.m89795a(parcel, Status.CREATOR);
        x3f1.m89797c(parcel);
        mo46119U0(status);
        return true;
    }
}
