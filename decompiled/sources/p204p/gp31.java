package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class gp31 implements jp31 {
    public static final Parcelable.Creator<gp31> CREATOR = new ln31(1);

    /* JADX INFO: renamed from: a */
    public final String f83068a;

    public gp31(String str) {
        this.f83068a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gp31) && wj50.m88271j(this.f83068a, ((gp31) obj).f83068a);
    }

    public final int hashCode() {
        return this.f83068a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f83068a);
    }
}
