package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class z310 implements m8z0 {
    public static final Parcelable.Creator<z310> CREATOR = new qz00(7);

    /* JADX INFO: renamed from: a */
    public final zbv f278739a;

    public z310(zbv zbvVar) {
        this.f278739a = zbvVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z310) && wj50.m88271j(this.f278739a, ((z310) obj).f278739a);
    }

    public final int hashCode() {
        return this.f278739a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f278739a.writeToParcel(parcel, i);
    }
}
