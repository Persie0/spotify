package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wzc0 implements d0d0 {
    public static final Parcelable.Creator<wzc0> CREATOR = new f4c0(14);

    /* JADX INFO: renamed from: a */
    public final String f256570a;

    public wzc0(String str) {
        this.f256570a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wzc0) && wj50.m88271j(this.f256570a, ((wzc0) obj).f256570a);
    }

    public final int hashCode() {
        return this.f256570a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f256570a);
    }
}
