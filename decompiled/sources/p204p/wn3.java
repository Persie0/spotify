package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class wn3 implements yn3 {
    public static final Parcelable.Creator<wn3> CREATOR = new bc3(12);

    /* JADX INFO: renamed from: a */
    public final String f253058a;

    public wn3(String str) {
        this.f253058a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn3) && wj50.m88271j(this.f253058a, ((wn3) obj).f253058a);
    }

    public final int hashCode() {
        return this.f253058a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f253058a);
    }
}
