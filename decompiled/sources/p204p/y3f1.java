package p204p;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y3f1 extends v0f1 {
    @Override // p204p.v0f1
    /* JADX INFO: renamed from: a2 */
    public final boolean mo56334a2(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                x3f1.m89797c(parcel);
                break;
            case 4:
                x3f1.m89797c(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                x3f1.m89797c(parcel);
                break;
            case 7:
                x3f1.m89797c(parcel);
                break;
            case 8:
                t4f1 t4f1Var = (t4f1) x3f1.m89795a(parcel, t4f1.CREATOR);
                x3f1.m89797c(parcel);
                b4f1 b4f1Var = (b4f1) this;
                b4f1Var.f23345m.post(new vpa1(b4f1Var, t4f1Var, 9));
                break;
            case 9:
                x3f1.m89797c(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
