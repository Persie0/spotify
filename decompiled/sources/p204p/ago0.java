package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ago0 extends mgo0 {
    public static final Parcelable.Creator<ago0> CREATOR = new o2o0(22);

    /* JADX INFO: renamed from: a */
    public final int f15456a;

    /* JADX INFO: renamed from: b */
    public final boolean f15457b;

    /* JADX INFO: renamed from: c */
    public final boolean f15458c;

    public ago0(int i) {
        this.f15456a = i;
        this.f15457b = i == 1;
        this.f15458c = i == 4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ago0) && this.f15456a == ((ago0) obj).f15456a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f15456a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f15456a;
        if (i2 == 1) {
            str = "LOCKED";
        } else if (i2 == 2) {
            str = "PLAYING";
        } else if (i2 == 3) {
            str = "PAUSED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "LOADING";
        }
        parcel.writeString(str);
    }
}
