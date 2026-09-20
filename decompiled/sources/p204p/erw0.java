package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class erw0 extends hrw0 {
    public static final Parcelable.Creator<erw0> CREATOR = new b8w0(18);

    /* JADX INFO: renamed from: a */
    public final String f62213a;

    public erw0(String str) {
        this.f62213a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof erw0) && wj50.m88271j(this.f62213a, ((erw0) obj).f62213a);
    }

    public final int hashCode() {
        return this.f62213a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f62213a);
    }
}
