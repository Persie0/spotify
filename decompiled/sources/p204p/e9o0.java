package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class e9o0 extends h9o0 {

    /* JADX INFO: renamed from: a */
    public static final e9o0 f57491a = new e9o0();
    public static final Parcelable.Creator<e9o0> CREATOR = new o2o0(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e9o0);
    }

    public final int hashCode() {
        return -1406167397;
    }

    public final String toString() {
        return "PlanManager";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
