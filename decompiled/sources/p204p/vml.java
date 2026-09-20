package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class vml implements Parcelable {
    public static final Parcelable.Creator<vml> CREATOR = new pkl(2);

    /* JADX INFO: renamed from: a */
    public final String f242868a;

    /* JADX INFO: renamed from: b */
    public final int f242869b;

    /* JADX INFO: renamed from: c */
    public final String f242870c;

    /* JADX INFO: renamed from: d */
    public final String f242871d;

    public vml(String str, String str2, int i, String str3) {
        this.f242868a = str;
        this.f242869b = i;
        this.f242870c = str2;
        this.f242871d = str3;
    }

    /* JADX INFO: renamed from: c */
    public final int m86018c() {
        return this.f242869b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vml)) {
            return false;
        }
        vml vmlVar = (vml) obj;
        return wj50.m88271j(this.f242868a, vmlVar.f242868a) && this.f242869b == vmlVar.f242869b && wj50.m88271j(this.f242870c, vmlVar.f242870c) && wj50.m88271j(this.f242871d, vmlVar.f242871d);
    }

    public final String getUri() {
        return this.f242868a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(f710.m40938f(this.f242869b, this.f242868a.hashCode() * 31, 31), 31, this.f242870c);
        String str = this.f242871d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f242868a);
        int i2 = this.f242869b;
        if (i2 == 1) {
            str = "ARTIST";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "AUTHOR";
        }
        parcel.writeString(str);
        parcel.writeString(this.f242870c);
        parcel.writeString(this.f242871d);
    }
}
