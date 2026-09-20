package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ftu implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f73307a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f73307a) {
            case 0:
                parcel.readInt();
                return gtu.f84283c;
            case 1:
                parcel.readInt();
                return htu.f95168c;
            case 2:
                parcel.readInt();
                return itu.f105744c;
            case 3:
                parcel.readInt();
                return jtu.f115972c;
            case 4:
                parcel.readInt();
                return ktu.f126401c;
            case 5:
                parcel.readInt();
                return ltu.f136867c;
            case 6:
                parcel.readInt();
                return mtu.f147157c;
            case 7:
                parcel.readInt();
                return ntu.f158150c;
            case 8:
                parcel.readInt();
                return otu.f170099c;
            case 9:
                parcel.readInt();
                return ptu.f181256c;
            case 10:
                parcel.readInt();
                return qtu.f192484c;
            case 11:
                parcel.readInt();
                return rtu.f202654c;
            case 12:
                parcel.readInt();
                return stu.f213953c;
            case 13:
                parcel.readInt();
                return ttu.f223679c;
            case 14:
                parcel.readInt();
                return utu.f233994c;
            case 15:
                parcel.readInt();
                return vtu.f244776c;
            case 16:
                parcel.readInt();
                return wtu.f255018c;
            case 17:
                parcel.readInt();
                return xtu.f265929c;
            case 18:
                parcel.readInt();
                return ytu.f276219c;
            case 19:
                parcel.readInt();
                return auu.f20028c;
            case 20:
                parcel.readInt();
                return buu.f31219c;
            case 21:
                parcel.readInt();
                return cuu.f42218c;
            case 22:
                parcel.readInt();
                return duu.f53275c;
            case 23:
                parcel.readInt();
                return euu.f63076c;
            case 24:
                parcel.readInt();
                return fuu.f73569c;
            case 25:
                parcel.readInt();
                return guu.f84544c;
            case 26:
                parcel.readInt();
                return huu.f95461c;
            case 27:
                parcel.readInt();
                return iuu.f106035c;
            case 28:
                parcel.readInt();
                return juu.f116172c;
            default:
                parcel.readInt();
                return kuu.f126680c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f73307a) {
            case 0:
                return new gtu[i];
            case 1:
                return new htu[i];
            case 2:
                return new itu[i];
            case 3:
                return new jtu[i];
            case 4:
                return new ktu[i];
            case 5:
                return new ltu[i];
            case 6:
                return new mtu[i];
            case 7:
                return new ntu[i];
            case 8:
                return new otu[i];
            case 9:
                return new ptu[i];
            case 10:
                return new qtu[i];
            case 11:
                return new rtu[i];
            case 12:
                return new stu[i];
            case 13:
                return new ttu[i];
            case 14:
                return new utu[i];
            case 15:
                return new vtu[i];
            case 16:
                return new wtu[i];
            case 17:
                return new xtu[i];
            case 18:
                return new ytu[i];
            case 19:
                return new auu[i];
            case 20:
                return new buu[i];
            case 21:
                return new cuu[i];
            case 22:
                return new duu[i];
            case 23:
                return new euu[i];
            case 24:
                return new fuu[i];
            case 25:
                return new guu[i];
            case 26:
                return new huu[i];
            case 27:
                return new iuu[i];
            case 28:
                return new juu[i];
            default:
                return new kuu[i];
        }
    }
}
