package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class k38 extends zq50 {
    public static final Parcelable.Creator<k38> CREATOR = new na7(21);

    /* JADX INFO: renamed from: a */
    public final String f118801a;

    /* JADX INFO: renamed from: b */
    public final qb31 f118802b;

    public k38(String str, qb31 qb31Var) {
        this.f118801a = str;
        this.f118802b = qb31Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k38)) {
            return false;
        }
        k38 k38Var = (k38) obj;
        return wj50.m88271j(this.f118801a, k38Var.f118801a) && wj50.m88271j(this.f118802b, k38Var.f118802b);
    }

    public final int hashCode() {
        return this.f118802b.f186988a.hashCode() + (this.f118801a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f118801a);
        this.f118802b.writeToParcel(parcel, i);
    }
}
