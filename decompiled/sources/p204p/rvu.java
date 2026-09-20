package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class rvu implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203130a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f203130a) {
            case 0:
                parcel.readInt();
                return svu.f214509c;
            case 1:
                parcel.readInt();
                return tvu.f224240c;
            case 2:
                parcel.readInt();
                return vvu.f245335c;
            case 3:
                parcel.readInt();
                return wvu.f255624c;
            case 4:
                parcel.readInt();
                return xvu.f266512c;
            case 5:
                parcel.readInt();
                return yvu.f276748c;
            case 6:
                parcel.readInt();
                return zvu.f286804c;
            case 7:
                parcel.readInt();
                return awu.f20703c;
            case 8:
                parcel.readInt();
                return bwu.f31733c;
            case 9:
                parcel.readInt();
                return cwu.f42827c;
            case 10:
                parcel.readInt();
                return dwu.f53749c;
            case 11:
                parcel.readInt();
                return ewu.f63601c;
            case 12:
                parcel.readInt();
                return fwu.f74163c;
            case 13:
                parcel.readInt();
                return gwu.f85101c;
            case 14:
                parcel.readInt();
                return hwu.f96050c;
            case 15:
                parcel.readInt();
                return iwu.f106510c;
            case 16:
                parcel.readInt();
                return jwu.f116719c;
            case 17:
                parcel.readInt();
                return kwu.f127239c;
            case 18:
                parcel.readInt();
                return lwu.f137636c;
            case 19:
                parcel.readInt();
                return mwu.f147884c;
            case 20:
                parcel.readInt();
                return nwu.f159286c;
            case 21:
                parcel.readInt();
                return owu.f170785c;
            case 22:
                parcel.readInt();
                return pwu.f182113c;
            case 23:
                parcel.readInt();
                return qwu.f193421c;
            case 24:
                parcel.readInt();
                return rwu.f203415c;
            case 25:
                parcel.readInt();
                return swu.f214723c;
            case 26:
                parcel.readInt();
                return twu.f224481c;
            case 27:
                parcel.readInt();
                return vwu.f245554c;
            case 28:
                parcel.readInt();
                return b6v.f24051a;
            default:
                return new j8v(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f203130a) {
            case 0:
                return new svu[i];
            case 1:
                return new tvu[i];
            case 2:
                return new vvu[i];
            case 3:
                return new wvu[i];
            case 4:
                return new xvu[i];
            case 5:
                return new yvu[i];
            case 6:
                return new zvu[i];
            case 7:
                return new awu[i];
            case 8:
                return new bwu[i];
            case 9:
                return new cwu[i];
            case 10:
                return new dwu[i];
            case 11:
                return new ewu[i];
            case 12:
                return new fwu[i];
            case 13:
                return new gwu[i];
            case 14:
                return new hwu[i];
            case 15:
                return new iwu[i];
            case 16:
                return new jwu[i];
            case 17:
                return new kwu[i];
            case 18:
                return new lwu[i];
            case 19:
                return new mwu[i];
            case 20:
                return new nwu[i];
            case 21:
                return new owu[i];
            case 22:
                return new pwu[i];
            case 23:
                return new qwu[i];
            case 24:
                return new rwu[i];
            case 25:
                return new swu[i];
            case 26:
                return new twu[i];
            case 27:
                return new vwu[i];
            case 28:
                return new b6v[i];
            default:
                return new j8v[i];
        }
    }
}
