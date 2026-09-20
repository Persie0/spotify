package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kt80 implements nt80 {
    public static final Parcelable.Creator<kt80> CREATOR = new ct80(7);

    /* JADX INFO: renamed from: a */
    public final String f126182a;

    public kt80(String str) {
        this.f126182a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt80) && wj50.m88271j(this.f126182a, ((kt80) obj).f126182a);
    }

    public final int hashCode() {
        return this.f126182a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f126182a);
    }
}
