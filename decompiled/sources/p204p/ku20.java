package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ku20 implements Parcelable {
    public static final Parcelable.Creator<ku20> CREATOR = new t320(19);

    /* JADX INFO: renamed from: a */
    public final long f126436a;

    /* JADX INFO: renamed from: b */
    public final String f126437b;

    public ku20(long j, String str) {
        this.f126436a = j;
        this.f126437b = str;
    }

    /* JADX INFO: renamed from: c */
    public final long m57373c() {
        return this.f126436a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku20)) {
            return false;
        }
        ku20 ku20Var = (ku20) obj;
        return this.f126436a == ku20Var.f126436a && wj50.m88271j(this.f126437b, ku20Var.f126437b);
    }

    public final int hashCode() {
        return this.f126437b.hashCode() + (Long.hashCode(this.f126436a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f126436a);
        parcel.writeString(this.f126437b);
    }
}
