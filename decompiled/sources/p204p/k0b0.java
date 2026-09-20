package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class k0b0 extends w0b0 {
    public static final Parcelable.Creator<k0b0> CREATOR = new ama0(29);

    /* JADX INFO: renamed from: a */
    public final String f117954a;

    /* JADX INFO: renamed from: b */
    public final String f117955b;

    public k0b0(String str, String str2) {
        this.f117954a = str;
        this.f117955b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0b0)) {
            return false;
        }
        k0b0 k0b0Var = (k0b0) obj;
        return wj50.m88271j(this.f117954a, k0b0Var.f117954a) && wj50.m88271j(this.f117955b, k0b0Var.f117955b);
    }

    public final int hashCode() {
        return this.f117955b.hashCode() + (this.f117954a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f117954a);
        parcel.writeString(this.f117955b);
    }
}
