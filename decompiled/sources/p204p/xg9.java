package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class xg9 implements Parcelable {
    public static final Parcelable.Creator<xg9> CREATOR = new dc9(7);

    /* JADX INFO: renamed from: a */
    public final String f261242a;

    /* JADX INFO: renamed from: b */
    public final String f261243b;

    /* JADX INFO: renamed from: c */
    public final String f261244c;

    /* JADX INFO: renamed from: d */
    public final int f261245d;

    /* JADX INFO: renamed from: e */
    public final int f261246e;

    /* JADX INFO: renamed from: f */
    public final b370 f261247f;

    public xg9(String str, String str2, String str3, int i, int i2, b370 b370Var) {
        this.f261242a = str;
        this.f261243b = str2;
        this.f261244c = str3;
        this.f261245d = i;
        this.f261246e = i2;
        this.f261247f = b370Var;
    }

    /* JADX INFO: renamed from: c */
    public final b370 m90559c() {
        return this.f261247f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg9)) {
            return false;
        }
        xg9 xg9Var = (xg9) obj;
        return wj50.m88271j(this.f261242a, xg9Var.f261242a) && wj50.m88271j(this.f261243b, xg9Var.f261243b) && wj50.m88271j(this.f261244c, xg9Var.f261244c) && this.f261245d == xg9Var.f261245d && this.f261246e == xg9Var.f261246e && wj50.m88271j(this.f261247f, xg9Var.f261247f);
    }

    public final int hashCode() {
        String str = this.f261242a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f261243b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f261244c;
        return this.f261247f.hashCode() + mt60.m62800g(this.f261246e, mt60.m62800g(this.f261245d, (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f261242a);
        parcel.writeString(this.f261243b);
        parcel.writeString(this.f261244c);
        parcel.writeInt(this.f261245d);
        parcel.writeInt(this.f261246e);
        parcel.writeParcelable(this.f261247f, i);
    }
}
