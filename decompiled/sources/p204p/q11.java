package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class q11 implements u11 {
    public static final Parcelable.Creator<q11> CREATOR = new g11(7);

    /* JADX INFO: renamed from: a */
    public final String f184150a;

    public q11(String str) {
        this.f184150a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q11) && wj50.m88271j(this.f184150a, ((q11) obj).f184150a);
    }

    public final int hashCode() {
        String str = this.f184150a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f184150a);
    }
}
