package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class k02 implements Parcelable {
    public static final Parcelable.Creator<k02> CREATOR = new zt1(10);

    /* JADX INFO: renamed from: a */
    public final String f117838a;

    /* JADX INFO: renamed from: b */
    public final String f117839b;

    /* JADX INFO: renamed from: c */
    public final String f117840c;

    /* JADX INFO: renamed from: d */
    public final String f117841d;

    /* JADX INFO: renamed from: e */
    public final String f117842e;

    /* JADX INFO: renamed from: f */
    public final String f117843f;

    /* JADX INFO: renamed from: g */
    public final String f117844g;

    public k02(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f117838a = str;
        this.f117839b = str2;
        this.f117840c = str3;
        this.f117841d = str4;
        this.f117842e = str5;
        this.f117843f = str6;
        this.f117844g = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k02)) {
            return false;
        }
        k02 k02Var = (k02) obj;
        return wj50.m88271j(this.f117838a, k02Var.f117838a) && wj50.m88271j(this.f117839b, k02Var.f117839b) && wj50.m88271j(this.f117840c, k02Var.f117840c) && wj50.m88271j(this.f117841d, k02Var.f117841d) && wj50.m88271j(this.f117842e, k02Var.f117842e) && wj50.m88271j(this.f117843f, k02Var.f117843f) && wj50.m88271j(this.f117844g, k02Var.f117844g);
    }

    public final int hashCode() {
        return this.f117844g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f117838a.hashCode() * 31, 31, this.f117839b), 31, this.f117840c), 31, this.f117841d), 31, this.f117842e), 31, this.f117843f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f117838a);
        parcel.writeString(this.f117839b);
        parcel.writeString(this.f117840c);
        parcel.writeString(this.f117841d);
        parcel.writeString(this.f117842e);
        parcel.writeString(this.f117843f);
        parcel.writeString(this.f117844g);
    }
}
