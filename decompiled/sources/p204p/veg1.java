package p204p;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class veg1 extends Binder implements iwf1, IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f240753a;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ev61 f240754l;

    public veg1(int i, ev61 ev61Var) {
        this.f240753a = i;
        this.f240754l = ev61Var;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override // p204p.iwf1
    /* JADX INFO: renamed from: e0 */
    public final void mo51822e0(Status status, jq40 jq40Var) {
        switch (this.f240753a) {
            case 0:
                break;
            default:
                oqg1.m67643l(status, jq40Var, this.f240754l);
                break;
        }
    }

    @Override // p204p.iwf1
    /* JADX INFO: renamed from: m1 */
    public final void mo51823m1(Status status, pgx pgxVar) {
        switch (this.f240753a) {
            case 0:
                oqg1.m67643l(status, pgxVar, this.f240754l);
                break;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            Status status = (Status) pmf1.m70341a(parcel, Status.CREATOR);
            jq40 jq40Var = (jq40) pmf1.m70341a(parcel, jq40.CREATOR);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new BadParcelableException(s571.m77246e(iDataAvail, "Parcel data not fully consumed, unread size: "));
            }
            mo51822e0(status, jq40Var);
            return true;
        }
        if (i != 2) {
            return false;
        }
        Status status2 = (Status) pmf1.m70341a(parcel, Status.CREATOR);
        pgx pgxVar = (pgx) pmf1.m70341a(parcel, pgx.CREATOR);
        int iDataAvail2 = parcel.dataAvail();
        if (iDataAvail2 > 0) {
            throw new BadParcelableException(s571.m77246e(iDataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        mo51823m1(status2, pgxVar);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX INFO: renamed from: C */
    private final void m85321C(Status status, pgx pgxVar) {
    }

    /* JADX INFO: renamed from: v1 */
    private final void m85322v1(Status status, jq40 jq40Var) {
    }
}
