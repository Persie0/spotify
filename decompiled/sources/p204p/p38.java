package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class p38 implements Parcelable {
    public static final Parcelable.Creator<p38> CREATOR = new na7(22);

    /* JADX INFO: renamed from: a */
    public final String f173580a;

    /* JADX INFO: renamed from: b */
    public final a48 f173581b;

    public p38(String str, a48 a48Var) {
        this.f173580a = str;
        this.f173581b = a48Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p38)) {
            return false;
        }
        p38 p38Var = (p38) obj;
        return wj50.m88271j(this.f173580a, p38Var.f173580a) && wj50.m88271j(this.f173581b, p38Var.f173581b);
    }

    public final int hashCode() {
        return this.f173581b.hashCode() + (this.f173580a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f173580a);
        parcel.writeParcelable(this.f173581b, i);
    }
}
