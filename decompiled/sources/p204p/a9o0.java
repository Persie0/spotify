package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class a9o0 implements Parcelable {
    public static final Parcelable.Creator<a9o0> CREATOR = new o2o0(7);

    /* JADX INFO: renamed from: a */
    public final String f13610a;

    /* JADX INFO: renamed from: b */
    public final String f13611b;

    /* JADX INFO: renamed from: c */
    public final boolean f13612c;

    public a9o0(String str, String str2, boolean z) {
        this.f13610a = str;
        this.f13611b = str2;
        this.f13612c = z;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25157c() {
        return this.f13612c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9o0)) {
            return false;
        }
        a9o0 a9o0Var = (a9o0) obj;
        return wj50.m88271j(this.f13610a, a9o0Var.f13610a) && wj50.m88271j(this.f13611b, a9o0Var.f13611b) && this.f13612c == a9o0Var.f13612c;
    }

    public final String getUri() {
        return this.f13610a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13612c) + s571.m77243b(this.f13610a.hashCode() * 31, 31, this.f13611b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13610a);
        parcel.writeString(this.f13611b);
        parcel.writeInt(this.f13612c ? 1 : 0);
    }
}
