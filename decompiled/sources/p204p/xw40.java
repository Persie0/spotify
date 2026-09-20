package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class xw40 implements ax40 {
    public static final Parcelable.Creator<xw40> CREATOR = new y240(19);

    /* JADX INFO: renamed from: a */
    public final String f266573a;

    public xw40(String str) {
        this.f266573a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw40) && wj50.m88271j(this.f266573a, ((xw40) obj).f266573a);
    }

    public final int hashCode() {
        return this.f266573a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f266573a);
    }
}
