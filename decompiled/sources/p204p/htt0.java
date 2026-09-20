package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class htt0 implements Parcelable {
    public static final Parcelable.Creator<htt0> CREATOR = new vit0(12);

    /* JADX INFO: renamed from: a */
    public final String f95167a;

    public htt0(String str) {
        this.f95167a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof htt0) && wj50.m88271j(this.f95167a, ((htt0) obj).f95167a);
    }

    public final int hashCode() {
        return this.f95167a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f95167a);
    }
}
