package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class o6d1 implements Parcelable {
    public static final Parcelable.Creator<o6d1> CREATOR = new vmc1(24);

    /* JADX INFO: renamed from: a */
    public final String f162324a;

    /* JADX INFO: renamed from: b */
    public final boolean f162325b;

    /* JADX INFO: renamed from: c */
    public final String f162326c;

    /* JADX INFO: renamed from: d */
    public final String f162327d;

    /* JADX INFO: renamed from: e */
    public final boolean f162328e;

    /* JADX INFO: renamed from: f */
    public final int f162329f;

    public o6d1(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.f162324a = str;
        this.f162325b = z;
        this.f162326c = str2;
        this.f162327d = str3;
        this.f162328e = z2;
        this.f162329f = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m66332c() {
        return this.f162329f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6d1)) {
            return false;
        }
        o6d1 o6d1Var = (o6d1) obj;
        return wj50.m88271j(this.f162324a, o6d1Var.f162324a) && this.f162325b == o6d1Var.f162325b && wj50.m88271j(this.f162326c, o6d1Var.f162326c) && wj50.m88271j(this.f162327d, o6d1Var.f162327d) && this.f162328e == o6d1Var.f162328e && this.f162329f == o6d1Var.f162329f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f162324a.hashCode() * 31, 31, this.f162325b);
        String str = this.f162326c;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f162327d;
        return edb.m38547C(this.f162329f) + s571.m77245d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f162328e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f162324a);
        parcel.writeInt(this.f162325b ? 1 : 0);
        parcel.writeString(this.f162326c);
        parcel.writeString(this.f162327d);
        parcel.writeInt(this.f162328e ? 1 : 0);
        int i2 = this.f162329f;
        if (i2 == 1) {
            str = "PORTRAIT";
        } else if (i2 == 2) {
            str = "LANDSCAPE";
        } else if (i2 == 3) {
            str = "SCREEN_ORIENTATION_LOCKED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "NONE";
        }
        parcel.writeString(str);
    }
}
