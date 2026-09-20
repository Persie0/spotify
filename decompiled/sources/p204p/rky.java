package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class rky extends sky {
    public static final Parcelable.Creator<rky> CREATOR = new p7y(22);

    /* JADX INFO: renamed from: a */
    public final String f200178a;

    public rky(String str) {
        this.f200178a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rky) && wj50.m88271j(this.f200178a, ((rky) obj).f200178a);
    }

    public final int hashCode() {
        return this.f200178a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f200178a);
    }
}
