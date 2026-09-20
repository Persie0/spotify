package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class qct implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187403a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f187403a) {
            case 0:
                return new rct(parcel.readString(), parcel.createStringArrayList());
            case 1:
                parcel.readInt();
                return sct.f207800a;
            case 2:
                parcel.readInt();
                return tct.f219142a;
            case 3:
                parcel.readInt();
                return uct.f229108a;
            case 4:
                return new mdt(parcel.readInt(), parcel.readInt(), parcel.readString(), (b370) parcel.readParcelable(mdt.class.getClassLoader()));
            case 5:
                return new ndt(parcel.readInt(), (b370) parcel.readParcelable(ndt.class.getClassLoader()));
            case 6:
                return new h1u((b2u) parcel.readParcelable(h1u.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 7:
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(l1u.valueOf(parcel.readString()));
                }
                return new k1u(string, arrayList, parcel.readInt() != 0);
            case 8:
                parcel.readInt();
                return v1u.f236476a;
            case 9:
                return new w1u(parcel.readString(), parcel.readInt());
            case 10:
                return new x1u(parcel.readString());
            case 11:
                return new y1u(parcel.readString());
            case 12:
                return new z1u(parcel.readString(), parcel.readString());
            case 13:
                return new a2u(parcel.readString());
            case 14:
                parcel.readInt();
                return cau.f35930a;
            case 15:
                return new pdu(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 16:
                parcel.readInt();
                return qmu.f190400c;
            case 17:
                parcel.readInt();
                return rmu.f200615c;
            case 18:
                parcel.readInt();
                return smu.f210728c;
            case 19:
                parcel.readInt();
                return tmu.f221780c;
            case 20:
                parcel.readInt();
                return umu.f231952c;
            case 21:
                parcel.readInt();
                return vmu.f242928c;
            case 22:
                parcel.readInt();
                return wmu.f252977c;
            case 23:
                parcel.readInt();
                return xmu.f263448c;
            case 24:
                parcel.readInt();
                return ymu.f274340c;
            case 25:
                parcel.readInt();
                return zmu.f284337c;
            case 26:
                parcel.readInt();
                return anu.f17496c;
            case 27:
                parcel.readInt();
                return bnu.f28922c;
            case 28:
                parcel.readInt();
                return cnu.f40090c;
            default:
                parcel.readInt();
                return dnu.f50881c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f187403a) {
            case 0:
                return new rct[i];
            case 1:
                return new sct[i];
            case 2:
                return new tct[i];
            case 3:
                return new uct[i];
            case 4:
                return new mdt[i];
            case 5:
                return new ndt[i];
            case 6:
                return new h1u[i];
            case 7:
                return new k1u[i];
            case 8:
                return new v1u[i];
            case 9:
                return new w1u[i];
            case 10:
                return new x1u[i];
            case 11:
                return new y1u[i];
            case 12:
                return new z1u[i];
            case 13:
                return new a2u[i];
            case 14:
                return new cau[i];
            case 15:
                return new pdu[i];
            case 16:
                return new qmu[i];
            case 17:
                return new rmu[i];
            case 18:
                return new smu[i];
            case 19:
                return new tmu[i];
            case 20:
                return new umu[i];
            case 21:
                return new vmu[i];
            case 22:
                return new wmu[i];
            case 23:
                return new xmu[i];
            case 24:
                return new ymu[i];
            case 25:
                return new zmu[i];
            case 26:
                return new anu[i];
            case 27:
                return new bnu[i];
            case 28:
                return new cnu[i];
            default:
                return new dnu[i];
        }
    }
}
