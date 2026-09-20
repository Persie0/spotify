package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class f2r implements Parcelable {
    public static final Parcelable.Creator<f2r> CREATOR = new lso(25);

    /* JADX INFO: renamed from: a */
    public final boolean f65257a;

    /* JADX INFO: renamed from: b */
    public final boolean f65258b;

    public f2r(boolean z, boolean z2) {
        this.f65257a = z;
        this.f65258b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2r)) {
            return false;
        }
        f2r f2rVar = (f2r) obj;
        return this.f65257a == f2rVar.f65257a && this.f65258b == f2rVar.f65258b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65258b) + (Boolean.hashCode(this.f65257a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f65257a ? 1 : 0);
        parcel.writeInt(this.f65258b ? 1 : 0);
    }

    public /* synthetic */ f2r(int i) {
        this(false, (i & 2) == 0);
    }
}
