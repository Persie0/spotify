package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class hxa1 implements Parcelable {
    public static final Parcelable.Creator<hxa1> CREATOR = new u2a1(25);

    /* JADX INFO: renamed from: a */
    public final int f96179a;

    /* JADX INFO: renamed from: b */
    public final fmn0 f96180b;

    /* JADX INFO: renamed from: c */
    public final String f96181c;

    public hxa1(int i, fmn0 fmn0Var, String str) {
        this.f96179a = i;
        this.f96180b = fmn0Var;
        this.f96181c = str;
    }

    /* JADX INFO: renamed from: c */
    public final fmn0 m48982c() {
        return this.f96180b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxa1)) {
            return false;
        }
        hxa1 hxa1Var = (hxa1) obj;
        return this.f96179a == hxa1Var.f96179a && wj50.m88271j(this.f96180b, hxa1Var.f96180b) && wj50.m88271j(this.f96181c, hxa1Var.f96181c);
    }

    /* JADX INFO: renamed from: g */
    public final int m48983g() {
        return this.f96179a;
    }

    public final int hashCode() {
        return this.f96181c.hashCode() + ((this.f96180b.hashCode() + (Integer.hashCode(this.f96179a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f96179a);
        parcel.writeParcelable(this.f96180b, i);
        parcel.writeString(this.f96181c);
    }
}
