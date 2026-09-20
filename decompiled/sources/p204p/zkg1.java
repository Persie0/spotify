package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class zkg1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<zkg1> CREATOR = new g7g1(15);

    /* JADX INFO: renamed from: X */
    public final byte f283750X;

    /* JADX INFO: renamed from: Y */
    public final String f283751Y;

    /* JADX INFO: renamed from: a */
    public final int f283752a;

    /* JADX INFO: renamed from: b */
    public final String f283753b;

    /* JADX INFO: renamed from: c */
    public final String f283754c;

    /* JADX INFO: renamed from: d */
    public final String f283755d;

    /* JADX INFO: renamed from: e */
    public final String f283756e;

    /* JADX INFO: renamed from: f */
    public final String f283757f;

    /* JADX INFO: renamed from: g */
    public final String f283758g;

    /* JADX INFO: renamed from: h */
    public final byte f283759h;

    /* JADX INFO: renamed from: i */
    public final byte f283760i;

    /* JADX INFO: renamed from: t */
    public final byte f283761t;

    public zkg1(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.f283752a = i;
        this.f283753b = str;
        this.f283754c = str2;
        this.f283755d = str3;
        this.f283756e = str4;
        this.f283757f = str5;
        this.f283758g = str6;
        this.f283759h = b;
        this.f283760i = b2;
        this.f283761t = b3;
        this.f283750X = b4;
        this.f283751Y = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zkg1.class != obj.getClass()) {
            return false;
        }
        zkg1 zkg1Var = (zkg1) obj;
        String str = zkg1Var.f283751Y;
        String str2 = zkg1Var.f283758g;
        String str3 = zkg1Var.f283754c;
        if (this.f283752a != zkg1Var.f283752a || this.f283759h != zkg1Var.f283759h || this.f283760i != zkg1Var.f283760i || this.f283761t != zkg1Var.f283761t || this.f283750X != zkg1Var.f283750X || !this.f283753b.equals(zkg1Var.f283753b)) {
            return false;
        }
        String str4 = this.f283754c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.f283755d.equals(zkg1Var.f283755d) || !this.f283756e.equals(zkg1Var.f283756e) || !this.f283757f.equals(zkg1Var.f283757f)) {
            return false;
        }
        String str5 = this.f283758g;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f283751Y;
        if (str6 != null) {
            return str6.equals(str);
        }
        return str == null;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f283752a + 31) * 31, 31, this.f283753b);
        String str = this.f283754c;
        int iM77243b2 = s571.m77243b(s571.m77243b(s571.m77243b((iM77243b + (str != null ? str.hashCode() : 0)) * 31, 31, this.f283755d), 31, this.f283756e), 31, this.f283757f);
        String str2 = this.f283758g;
        int iHashCode = (((((((((iM77243b2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f283759h) * 31) + this.f283760i) * 31) + this.f283761t) * 31) + this.f283750X) * 31;
        String str3 = this.f283751Y;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AncsNotificationParcelable{, id=" + this.f283752a + ", appId='" + this.f283753b + "', dateTime='" + this.f283754c + "', eventId=" + ((int) this.f283759h) + ", eventFlags=" + ((int) this.f283760i) + ", categoryId=" + ((int) this.f283761t) + ", categoryCount=" + ((int) this.f283750X) + ", packageName='" + this.f283751Y + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f283752a);
        String str = this.f283753b;
        alf1.m26308N(parcel, 3, str);
        alf1.m26308N(parcel, 4, this.f283754c);
        alf1.m26308N(parcel, 5, this.f283755d);
        alf1.m26308N(parcel, 6, this.f283756e);
        alf1.m26308N(parcel, 7, this.f283757f);
        String str2 = this.f283758g;
        if (str2 != null) {
            str = str2;
        }
        alf1.m26308N(parcel, 8, str);
        alf1.m26313S(parcel, 9, 4);
        parcel.writeInt(this.f283759h);
        alf1.m26313S(parcel, 10, 4);
        parcel.writeInt(this.f283760i);
        alf1.m26313S(parcel, 11, 4);
        parcel.writeInt(this.f283761t);
        alf1.m26313S(parcel, 12, 4);
        parcel.writeInt(this.f283750X);
        alf1.m26308N(parcel, 13, this.f283751Y);
        alf1.m26316V(iM26314T, parcel);
    }
}
