package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ij80 implements Parcelable {
    public static final Parcelable.Creator<ij80> CREATOR = new i980(8);

    /* JADX INFO: renamed from: a */
    public final int f102753a;

    /* JADX INFO: renamed from: b */
    public final gj80 f102754b;

    /* JADX INFO: renamed from: c */
    public final boolean f102755c;

    public ij80(int i, gj80 gj80Var, boolean z) {
        this.f102753a = i;
        this.f102754b = gj80Var;
        this.f102755c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij80)) {
            return false;
        }
        ij80 ij80Var = (ij80) obj;
        return this.f102753a == ij80Var.f102753a && wj50.m88271j(this.f102754b, ij80Var.f102754b) && this.f102755c == ij80Var.f102755c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102755c) + ((this.f102754b.hashCode() + (Integer.hashCode(this.f102753a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f102753a);
        parcel.writeParcelable(this.f102754b, i);
        parcel.writeInt(this.f102755c ? 1 : 0);
    }
}
