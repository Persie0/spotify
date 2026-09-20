package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class pzw0 implements Parcelable {
    public static final Parcelable.Creator<pzw0> CREATOR = new xxw0(3);

    /* JADX INFO: renamed from: a */
    public final String f183853a;

    /* JADX INFO: renamed from: b */
    public final boolean f183854b;

    public pzw0(String str, boolean z) {
        this.f183853a = str;
        this.f183854b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzw0)) {
            return false;
        }
        pzw0 pzw0Var = (pzw0) obj;
        return wj50.m88271j(this.f183853a, pzw0Var.f183853a) && this.f183854b == pzw0Var.f183854b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183854b) + (this.f183853a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f183853a);
        parcel.writeInt(this.f183854b ? 1 : 0);
    }
}
