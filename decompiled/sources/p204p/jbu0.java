package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jbu0 extends lbu0 {
    public static final Parcelable.Creator<jbu0> CREATOR = new v5u0(7);

    /* JADX INFO: renamed from: a */
    public final String f110880a;

    /* JADX INFO: renamed from: b */
    public final String f110881b;

    /* JADX INFO: renamed from: c */
    public final ss8 f110882c;

    public jbu0(String str, String str2, ss8 ss8Var) {
        this.f110880a = str;
        this.f110881b = str2;
        this.f110882c = ss8Var;
    }

    /* JADX INFO: renamed from: g */
    public static jbu0 m52916g(jbu0 jbu0Var, ss8 ss8Var) {
        String str = jbu0Var.f110880a;
        String str2 = jbu0Var.f110881b;
        jbu0Var.getClass();
        return new jbu0(str, str2, ss8Var);
    }

    @Override // p204p.lbu0
    /* JADX INFO: renamed from: c */
    public final ss8 mo52917c() {
        return this.f110882c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbu0)) {
            return false;
        }
        jbu0 jbu0Var = (jbu0) obj;
        return wj50.m88271j(this.f110880a, jbu0Var.f110880a) && wj50.m88271j(this.f110881b, jbu0Var.f110881b) && this.f110882c == jbu0Var.f110882c;
    }

    @Override // p204p.lbu0
    public final String getUri() {
        return this.f110881b;
    }

    @Override // p204p.lbu0
    public final String getUuid() {
        return this.f110880a;
    }

    public final int hashCode() {
        return this.f110882c.hashCode() + s571.m77243b(this.f110880a.hashCode() * 31, 31, this.f110881b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110880a);
        parcel.writeString(this.f110881b);
        parcel.writeString(this.f110882c.name());
    }
}
