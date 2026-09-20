package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class sc40 implements uc40 {
    public static final Parcelable.Creator<sc40> CREATOR = new y240(11);

    /* JADX INFO: renamed from: a */
    public final String f207649a;

    public sc40(String str) {
        this.f207649a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sc40) && wj50.m88271j(this.f207649a, ((sc40) obj).f207649a);
    }

    public final int hashCode() {
        return this.f207649a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f207649a);
    }
}
