package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zrl0 implements Parcelable {
    public static final Parcelable.Creator<zrl0> CREATOR = new cpl0(1);

    /* JADX INFO: renamed from: a */
    public final String f285701a;

    /* JADX INFO: renamed from: b */
    public final String f285702b;

    /* JADX INFO: renamed from: c */
    public final String f285703c;

    /* JADX INFO: renamed from: d */
    public final String f285704d;

    /* JADX INFO: renamed from: e */
    public final String f285705e;

    public zrl0(String str, String str2, String str3, String str4, String str5) {
        this.f285701a = str;
        this.f285702b = str2;
        this.f285703c = str3;
        this.f285704d = str4;
        this.f285705e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrl0)) {
            return false;
        }
        zrl0 zrl0Var = (zrl0) obj;
        return wj50.m88271j(this.f285701a, zrl0Var.f285701a) && wj50.m88271j(this.f285702b, zrl0Var.f285702b) && wj50.m88271j(this.f285703c, zrl0Var.f285703c) && wj50.m88271j(this.f285704d, zrl0Var.f285704d) && wj50.m88271j(this.f285705e, zrl0Var.f285705e);
    }

    public final int hashCode() {
        return this.f285705e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f285701a.hashCode() * 31, 31, this.f285702b), 31, this.f285703c), 31, this.f285704d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f285701a);
        parcel.writeString(this.f285702b);
        parcel.writeString(this.f285703c);
        parcel.writeString(this.f285704d);
        parcel.writeString(this.f285705e);
    }
}
