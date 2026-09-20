package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ge9 extends ie9 {
    public static final Parcelable.Creator<ge9> CREATOR = new dc9(3);

    /* JADX INFO: renamed from: a */
    public final String f79058a;

    /* JADX INFO: renamed from: b */
    public final String f79059b;

    /* JADX INFO: renamed from: c */
    public final boolean f79060c;

    public ge9(String str, String str2, boolean z) {
        this.f79058a = str;
        this.f79059b = str2;
        this.f79060c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge9)) {
            return false;
        }
        ge9 ge9Var = (ge9) obj;
        return wj50.m88271j(this.f79058a, ge9Var.f79058a) && wj50.m88271j(this.f79059b, ge9Var.f79059b) && this.f79060c == ge9Var.f79060c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79060c) + s571.m77243b(this.f79058a.hashCode() * 31, 31, this.f79059b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f79058a);
        parcel.writeString(this.f79059b);
        parcel.writeInt(this.f79060c ? 1 : 0);
    }
}
