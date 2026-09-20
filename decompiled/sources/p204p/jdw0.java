package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class jdw0 implements Parcelable {
    public static final Parcelable.Creator<jdw0> CREATOR = new b8w0(11);

    /* JADX INFO: renamed from: a */
    public final String f111404a;

    public jdw0(String str) {
        this.f111404a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdw0) && wj50.m88271j(this.f111404a, ((jdw0) obj).f111404a);
    }

    public final int hashCode() {
        String str = this.f111404a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111404a);
    }
}
