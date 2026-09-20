package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class zyh0 extends azh0 {
    public static final Parcelable.Creator<zyh0> CREATOR = new ruh0(17);

    /* JADX INFO: renamed from: a */
    public final String f287590a;

    /* JADX INFO: renamed from: b */
    public final String f287591b;

    /* JADX INFO: renamed from: c */
    public final String f287592c;

    /* JADX INFO: renamed from: d */
    public final String f287593d;

    public zyh0(String str, String str2, String str3, String str4) {
        this.f287590a = str;
        this.f287591b = str2;
        this.f287592c = str3;
        this.f287593d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyh0)) {
            return false;
        }
        zyh0 zyh0Var = (zyh0) obj;
        return wj50.m88271j(this.f287590a, zyh0Var.f287590a) && wj50.m88271j(this.f287591b, zyh0Var.f287591b) && wj50.m88271j(this.f287592c, zyh0Var.f287592c) && wj50.m88271j(this.f287593d, zyh0Var.f287593d);
    }

    public final int hashCode() {
        return this.f287593d.hashCode() + s571.m77243b(s571.m77243b(this.f287590a.hashCode() * 31, 31, this.f287591b), 31, this.f287592c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f287590a);
        parcel.writeString(this.f287591b);
        parcel.writeString(this.f287592c);
        parcel.writeString(this.f287593d);
    }
}
