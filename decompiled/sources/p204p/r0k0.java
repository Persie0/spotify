package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class r0k0 implements Parcelable {
    public static final Parcelable.Creator<r0k0> CREATOR = new fgj0(15);

    /* JADX INFO: renamed from: a */
    public final boolean f194514a;

    /* JADX INFO: renamed from: b */
    public final String f194515b;

    public r0k0(boolean z, String str) {
        this.f194514a = z;
        this.f194515b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0k0)) {
            return false;
        }
        r0k0 r0k0Var = (r0k0) obj;
        return this.f194514a == r0k0Var.f194514a && wj50.m88271j(this.f194515b, r0k0Var.f194515b);
    }

    public final int hashCode() {
        return this.f194515b.hashCode() + (Boolean.hashCode(this.f194514a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f194514a ? 1 : 0);
        parcel.writeString(this.f194515b);
    }
}
