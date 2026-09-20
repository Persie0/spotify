package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class mh3 implements nh3 {
    public static final Parcelable.Creator<mh3> CREATOR = new bc3(4);

    /* JADX INFO: renamed from: a */
    public final String f143696a;

    public mh3(String str) {
        this.f143696a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mh3) && wj50.m88271j(this.f143696a, ((mh3) obj).f143696a);
    }

    public final int hashCode() {
        return this.f143696a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f143696a);
    }
}
