package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vea0 extends xea0 {
    public static final Parcelable.Creator<vea0> CREATOR = new z8a0(18);

    /* JADX INFO: renamed from: a */
    public final String f240662a;

    public vea0(String str) {
        this.f240662a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vea0) && wj50.m88271j(this.f240662a, ((vea0) obj).f240662a);
    }

    public final int hashCode() {
        return this.f240662a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f240662a);
    }
}
