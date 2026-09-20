package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class frk extends hrk {

    /* JADX INFO: renamed from: a */
    public static final frk f72497a = new frk();
    public static final Parcelable.Creator<frk> CREATOR = new kck(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof frk);
    }

    public final int hashCode() {
        return -886660502;
    }

    public final String toString() {
        return "Loaded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
