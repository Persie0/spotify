package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class i4w implements Parcelable {
    public static final Parcelable.Creator<i4w> CREATOR = new bwv(10);

    /* JADX INFO: renamed from: a */
    public final String f98596a;

    public i4w(String str) {
        this.f98596a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4w) && wj50.m88271j(this.f98596a, ((i4w) obj).f98596a);
    }

    public final String getUri() {
        return this.f98596a;
    }

    public final int hashCode() {
        return this.f98596a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f98596a);
    }
}
