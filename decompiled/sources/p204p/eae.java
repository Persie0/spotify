package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class eae implements Parcelable {
    public static final Parcelable.Creator<eae> CREATOR = new n6e(2);

    /* JADX INFO: renamed from: a */
    public final dae f57644a;

    public eae(dae daeVar) {
        this.f57644a = daeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eae) && wj50.m88271j(this.f57644a, ((eae) obj).f57644a);
    }

    public final int hashCode() {
        return this.f57644a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f57644a, i);
    }
}
