package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class m1z0 implements Parcelable {
    public static final Parcelable.Creator<m1z0> CREATOR = new lpy0(19);

    /* JADX INFO: renamed from: a */
    public final xov f139167a;

    public m1z0(xov xovVar) {
        this.f139167a = xovVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1z0) && wj50.m88271j(this.f139167a, ((m1z0) obj).f139167a);
    }

    public final int hashCode() {
        return this.f139167a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f139167a.writeToParcel(parcel, i);
    }
}
