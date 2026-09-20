package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class zcj implements hdj {
    public static final Parcelable.Creator<zcj> CREATOR = new wcj(4);

    /* JADX INFO: renamed from: a */
    public final long f281529a;

    public zcj(long j) {
        this.f281529a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zcj) && this.f281529a == ((zcj) obj).f281529a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f281529a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f281529a);
    }
}
