package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class o320 implements m6k {
    public static final Parcelable.Creator<o320> CREATOR = new km10(29);

    /* JADX INFO: renamed from: a */
    public final String f161236a;

    /* JADX INFO: renamed from: b */
    public final String f161237b;

    /* JADX INFO: renamed from: c */
    public final nmn0 f161238c;

    /* JADX INFO: renamed from: d */
    public final String f161239d;

    public o320(String str, String str2, nmn0 nmn0Var, String str3) {
        this.f161236a = str;
        this.f161237b = str2;
        this.f161238c = nmn0Var;
        this.f161239d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o320)) {
            return false;
        }
        o320 o320Var = (o320) obj;
        return wj50.m88271j(this.f161236a, o320Var.f161236a) && wj50.m88271j(this.f161237b, o320Var.f161237b) && wj50.m88271j(this.f161238c, o320Var.f161238c) && wj50.m88271j(this.f161239d, o320Var.f161239d);
    }

    @Override // p204p.m6k
    public final z6k getTarget() {
        return null;
    }

    public final int hashCode() {
        return this.f161239d.hashCode() + ((this.f161238c.hashCode() + s571.m77243b(this.f161236a.hashCode() * 31, 31, this.f161237b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161236a);
        parcel.writeString(this.f161237b);
        parcel.writeParcelable(this.f161238c, i);
        parcel.writeString(this.f161239d);
    }
}
