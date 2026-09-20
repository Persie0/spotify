package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class yzu0 implements Parcelable {
    public static final Parcelable.Creator<yzu0> CREATOR = new v5u0(28);

    /* JADX INFO: renamed from: a */
    public final String f277901a;

    /* JADX INFO: renamed from: b */
    public final boolean f277902b;

    public yzu0(String str, boolean z) {
        this.f277901a = str;
        this.f277902b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzu0)) {
            return false;
        }
        yzu0 yzu0Var = (yzu0) obj;
        return wj50.m88271j(this.f277901a, yzu0Var.f277901a) && this.f277902b == yzu0Var.f277902b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f277902b) + (this.f277901a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f277901a);
        parcel.writeInt(this.f277902b ? 1 : 0);
    }
}
