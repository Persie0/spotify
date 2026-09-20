package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class kpe1 implements Parcelable {
    public static final Parcelable.Creator<kpe1> CREATOR = new tne1(3);

    /* JADX INFO: renamed from: a */
    public final wne1 f125051a;

    public kpe1(wne1 wne1Var) {
        this.f125051a = wne1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpe1) && wj50.m88271j(this.f125051a, ((kpe1) obj).f125051a);
    }

    public final int hashCode() {
        return this.f125051a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f125051a, i);
    }
}
