package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class vf1 implements Parcelable {
    public static final Parcelable.Creator<vf1> CREATOR = new g11(19);

    /* JADX INFO: renamed from: a */
    public final String f240868a;

    public vf1(String str) {
        this.f240868a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf1) && wj50.m88271j(this.f240868a, ((vf1) obj).f240868a);
    }

    public final int hashCode() {
        String str = this.f240868a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f240868a);
    }
}
