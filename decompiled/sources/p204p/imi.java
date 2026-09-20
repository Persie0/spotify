package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class imi implements jmi {
    public static final Parcelable.Creator<imi> CREATOR = new f2i(11);

    /* JADX INFO: renamed from: a */
    public final String f103708a;

    public imi(String str) {
        this.f103708a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof imi) && wj50.m88271j(this.f103708a, ((imi) obj).f103708a);
    }

    public final int hashCode() {
        return this.f103708a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f103708a);
    }
}
