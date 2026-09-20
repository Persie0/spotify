package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class sbl implements Parcelable {
    public static final Parcelable.Creator<sbl> CREATOR = new z4l(11);

    /* JADX INFO: renamed from: a */
    public final String f207525a;

    public sbl(String str) {
        this.f207525a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbl) && wj50.m88271j(this.f207525a, ((sbl) obj).f207525a);
    }

    public final int hashCode() {
        return this.f207525a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f207525a);
    }
}
