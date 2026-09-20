package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class c5x0 implements Parcelable {
    public static final Parcelable.Creator<c5x0> CREATOR = new xxw0(5);

    /* JADX INFO: renamed from: a */
    public final boolean f34310a;

    /* JADX INFO: renamed from: b */
    public final boolean f34311b;

    /* JADX INFO: renamed from: c */
    public final boolean f34312c;

    /* JADX INFO: renamed from: d */
    public final boolean f34313d;

    public c5x0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f34310a = z;
        this.f34311b = z2;
        this.f34312c = z3;
        this.f34313d = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5x0)) {
            return false;
        }
        c5x0 c5x0Var = (c5x0) obj;
        return this.f34310a == c5x0Var.f34310a && this.f34311b == c5x0Var.f34311b && this.f34312c == c5x0Var.f34312c && this.f34313d == c5x0Var.f34313d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34313d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f34310a) * 31, 31, this.f34311b), 31, this.f34312c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34310a ? 1 : 0);
        parcel.writeInt(this.f34311b ? 1 : 0);
        parcel.writeInt(this.f34312c ? 1 : 0);
        parcel.writeInt(this.f34313d ? 1 : 0);
    }
}
