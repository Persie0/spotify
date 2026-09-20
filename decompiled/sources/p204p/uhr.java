package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class uhr extends xhr {
    public static final Parcelable.Creator<uhr> CREATOR = new o5r(10);

    /* JADX INFO: renamed from: a */
    public final String f230499a;

    public uhr(String str) {
        this.f230499a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhr) && wj50.m88271j(this.f230499a, ((uhr) obj).f230499a);
    }

    public final int hashCode() {
        return this.f230499a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f230499a);
    }
}
