package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class vy80 implements Parcelable {
    public static final Parcelable.Creator<vy80> CREATOR = new ct80(12);

    /* JADX INFO: renamed from: a */
    public final boolean f246003a;

    /* JADX INFO: renamed from: b */
    public final boolean f246004b;

    /* JADX INFO: renamed from: c */
    public final boolean f246005c;

    public vy80(boolean z, boolean z2, boolean z3) {
        this.f246003a = z;
        this.f246004b = z2;
        this.f246005c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy80)) {
            return false;
        }
        vy80 vy80Var = (vy80) obj;
        return this.f246003a == vy80Var.f246003a && this.f246004b == vy80Var.f246004b && this.f246005c == vy80Var.f246005c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246005c) + s571.m77245d(Boolean.hashCode(this.f246003a) * 31, 31, this.f246004b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f246003a ? 1 : 0);
        parcel.writeInt(this.f246004b ? 1 : 0);
        parcel.writeInt(this.f246005c ? 1 : 0);
    }
}
