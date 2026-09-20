package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class xyn0 extends b221 implements ikz0 {
    public static final Parcelable.Creator<xyn0> CREATOR = new ejn0(23);

    /* JADX INFO: renamed from: a */
    public final String f267387a;

    /* JADX INFO: renamed from: b */
    public final String f267388b;

    /* JADX INFO: renamed from: c */
    public final boolean f267389c;

    public xyn0(String str, String str2, boolean z) {
        this.f267387a = str;
        this.f267388b = str2;
        this.f267389c = z;
    }

    /* JADX INFO: renamed from: c */
    public static xyn0 m92422c(xyn0 xyn0Var, boolean z) {
        String str = xyn0Var.f267387a;
        String str2 = xyn0Var.f267388b;
        xyn0Var.getClass();
        return new xyn0(str, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyn0)) {
            return false;
        }
        xyn0 xyn0Var = (xyn0) obj;
        return wj50.m88271j(this.f267387a, xyn0Var.f267387a) && wj50.m88271j(this.f267388b, xyn0Var.f267388b) && this.f267389c == xyn0Var.f267389c;
    }

    @Override // p204p.ikz0
    /* JADX INFO: renamed from: f */
    public final boolean mo28935f() {
        return this.f267389c;
    }

    @Override // p204p.b221
    public final String getUri() {
        return this.f267388b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267389c) + s571.m77243b(this.f267387a.hashCode() * 31, 31, this.f267388b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f267387a);
        parcel.writeString(this.f267388b);
        parcel.writeInt(this.f267389c ? 1 : 0);
    }
}
