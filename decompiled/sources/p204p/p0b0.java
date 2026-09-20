package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class p0b0 extends w0b0 {
    public static final Parcelable.Creator<p0b0> CREATOR = new l0b0(3);

    /* JADX INFO: renamed from: a */
    public final String f172626a;

    /* JADX INFO: renamed from: b */
    public final String f172627b;

    public p0b0(String str, String str2) {
        this.f172626a = str;
        this.f172627b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0b0)) {
            return false;
        }
        p0b0 p0b0Var = (p0b0) obj;
        return wj50.m88271j(this.f172626a, p0b0Var.f172626a) && wj50.m88271j(this.f172627b, p0b0Var.f172627b);
    }

    public final int hashCode() {
        return this.f172627b.hashCode() + (this.f172626a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f172626a);
        parcel.writeString(this.f172627b);
    }
}
