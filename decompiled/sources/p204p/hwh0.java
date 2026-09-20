package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class hwh0 implements Parcelable {
    public static final Parcelable.Creator<hwh0> CREATOR = new xuf0(23);

    /* JADX INFO: renamed from: a */
    public final String f95944a;

    /* JADX INFO: renamed from: b */
    public final boolean f95945b;

    public hwh0(String str, boolean z) {
        this.f95944a = str;
        this.f95945b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwh0)) {
            return false;
        }
        hwh0 hwh0Var = (hwh0) obj;
        return wj50.m88271j(this.f95944a, hwh0Var.f95944a) && this.f95945b == hwh0Var.f95945b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95945b) + (this.f95944a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f95944a);
        parcel.writeInt(this.f95945b ? 1 : 0);
    }
}
