package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class t0b0 extends w0b0 {
    public static final Parcelable.Creator<t0b0> CREATOR = new l0b0(7);

    /* JADX INFO: renamed from: a */
    public final String f215806a;

    /* JADX INFO: renamed from: b */
    public final String f215807b;

    /* JADX INFO: renamed from: c */
    public final String f215808c;

    public t0b0(String str, String str2, String str3) {
        this.f215806a = str;
        this.f215807b = str2;
        this.f215808c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0b0)) {
            return false;
        }
        t0b0 t0b0Var = (t0b0) obj;
        return wj50.m88271j(this.f215806a, t0b0Var.f215806a) && wj50.m88271j(this.f215807b, t0b0Var.f215807b) && wj50.m88271j(this.f215808c, t0b0Var.f215808c);
    }

    /* JADX INFO: renamed from: g */
    public final String m79777g() {
        return this.f215807b;
    }

    /* JADX INFO: renamed from: h */
    public final String m79778h() {
        return this.f215806a;
    }

    public final int hashCode() {
        return this.f215808c.hashCode() + s571.m77243b(this.f215806a.hashCode() * 31, 31, this.f215807b);
    }

    /* JADX INFO: renamed from: j */
    public final String m79779j() {
        return this.f215808c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f215806a);
        parcel.writeString(this.f215807b);
        parcel.writeString(this.f215808c);
    }
}
