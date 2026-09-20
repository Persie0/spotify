package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class vj80 implements Parcelable {
    public static final Parcelable.Creator<vj80> CREATOR = new i980(10);

    /* JADX INFO: renamed from: a */
    public final String f241919a;

    /* JADX INFO: renamed from: b */
    public final String f241920b;

    public vj80(String str, String str2) {
        this.f241919a = str;
        this.f241920b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj80)) {
            return false;
        }
        vj80 vj80Var = (vj80) obj;
        return wj50.m88271j(this.f241919a, vj80Var.f241919a) && wj50.m88271j(this.f241920b, vj80Var.f241920b);
    }

    public final int hashCode() {
        int iHashCode = this.f241919a.hashCode() * 31;
        String str = this.f241920b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f241919a);
        parcel.writeString(this.f241920b);
    }
}
