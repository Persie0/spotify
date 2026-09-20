package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zn2 implements bo2 {
    public static final Parcelable.Creator<zn2> CREATOR = new lb2(16);

    /* JADX INFO: renamed from: a */
    public final long f284395a;

    public zn2(long j) {
        this.f284395a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zn2) && this.f284395a == ((zn2) obj).f284395a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f284395a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f284395a);
    }
}
