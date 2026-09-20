package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class r0y implements i6z0 {
    public static final Parcelable.Creator<r0y> CREATOR = new wfw(16);

    /* JADX INFO: renamed from: a */
    public final int f194606a;

    /* JADX INFO: renamed from: b */
    public final String f194607b;

    /* JADX INFO: renamed from: c */
    public final String f194608c;

    public r0y(int i, String str, String str2) {
        this.f194606a = i;
        this.f194607b = str;
        this.f194608c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0y)) {
            return false;
        }
        r0y r0yVar = (r0y) obj;
        return this.f194606a == r0yVar.f194606a && wj50.m88271j(this.f194607b, r0yVar.f194607b) && wj50.m88271j(this.f194608c, r0yVar.f194608c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Integer.hashCode(this.f194606a) * 31, 31, this.f194607b);
        String str = this.f194608c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // p204p.i6z0
    /* JADX INFO: renamed from: s */
    public final int mo27367s() {
        return this.f194606a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f194606a);
        parcel.writeString(this.f194607b);
        parcel.writeString(this.f194608c);
    }
}
