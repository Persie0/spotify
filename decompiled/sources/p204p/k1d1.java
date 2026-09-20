package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class k1d1 implements Parcelable {
    public static final Parcelable.Creator<k1d1> CREATOR = new vmc1(19);

    /* JADX INFO: renamed from: a */
    public final String f118294a;

    /* JADX INFO: renamed from: b */
    public final String f118295b;

    public k1d1(String str, String str2) {
        this.f118294a = str;
        this.f118295b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m55091c() {
        return this.f118294a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1d1)) {
            return false;
        }
        k1d1 k1d1Var = (k1d1) obj;
        return wj50.m88271j(this.f118294a, k1d1Var.f118294a) && wj50.m88271j(this.f118295b, k1d1Var.f118295b);
    }

    public final int hashCode() {
        return this.f118295b.hashCode() + (this.f118294a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f118294a);
        parcel.writeString(this.f118295b);
    }
}
