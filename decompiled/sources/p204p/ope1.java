package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ope1 implements Parcelable {
    public static final Parcelable.Creator<ope1> CREATOR = new tne1(4);

    /* JADX INFO: renamed from: a */
    public final wne1 f167888a;

    public ope1(wne1 wne1Var) {
        this.f167888a = wne1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ope1) && wj50.m88271j(this.f167888a, ((ope1) obj).f167888a);
    }

    public final int hashCode() {
        return this.f167888a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f167888a, i);
    }
}
