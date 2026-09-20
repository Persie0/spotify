package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class t8t implements Parcelable {
    public static final Parcelable.Creator<t8t> CREATOR = new f9s(26);

    /* JADX INFO: renamed from: a */
    public final String f218129a;

    public t8t(String str) {
        this.f218129a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8t) && wj50.m88271j(this.f218129a, ((t8t) obj).f218129a);
    }

    public final int hashCode() {
        return this.f218129a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f218129a);
    }
}
