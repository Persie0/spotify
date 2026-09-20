package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class n6x0 extends c7x0 {
    public static final Parcelable.Creator<n6x0> CREATOR = new xxw0(10);

    /* JADX INFO: renamed from: a */
    public final Parcelable f150980a;

    public n6x0(Parcelable parcelable) {
        this.f150980a = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6x0) && wj50.m88271j(this.f150980a, ((n6x0) obj).f150980a);
    }

    public final int hashCode() {
        return this.f150980a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f150980a, i);
    }
}
