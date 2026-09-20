package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class zde1 implements Parcelable {
    public static final Parcelable.Creator<zde1> CREATOR = new xed1(14);

    /* JADX INFO: renamed from: a */
    public final String f281707a;

    /* JADX INFO: renamed from: b */
    public final boolean f281708b;

    public zde1(String str, boolean z) {
        this.f281707a = str;
        this.f281708b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zde1)) {
            return false;
        }
        zde1 zde1Var = (zde1) obj;
        return wj50.m88271j(this.f281707a, zde1Var.f281707a) && this.f281708b == zde1Var.f281708b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281708b) + (this.f281707a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f281707a);
        parcel.writeInt(this.f281708b ? 1 : 0);
    }
}
