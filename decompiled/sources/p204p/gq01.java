package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class gq01 implements Parcelable {
    public static final Parcelable.Creator<gq01> CREATOR = new sp01(12);

    /* JADX INFO: renamed from: a */
    public final fq01 f83310a;

    /* JADX INFO: renamed from: b */
    public final boolean f83311b;

    public gq01(fq01 fq01Var, boolean z) {
        this.f83310a = fq01Var;
        this.f83311b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq01)) {
            return false;
        }
        gq01 gq01Var = (gq01) obj;
        return wj50.m88271j(this.f83310a, gq01Var.f83310a) && this.f83311b == gq01Var.f83311b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83311b) + (this.f83310a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f83310a, i);
        parcel.writeInt(this.f83311b ? 1 : 0);
    }
}
