package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class h98 implements Parcelable {
    public static final Parcelable.Creator<h98> CREATOR = new na7(29);

    /* JADX INFO: renamed from: a */
    public final int f88891a;

    /* JADX INFO: renamed from: b */
    public final boolean f88892b;

    public h98(int i, boolean z) {
        this.f88891a = i;
        this.f88892b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h98)) {
            return false;
        }
        h98 h98Var = (h98) obj;
        return this.f88891a == h98Var.f88891a && this.f88892b == h98Var.f88892b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88892b) + (Integer.hashCode(this.f88891a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f88891a);
        parcel.writeInt(this.f88892b ? 1 : 0);
    }
}
