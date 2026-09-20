package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class gj80 implements Parcelable {
    public static final Parcelable.Creator<gj80> CREATOR = new i980(5);

    /* JADX INFO: renamed from: a */
    public final String f80394a;

    /* JADX INFO: renamed from: b */
    public final fj80 f80395b;

    public gj80(String str, fj80 fj80Var) {
        this.f80394a = str;
        this.f80395b = fj80Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj80)) {
            return false;
        }
        gj80 gj80Var = (gj80) obj;
        return wj50.m88271j(this.f80394a, gj80Var.f80394a) && wj50.m88271j(this.f80395b, gj80Var.f80395b);
    }

    public final int hashCode() {
        return this.f80395b.hashCode() + (this.f80394a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f80394a);
        parcel.writeParcelable(this.f80395b, i);
    }
}
