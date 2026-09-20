package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class p7y implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174783a;

    public /* synthetic */ p7y(int i) {
        this.f174783a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f174783a) {
            case 0:
                return new t7y(parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                return new e8y(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
            case 2:
                return new eby(parcel.readInt());
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("HUB_SECTION")) {
                    i = 1;
                } else if (string3.equals("DEEPLINK")) {
                    i = 2;
                } else if (string3.equals("NOTIFICATION")) {
                    i = 3;
                } else {
                    if (!string3.equals("UNKNOWN")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.culturalmoments.faneventredemption.FanEventRedemptionEntryReason.".concat(string3));
                    }
                    i = 4;
                }
                return new ycy(string, string2, z, i);
            case 4:
                return new ufy(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 5:
                return new agy(parcel.readString());
            case 6:
                return new rgy(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                return new xgy(parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                parcel.readInt();
                return ehy.f59751a;
            case 9:
                parcel.readInt();
                return fhy.f69729a;
            case 10:
                return new hhy(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 11:
                parcel.readInt();
                return ihy.f102379a;
            case 12:
                return new lhy(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), (jhy) parcel.readParcelable(lhy.class.getClassLoader()), (ghy) parcel.readParcelable(lhy.class.getClassLoader()));
            case 13:
                parcel.readInt();
                return mhy.f143887a;
            case 14:
                return new nhy(parcel.readString(), parcel.readString(), parcel.readString(), (jhy) parcel.readParcelable(nhy.class.getClassLoader()), (ghy) parcel.readParcelable(nhy.class.getClassLoader()));
            case 15:
                return new vhy(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 16:
                parcel.readInt();
                return why.f251461a;
            case 17:
                return new zhy(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), (xhy) parcel.readParcelable(zhy.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 18:
                return new aiy(parcel.readString(), parcel.readString(), (xhy) parcel.readParcelable(aiy.class.getClassLoader()));
            case 19:
                parcel.readInt();
                return aky.f16677a;
            case 20:
                return new mky(parcel.readString(), parcel.readString(), (b791) parcel.readParcelable(mky.class.getClassLoader()), parcel.readInt() != 0);
            case 21:
                parcel.readInt();
                return qky.f189667a;
            case 22:
                return new rky(parcel.readString());
            case 23:
                return new vky(parcel.readInt() != 0);
            case 24:
                return new wky(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 25:
                parcel.readInt();
                return xky.f262961a;
            case 26:
                parcel.readInt();
                return yky.f273858a;
            case 27:
                parcel.readInt();
                return zky.f283866a;
            case 28:
                return new ypy(parcel.readString(), parcel.readString());
            default:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (string5 != null) {
                    return new dqy(string4, string5);
                }
                throw new IllegalArgumentException("AdIdentifier value cannot be null in parcel");
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f174783a) {
            case 0:
                return new t7y[i];
            case 1:
                return new e8y[i];
            case 2:
                return new eby[i];
            case 3:
                return new ycy[i];
            case 4:
                return new ufy[i];
            case 5:
                return new agy[i];
            case 6:
                return new rgy[i];
            case 7:
                return new xgy[i];
            case 8:
                return new ehy[i];
            case 9:
                return new fhy[i];
            case 10:
                return new hhy[i];
            case 11:
                return new ihy[i];
            case 12:
                return new lhy[i];
            case 13:
                return new mhy[i];
            case 14:
                return new nhy[i];
            case 15:
                return new vhy[i];
            case 16:
                return new why[i];
            case 17:
                return new zhy[i];
            case 18:
                return new aiy[i];
            case 19:
                return new aky[i];
            case 20:
                return new mky[i];
            case 21:
                return new qky[i];
            case 22:
                return new rky[i];
            case 23:
                return new vky[i];
            case 24:
                return new wky[i];
            case 25:
                return new xky[i];
            case 26:
                return new yky[i];
            case 27:
                return new zky[i];
            case 28:
                return new ypy[i];
            default:
                return new dqy[i];
        }
    }
}
