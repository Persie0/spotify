package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ndl implements pdl, Parcelable {
    public static final Parcelable.Creator<ndl> CREATOR = new z4l(14);

    /* JADX INFO: renamed from: a */
    public final String f152799a;

    /* JADX INFO: renamed from: b */
    public final String f152800b;

    public ndl(String str, String str2) {
        this.f152799a = str;
        this.f152800b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ndl) {
            return wj50.m88271j(this.f152799a, ((ndl) obj).f152799a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f152799a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f152799a);
        parcel.writeString(this.f152800b);
    }
}
