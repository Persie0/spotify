package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ru71 extends wqg1 implements Parcelable {
    public static final Parcelable.Creator<ru71> CREATOR = new sr71(4);

    /* JADX INFO: renamed from: c */
    public final long f202769c;

    public ru71(long j) {
        this.f202769c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru71) && this.f202769c == ((ru71) obj).f202769c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f202769c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f202769c);
    }
}
