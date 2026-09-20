package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class l1e implements p1e {
    public static final Parcelable.Creator<l1e> CREATOR = new j0e(22);

    /* JADX INFO: renamed from: a */
    public final String f128707a;

    public l1e(String str) {
        this.f128707a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1e) && wj50.m88271j(this.f128707a, ((l1e) obj).f128707a);
    }

    public final int hashCode() {
        return this.f128707a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f128707a);
    }
}
