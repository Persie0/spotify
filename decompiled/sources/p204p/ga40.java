package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ga40 implements Parcelable {
    public static final Parcelable.Creator<ga40> CREATOR = new y240(9);

    /* JADX INFO: renamed from: a */
    public final boolean f77971a;

    /* JADX INFO: renamed from: b */
    public final boolean f77972b;

    public ga40(boolean z, boolean z2) {
        this.f77971a = z;
        this.f77972b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga40)) {
            return false;
        }
        ga40 ga40Var = (ga40) obj;
        return this.f77971a == ga40Var.f77971a && this.f77972b == ga40Var.f77972b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77972b) + (Boolean.hashCode(this.f77971a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f77971a ? 1 : 0);
        parcel.writeInt(this.f77972b ? 1 : 0);
    }
}
