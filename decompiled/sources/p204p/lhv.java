package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class lhv extends mhv {
    public static final Parcelable.Creator<lhv> CREATOR = new m8v(17);

    /* JADX INFO: renamed from: a */
    public final wr31 f133649a;

    /* JADX INFO: renamed from: b */
    public final xi3 f133650b;

    /* JADX INFO: renamed from: c */
    public final boolean f133651c;

    public lhv(wr31 wr31Var, xi3 xi3Var, boolean z) {
        this.f133649a = wr31Var;
        this.f133650b = xi3Var;
        this.f133651c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhv)) {
            return false;
        }
        lhv lhvVar = (lhv) obj;
        return this.f133649a == lhvVar.f133649a && this.f133650b == lhvVar.f133650b && this.f133651c == lhvVar.f133651c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133651c) + ((this.f133650b.hashCode() + (this.f133649a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f133649a.name());
        parcel.writeString(this.f133650b.name());
        parcel.writeInt(this.f133651c ? 1 : 0);
    }
}
