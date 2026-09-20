package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class fdw implements Parcelable {
    public static final Parcelable.Creator<fdw> CREATOR = new bwv(20);

    /* JADX INFO: renamed from: a */
    public final String f68580a;

    /* JADX INFO: renamed from: b */
    public final boolean f68581b;

    public fdw(String str, boolean z) {
        this.f68580a = str;
        this.f68581b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdw)) {
            return false;
        }
        fdw fdwVar = (fdw) obj;
        return wj50.m88271j(this.f68580a, fdwVar.f68580a) && this.f68581b == fdwVar.f68581b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68581b) + (this.f68580a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68580a);
        parcel.writeInt(this.f68581b ? 1 : 0);
    }
}
