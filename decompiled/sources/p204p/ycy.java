package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ycy implements Parcelable {
    public static final Parcelable.Creator<ycy> CREATOR = new p7y(3);

    /* JADX INFO: renamed from: a */
    public final String f271592a;

    /* JADX INFO: renamed from: b */
    public final String f271593b;

    /* JADX INFO: renamed from: c */
    public final boolean f271594c;

    /* JADX INFO: renamed from: d */
    public final int f271595d;

    public ycy(String str, String str2, boolean z, int i) {
        this.f271592a = str;
        this.f271593b = str2;
        this.f271594c = z;
        this.f271595d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycy)) {
            return false;
        }
        ycy ycyVar = (ycy) obj;
        return wj50.m88271j(this.f271592a, ycyVar.f271592a) && wj50.m88271j(this.f271593b, ycyVar.f271593b) && this.f271594c == ycyVar.f271594c && this.f271595d == ycyVar.f271595d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f271595d) + s571.m77245d(s571.m77243b(this.f271592a.hashCode() * 31, 31, this.f271593b), 31, this.f271594c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f271592a);
        parcel.writeString(this.f271593b);
        parcel.writeInt(this.f271594c ? 1 : 0);
        int i2 = this.f271595d;
        if (i2 == 1) {
            str = "HUB_SECTION";
        } else if (i2 == 2) {
            str = "DEEPLINK";
        } else if (i2 == 3) {
            str = "NOTIFICATION";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "UNKNOWN";
        }
        parcel.writeString(str);
    }
}
