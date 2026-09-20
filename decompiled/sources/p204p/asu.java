package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class asu implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19500a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f19500a) {
            case 0:
                parcel.readInt();
                return bsu.f30386c;
            case 1:
                parcel.readInt();
                return csu.f41692c;
            case 2:
                parcel.readInt();
                return dsu.f52630c;
            case 3:
                parcel.readInt();
                return esu.f62479c;
            case 4:
                parcel.readInt();
                return fsu.f72981c;
            case 5:
                parcel.readInt();
                return gsu.f84017c;
            case 6:
                parcel.readInt();
                return hsu.f94805c;
            case 7:
                parcel.readInt();
                return isu.f105316c;
            case 8:
                parcel.readInt();
                return jsu.f115558c;
            case 9:
                parcel.readInt();
                return ksu.f126017c;
            case 10:
                parcel.readInt();
                return lsu.f136611c;
            case 11:
                parcel.readInt();
                return msu.f146859c;
            case 12:
                parcel.readInt();
                return nsu.f157894c;
            case 13:
                parcel.readInt();
                return osu.f168894c;
            case 14:
                parcel.readInt();
                return psu.f180961c;
            case 15:
                parcel.readInt();
                return qsu.f192186c;
            case 16:
                parcel.readInt();
                return rsu.f202435c;
            case 17:
                parcel.readInt();
                return ssu.f213712c;
            case 18:
                parcel.readInt();
                return tsu.f223430c;
            case 19:
                parcel.readInt();
                return usu.f233688c;
            case 20:
                parcel.readInt();
                return vsu.f244494c;
            case 21:
                parcel.readInt();
                return wsu.f254761c;
            case 22:
                parcel.readInt();
                return xsu.f265675c;
            case 23:
                parcel.readInt();
                return ysu.f275876c;
            case 24:
                parcel.readInt();
                return zsu.f286000c;
            case 25:
                parcel.readInt();
                return atu.f19745c;
            case 26:
                parcel.readInt();
                return btu.f30937c;
            case 27:
                parcel.readInt();
                return ctu.f41975c;
            case 28:
                parcel.readInt();
                return dtu.f52906c;
            default:
                parcel.readInt();
                return etu.f62804c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f19500a) {
            case 0:
                return new bsu[i];
            case 1:
                return new csu[i];
            case 2:
                return new dsu[i];
            case 3:
                return new esu[i];
            case 4:
                return new fsu[i];
            case 5:
                return new gsu[i];
            case 6:
                return new hsu[i];
            case 7:
                return new isu[i];
            case 8:
                return new jsu[i];
            case 9:
                return new ksu[i];
            case 10:
                return new lsu[i];
            case 11:
                return new msu[i];
            case 12:
                return new nsu[i];
            case 13:
                return new osu[i];
            case 14:
                return new psu[i];
            case 15:
                return new qsu[i];
            case 16:
                return new rsu[i];
            case 17:
                return new ssu[i];
            case 18:
                return new tsu[i];
            case 19:
                return new usu[i];
            case 20:
                return new vsu[i];
            case 21:
                return new wsu[i];
            case 22:
                return new xsu[i];
            case 23:
                return new ysu[i];
            case 24:
                return new zsu[i];
            case 25:
                return new atu[i];
            case 26:
                return new btu[i];
            case 27:
                return new ctu[i];
            case 28:
                return new dtu[i];
            default:
                return new etu[i];
        }
    }
}
