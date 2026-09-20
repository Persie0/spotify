package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class mee0 implements Parcelable {
    public static final Parcelable.Creator<mee0> CREATOR = new ube0(2);

    /* JADX INFO: renamed from: a */
    public final String f142687a;

    /* JADX INFO: renamed from: b */
    public final k8j0 f142688b;

    public mee0(String str, k8j0 k8j0Var) {
        this.f142687a = str;
        this.f142688b = k8j0Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m61569c() {
        return this.f142687a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mee0)) {
            return false;
        }
        mee0 mee0Var = (mee0) obj;
        return wj50.m88271j(this.f142687a, mee0Var.f142687a) && this.f142688b == mee0Var.f142688b;
    }

    public final int hashCode() {
        return this.f142688b.hashCode() + (this.f142687a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f142687a);
        parcel.writeString(this.f142688b.name());
    }
}
