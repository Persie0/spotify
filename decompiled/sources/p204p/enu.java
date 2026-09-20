package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class enu implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61227a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f61227a) {
            case 0:
                parcel.readInt();
                return fnu.f71357c;
            case 1:
                parcel.readInt();
                return gnu.f82782c;
            case 2:
                parcel.readInt();
                return hnu.f93391c;
            case 3:
                parcel.readInt();
                return inu.f104062c;
            case 4:
                parcel.readInt();
                return jnu.f114200c;
            case 5:
                parcel.readInt();
                return knu.f124473c;
            case 6:
                parcel.readInt();
                return lnu.f135226c;
            case 7:
                parcel.readInt();
                return mnu.f145478c;
            case 8:
                parcel.readInt();
                return nnu.f156491c;
            case 9:
                parcel.readInt();
                return onu.f167360c;
            case 10:
                parcel.readInt();
                return pnu.f179531c;
            case 11:
                parcel.readInt();
                return qnu.f190701c;
            case 12:
                parcel.readInt();
                return rnu.f201015c;
            case 13:
                parcel.readInt();
                return snu.f211026c;
            case 14:
                parcel.readInt();
                return tnu.f222077c;
            case 15:
                parcel.readInt();
                return unu.f232263c;
            case 16:
                parcel.readInt();
                return vnu.f243249c;
            case 17:
                parcel.readInt();
                return wnu.f253297c;
            case 18:
                parcel.readInt();
                return xnu.f263709c;
            case 19:
                parcel.readInt();
                return ynu.f274505c;
            case 20:
                parcel.readInt();
                return znu.f284555c;
            case 21:
                parcel.readInt();
                return aou.f17766c;
            case 22:
                parcel.readInt();
                return bou.f29251c;
            case 23:
                parcel.readInt();
                return cou.f40340c;
            case 24:
                parcel.readInt();
                return dou.f51115c;
            case 25:
                parcel.readInt();
                return eou.f61476c;
            case 26:
                parcel.readInt();
                return fou.f71631c;
            case 27:
                parcel.readInt();
                return gou.f83015c;
            case 28:
                parcel.readInt();
                return hou.f93607c;
            default:
                parcel.readInt();
                return iou.f104288c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f61227a) {
            case 0:
                return new fnu[i];
            case 1:
                return new gnu[i];
            case 2:
                return new hnu[i];
            case 3:
                return new inu[i];
            case 4:
                return new jnu[i];
            case 5:
                return new knu[i];
            case 6:
                return new lnu[i];
            case 7:
                return new mnu[i];
            case 8:
                return new nnu[i];
            case 9:
                return new onu[i];
            case 10:
                return new pnu[i];
            case 11:
                return new qnu[i];
            case 12:
                return new rnu[i];
            case 13:
                return new snu[i];
            case 14:
                return new tnu[i];
            case 15:
                return new unu[i];
            case 16:
                return new vnu[i];
            case 17:
                return new wnu[i];
            case 18:
                return new xnu[i];
            case 19:
                return new ynu[i];
            case 20:
                return new znu[i];
            case 21:
                return new aou[i];
            case 22:
                return new bou[i];
            case 23:
                return new cou[i];
            case 24:
                return new dou[i];
            case 25:
                return new eou[i];
            case 26:
                return new fou[i];
            case 27:
                return new gou[i];
            case 28:
                return new hou[i];
            default:
                return new iou[i];
        }
    }
}
