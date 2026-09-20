package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class hla0 implements Parcelable {
    public static final Parcelable.Creator<hla0> CREATOR = new z8a0(26);

    /* JADX INFO: renamed from: a */
    public final String f92656a;

    public hla0(String str) {
        this.f92656a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hla0) && wj50.m88271j(this.f92656a, ((hla0) obj).f92656a);
    }

    public final int hashCode() {
        String str = this.f92656a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f92656a);
    }
}
