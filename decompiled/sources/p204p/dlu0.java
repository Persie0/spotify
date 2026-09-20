package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class dlu0 implements Parcelable {
    public static final Parcelable.Creator<dlu0> CREATOR = new v5u0(22);

    /* JADX INFO: renamed from: a */
    public final String f50366a;

    /* JADX INFO: renamed from: b */
    public final String f50367b;

    /* JADX INFO: renamed from: c */
    public final String f50368c;

    /* JADX INFO: renamed from: d */
    public final boolean f50369d;

    public dlu0(String str, String str2, String str3, boolean z) {
        this.f50366a = str;
        this.f50367b = str2;
        this.f50368c = str3;
        this.f50369d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlu0)) {
            return false;
        }
        dlu0 dlu0Var = (dlu0) obj;
        return wj50.m88271j(this.f50366a, dlu0Var.f50366a) && wj50.m88271j(this.f50367b, dlu0Var.f50367b) && wj50.m88271j(this.f50368c, dlu0Var.f50368c) && this.f50369d == dlu0Var.f50369d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50369d) + s571.m77243b(s571.m77243b(this.f50366a.hashCode() * 31, 31, this.f50367b), 31, this.f50368c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50366a);
        parcel.writeString(this.f50367b);
        parcel.writeString(this.f50368c);
        parcel.writeInt(this.f50369d ? 1 : 0);
    }
}
