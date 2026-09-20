package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class n0b0 extends w0b0 {
    public static final Parcelable.Creator<n0b0> CREATOR = new l0b0(1);

    /* JADX INFO: renamed from: a */
    public final String f148967a;

    public n0b0(String str) {
        this.f148967a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0b0) && wj50.m88271j(this.f148967a, ((n0b0) obj).f148967a);
    }

    public final int hashCode() {
        return this.f148967a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f148967a);
    }
}
