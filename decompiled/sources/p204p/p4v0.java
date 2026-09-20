package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class p4v0 implements Parcelable {
    public static final Parcelable.Creator<p4v0> CREATOR = new h1v0(1);

    /* JADX INFO: renamed from: a */
    public final String f174014a;

    /* JADX INFO: renamed from: b */
    public final int f174015b;

    public p4v0(String str, int i) {
        this.f174014a = str;
        this.f174015b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4v0)) {
            return false;
        }
        p4v0 p4v0Var = (p4v0) obj;
        return wj50.m88271j(this.f174014a, p4v0Var.f174014a) && this.f174015b == p4v0Var.f174015b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f174015b) + (this.f174014a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f174014a);
        parcel.writeInt(this.f174015b);
    }
}
