package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class tqv0 implements Parcelable {
    public static final Parcelable.Creator<tqv0> CREATOR = new h1v0(18);

    /* JADX INFO: renamed from: a */
    public final String f222898a;

    /* JADX INFO: renamed from: b */
    public final String f222899b;

    public tqv0(String str, String str2) {
        this.f222898a = str;
        this.f222899b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqv0)) {
            return false;
        }
        tqv0 tqv0Var = (tqv0) obj;
        return wj50.m88271j(this.f222898a, tqv0Var.f222898a) && wj50.m88271j(this.f222899b, tqv0Var.f222899b);
    }

    public final String getEntityUri() {
        return this.f222898a;
    }

    public final int hashCode() {
        return this.f222899b.hashCode() + (this.f222898a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f222898a);
        parcel.writeString(this.f222899b);
    }
}
