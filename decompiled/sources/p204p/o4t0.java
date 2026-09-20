package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class o4t0 extends p4t0 {
    public static final Parcelable.Creator<o4t0> CREATOR = new wds0(24);

    /* JADX INFO: renamed from: a */
    public final String f161752a;

    public o4t0(String str) {
        this.f161752a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4t0) && wj50.m88271j(this.f161752a, ((o4t0) obj).f161752a);
    }

    public final int hashCode() {
        return this.f161752a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161752a);
    }
}
