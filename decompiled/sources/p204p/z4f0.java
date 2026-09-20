package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class z4f0 extends a5f0 {

    /* JADX INFO: renamed from: a */
    public static final z4f0 f279231a = new z4f0();
    public static final Parcelable.Creator<z4f0> CREATOR = new r4f0(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z4f0);
    }

    public final int hashCode() {
        return 2071375774;
    }

    public final String toString() {
        return "Initial";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
