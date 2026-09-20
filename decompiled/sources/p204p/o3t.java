package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class o3t implements Parcelable {
    public static final Parcelable.Creator<o3t> CREATOR = new f9s(23);

    /* JADX INFO: renamed from: a */
    public final String f161437a;

    public o3t(String str) {
        this.f161437a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3t) && wj50.m88271j(this.f161437a, ((o3t) obj).f161437a);
    }

    public final int hashCode() {
        return this.f161437a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161437a);
    }
}
