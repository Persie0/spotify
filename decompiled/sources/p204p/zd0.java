package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class zd0 implements be0 {
    public static final Parcelable.Creator<zd0> CREATOR = new C2267ps(19);

    /* JADX INFO: renamed from: a */
    public final String f281595a;

    /* JADX INFO: renamed from: b */
    public final String f281596b;

    /* JADX INFO: renamed from: c */
    public final String f281597c;

    /* JADX INFO: renamed from: d */
    public final tfu f281598d;

    /* JADX INFO: renamed from: e */
    public final boolean f281599e;

    public zd0(String str, String str2, String str3, tfu tfuVar, boolean z) {
        this.f281595a = str;
        this.f281596b = str2;
        this.f281597c = str3;
        this.f281598d = tfuVar;
        this.f281599e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd0)) {
            return false;
        }
        zd0 zd0Var = (zd0) obj;
        return wj50.m88271j(this.f281595a, zd0Var.f281595a) && wj50.m88271j(this.f281596b, zd0Var.f281596b) && wj50.m88271j(this.f281597c, zd0Var.f281597c) && this.f281598d == zd0Var.f281598d && this.f281599e == zd0Var.f281599e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281599e) + ((this.f281598d.hashCode() + s571.m77243b(s571.m77243b(this.f281595a.hashCode() * 31, 31, this.f281596b), 31, this.f281597c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f281595a);
        parcel.writeString(this.f281596b);
        parcel.writeString(this.f281597c);
        parcel.writeString(this.f281598d.name());
        parcel.writeInt(this.f281599e ? 1 : 0);
    }
}
