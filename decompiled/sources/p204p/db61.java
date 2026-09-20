package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class db61 implements Parcelable {
    public static final Parcelable.Creator<db61> CREATOR = new e361(17);

    /* JADX INFO: renamed from: a */
    public final String f47224a;

    public db61(String str) {
        this.f47224a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db61) && wj50.m88271j(this.f47224a, ((db61) obj).f47224a);
    }

    public final int hashCode() {
        return this.f47224a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f47224a);
    }
}
