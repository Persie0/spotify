package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class xtf0 implements Parcelable {
    public static final Parcelable.Creator<xtf0> CREATOR = new r4f0(19);

    /* JADX INFO: renamed from: a */
    public final String f265859a;

    /* JADX INFO: renamed from: b */
    public final mtf0 f265860b;

    public xtf0(String str, mtf0 mtf0Var) {
        this.f265859a = str;
        this.f265860b = mtf0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtf0)) {
            return false;
        }
        xtf0 xtf0Var = (xtf0) obj;
        return wj50.m88271j(this.f265859a, xtf0Var.f265859a) && wj50.m88271j(this.f265860b, xtf0Var.f265860b);
    }

    public final int hashCode() {
        return this.f265860b.hashCode() + (this.f265859a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f265859a);
        parcel.writeParcelable(this.f265860b, i);
    }
}
