package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class qq50 implements br50, Parcelable {
    public static final Parcelable.Creator<qq50> CREATOR = new pq50(0);

    /* JADX INFO: renamed from: a */
    public final String f191491a;

    /* JADX INFO: renamed from: b */
    public final String f191492b;

    /* JADX INFO: renamed from: c */
    public final String f191493c;

    /* JADX INFO: renamed from: d */
    public final String f191494d;

    public qq50(String str, String str2, String str3, String str4) {
        this.f191491a = str;
        this.f191492b = str2;
        this.f191493c = str3;
        this.f191494d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq50)) {
            return false;
        }
        qq50 qq50Var = (qq50) obj;
        return wj50.m88271j(this.f191491a, qq50Var.f191491a) && wj50.m88271j(this.f191492b, qq50Var.f191492b) && wj50.m88271j(this.f191493c, qq50Var.f191493c) && wj50.m88271j(this.f191494d, qq50Var.f191494d);
    }

    @Override // p204p.br50
    public final String getImageUri() {
        return this.f191493c;
    }

    @Override // p204p.br50
    public final String getName() {
        return this.f191492b;
    }

    @Override // p204p.br50
    public final String getUri() {
        return this.f191491a;
    }

    public final int hashCode() {
        return this.f191494d.hashCode() + s571.m77243b(s571.m77243b(this.f191491a.hashCode() * 31, 31, this.f191492b), 31, this.f191493c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f191491a);
        parcel.writeString(this.f191492b);
        parcel.writeString(this.f191493c);
        parcel.writeString(this.f191494d);
    }
}
