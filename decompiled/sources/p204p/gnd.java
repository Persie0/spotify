package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class gnd implements ind {
    public static final Parcelable.Creator<gnd> CREATOR = new fjd(7);

    /* JADX INFO: renamed from: a */
    public final String f82689a;

    /* JADX INFO: renamed from: b */
    public final String f82690b;

    public gnd(String str, String str2) {
        this.f82689a = str;
        this.f82690b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnd)) {
            return false;
        }
        gnd gndVar = (gnd) obj;
        return wj50.m88271j(this.f82689a, gndVar.f82689a) && wj50.m88271j(this.f82690b, gndVar.f82690b);
    }

    public final int hashCode() {
        String str = this.f82689a;
        return this.f82690b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f82689a);
        parcel.writeString(this.f82690b);
    }
}
