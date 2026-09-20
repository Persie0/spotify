package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class jd01 implements Parcelable {
    public static final Parcelable.Creator<jd01> CREATOR = new vcz0(21);

    /* JADX INFO: renamed from: a */
    public final String f111218a;

    public jd01(String str) {
        this.f111218a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd01) && wj50.m88271j(this.f111218a, ((jd01) obj).f111218a);
    }

    public final int hashCode() {
        return this.f111218a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111218a);
    }
}
