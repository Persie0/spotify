package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class yv50 extends dw50 {
    public static final Parcelable.Creator<yv50> CREATOR = new pq50(7);

    /* JADX INFO: renamed from: a */
    public final String f276577a;

    public yv50(String str) {
        this.f276577a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv50) && wj50.m88271j(this.f276577a, ((yv50) obj).f276577a);
    }

    public final int hashCode() {
        String str = this.f276577a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f276577a);
    }
}
