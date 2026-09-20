package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class g0b0 extends w0b0 {
    public static final Parcelable.Creator<g0b0> CREATOR = new ama0(25);

    /* JADX INFO: renamed from: a */
    public final String f75325a;

    /* JADX INFO: renamed from: b */
    public final String f75326b;

    public g0b0(String str, String str2) {
        this.f75325a = str;
        this.f75326b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0b0)) {
            return false;
        }
        g0b0 g0b0Var = (g0b0) obj;
        return wj50.m88271j(this.f75325a, g0b0Var.f75325a) && wj50.m88271j(this.f75326b, g0b0Var.f75326b);
    }

    /* JADX INFO: renamed from: g */
    public final String m43259g() {
        return this.f75325a;
    }

    public final int hashCode() {
        return this.f75326b.hashCode() + (this.f75325a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f75325a);
        parcel.writeString(this.f75326b);
    }
}
