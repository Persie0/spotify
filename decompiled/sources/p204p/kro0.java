package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class kro0 implements qro0 {
    public static final Parcelable.Creator<kro0> CREATOR = new igo0(14);

    /* JADX INFO: renamed from: a */
    public final String f125698a;

    public kro0(String str) {
        this.f125698a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kro0) && wj50.m88271j(this.f125698a, ((kro0) obj).f125698a);
    }

    public final int hashCode() {
        return this.f125698a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f125698a);
    }
}
