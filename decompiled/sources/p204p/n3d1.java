package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class n3d1 implements Parcelable {
    public static final Parcelable.Creator<n3d1> CREATOR = new vmc1(22);

    /* JADX INFO: renamed from: a */
    public final String f150031a;

    /* JADX INFO: renamed from: b */
    public final String f150032b;

    /* JADX INFO: renamed from: c */
    public final String f150033c;

    /* JADX INFO: renamed from: d */
    public final byte[] f150034d;

    public n3d1(String str, String str2, byte[] bArr, String str3) {
        this.f150031a = str;
        this.f150032b = str2;
        this.f150033c = str3;
        this.f150034d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3d1)) {
            return false;
        }
        n3d1 n3d1Var = (n3d1) obj;
        return wj50.m88271j(this.f150031a, n3d1Var.f150031a) && wj50.m88271j(this.f150032b, n3d1Var.f150032b) && wj50.m88271j(this.f150033c, n3d1Var.f150033c) && wj50.m88271j(this.f150034d, n3d1Var.f150034d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f150031a.hashCode() * 31, 31, this.f150032b), 31, this.f150033c);
        byte[] bArr = this.f150034d;
        return iM77243b + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f150031a);
        parcel.writeString(this.f150032b);
        parcel.writeString(this.f150033c);
        parcel.writeByteArray(this.f150034d);
    }
}
