package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jw30 extends nw30 {
    public static final Parcelable.Creator<jw30> CREATOR = new bw30(6);

    /* JADX INFO: renamed from: c */
    public final String f116565c;

    public jw30(String str) {
        super(26, 2);
        this.f116565c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jw30) && wj50.m88271j(this.f116565c, ((jw30) obj).f116565c);
    }

    public final int hashCode() {
        return this.f116565c.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f116565c);
    }
}
