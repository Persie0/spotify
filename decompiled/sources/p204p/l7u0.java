package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class l7u0 implements Parcelable {
    public static final Parcelable.Creator<l7u0> CREATOR = new v5u0(4);

    /* JADX INFO: renamed from: a */
    public final String f130738a;

    /* JADX INFO: renamed from: b */
    public final int f130739b;

    public l7u0(String str, int i) {
        this.f130738a = str;
        this.f130739b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7u0)) {
            return false;
        }
        l7u0 l7u0Var = (l7u0) obj;
        return wj50.m88271j(this.f130738a, l7u0Var.f130738a) && this.f130739b == l7u0Var.f130739b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130739b) + (this.f130738a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f130738a);
        parcel.writeInt(this.f130739b);
    }
}
