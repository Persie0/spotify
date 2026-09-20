package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class d8b1 implements n4y {
    public static final Parcelable.Creator<d8b1> CREATOR = new c8b1(0);

    /* JADX INFO: renamed from: a */
    public final String f46421a;

    /* JADX INFO: renamed from: b */
    public final String f46422b;

    public d8b1(String str, String str2) {
        this.f46421a = str;
        this.f46422b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8b1)) {
            return false;
        }
        d8b1 d8b1Var = (d8b1) obj;
        return wj50.m88271j(this.f46421a, d8b1Var.f46421a) && wj50.m88271j(this.f46422b, d8b1Var.f46422b);
    }

    public final int hashCode() {
        return this.f46422b.hashCode() + (this.f46421a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46421a);
        parcel.writeString(this.f46422b);
    }
}
