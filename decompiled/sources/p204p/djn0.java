package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class djn0 implements Parcelable {
    public static final Parcelable.Creator<djn0> CREATOR = new n9n0(28);

    /* JADX INFO: renamed from: a */
    public final long f49708a;

    /* JADX INFO: renamed from: b */
    public final String f49709b;

    public djn0(long j, String str) {
        this.f49708a = j;
        this.f49709b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djn0)) {
            return false;
        }
        djn0 djn0Var = (djn0) obj;
        return this.f49708a == djn0Var.f49708a && wj50.m88271j(this.f49709b, djn0Var.f49709b);
    }

    public final int hashCode() {
        return this.f49709b.hashCode() + (Long.hashCode(this.f49708a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f49708a);
        parcel.writeString(this.f49709b);
    }
}
