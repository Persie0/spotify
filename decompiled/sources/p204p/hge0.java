package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class hge0 implements Parcelable {
    public static final Parcelable.Creator<hge0> CREATOR = new ube0(4);

    /* JADX INFO: renamed from: a */
    public final String f91144a;

    public hge0(String str) {
        this.f91144a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hge0) && wj50.m88271j(this.f91144a, ((hge0) obj).f91144a);
    }

    public final int hashCode() {
        return this.f91144a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f91144a);
    }
}
