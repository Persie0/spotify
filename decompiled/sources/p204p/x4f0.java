package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class x4f0 extends a5f0 {
    public static final Parcelable.Creator<x4f0> CREATOR = new r4f0(3);

    /* JADX INFO: renamed from: a */
    public final String f258084a;

    public x4f0(String str) {
        this.f258084a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4f0) && wj50.m88271j(this.f258084a, ((x4f0) obj).f258084a);
    }

    public final int hashCode() {
        return this.f258084a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f258084a);
    }
}
