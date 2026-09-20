package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class hck implements ick {
    public static final Parcelable.Creator<hck> CREATOR = new dnj(28);

    /* JADX INFO: renamed from: a */
    public final long f89828a;

    public hck(long j) {
        this.f89828a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hck) && this.f89828a == ((hck) obj).f89828a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89828a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f89828a);
    }
}
