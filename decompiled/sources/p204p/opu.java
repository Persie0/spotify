package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class opu implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f168021a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f168021a) {
            case 0:
                parcel.readInt();
                return ppu.f180105c;
            case 1:
                parcel.readInt();
                return qpu.f191379c;
            case 2:
                parcel.readInt();
                return spu.f212955c;
            case 3:
                parcel.readInt();
                return tpu.f222601c;
            case 4:
                parcel.readInt();
                return upu.f232830c;
            case 5:
                parcel.readInt();
                return vpu.f243782c;
            case 6:
                parcel.readInt();
                return wpu.f253840c;
            case 7:
                parcel.readInt();
                return xpu.f264726c;
            case 8:
                parcel.readInt();
                return ypu.f275030c;
            case 9:
                parcel.readInt();
                return zpu.f285228c;
            case 10:
                parcel.readInt();
                return aqu.f18809c;
            case 11:
                parcel.readInt();
                return bqu.f29881c;
            case 12:
                parcel.readInt();
                return cqu.f40993c;
            case 13:
                parcel.readInt();
                return dqu.f52086c;
            case 14:
                parcel.readInt();
                return equ.f61948c;
            case 15:
                parcel.readInt();
                return fqu.f72260c;
            case 16:
                parcel.readInt();
                return gqu.f83531c;
            case 17:
                parcel.readInt();
                return hqu.f94252c;
            case 18:
                parcel.readInt();
                return iqu.f104847c;
            case 19:
                parcel.readInt();
                return jqu.f115003c;
            case 20:
                parcel.readInt();
                return kqu.f125437c;
            case 21:
                parcel.readInt();
                return lqu.f136138c;
            case 22:
                parcel.readInt();
                return mqu.f146356c;
            case 23:
                parcel.readInt();
                return nqu.f157339c;
            case 24:
                parcel.readInt();
                return oqu.f168387c;
            case 25:
                parcel.readInt();
                return pqu.f180425c;
            case 26:
                parcel.readInt();
                return qqu.f191652c;
            case 27:
                parcel.readInt();
                return rqu.f201886c;
            case 28:
                parcel.readInt();
                return squ.f213162c;
            default:
                parcel.readInt();
                return tqu.f222887c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f168021a) {
            case 0:
                return new ppu[i];
            case 1:
                return new qpu[i];
            case 2:
                return new spu[i];
            case 3:
                return new tpu[i];
            case 4:
                return new upu[i];
            case 5:
                return new vpu[i];
            case 6:
                return new wpu[i];
            case 7:
                return new xpu[i];
            case 8:
                return new ypu[i];
            case 9:
                return new zpu[i];
            case 10:
                return new aqu[i];
            case 11:
                return new bqu[i];
            case 12:
                return new cqu[i];
            case 13:
                return new dqu[i];
            case 14:
                return new equ[i];
            case 15:
                return new fqu[i];
            case 16:
                return new gqu[i];
            case 17:
                return new hqu[i];
            case 18:
                return new iqu[i];
            case 19:
                return new jqu[i];
            case 20:
                return new kqu[i];
            case 21:
                return new lqu[i];
            case 22:
                return new mqu[i];
            case 23:
                return new nqu[i];
            case 24:
                return new oqu[i];
            case 25:
                return new pqu[i];
            case 26:
                return new qqu[i];
            case 27:
                return new rqu[i];
            case 28:
                return new squ[i];
            default:
                return new tqu[i];
        }
    }
}
