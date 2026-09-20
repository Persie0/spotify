package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class pse1 implements Parcelable {
    public static final Parcelable.Creator<pse1> CREATOR = new tne1(8);

    /* JADX INFO: renamed from: a */
    public final String f180832a;

    /* JADX INFO: renamed from: b */
    public final String f180833b;

    public pse1(String str, String str2) {
        this.f180832a = str;
        this.f180833b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pse1)) {
            return false;
        }
        pse1 pse1Var = (pse1) obj;
        return wj50.m88271j(this.f180832a, pse1Var.f180832a) && wj50.m88271j(this.f180833b, pse1Var.f180833b);
    }

    public final int hashCode() {
        return this.f180833b.hashCode() + (this.f180832a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f180832a);
        parcel.writeString(this.f180833b);
    }
}
