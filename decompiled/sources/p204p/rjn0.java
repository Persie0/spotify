package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class rjn0 implements ehr0 {

    /* JADX INFO: renamed from: a */
    public static final rjn0 f199865a = new rjn0();
    public static final Parcelable.Creator<rjn0> CREATOR = new ejn0(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rjn0);
    }

    public final int hashCode() {
        return 329412237;
    }

    @Override // p204p.ehr0
    /* JADX INFO: renamed from: p0 */
    public final boolean mo38997p0() {
        return true;
    }

    public final String toString() {
        return "PendingState";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
