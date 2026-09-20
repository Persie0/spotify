package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class rg70 implements Parcelable {
    public static final Parcelable.Creator<rg70> CREATOR = new w270(13);

    /* JADX INFO: renamed from: a */
    public final String f198883a;

    public rg70(String str) {
        this.f198883a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg70) && wj50.m88271j(this.f198883a, ((rg70) obj).f198883a);
    }

    public final int hashCode() {
        return this.f198883a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f198883a);
    }
}
