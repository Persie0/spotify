package p204p;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class fcr0 extends icr0 {
    public static final Parcelable.Creator<fcr0> CREATOR = new vzq0(20);

    /* JADX INFO: renamed from: a */
    public final int f68246a;

    /* JADX INFO: renamed from: b */
    public final int f68247b;

    /* JADX INFO: renamed from: c */
    public final String f68248c;

    public fcr0(int i, int i2, String str) {
        this.f68246a = i;
        this.f68247b = i2;
        this.f68248c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcr0)) {
            return false;
        }
        fcr0 fcr0Var = (fcr0) obj;
        return this.f68246a == fcr0Var.f68246a && this.f68247b == fcr0Var.f68247b && wj50.m88271j(this.f68248c, fcr0Var.f68248c);
    }

    public final int hashCode() {
        return this.f68248c.hashCode() + mt60.m62800g(this.f68247b, Integer.hashCode(this.f68246a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f68246a);
        parcel.writeInt(this.f68247b);
        parcel.writeString(this.f68248c);
    }

    public fcr0(String str, String str2, String str3) {
        this(Color.parseColor(str), Color.parseColor(str2), str3);
    }
}
