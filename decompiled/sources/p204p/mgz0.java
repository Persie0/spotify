package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class mgz0 implements Parcelable {
    public static final Parcelable.Creator<mgz0> CREATOR = new vcz0(4);

    /* JADX INFO: renamed from: a */
    public final long f143675a;

    /* JADX INFO: renamed from: b */
    public final boolean f143676b;

    public mgz0(long j, boolean z) {
        this.f143675a = j;
        this.f143676b = z;
    }

    /* JADX INFO: renamed from: c */
    public final long m61734c() {
        return this.f143675a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgz0)) {
            return false;
        }
        mgz0 mgz0Var = (mgz0) obj;
        return this.f143675a == mgz0Var.f143675a && this.f143676b == mgz0Var.f143676b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143676b) + (Long.hashCode(this.f143675a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f143675a);
        parcel.writeInt(this.f143676b ? 1 : 0);
    }
}
