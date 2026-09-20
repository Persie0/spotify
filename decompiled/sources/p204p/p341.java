package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class p341 implements Parcelable {
    public static final Parcelable.Creator<p341> CREATOR = new ln31(20);

    /* JADX INFO: renamed from: a */
    public final String f173553a;

    /* JADX INFO: renamed from: b */
    public final String f173554b;

    /* JADX INFO: renamed from: c */
    public final String f173555c;

    /* JADX INFO: renamed from: d */
    public final String f173556d;

    public p341(String str, String str2, String str3, String str4) {
        this.f173553a = str;
        this.f173554b = str2;
        this.f173555c = str3;
        this.f173556d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p341)) {
            return false;
        }
        p341 p341Var = (p341) obj;
        return wj50.m88271j(this.f173553a, p341Var.f173553a) && wj50.m88271j(this.f173554b, p341Var.f173554b) && wj50.m88271j(this.f173555c, p341Var.f173555c) && wj50.m88271j(this.f173556d, p341Var.f173556d);
    }

    public final int hashCode() {
        return this.f173556d.hashCode() + s571.m77243b(s571.m77243b(this.f173553a.hashCode() * 31, 31, this.f173554b), 31, this.f173555c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f173553a);
        parcel.writeString(this.f173554b);
        parcel.writeString(this.f173555c);
        parcel.writeString(this.f173556d);
    }
}
