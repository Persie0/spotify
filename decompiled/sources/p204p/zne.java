package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class zne implements Parcelable {
    public static final Parcelable.Creator<zne> CREATOR = new rae(7);

    /* JADX INFO: renamed from: a */
    public final String f284480a;

    public zne(String str) {
        this.f284480a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zne) && wj50.m88271j(this.f284480a, ((zne) obj).f284480a);
    }

    public final int hashCode() {
        return this.f284480a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f284480a);
    }
}
