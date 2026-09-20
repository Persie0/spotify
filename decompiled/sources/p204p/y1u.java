package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class y1u extends b2u {
    public static final Parcelable.Creator<y1u> CREATOR = new qct(11);

    /* JADX INFO: renamed from: a */
    public final String f268406a;

    public y1u(String str) {
        this.f268406a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1u) && wj50.m88271j(this.f268406a, ((y1u) obj).f268406a);
    }

    public final int hashCode() {
        return this.f268406a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f268406a);
    }
}
