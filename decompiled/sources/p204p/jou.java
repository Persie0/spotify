package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class jou implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114511a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f114511a) {
            case 0:
                parcel.readInt();
                return kou.f124911c;
            case 1:
                parcel.readInt();
                return lou.f135546c;
            case 2:
                parcel.readInt();
                return mou.f145743c;
            case 3:
                parcel.readInt();
                return nou.f156795c;
            case 4:
                parcel.readInt();
                return oou.f167693c;
            case 5:
                parcel.readInt();
                return pou.f179785c;
            case 6:
                parcel.readInt();
                return qou.f191038c;
            case 7:
                parcel.readInt();
                return rou.f201345c;
            case 8:
                parcel.readInt();
                return sou.f212653c;
            case 9:
                parcel.readInt();
                return tou.f222320c;
            case 10:
                parcel.readInt();
                return uou.f232525c;
            case 11:
                parcel.readInt();
                return vou.f243541c;
            case 12:
                parcel.readInt();
                return wou.f253571c;
            case 13:
                parcel.readInt();
                return xou.f264362c;
            case 14:
                parcel.readInt();
                return you.f274734c;
            case 15:
                parcel.readInt();
                return zou.f284873c;
            case 16:
                parcel.readInt();
                return apu.f18012c;
            case 17:
                parcel.readInt();
                return bpu.f29605c;
            case 18:
                parcel.readInt();
                return cpu.f40644c;
            case 19:
                parcel.readInt();
                return dpu.f51745c;
            case 20:
                parcel.readInt();
                return epu.f61709c;
            case 21:
                parcel.readInt();
                return fpu.f72002c;
            case 22:
                parcel.readInt();
                return gpu.f83248c;
            case 23:
                parcel.readInt();
                return hpu.f93849c;
            case 24:
                parcel.readInt();
                return ipu.f104557c;
            case 25:
                parcel.readInt();
                return jpu.f114721c;
            case 26:
                parcel.readInt();
                return kpu.f125126c;
            case 27:
                parcel.readInt();
                return lpu.f135842c;
            case 28:
                parcel.readInt();
                return mpu.f146093c;
            default:
                parcel.readInt();
                return npu.f157070c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f114511a) {
            case 0:
                return new kou[i];
            case 1:
                return new lou[i];
            case 2:
                return new mou[i];
            case 3:
                return new nou[i];
            case 4:
                return new oou[i];
            case 5:
                return new pou[i];
            case 6:
                return new qou[i];
            case 7:
                return new rou[i];
            case 8:
                return new sou[i];
            case 9:
                return new tou[i];
            case 10:
                return new uou[i];
            case 11:
                return new vou[i];
            case 12:
                return new wou[i];
            case 13:
                return new xou[i];
            case 14:
                return new you[i];
            case 15:
                return new zou[i];
            case 16:
                return new apu[i];
            case 17:
                return new bpu[i];
            case 18:
                return new cpu[i];
            case 19:
                return new dpu[i];
            case 20:
                return new epu[i];
            case 21:
                return new fpu[i];
            case 22:
                return new gpu[i];
            case 23:
                return new hpu[i];
            case 24:
                return new ipu[i];
            case 25:
                return new jpu[i];
            case 26:
                return new kpu[i];
            case 27:
                return new lpu[i];
            case 28:
                return new mpu[i];
            default:
                return new npu[i];
        }
    }
}
