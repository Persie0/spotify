package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class u0b0 extends w0b0 {
    public static final Parcelable.Creator<u0b0> CREATOR = new l0b0(8);

    /* JADX INFO: renamed from: a */
    public final String f225433a;

    /* JADX INFO: renamed from: b */
    public final String f225434b;

    public u0b0(String str, String str2) {
        this.f225433a = str;
        this.f225434b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0b0)) {
            return false;
        }
        u0b0 u0b0Var = (u0b0) obj;
        return wj50.m88271j(this.f225433a, u0b0Var.f225433a) && wj50.m88271j(this.f225434b, u0b0Var.f225434b);
    }

    public final int hashCode() {
        return this.f225434b.hashCode() + (this.f225433a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f225433a);
        parcel.writeString(this.f225434b);
    }
}
