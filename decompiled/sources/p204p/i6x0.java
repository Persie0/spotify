package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class i6x0 extends b7x0 {
    public static final Parcelable.Creator<i6x0> CREATOR = new xxw0(9);

    /* JADX INFO: renamed from: a */
    public final String f99381a;

    public i6x0(String str) {
        this.f99381a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6x0) && wj50.m88271j(this.f99381a, ((i6x0) obj).f99381a);
    }

    public final int hashCode() {
        return this.f99381a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f99381a);
    }
}
