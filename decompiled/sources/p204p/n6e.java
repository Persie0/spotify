package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class n6e implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150851a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f150851a) {
            case 0:
                return new o6e(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : a8d1.CREATOR.createFromParcel(parcel), (hk80) parcel.readParcelable(o6e.class.getClassLoader()), bc9.CREATOR.createFromParcel(parcel));
            case 1:
                return new h7e((e1e) parcel.readParcelable(h7e.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 2:
                return new eae((dae) parcel.readParcelable(eae.class.getClassLoader()));
            case 3:
                return new f9e(parcel.readInt() != 0, parcel.readString());
            case 4:
                return new g9e(f9e.CREATOR.createFromParcel(parcel), tae.CREATOR.createFromParcel(parcel));
            case 5:
                parcel.readInt();
                return h9e.f88927a;
            case 6:
                return new j9e(f9e.CREATOR.createFromParcel(parcel), tae.CREATOR.createFromParcel(parcel));
            case 7:
                parcel.readInt();
                return k9e.f120573a;
            case 8:
                parcel.readInt();
                return m9e.f141284a;
            case 9:
                return new n9e(sae.CREATOR.createFromParcel(parcel));
            case 10:
                parcel.readInt();
                return o9e.f163006a;
            case 11:
                return new p9e(f9e.CREATOR.createFromParcel(parcel));
            case 12:
                f9e f9eVarCreateFromParcel = f9e.CREATOR.createFromParcel(parcel);
                tae taeVarCreateFromParcel = tae.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    i = 0;
                } else {
                    String string = parcel.readString();
                    if (string == null) {
                        throw new NullPointerException("Name is null");
                    }
                    if (string.equals("SPOTIFY")) {
                        i = 1;
                    } else if (string.equals("SPOTIFY_NATIVE")) {
                        i = 2;
                    } else {
                        if (!string.equals("GPB")) {
                            throw new IllegalArgumentException("No enum constant com.spotify.gpb.choicescreenuc.domain.ChoiceScreenUcModel.State.Loaded.Choice.".concat(string));
                        }
                        i = 3;
                    }
                }
                return new q9e(f9eVarCreateFromParcel, taeVarCreateFromParcel, i);
            case 13:
                parcel.readInt();
                return r9e.f197037a;
            case 14:
                return new s9e(f9e.CREATOR.createFromParcel(parcel));
            case 15:
                return new t9e(f9e.CREATOR.createFromParcel(parcel), qae.CREATOR.createFromParcel(parcel));
            case 16:
                return new u9e(parcel.readString());
            case 17:
                parcel.readInt();
                return v9e.f238925a;
            case 18:
                parcel.readInt();
                return w9e.f249164a;
            case 19:
                return new x9e(f9e.CREATOR.createFromParcel(parcel), tae.CREATOR.createFromParcel(parcel), (ok10) parcel.readParcelable(x9e.class.getClassLoader()));
            case 20:
                return new y9e((ok10) parcel.readParcelable(y9e.class.getClassLoader()));
            case 21:
                return new aae(parcel.readInt() != 0, f9e.CREATOR.createFromParcel(parcel), tae.CREATOR.createFromParcel(parcel), (ok10) parcel.readParcelable(aae.class.getClassLoader()));
            case 22:
                return new bae(parcel.readInt() != 0, (ok10) parcel.readParcelable(bae.class.getClassLoader()));
            case 23:
                return new jae(parcel.readString(), parcel.readString());
            case 24:
                parcel.readInt();
                return kae.f120873a;
            case 25:
                parcel.readInt();
                return lae.f131332a;
            case 26:
                return new mae(parcel.readString());
            case 27:
                parcel.readInt();
                return nae.f152049a;
            case 28:
                return new pae(parcel.readString(), (oae) parcel.readParcelable(pae.class.getClassLoader()));
            default:
                return new qae(parcel.readString(), parcel.readString(), (oae) parcel.readParcelable(qae.class.getClassLoader()), parcel.readInt() == 0 ? null : pae.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? pae.CREATOR.createFromParcel(parcel) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f150851a) {
            case 0:
                return new o6e[i];
            case 1:
                return new h7e[i];
            case 2:
                return new eae[i];
            case 3:
                return new f9e[i];
            case 4:
                return new g9e[i];
            case 5:
                return new h9e[i];
            case 6:
                return new j9e[i];
            case 7:
                return new k9e[i];
            case 8:
                return new m9e[i];
            case 9:
                return new n9e[i];
            case 10:
                return new o9e[i];
            case 11:
                return new p9e[i];
            case 12:
                return new q9e[i];
            case 13:
                return new r9e[i];
            case 14:
                return new s9e[i];
            case 15:
                return new t9e[i];
            case 16:
                return new u9e[i];
            case 17:
                return new v9e[i];
            case 18:
                return new w9e[i];
            case 19:
                return new x9e[i];
            case 20:
                return new y9e[i];
            case 21:
                return new aae[i];
            case 22:
                return new bae[i];
            case 23:
                return new jae[i];
            case 24:
                return new kae[i];
            case 25:
                return new lae[i];
            case 26:
                return new mae[i];
            case 27:
                return new nae[i];
            case 28:
                return new pae[i];
            default:
                return new qae[i];
        }
    }
}
