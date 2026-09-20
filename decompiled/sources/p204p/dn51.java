package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class dn51 implements gn51 {
    public static final Parcelable.Creator<dn51> CREATOR = new nc51(18);

    /* JADX INFO: renamed from: a */
    public final String f50692a;

    /* JADX INFO: renamed from: b */
    public final xm51 f50693b;

    public dn51(String str, xm51 xm51Var) {
        this.f50692a = str;
        this.f50693b = xm51Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn51)) {
            return false;
        }
        dn51 dn51Var = (dn51) obj;
        return wj50.m88271j(this.f50692a, dn51Var.f50692a) && wj50.m88271j(this.f50693b, dn51Var.f50693b);
    }

    public final int hashCode() {
        return this.f50693b.hashCode() + (this.f50692a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50692a);
        this.f50693b.writeToParcel(parcel, i);
    }
}
