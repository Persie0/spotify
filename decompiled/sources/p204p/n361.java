package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class n361 implements Parcelable {
    public static final Parcelable.Creator<n361> CREATOR = new e361(3);

    /* JADX INFO: renamed from: a */
    public final long f149946a;

    public n361(long j) {
        this.f149946a = j;
    }

    /* JADX INFO: renamed from: c */
    public final long m63589c() {
        return this.f149946a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n361) && this.f149946a == ((n361) obj).f149946a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f149946a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f149946a);
    }
}
