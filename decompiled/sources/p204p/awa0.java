package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class awa0 implements Parcelable {
    public static final Parcelable.Creator<awa0> CREATOR = new ama0(16);

    /* JADX INFO: renamed from: L0 */
    public final int f20445L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f20446M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f20447N0;

    /* JADX INFO: renamed from: O0 */
    public final String f20448O0;

    /* JADX INFO: renamed from: P0 */
    public final String f20449P0;

    /* JADX INFO: renamed from: Q0 */
    public final String f20450Q0;

    /* JADX INFO: renamed from: R0 */
    public final int f20451R0;

    /* JADX INFO: renamed from: X */
    public final String f20452X;

    /* JADX INFO: renamed from: Y */
    public String f20453Y;

    /* JADX INFO: renamed from: Z */
    public boolean f20454Z;

    /* JADX INFO: renamed from: a */
    public final int f20455a;

    /* JADX INFO: renamed from: b */
    public Set f20456b;

    /* JADX INFO: renamed from: c */
    public final int f20457c;

    /* JADX INFO: renamed from: d */
    public final String f20458d;

    /* JADX INFO: renamed from: e */
    public final String f20459e;

    /* JADX INFO: renamed from: f */
    public final String f20460f;

    /* JADX INFO: renamed from: g */
    public final String f20461g;

    /* JADX INFO: renamed from: h */
    public boolean f20462h;

    /* JADX INFO: renamed from: i */
    public final String f20463i;

    /* JADX INFO: renamed from: t */
    public final String f20464t;

    public awa0(Set set, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
        this.f20455a = 1;
        this.f20456b = set;
        this.f20457c = 3;
        this.f20464t = "rerequest";
        this.f20458d = str;
        this.f20459e = str6;
        this.f20460f = str7;
        this.f20461g = str2;
        this.f20445L0 = 1;
        if (str3.length() == 0) {
            this.f20448O0 = UUID.randomUUID().toString();
        } else {
            this.f20448O0 = str3;
        }
        this.f20449P0 = str4;
        this.f20450Q0 = str5;
        this.f20451R0 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(y8a0.m93115t(this.f20455a));
        parcel.writeStringList(new ArrayList(this.f20456b));
        parcel.writeString(adn.m25611w(this.f20457c));
        parcel.writeString(this.f20458d);
        parcel.writeString(this.f20459e);
        parcel.writeString(this.f20460f);
        parcel.writeString(this.f20461g);
        parcel.writeByte(this.f20462h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f20463i);
        parcel.writeString(this.f20464t);
        parcel.writeString(this.f20452X);
        parcel.writeString(this.f20453Y);
        parcel.writeByte(this.f20454Z ? (byte) 1 : (byte) 0);
        int i2 = this.f20445L0;
        if (i2 == 1) {
            str = "FACEBOOK";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "INSTAGRAM";
        }
        parcel.writeString(str);
        parcel.writeByte(this.f20446M0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20447N0 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f20448O0);
        parcel.writeString(this.f20449P0);
        parcel.writeString(this.f20450Q0);
        int i3 = this.f20451R0;
        parcel.writeString(i3 != 0 ? tfe.m80662t(i3) : null);
    }

    public awa0(Parcel parcel) {
        int i;
        int i2;
        int i3;
        int i4;
        String string = parcel.readString();
        zn91.m96548e0(string, "loginBehavior");
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("NATIVE_WITH_FALLBACK")) {
            i = 1;
        } else if (string.equals("NATIVE_ONLY")) {
            i = 2;
        } else if (string.equals("KATANA_ONLY")) {
            i = 3;
        } else if (string.equals("WEB_ONLY")) {
            i = 4;
        } else if (string.equals("DIALOG_ONLY")) {
            i = 5;
        } else {
            if (!string.equals("DEVICE_AUTH")) {
                throw new IllegalArgumentException("No enum constant com.facebook.login.LoginBehavior.".concat(string));
            }
            i = 6;
        }
        this.f20455a = i;
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f20456b = new HashSet(arrayList);
        String string2 = parcel.readString();
        if (string2 == null) {
            i2 = 1;
        } else {
            if (string2 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string2.equals("NONE")) {
                i2 = 1;
            } else if (string2.equals("ONLY_ME")) {
                i2 = 2;
            } else if (string2.equals("FRIENDS")) {
                i2 = 3;
            } else {
                if (!string2.equals("EVERYONE")) {
                    throw new IllegalArgumentException("No enum constant com.facebook.login.DefaultAudience.".concat(string2));
                }
                i2 = 4;
            }
        }
        this.f20457c = i2;
        String string3 = parcel.readString();
        zn91.m96548e0(string3, "applicationId");
        this.f20458d = string3;
        this.f20459e = parcel.readString();
        this.f20460f = parcel.readString();
        String string4 = parcel.readString();
        zn91.m96548e0(string4, "authId");
        this.f20461g = string4;
        int i5 = 0;
        this.f20462h = parcel.readByte() != 0;
        this.f20463i = parcel.readString();
        String string5 = parcel.readString();
        zn91.m96548e0(string5, "authType");
        this.f20464t = string5;
        this.f20452X = parcel.readString();
        this.f20453Y = parcel.readString();
        this.f20454Z = parcel.readByte() != 0;
        String string6 = parcel.readString();
        if (string6 == null) {
            i3 = 1;
        } else {
            if (string6 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string6.equals("FACEBOOK")) {
                i3 = 1;
            } else {
                if (!string6.equals("INSTAGRAM")) {
                    throw new IllegalArgumentException("No enum constant com.facebook.login.LoginTargetApp.".concat(string6));
                }
                i3 = 2;
            }
        }
        this.f20445L0 = i3;
        this.f20446M0 = parcel.readByte() != 0;
        this.f20447N0 = parcel.readByte() != 0;
        String string7 = parcel.readString();
        zn91.m96548e0(string7, "nonce");
        this.f20448O0 = string7;
        this.f20449P0 = parcel.readString();
        this.f20450Q0 = parcel.readString();
        String string8 = parcel.readString();
        if (string8 != null) {
            if (string8 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string8.equals("S256")) {
                i4 = 1;
            } else {
                if (!string8.equals("PLAIN")) {
                    throw new IllegalArgumentException("No enum constant com.facebook.login.CodeChallengeMethod.".concat(string8));
                }
                i4 = 2;
            }
            i5 = i4;
        }
        this.f20451R0 = i5;
    }
}
