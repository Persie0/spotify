package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class kbu0 extends lbu0 {
    public static final Parcelable.Creator<kbu0> CREATOR = new v5u0(8);

    /* JADX INFO: renamed from: a */
    public final String f121285a;

    /* JADX INFO: renamed from: b */
    public final String f121286b;

    /* JADX INFO: renamed from: c */
    public final ss8 f121287c;

    /* JADX INFO: renamed from: d */
    public final jbu0 f121288d;

    public kbu0(String str, String str2, ss8 ss8Var, jbu0 jbu0Var) {
        this.f121285a = str;
        this.f121286b = str2;
        this.f121287c = ss8Var;
        this.f121288d = jbu0Var;
    }

    @Override // p204p.lbu0
    /* JADX INFO: renamed from: c */
    public final ss8 mo52917c() {
        return this.f121287c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbu0)) {
            return false;
        }
        kbu0 kbu0Var = (kbu0) obj;
        return wj50.m88271j(this.f121285a, kbu0Var.f121285a) && wj50.m88271j(this.f121286b, kbu0Var.f121286b) && this.f121287c == kbu0Var.f121287c && wj50.m88271j(this.f121288d, kbu0Var.f121288d);
    }

    @Override // p204p.lbu0
    public final String getUri() {
        return this.f121286b;
    }

    @Override // p204p.lbu0
    public final String getUuid() {
        return this.f121285a;
    }

    public final int hashCode() {
        int iHashCode = (this.f121287c.hashCode() + s571.m77243b(this.f121285a.hashCode() * 31, 31, this.f121286b)) * 31;
        jbu0 jbu0Var = this.f121288d;
        return iHashCode + (jbu0Var == null ? 0 : jbu0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f121285a);
        parcel.writeString(this.f121286b);
        parcel.writeString(this.f121287c.name());
        jbu0 jbu0Var = this.f121288d;
        if (jbu0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jbu0Var.writeToParcel(parcel, i);
        }
    }
}
