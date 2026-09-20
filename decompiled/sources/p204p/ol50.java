package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ol50 extends ql50 {
    public static final Parcelable.Creator<ol50> CREATOR = new gd50(8);

    /* JADX INFO: renamed from: a */
    public final String f166762a;

    public ol50(String str) {
        this.f166762a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol50) && wj50.m88271j(this.f166762a, ((ol50) obj).f166762a);
    }

    public final int hashCode() {
        String str = this.f166762a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f166762a);
    }
}
