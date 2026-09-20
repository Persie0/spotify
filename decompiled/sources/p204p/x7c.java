package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class x7c implements Parcelable {
    public static final Parcelable.Creator<x7c> CREATOR = new n6f1(7);

    /* JADX INFO: renamed from: a */
    public final int f258871a;

    public x7c(int i) {
        this.f258871a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7c) && this.f258871a == ((x7c) obj).f258871a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f258871a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f258871a);
    }
}
