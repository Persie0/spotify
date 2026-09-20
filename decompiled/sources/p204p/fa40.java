package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class fa40 implements Parcelable {
    public static final Parcelable.Creator<fa40> CREATOR = new y240(8);

    /* JADX INFO: renamed from: a */
    public final boolean f67424a;

    /* JADX INFO: renamed from: b */
    public final boolean f67425b;

    public fa40(boolean z, boolean z2) {
        this.f67424a = z;
        this.f67425b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa40)) {
            return false;
        }
        fa40 fa40Var = (fa40) obj;
        return this.f67424a == fa40Var.f67424a && this.f67425b == fa40Var.f67425b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67425b) + (Boolean.hashCode(this.f67424a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f67424a ? 1 : 0);
        parcel.writeInt(this.f67425b ? 1 : 0);
    }
}
