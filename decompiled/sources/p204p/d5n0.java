package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class d5n0 implements Parcelable {
    public static final Parcelable.Creator<d5n0> CREATOR = new pum0(21);

    /* JADX INFO: renamed from: a */
    public final boolean f45467a;

    /* JADX INFO: renamed from: b */
    public final p5n0 f45468b;

    /* JADX INFO: renamed from: c */
    public final tdu f45469c;

    public d5n0(boolean z, p5n0 p5n0Var, tdu tduVar) {
        this.f45467a = z;
        this.f45468b = p5n0Var;
        this.f45469c = tduVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5n0)) {
            return false;
        }
        d5n0 d5n0Var = (d5n0) obj;
        return this.f45467a == d5n0Var.f45467a && wj50.m88271j(this.f45468b, d5n0Var.f45468b) && wj50.m88271j(this.f45469c, d5n0Var.f45469c);
    }

    public final int hashCode() {
        return this.f45469c.hashCode() + ((this.f45468b.hashCode() + (Boolean.hashCode(this.f45467a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45467a ? 1 : 0);
        parcel.writeParcelable(this.f45468b, i);
        parcel.writeParcelable(this.f45469c, i);
    }
}
