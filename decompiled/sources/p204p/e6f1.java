package p204p;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e6f1 extends kv30 implements k0g1 {
    public e6f1() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 10);
    }

    @Override // p204p.k0g1
    /* JADX INFO: renamed from: C0 */
    public void mo37935C0(DataHolder dataHolder) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.k0g1
    /* JADX INFO: renamed from: D */
    public void mo37936D(cxf1 cxf1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.k0g1
    /* JADX INFO: renamed from: V0 */
    public void mo37937V0(j7g1 j7g1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.k0g1
    /* JADX INFO: renamed from: Z1 */
    public void mo37938Z1(yxf1 yxf1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.k0g1
    /* JADX INFO: renamed from: a1 */
    public void mo37939a1(utf1 utf1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                throw t3d1.m79994i(parcel);
            case 3:
                j7g1 j7g1Var = (j7g1) qmf1.m73271a(parcel, j7g1.CREATOR);
                qmf1.m73272b(parcel);
                mo37937V0(j7g1Var);
                break;
            case 4:
                throw t3d1.m79994i(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) qmf1.m73271a(parcel, DataHolder.CREATOR);
                qmf1.m73272b(parcel);
                mo37935C0(dataHolder);
                break;
            case 6:
                utf1 utf1Var = (utf1) qmf1.m73271a(parcel, utf1.CREATOR);
                qmf1.m73272b(parcel);
                mo37939a1(utf1Var);
                break;
            case 7:
                throw t3d1.m79994i(parcel);
            case 8:
                throw t3d1.m79994i(parcel);
            case 9:
                throw t3d1.m79994i(parcel);
            case 10:
                yxf1 yxf1Var = (yxf1) qmf1.m73271a(parcel, yxf1.CREATOR);
                qmf1.m73272b(parcel);
                mo37938Z1(yxf1Var);
                break;
            case 11:
                Status status = (Status) qmf1.m73271a(parcel, Status.CREATOR);
                qmf1.m73272b(parcel);
                mo25472r1(status);
                break;
            case 12:
                throw t3d1.m79994i(parcel);
            case 13:
                throw t3d1.m79994i(parcel);
            case 14:
                throw t3d1.m79994i(parcel);
            case 15:
                throw t3d1.m79994i(parcel);
            case 16:
                throw t3d1.m79994i(parcel);
            case 17:
                throw t3d1.m79994i(parcel);
            case 18:
                throw t3d1.m79994i(parcel);
            case 19:
                throw t3d1.m79994i(parcel);
            case 20:
                throw t3d1.m79994i(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw t3d1.m79994i(parcel);
            case 23:
                euf1 euf1Var = (euf1) qmf1.m73271a(parcel, euf1.CREATOR);
                qmf1.m73272b(parcel);
                mo37940n(euf1Var);
                break;
            case 26:
                throw t3d1.m79994i(parcel);
            case 27:
                throw t3d1.m79994i(parcel);
            case 28:
                throw t3d1.m79994i(parcel);
            case 29:
                throw t3d1.m79994i(parcel);
            case 30:
                throw t3d1.m79994i(parcel);
            case 34:
                throw t3d1.m79994i(parcel);
            case 35:
                throw t3d1.m79994i(parcel);
            case 36:
                throw t3d1.m79994i(parcel);
            case 37:
                cxf1 cxf1Var = (cxf1) qmf1.m73271a(parcel, cxf1.CREATOR);
                qmf1.m73272b(parcel);
                mo37936D(cxf1Var);
                break;
            case 38:
                throw t3d1.m79994i(parcel);
            case 39:
                throw t3d1.m79994i(parcel);
            case 40:
                throw t3d1.m79994i(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // p204p.k0g1
    /* JADX INFO: renamed from: n */
    public void mo37940n(euf1 euf1Var) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: r1 */
    public void mo25472r1(Status status) {
        throw new UnsupportedOperationException();
    }
}
