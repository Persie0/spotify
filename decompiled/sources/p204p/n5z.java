package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class n5z implements Parcelable {
    public static final Parcelable.Creator<n5z> CREATOR = new c2z(9);

    /* JADX INFO: renamed from: a */
    public final String f150640a;

    /* JADX INFO: renamed from: b */
    public final a7z0 f150641b;

    public n5z(String str, a7z0 a7z0Var) {
        this.f150640a = str;
        this.f150641b = a7z0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5z)) {
            return false;
        }
        n5z n5zVar = (n5z) obj;
        return wj50.m88271j(this.f150640a, n5zVar.f150640a) && wj50.m88271j(this.f150641b, n5zVar.f150641b);
    }

    public final int hashCode() {
        return this.f150641b.f13152a.hashCode() + (this.f150640a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f150640a);
        this.f150641b.writeToParcel(parcel, i);
    }
}
