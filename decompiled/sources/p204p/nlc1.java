package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Any;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class nlc1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f155075a;

    public /* synthetic */ nlc1(int i) {
        this.f155075a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        byte[] bArrCreateByteArray;
        switch (this.f155075a) {
            case 0:
                parcel.readInt();
                return plc1.f178696a;
            case 1:
                parcel.readInt();
                return qlc1.f189827a;
            case 2:
                parcel.readInt();
                return rlc1.f200279a;
            case 3:
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iM9h = 0;
                while (iM9h != i) {
                    iM9h = AbstractC0000a.m9h(slc1.class, parcel, arrayList, iM9h, 1);
                }
                return new slc1(string, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : cmc1.CREATOR.createFromParcel(parcel));
            case 4:
                parcel.readInt();
                return tlc1.f221448a;
            case 5:
                parcel.readInt();
                return ulc1.f231526a;
            case 6:
                return new vlc1(parcel.readString());
            case 7:
                parcel.readInt();
                return wlc1.f252514a;
            case 8:
                return new ylc1(parcel.readString(), (xlc1) parcel.readParcelable(ylc1.class.getClassLoader()));
            case 9:
                return new zlc1(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ylc1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ylc1.CREATOR.createFromParcel(parcel) : null);
            case 10:
                return new amc1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new cmc1(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : bmc1.CREATOR.createFromParcel(parcel), parcel.readString());
            case 12:
                return new bmc1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                parcel.readInt();
                return dmc1.f50488a;
            case 14:
                return new emc1(parcel.readString(), (sv50) parcel.readParcelable(emc1.class.getClassLoader()));
            case 15:
                return new fmc1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Any anyM1911t = null;
                if (parcel.readByte() != 0 && (bArrCreateByteArray = parcel.createByteArray()) != null) {
                    try {
                        anyM1911t = Any.m1911t(bArrCreateByteArray);
                        break;
                    } catch (Exception unused) {
                    }
                }
                return new gmc1(string2, string3, anyM1911t);
            case 17:
                return new hmc1(parcel.readString(), parcel.readString());
            case 18:
                return new umc1(parcel.readString(), (hk80) parcel.readParcelable(umc1.class.getClassLoader()), parcel.readInt() == 0 ? null : hmc1.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : gmc1.CREATOR.createFromParcel(parcel), (pmc1) parcel.readParcelable(umc1.class.getClassLoader()), (tmc1) parcel.readParcelable(umc1.class.getClassLoader()), (yjc) parcel.readParcelable(umc1.class.getClassLoader()), parcel.readInt() != 0 ? cnc1.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
            case 19:
                return new imc1(parcel.readString(), (k340) parcel.readParcelable(imc1.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                return new jmc1(parcel.readString(), (pdn0) parcel.readParcelable(jmc1.class.getClassLoader()));
            case 21:
                return new kmc1(parcel.readString(), parcel.readString());
            case 22:
                return new lmc1(parcel.readString());
            case 23:
                String string4 = parcel.readString();
                k340 k340Var = (k340) parcel.readParcelable(nmc1.class.getClassLoader());
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                mmc1 mmc1Var = (mmc1) parcel.readParcelable(nmc1.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iM9h2 = 0;
                while (iM9h2 != i2) {
                    iM9h2 = AbstractC0000a.m9h(nmc1.class, parcel, arrayList2, iM9h2, 1);
                }
                return new nmc1(string4, k340Var, string5, string6, mmc1Var, arrayList2, uuh0.CREATOR.createFromParcel(parcel));
            case 24:
                return new omc1(parcel.readString());
            case 25:
                return new qmc1(parcel.readString());
            case 26:
                return new rmc1(parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                return new smc1(parcel.readString(), imc1.CREATOR.createFromParcel(parcel), (np71) parcel.readParcelable(smc1.class.getClassLoader()), parcel.readInt() == 0 ? null : fmc1.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                parcel.readInt();
                return wmc1.f252778a;
            default:
                parcel.readInt();
                return xmc1.f263340a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f155075a) {
            case 0:
                return new plc1[i];
            case 1:
                return new qlc1[i];
            case 2:
                return new rlc1[i];
            case 3:
                return new slc1[i];
            case 4:
                return new tlc1[i];
            case 5:
                return new ulc1[i];
            case 6:
                return new vlc1[i];
            case 7:
                return new wlc1[i];
            case 8:
                return new ylc1[i];
            case 9:
                return new zlc1[i];
            case 10:
                return new amc1[i];
            case 11:
                return new cmc1[i];
            case 12:
                return new bmc1[i];
            case 13:
                return new dmc1[i];
            case 14:
                return new emc1[i];
            case 15:
                return new fmc1[i];
            case 16:
                return new gmc1[i];
            case 17:
                return new hmc1[i];
            case 18:
                return new umc1[i];
            case 19:
                return new imc1[i];
            case 20:
                return new jmc1[i];
            case 21:
                return new kmc1[i];
            case 22:
                return new lmc1[i];
            case 23:
                return new nmc1[i];
            case 24:
                return new omc1[i];
            case 25:
                return new qmc1[i];
            case 26:
                return new rmc1[i];
            case 27:
                return new smc1[i];
            case 28:
                return new wmc1[i];
            default:
                return new xmc1[i];
        }
    }
}
