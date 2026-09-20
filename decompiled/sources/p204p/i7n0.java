package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class i7n0 implements Parcelable {
    public static final Parcelable.Creator<i7n0> CREATOR = new pum0(25);

    /* JADX INFO: renamed from: a */
    public final String f99595a;

    /* JADX INFO: renamed from: b */
    public final String f99596b;

    public i7n0(String str, String str2) {
        this.f99595a = str;
        this.f99596b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7n0)) {
            return false;
        }
        i7n0 i7n0Var = (i7n0) obj;
        return wj50.m88271j(this.f99595a, i7n0Var.f99595a) && wj50.m88271j(this.f99596b, i7n0Var.f99596b);
    }

    public final int hashCode() {
        return this.f99596b.hashCode() + (this.f99595a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f99595a);
        parcel.writeString(this.f99596b);
    }
}
