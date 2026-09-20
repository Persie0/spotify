package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class k1b1 implements Parcelable {
    public static final Parcelable.Creator<k1b1> CREATOR = new u2a1(27);

    /* JADX INFO: renamed from: a */
    public final String f118267a;

    /* JADX INFO: renamed from: b */
    public final String f118268b;

    /* JADX INFO: renamed from: c */
    public final String f118269c;

    /* JADX INFO: renamed from: d */
    public final String f118270d;

    /* JADX INFO: renamed from: e */
    public final String f118271e;

    public k1b1(String str, String str2, String str3, String str4, String str5) {
        this.f118267a = str;
        this.f118268b = str2;
        this.f118269c = str3;
        this.f118270d = str4;
        this.f118271e = str5;
    }

    /* JADX INFO: renamed from: c */
    public final j1b1 m55090c() {
        return new j1b1(this.f118267a, this.f118268b, this.f118269c, this.f118270d, this.f118271e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1b1)) {
            return false;
        }
        k1b1 k1b1Var = (k1b1) obj;
        return wj50.m88271j(this.f118267a, k1b1Var.f118267a) && wj50.m88271j(this.f118268b, k1b1Var.f118268b) && wj50.m88271j(this.f118269c, k1b1Var.f118269c) && wj50.m88271j(this.f118270d, k1b1Var.f118270d) && wj50.m88271j(this.f118271e, k1b1Var.f118271e);
    }

    public final int hashCode() {
        String str = this.f118267a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f118268b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f118269c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f118270d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f118271e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f118267a);
        parcel.writeString(this.f118268b);
        parcel.writeString(this.f118269c);
        parcel.writeString(this.f118270d);
        parcel.writeString(this.f118271e);
    }

    public /* synthetic */ k1b1(String str, String str2, int i) {
        this(null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, null, (i & 16) == 0 ? "canvas-v1" : null);
    }
}
