package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vu1 implements iet0 {
    public static final Parcelable.Creator<vu1> CREATOR = new zt1(4);

    /* JADX INFO: renamed from: a */
    public final int f244806a;

    /* JADX INFO: renamed from: b */
    public final String f244807b;

    /* JADX INFO: renamed from: c */
    public final String f244808c;

    /* JADX INFO: renamed from: d */
    public final String f244809d;

    /* JADX INFO: renamed from: e */
    public final String f244810e;

    public vu1(int i, String str, String str2, String str3, String str4) {
        this.f244806a = i;
        this.f244807b = str;
        this.f244808c = str2;
        this.f244809d = str3;
        this.f244810e = str4;
    }

    @Override // p204p.iet0
    /* JADX INFO: renamed from: I0 */
    public final int mo33720I0() {
        return this.f244806a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu1)) {
            return false;
        }
        vu1 vu1Var = (vu1) obj;
        return this.f244806a == vu1Var.f244806a && wj50.m88271j(this.f244807b, vu1Var.f244807b) && wj50.m88271j(this.f244808c, vu1Var.f244808c) && wj50.m88271j(this.f244809d, vu1Var.f244809d) && wj50.m88271j(this.f244810e, vu1Var.f244810e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f244806a) * 31, 31, this.f244807b), 31, this.f244808c), 31, this.f244809d);
        String str = this.f244810e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f244806a);
        parcel.writeString(this.f244807b);
        parcel.writeString(this.f244808c);
        parcel.writeString(this.f244809d);
        parcel.writeString(this.f244810e);
    }
}
