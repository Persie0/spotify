package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class tu71 implements Parcelable {
    public static final Parcelable.Creator<tu71> CREATOR = new sr71(5);

    /* JADX INFO: renamed from: a */
    public final long f223785a;

    public /* synthetic */ tu71(long j) {
        this.f223785a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tu71) {
            return this.f223785a == ((tu71) obj).f223785a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f223785a);
    }

    public final String toString() {
        return edb.m38562k(this.f223785a, "TimestampConfiguration(timestampInSec=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f223785a);
    }
}
