package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vla0 implements Parcelable {
    public static final Parcelable.Creator<vla0> CREATOR = new z8a0(28);

    /* JADX INFO: renamed from: a */
    public final String f242411a;

    /* JADX INFO: renamed from: b */
    public final boolean f242412b;

    public vla0(String str, boolean z) {
        this.f242411a = str;
        this.f242412b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vla0)) {
            return false;
        }
        vla0 vla0Var = (vla0) obj;
        return wj50.m88271j(this.f242411a, vla0Var.f242411a) && this.f242412b == vla0Var.f242412b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242412b) + (this.f242411a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242411a);
        parcel.writeInt(this.f242412b ? 1 : 0);
    }
}
