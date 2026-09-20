package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class id01 implements Parcelable {
    public static final Parcelable.Creator<id01> CREATOR = new vcz0(20);

    /* JADX INFO: renamed from: a */
    public final be01 f100912a;

    /* JADX INFO: renamed from: b */
    public final boolean f100913b;

    public id01(be01 be01Var, boolean z) {
        this.f100912a = be01Var;
        this.f100913b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id01)) {
            return false;
        }
        id01 id01Var = (id01) obj;
        return wj50.m88271j(this.f100912a, id01Var.f100912a) && this.f100913b == id01Var.f100913b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100913b) + (this.f100912a.f26239a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f100912a, i);
        parcel.writeInt(this.f100913b ? 1 : 0);
    }
}
