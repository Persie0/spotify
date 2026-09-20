package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class lw00 implements Parcelable {
    public static final Parcelable.Creator<lw00> CREATOR = new k700(18);

    /* JADX INFO: renamed from: a */
    public final kw00 f137429a;

    /* JADX INFO: renamed from: b */
    public final hw00 f137430b;

    public lw00(kw00 kw00Var, hw00 hw00Var) {
        this.f137429a = kw00Var;
        this.f137430b = hw00Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw00)) {
            return false;
        }
        lw00 lw00Var = (lw00) obj;
        return wj50.m88271j(this.f137429a, lw00Var.f137429a) && this.f137430b == lw00Var.f137430b;
    }

    public final int hashCode() {
        return this.f137430b.hashCode() + (this.f137429a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f137429a, i);
        this.f137430b.writeToParcel(parcel, i);
    }
}
