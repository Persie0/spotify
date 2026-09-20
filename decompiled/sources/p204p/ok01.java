package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ok01 implements Parcelable {
    public static final Parcelable.Creator<ok01> CREATOR = new vj01(6);

    /* JADX INFO: renamed from: a */
    public final xr01 f166205a;

    /* JADX INFO: renamed from: b */
    public final dd41 f166206b;

    /* JADX INFO: renamed from: c */
    public final z0c f166207c;

    public ok01(xr01 xr01Var, dd41 dd41Var, z0c z0cVar) {
        this.f166205a = xr01Var;
        this.f166206b = dd41Var;
        this.f166207c = z0cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok01)) {
            return false;
        }
        ok01 ok01Var = (ok01) obj;
        return wj50.m88271j(this.f166205a, ok01Var.f166205a) && wj50.m88271j(this.f166206b, ok01Var.f166206b) && wj50.m88271j(this.f166207c, ok01Var.f166207c);
    }

    public final int hashCode() {
        return this.f166207c.hashCode() + ((this.f166206b.hashCode() + (this.f166205a.f265192a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f166205a, i);
        dd41 dd41Var = this.f166206b;
        parcel.writeString(dd41Var != null ? dd41Var.m35694A() : null);
        parcel.writeParcelable(this.f166207c, i);
    }
}
