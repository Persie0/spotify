package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d11 implements l11 {
    public static final Parcelable.Creator<d11> CREATOR = new zz0(26);

    /* JADX INFO: renamed from: a */
    public final fua0 f44125a;

    /* JADX INFO: renamed from: b */
    public final w0b0 f44126b;

    /* JADX INFO: renamed from: c */
    public final Boolean f44127c;

    /* JADX INFO: renamed from: d */
    public final hy0 f44128d;

    /* JADX INFO: renamed from: e */
    public final boolean f44129e;

    public d11(fua0 fua0Var, w0b0 w0b0Var, Boolean bool, hy0 hy0Var, boolean z) {
        this.f44125a = fua0Var;
        this.f44126b = w0b0Var;
        this.f44127c = bool;
        this.f44128d = hy0Var;
        this.f44129e = z;
    }

    /* JADX INFO: renamed from: c */
    public static d11 m34574c(d11 d11Var, w0b0 w0b0Var, Boolean bool, hy0 hy0Var, boolean z, int i) {
        w0b0 w0b0Var2 = w0b0Var;
        fua0 fua0Var = d11Var.f44125a;
        if ((i & 2) != 0) {
            w0b0Var2 = d11Var.f44126b;
        }
        if ((i & 4) != 0) {
            bool = d11Var.f44127c;
        }
        if ((i & 8) != 0) {
            hy0Var = d11Var.f44128d;
        }
        if ((i & 16) != 0) {
            z = d11Var.f44129e;
        }
        boolean z2 = z;
        d11Var.getClass();
        hy0 hy0Var2 = hy0Var;
        return new d11(fua0Var, w0b0Var2, bool, hy0Var2, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d11)) {
            return false;
        }
        d11 d11Var = (d11) obj;
        return wj50.m88271j(this.f44125a, d11Var.f44125a) && wj50.m88271j(this.f44126b, d11Var.f44126b) && wj50.m88271j(this.f44127c, d11Var.f44127c) && wj50.m88271j(this.f44128d, d11Var.f44128d) && this.f44129e == d11Var.f44129e;
    }

    public final int hashCode() {
        fua0 fua0Var = this.f44125a;
        int iHashCode = (fua0Var == null ? 0 : fua0Var.hashCode()) * 31;
        w0b0 w0b0Var = this.f44126b;
        int iHashCode2 = (iHashCode + (w0b0Var == null ? 0 : w0b0Var.hashCode())) * 31;
        Boolean bool = this.f44127c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        hy0 hy0Var = this.f44128d;
        return Boolean.hashCode(this.f44129e) + ((iHashCode3 + (hy0Var != null ? hy0Var.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f44125a, i);
        parcel.writeParcelable(this.f44126b, i);
        Boolean bool = this.f44127c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool);
        }
        hy0 hy0Var = this.f44128d;
        if (hy0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hy0Var.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ d11(fua0 fua0Var, w0b0 w0b0Var, Boolean bool, hy0 hy0Var, int i) {
        this(fua0Var, (i & 2) != 0 ? null : w0b0Var, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : hy0Var, false);
    }
}
