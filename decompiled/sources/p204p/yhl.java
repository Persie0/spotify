package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class yhl implements eil {
    public static final Parcelable.Creator<yhl> CREATOR = new z4l(18);

    /* JADX INFO: renamed from: a */
    public final String f272917a;

    public yhl(String str) {
        this.f272917a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yhl) && wj50.m88271j(this.f272917a, ((yhl) obj).f272917a);
    }

    public final int hashCode() {
        return this.f272917a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f272917a);
    }
}
