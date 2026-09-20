package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ztf0 implements auf0 {

    /* JADX INFO: renamed from: a */
    public static final ztf0 f286153a = new ztf0();
    public static final Parcelable.Creator<ztf0> CREATOR = new r4f0(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ztf0);
    }

    public final int hashCode() {
        return -1840181351;
    }

    public final String toString() {
        return "OncePerSession";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
