package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class sfz extends vfz {
    public static final Parcelable.Creator<sfz> CREATOR = new c2z(22);

    /* JADX INFO: renamed from: a */
    public final int f208665a;

    public sfz(int i) {
        this.f208665a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfz) && this.f208665a == ((sfz) obj).f208665a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f208665a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f208665a;
        if (i2 == 1) {
            str = "VIDEOS";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "PODCAST_AND_EPISODES";
        }
        parcel.writeString(str);
    }
}
