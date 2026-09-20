package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class whr extends xhr {
    public static final Parcelable.Creator<whr> CREATOR = new o5r(11);

    /* JADX INFO: renamed from: a */
    public final String f251425a;

    public whr(String str) {
        this.f251425a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof whr) && wj50.m88271j(this.f251425a, ((whr) obj).f251425a);
    }

    public final int hashCode() {
        return this.f251425a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f251425a);
    }
}
