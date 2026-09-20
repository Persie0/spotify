package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class eck implements ick {
    public static final Parcelable.Creator<eck> CREATOR = new dnj(25);

    /* JADX INFO: renamed from: a */
    public final int f58350a;

    public eck(int i) {
        this.f58350a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eck) && this.f58350a == ((eck) obj).f58350a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f58350a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f58350a;
        if (i2 == 1) {
            str = "UNSPECIFIED";
        } else if (i2 == 2) {
            str = "PAIRING_NEEDED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "RE_PAIRING_NEEDED";
        }
        parcel.writeString(str);
    }

    public /* synthetic */ eck() {
        this(1);
    }
}
