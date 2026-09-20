package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class h9l implements Parcelable {
    public static final Parcelable.Creator<h9l> CREATOR = new z4l(5);

    /* JADX INFO: renamed from: a */
    public final String f88998a;

    public h9l(String str) {
        this.f88998a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9l) && wj50.m88271j(this.f88998a, ((h9l) obj).f88998a);
    }

    public final int hashCode() {
        return this.f88998a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f88998a);
    }
}
