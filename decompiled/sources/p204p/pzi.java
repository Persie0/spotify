package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class pzi extends vzi {
    public static final Parcelable.Creator<pzi> CREATOR = new f2i(13);

    /* JADX INFO: renamed from: a */
    public final int f183713a;

    public pzi(int i) {
        this.f183713a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzi) && this.f183713a == ((pzi) obj).f183713a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f183713a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f183713a;
        if (i2 == 1) {
            str = "FORCED_OFFLINE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "NO_INTERNET";
        }
        parcel.writeString(str);
    }
}
