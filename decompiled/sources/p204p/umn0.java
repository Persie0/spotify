package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class umn0 implements Parcelable {
    public static final Parcelable.Creator<umn0> CREATOR = new ejn0(13);

    /* JADX INFO: renamed from: a */
    public final boolean f231922a;

    /* JADX INFO: renamed from: b */
    public final boolean f231923b;

    /* JADX INFO: renamed from: c */
    public final tmn0 f231924c;

    public umn0(boolean z, boolean z2, tmn0 tmn0Var) {
        this.f231922a = z;
        this.f231923b = z2;
        this.f231924c = tmn0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umn0)) {
            return false;
        }
        umn0 umn0Var = (umn0) obj;
        return this.f231922a == umn0Var.f231922a && this.f231923b == umn0Var.f231923b && wj50.m88271j(this.f231924c, umn0Var.f231924c);
    }

    public final int hashCode() {
        return this.f231924c.f221761a.hashCode() + s571.m77245d(Boolean.hashCode(this.f231922a) * 31, 31, this.f231923b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f231922a ? 1 : 0);
        parcel.writeInt(this.f231923b ? 1 : 0);
        this.f231924c.writeToParcel(parcel, i);
    }
}
