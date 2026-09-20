package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ila0 implements Parcelable {
    public static final Parcelable.Creator<ila0> CREATOR = new z8a0(27);

    /* JADX INFO: renamed from: a */
    public final d510 f103339a;

    public ila0(d510 d510Var) {
        this.f103339a = d510Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ila0) && wj50.m88271j(this.f103339a, ((ila0) obj).f103339a);
    }

    public final int hashCode() {
        d510 d510Var = this.f103339a;
        if (d510Var == null) {
            return 0;
        }
        return d510Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f103339a, i);
    }
}
