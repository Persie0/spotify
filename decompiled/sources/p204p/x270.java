package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class x270 implements b370 {
    public static final Parcelable.Creator<x270> CREATOR = new w270(0);

    /* JADX INFO: renamed from: a */
    public final String f257374a;

    public x270(String str) {
        this.f257374a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x270) && wj50.m88271j(this.f257374a, ((x270) obj).f257374a);
    }

    public final int hashCode() {
        return this.f257374a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f257374a);
    }
}
