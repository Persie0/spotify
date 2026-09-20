package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class yoa1 implements Parcelable {
    public static final Parcelable.Creator<yoa1> CREATOR = new u2a1(14);

    /* JADX INFO: renamed from: a */
    public final String f274617a;

    public yoa1(String str) {
        this.f274617a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yoa1) && wj50.m88271j(this.f274617a, ((yoa1) obj).f274617a);
    }

    public final int hashCode() {
        String str = this.f274617a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f274617a);
    }
}
