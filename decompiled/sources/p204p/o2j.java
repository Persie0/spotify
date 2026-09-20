package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class o2j implements Parcelable {
    public static final Parcelable.Creator<o2j> CREATOR = new f2i(16);

    /* JADX INFO: renamed from: a */
    public final String f161056a;

    public o2j(String str) {
        this.f161056a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2j) && wj50.m88271j(this.f161056a, ((o2j) obj).f161056a);
    }

    public final int hashCode() {
        return this.f161056a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161056a);
    }
}
