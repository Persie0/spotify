package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class idj implements fej {
    public static final Parcelable.Creator<idj> CREATOR = new wcj(1);

    /* JADX INFO: renamed from: a */
    public final hdj f101141a;

    public idj(hdj hdjVar) {
        this.f101141a = hdjVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idj) && wj50.m88271j(this.f101141a, ((idj) obj).f101141a);
    }

    public final int hashCode() {
        return this.f101141a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f101141a, i);
    }
}
