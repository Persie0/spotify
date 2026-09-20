package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vzc0 implements d0d0 {
    public static final Parcelable.Creator<vzc0> CREATOR = new f4c0(13);

    /* JADX INFO: renamed from: a */
    public final String f246436a;

    public vzc0(String str) {
        this.f246436a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzc0) && wj50.m88271j(this.f246436a, ((vzc0) obj).f246436a);
    }

    public final int hashCode() {
        return this.f246436a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f246436a);
    }
}
