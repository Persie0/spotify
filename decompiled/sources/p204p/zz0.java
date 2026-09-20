package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zz0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f287747a;

    public /* synthetic */ zz0(int i) {
        this.f287747a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        Boolean boolValueOf;
        switch (this.f287747a) {
            case 0:
                return new a01(parcel.readString());
            case 1:
                return new y11((x11) parcel.readParcelable(y11.class.getClassLoader()), parcel.readInt() == 0 ? null : a11.CREATOR.createFromParcel(parcel), my0.CREATOR.createFromParcel(parcel));
            case 2:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("NONE")) {
                    i = 1;
                } else if (string.equals("API_CREATE")) {
                    i = 2;
                } else if (string.equals("API_COMPLETE_CREATION")) {
                    i = 3;
                } else if (string.equals("API_GET_SESSION")) {
                    i = 4;
                } else if (string.equals("API_AUTH_CLIENT")) {
                    i = 5;
                } else if (string.equals("CHALLENGE_IN_PROGRESS")) {
                    i = 6;
                } else if (string.equals("SESSION_ID_MISMATCH")) {
                    i = 7;
                } else if (string.equals("CHALLENGE_PASSKEY_AUTHN_REQUEST")) {
                    i = 8;
                } else if (string.equals("CHALLENGE_SMSCODE_REQUEST")) {
                    i = 9;
                } else {
                    if (!string.equals("CHALLENGE_EMAILCODE_REQUEST")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.login.adaptiveauthentication.domain.AdaptiveAuthenticationModel.Error.ErrorSource.".concat(string));
                    }
                    i = 10;
                }
                return new a11(i, parcel.readString(), (z01) parcel.readParcelable(a11.class.getClassLoader()), parcel.readInt() == 0 ? null : rk7.valueOf(parcel.readString()));
            case 3:
                return new d01(fr0.m42456G(parcel.readString()), fr0.m42455F(parcel.readString()));
            case 4:
                return new e01(parcel.readString(), parcel.readString());
            case 5:
                return new f01(parcel.readInt() != 0);
            case 6:
                return new g01(parcel.readInt() != 0);
            case 7:
                return new h01(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
            case 8:
                return new i01(parcel.readInt() == 0 ? null : rk7.valueOf(parcel.readString()));
            case 9:
                parcel.readInt();
                return j01.f107324a;
            case 10:
                return new o01((n01) parcel.readParcelable(o01.class.getClassLoader()));
            case 11:
                parcel.readInt();
                return k01.f117834a;
            case 12:
                parcel.readInt();
                return l01.f128251a;
            case 13:
                parcel.readInt();
                return m01.f138483a;
            case 14:
                parcel.readInt();
                return p01.f172423a;
            case 15:
                parcel.readInt();
                return q01.f183876a;
            case 16:
                return new r01(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 17:
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("CREDENTIAL_NOT_FOUND")) {
                    i2 = 1;
                } else if (string2.equals("CONNECTION")) {
                    i2 = 2;
                } else {
                    if (!string2.equals("UNKNOWN")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.login.credentialmanager.PasskeyAuthenticationError.".concat(string2));
                    }
                    i2 = 3;
                }
                return new s01(i2);
            case 18:
                return new t01((t661) parcel.readParcelable(t01.class.getClassLoader()));
            case 19:
                return new u01(parcel.readString());
            case 20:
                return new v01(parcel.readString(), parcel.readString());
            case 21:
                return new w01(parcel.readString(), parcel.readString());
            case 22:
                return new x01(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 23:
                return new y01(parcel.readString(), parcel.readString());
            case 24:
                return new b11(hy0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), (w0b0) parcel.readParcelable(b11.class.getClassLoader()), parcel.readInt() == 0 ? null : kj7.CREATOR.createFromParcel(parcel), (wi7) parcel.readParcelable(b11.class.getClassLoader()), (mrl) parcel.readParcelable(b11.class.getClassLoader()));
            case 25:
                return new c11((w0b0) parcel.readParcelable(c11.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : hy0.CREATOR.createFromParcel(parcel), (mrl) parcel.readParcelable(c11.class.getClassLoader()));
            case 26:
                fua0 fua0Var = (fua0) parcel.readParcelable(d11.class.getClassLoader());
                w0b0 w0b0Var = (w0b0) parcel.readParcelable(d11.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new d11(fua0Var, w0b0Var, boolValueOf, parcel.readInt() != 0 ? hy0.CREATOR.createFromParcel(parcel) : null, 16);
            case 27:
                return new e11((C2539wl) parcel.readParcelable(e11.class.getClassLoader()), (kiq0) parcel.readParcelable(e11.class.getClassLoader()), (mrl) parcel.readParcelable(e11.class.getClassLoader()), parcel.readInt() == 0 ? null : uyu0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 28:
                return new k11(parcel.readString(), parcel.readInt() != 0, (j11) parcel.readParcelable(k11.class.getClassLoader()));
            default:
                return new f11((b01) parcel.readParcelable(f11.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f287747a) {
            case 0:
                return new a01[i];
            case 1:
                return new y11[i];
            case 2:
                return new a11[i];
            case 3:
                return new d01[i];
            case 4:
                return new e01[i];
            case 5:
                return new f01[i];
            case 6:
                return new g01[i];
            case 7:
                return new h01[i];
            case 8:
                return new i01[i];
            case 9:
                return new j01[i];
            case 10:
                return new o01[i];
            case 11:
                return new k01[i];
            case 12:
                return new l01[i];
            case 13:
                return new m01[i];
            case 14:
                return new p01[i];
            case 15:
                return new q01[i];
            case 16:
                return new r01[i];
            case 17:
                return new s01[i];
            case 18:
                return new t01[i];
            case 19:
                return new u01[i];
            case 20:
                return new v01[i];
            case 21:
                return new w01[i];
            case 22:
                return new x01[i];
            case 23:
                return new y01[i];
            case 24:
                return new b11[i];
            case 25:
                return new c11[i];
            case 26:
                return new d11[i];
            case 27:
                return new e11[i];
            case 28:
                return new k11[i];
            default:
                return new f11[i];
        }
    }
}
