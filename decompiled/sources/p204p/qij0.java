package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class qij0 implements n4y {
    public static final Parcelable.Creator<qij0> CREATOR = new fgj0(1);

    /* JADX INFO: renamed from: a */
    public final long f189019a;

    public qij0(long j) {
        this.f189019a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qij0) && this.f189019a == ((qij0) obj).f189019a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f189019a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f189019a);
    }
}
