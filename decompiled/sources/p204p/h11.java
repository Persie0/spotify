package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class h11 implements j11 {
    public static final Parcelable.Creator<h11> CREATOR = new g11(0);

    /* JADX INFO: renamed from: a */
    public final String f86401a;

    public h11(String str) {
        this.f86401a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h11) && wj50.m88271j(this.f86401a, ((h11) obj).f86401a);
    }

    public final int hashCode() {
        return this.f86401a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f86401a);
    }
}
