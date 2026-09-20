package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class yea0 implements Parcelable {
    public static final Parcelable.Creator<yea0> CREATOR = new z8a0(20);

    /* JADX INFO: renamed from: a */
    public final xea0 f271952a;

    /* JADX INFO: renamed from: b */
    public final float f271953b;

    /* JADX INFO: renamed from: c */
    public final String f271954c;

    /* JADX INFO: renamed from: d */
    public final String f271955d;

    public yea0(xea0 xea0Var, float f, String str, String str2) {
        this.f271952a = xea0Var;
        this.f271953b = f;
        this.f271954c = str;
        this.f271955d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yea0)) {
            return false;
        }
        yea0 yea0Var = (yea0) obj;
        return wj50.m88271j(this.f271952a, yea0Var.f271952a) && Float.compare(this.f271953b, yea0Var.f271953b) == 0 && wj50.m88271j(this.f271954c, yea0Var.f271954c) && wj50.m88271j(this.f271955d, yea0Var.f271955d);
    }

    public final int hashCode() {
        int iM8g = AbstractC0000a.m8g(this.f271952a.hashCode() * 31, 31, this.f271953b);
        String str = this.f271954c;
        return this.f271955d.hashCode() + ((iM8g + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f271952a, i);
        parcel.writeFloat(this.f271953b);
        parcel.writeString(this.f271954c);
        parcel.writeString(this.f271955d);
    }
}
