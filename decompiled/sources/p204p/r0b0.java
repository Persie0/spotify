package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class r0b0 extends w0b0 {
    public static final Parcelable.Creator<r0b0> CREATOR = new l0b0(5);

    /* JADX INFO: renamed from: a */
    public final String f194422a;

    /* JADX INFO: renamed from: b */
    public final eg7 f194423b;

    public r0b0(String str, eg7 eg7Var) {
        this.f194422a = str;
        this.f194423b = eg7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0b0)) {
            return false;
        }
        r0b0 r0b0Var = (r0b0) obj;
        return wj50.m88271j(this.f194422a, r0b0Var.f194422a) && wj50.m88271j(this.f194423b, r0b0Var.f194423b);
    }

    /* JADX INFO: renamed from: g */
    public final String m74370g() {
        return this.f194422a;
    }

    /* JADX INFO: renamed from: h */
    public final eg7 m74371h() {
        return this.f194423b;
    }

    public final int hashCode() {
        return this.f194423b.hashCode() + (this.f194422a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f194422a);
        parcel.writeParcelable(this.f194423b, i);
    }
}
