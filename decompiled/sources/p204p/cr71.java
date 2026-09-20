package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class cr71 implements fr71 {
    public static final Parcelable.Creator<cr71> CREATOR = new c071(27);

    /* JADX INFO: renamed from: a */
    public final boolean f41201a;

    /* JADX INFO: renamed from: b */
    public final boolean f41202b;

    public cr71(boolean z, boolean z2) {
        this.f41201a = z;
        this.f41202b = z2;
    }

    @Override // p204p.fr71
    /* JADX INFO: renamed from: F0 */
    public final boolean mo33722F0() {
        return this.f41201a;
    }

    @Override // p204p.fr71
    /* JADX INFO: renamed from: P */
    public final boolean mo33723P() {
        return this.f41202b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr71)) {
            return false;
        }
        cr71 cr71Var = (cr71) obj;
        return this.f41201a == cr71Var.f41201a && this.f41202b == cr71Var.f41202b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41202b) + (Boolean.hashCode(this.f41201a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f41201a ? 1 : 0);
        parcel.writeInt(this.f41202b ? 1 : 0);
    }
}
