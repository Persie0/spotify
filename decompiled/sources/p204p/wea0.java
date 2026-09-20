package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wea0 extends xea0 {
    public static final Parcelable.Creator<wea0> CREATOR = new z8a0(19);

    /* JADX INFO: renamed from: a */
    public final String f250502a;

    public wea0(String str) {
        this.f250502a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wea0) && wj50.m88271j(this.f250502a, ((wea0) obj).f250502a);
    }

    public final int hashCode() {
        return this.f250502a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f250502a);
    }
}
