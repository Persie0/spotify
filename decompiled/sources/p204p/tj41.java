package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class tj41 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220828a;

    public /* synthetic */ tj41(int i) {
        this.f220828a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f220828a) {
            case 0:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z = false;
                boolean z2 = true;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new xj41(string, string2, string3, z3, z, z2, z, parcel.readInt() != 0, (wj41) parcel.readParcelable(xj41.class.getClassLoader()), di20.valueOf(parcel.readString()));
            case 1:
                parcel.readInt();
                return uj41.f230902a;
            case 2:
                return new vj41(parcel.readString());
            case 3:
                return new zn41(stz0.m79365s(parcel.readString()), (xr01) parcel.readParcelable(zn41.class.getClassLoader()), (ck01) parcel.readParcelable(zn41.class.getClassLoader()), (lu01) parcel.readParcelable(zn41.class.getClassLoader()), null);
            case 4:
                int iM79365s = stz0.m79365s(parcel.readString());
                xr01 xr01Var = (xr01) parcel.readParcelable(ao41.class.getClassLoader());
                ck01 ck01Var = (ck01) parcel.readParcelable(ao41.class.getClassLoader());
                lu01 lu01Var = (lu01) parcel.readParcelable(ao41.class.getClassLoader());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i2 = parcel.readInt();
                icr0 icr0Var = (icr0) parcel.readParcelable(ao41.class.getClassLoader());
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM9h = 0;
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(ao41.class, parcel, arrayList, iM9h, 1);
                }
                return new ao41(iM79365s, xr01Var, ck01Var, lu01Var, string4, string5, string6, i2, icr0Var, arrayList, parcel.readInt(), parcel.readInt() != 0, 16);
            case 5:
                return new bo41(stz0.m79365s(parcel.readString()), (xr01) parcel.readParcelable(bo41.class.getClassLoader()), (ck01) parcel.readParcelable(bo41.class.getClassLoader()), (lu01) parcel.readParcelable(bo41.class.getClassLoader()), null);
            case 6:
                parcel.readInt();
                return new eo41();
            case 7:
                s7y s7yVarCreateFromParcel = s7y.CREATOR.createFromParcel(parcel);
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM31715d = 0;
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(s7y.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new dq41(s7yVarCreateFromParcel, arrayList2);
            case 8:
                return new fq41(dq41.CREATOR.createFromParcel(parcel));
            case 9:
                return new cr41(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                parcel.readInt();
                return os41.f168744a;
            case 11:
                parcel.readInt();
                return ts41.f223213a;
            case 12:
                return new us41(parcel.readString());
            case 13:
                parcel.readInt();
                return xs41.f265485a;
            case 14:
                return new bt41(parcel.readString(), parcel.readInt() != 0);
            case 15:
                parcel.readInt();
                return dt41.f52726a;
            case 16:
                return new et41(parcel.readString(), (agw) parcel.readParcelable(et41.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 17:
                return new ft41(parcel.readString(), (gn50) parcel.readParcelable(ft41.class.getClassLoader()));
            case 18:
                parcel.readInt();
                return rt41.f202491a;
            case 19:
                parcel.readInt();
                return tt41.f223519a;
            case 20:
                parcel.readInt();
                return ut41.f233771a;
            case 21:
                return new zt41(parcel.readString(), (yt41) parcel.readParcelable(zt41.class.getClassLoader()));
            case 22:
                return new yt41(parcel.readInt());
            case 23:
                return new au41(parcel.readString(), (zsk0) parcel.readParcelable(au41.class.getClassLoader()));
            case 24:
                return new bu41(parcel.readInt());
            case 25:
                parcel.readInt();
                return cu41.f42048a;
            case 26:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                boolean z4 = parcel.readInt() != 0;
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("Http")) {
                    i = 1;
                } else {
                    if (!string7.equals("Offline")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.highlightsstats.shareduiusecases.error.ErrorElement.ErrorType.".concat(string7));
                    }
                    i = 2;
                }
                return new sz41(i5, i6, z4, i, (kew) parcel.readParcelable(sz41.class.getClassLoader()));
            case 27:
                parcel.readInt();
                return n051.f148895a;
            case 28:
                parcel.readInt();
                return o051.f160238a;
            default:
                parcel.readInt();
                return p051.f172498a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f220828a) {
            case 0:
                return new xj41[i];
            case 1:
                return new uj41[i];
            case 2:
                return new vj41[i];
            case 3:
                return new zn41[i];
            case 4:
                return new ao41[i];
            case 5:
                return new bo41[i];
            case 6:
                return new eo41[i];
            case 7:
                return new dq41[i];
            case 8:
                return new fq41[i];
            case 9:
                return new cr41[i];
            case 10:
                return new os41[i];
            case 11:
                return new ts41[i];
            case 12:
                return new us41[i];
            case 13:
                return new xs41[i];
            case 14:
                return new bt41[i];
            case 15:
                return new dt41[i];
            case 16:
                return new et41[i];
            case 17:
                return new ft41[i];
            case 18:
                return new rt41[i];
            case 19:
                return new tt41[i];
            case 20:
                return new ut41[i];
            case 21:
                return new zt41[i];
            case 22:
                return new yt41[i];
            case 23:
                return new au41[i];
            case 24:
                return new bu41[i];
            case 25:
                return new cu41[i];
            case 26:
                return new sz41[i];
            case 27:
                return new n051[i];
            case 28:
                return new o051[i];
            default:
                return new p051[i];
        }
    }
}
