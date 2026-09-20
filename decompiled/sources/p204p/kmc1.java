package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class kmc1 implements mmc1 {
    public static final Parcelable.Creator<kmc1> CREATOR = new nlc1(21);

    /* JADX INFO: renamed from: a */
    public final String f124110a;

    /* JADX INFO: renamed from: b */
    public final String f124111b;

    public kmc1(String str, String str2) {
        this.f124110a = str;
        this.f124111b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmc1)) {
            return false;
        }
        kmc1 kmc1Var = (kmc1) obj;
        return wj50.m88271j(this.f124110a, kmc1Var.f124110a) && wj50.m88271j(this.f124111b, kmc1Var.f124111b);
    }

    @Override // p204p.mmc1
    public final String getLabel() {
        return this.f124110a;
    }

    public final int hashCode() {
        return this.f124111b.hashCode() + (this.f124110a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f124110a);
        parcel.writeString(this.f124111b);
    }
}
