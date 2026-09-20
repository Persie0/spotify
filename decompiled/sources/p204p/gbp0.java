package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class gbp0 implements jbp0 {
    public static final Parcelable.Creator<gbp0> CREATOR = new igo0(20);

    /* JADX INFO: renamed from: a */
    public final long f78367a;

    /* JADX INFO: renamed from: b */
    public final long f78368b;

    public gbp0(long j, long j2) {
        this.f78367a = j;
        this.f78368b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbp0)) {
            return false;
        }
        gbp0 gbp0Var = (gbp0) obj;
        return this.f78367a == gbp0Var.f78367a && this.f78368b == gbp0Var.f78368b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f78368b) + (Long.hashCode(this.f78367a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f78367a);
        parcel.writeLong(this.f78368b);
    }
}
