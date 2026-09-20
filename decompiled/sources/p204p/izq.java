package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class izq implements jzq {
    public static final Parcelable.Creator<izq> CREATOR = new lso(17);

    /* JADX INFO: renamed from: a */
    public final String f107278a;

    public izq(String str) {
        this.f107278a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izq) && wj50.m88271j(this.f107278a, ((izq) obj).f107278a);
    }

    public final int hashCode() {
        return this.f107278a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f107278a);
    }
}
