package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class eia1 implements Parcelable {
    public static final Parcelable.Creator<eia1> CREATOR = new u2a1(10);

    /* JADX INFO: renamed from: a */
    public final gha1 f59837a;

    /* JADX INFO: renamed from: b */
    public final boolean f59838b;

    public eia1(gha1 gha1Var, boolean z) {
        this.f59837a = gha1Var;
        this.f59838b = z;
    }

    /* JADX INFO: renamed from: c */
    public final gha1 m39087c() {
        return this.f59837a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eia1)) {
            return false;
        }
        eia1 eia1Var = (eia1) obj;
        return wj50.m88271j(this.f59837a, eia1Var.f59837a) && this.f59838b == eia1Var.f59838b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m39088g() {
        return this.f59838b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59838b) + (this.f59837a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f59837a, i);
        parcel.writeInt(this.f59838b ? 1 : 0);
    }
}
