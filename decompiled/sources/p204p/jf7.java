package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class jf7 implements Parcelable {
    public static final Parcelable.Creator<jf7> CREATOR = new na7(4);

    /* JADX INFO: renamed from: a */
    public final String f111832a;

    public jf7(String str) {
        this.f111832a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jf7) && wj50.m88271j(this.f111832a, ((jf7) obj).f111832a);
    }

    public final int hashCode() {
        return this.f111832a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111832a);
    }
}
