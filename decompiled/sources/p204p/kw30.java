package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class kw30 extends nw30 {
    public static final Parcelable.Creator<kw30> CREATOR = new bw30(7);

    /* JADX INFO: renamed from: c */
    public final String f127000c;

    public kw30(String str) {
        super(28, 2);
        this.f127000c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kw30) && wj50.m88271j(this.f127000c, ((kw30) obj).f127000c);
    }

    public final int hashCode() {
        return this.f127000c.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f127000c);
    }
}
