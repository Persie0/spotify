package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class a2u extends b2u {
    public static final Parcelable.Creator<a2u> CREATOR = new qct(13);

    /* JADX INFO: renamed from: a */
    public final String f11721a;

    public a2u(String str) {
        this.f11721a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2u) && wj50.m88271j(this.f11721a, ((a2u) obj).f11721a);
    }

    public final int hashCode() {
        return this.f11721a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11721a);
    }
}
