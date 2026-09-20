package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jbz0 implements Parcelable {
    public static final Parcelable.Creator<jbz0> CREATOR = new lpy0(29);

    /* JADX INFO: renamed from: a */
    public final String f110925a;

    /* JADX INFO: renamed from: b */
    public final String f110926b;

    public jbz0(String str, String str2) {
        this.f110925a = str;
        this.f110926b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbz0)) {
            return false;
        }
        jbz0 jbz0Var = (jbz0) obj;
        return wj50.m88271j(this.f110925a, jbz0Var.f110925a) && wj50.m88271j(this.f110926b, jbz0Var.f110926b);
    }

    public final int hashCode() {
        return this.f110926b.hashCode() + (this.f110925a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110925a);
        parcel.writeString(this.f110926b);
    }
}
