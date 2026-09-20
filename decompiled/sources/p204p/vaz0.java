package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vaz0 implements waz0 {
    public static final Parcelable.Creator<vaz0> CREATOR = new lpy0(28);

    /* JADX INFO: renamed from: a */
    public final String f239346a;

    /* JADX INFO: renamed from: b */
    public final String f239347b;

    public vaz0(String str, String str2) {
        this.f239346a = str;
        this.f239347b = str2;
    }

    @Override // p204p.waz0
    /* JADX INFO: renamed from: B */
    public final String mo82709B() {
        return this.f239347b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaz0)) {
            return false;
        }
        vaz0 vaz0Var = (vaz0) obj;
        return wj50.m88271j(this.f239346a, vaz0Var.f239346a) && wj50.m88271j(this.f239347b, vaz0Var.f239347b);
    }

    public final int hashCode() {
        return this.f239347b.hashCode() + (this.f239346a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f239346a);
        parcel.writeString(this.f239347b);
    }
}
