package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class mae implements oae {
    public static final Parcelable.Creator<mae> CREATOR = new n6e(26);

    /* JADX INFO: renamed from: a */
    public final String f141566a;

    public mae(String str) {
        this.f141566a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mae) && wj50.m88271j(this.f141566a, ((mae) obj).f141566a);
    }

    public final int hashCode() {
        return this.f141566a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f141566a);
    }
}
