package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class l5p0 implements Parcelable {
    public static final Parcelable.Creator<l5p0> CREATOR = new igo0(17);

    /* JADX INFO: renamed from: a */
    public final int f129990a;

    public l5p0(int i) {
        this.f129990a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5p0) && this.f129990a == ((l5p0) obj).f129990a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f129990a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f129990a;
        if (i2 == 1) {
            str = "StartSlow";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Stuck";
        }
        parcel.writeString(str);
    }
}
