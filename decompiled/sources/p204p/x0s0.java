package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class x0s0 implements xyr0 {
    public static final Parcelable.Creator<x0s0> CREATOR = new uir0(26);

    /* JADX INFO: renamed from: a */
    public final String f256967a;

    public x0s0(String str) {
        this.f256967a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0s0) && wj50.m88271j(this.f256967a, ((x0s0) obj).f256967a);
    }

    public final int hashCode() {
        return this.f256967a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f256967a);
    }
}
