package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class n1j0 implements Parcelable {
    public static final Parcelable.Creator<n1j0> CREATOR = new rri0(8);

    /* JADX INFO: renamed from: a */
    public final String f149458a;

    /* JADX INFO: renamed from: b */
    public final String f149459b;

    public n1j0(String str, String str2) {
        this.f149458a = str;
        this.f149459b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1j0)) {
            return false;
        }
        n1j0 n1j0Var = (n1j0) obj;
        return wj50.m88271j(this.f149458a, n1j0Var.f149458a) && wj50.m88271j(this.f149459b, n1j0Var.f149459b);
    }

    public final int hashCode() {
        return this.f149459b.hashCode() + (this.f149458a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f149458a);
        parcel.writeString(this.f149459b);
    }
}
