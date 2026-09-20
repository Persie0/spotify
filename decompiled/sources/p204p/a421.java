package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class a421 implements Parcelable {
    public static final Parcelable.Creator<a421> CREATOR = new luh0(16);

    /* JADX INFO: renamed from: a */
    public final z321 f12123a;

    /* JADX INFO: renamed from: b */
    public final rk7 f12124b;

    public a421(z321 z321Var, rk7 rk7Var) {
        this.f12123a = z321Var;
        this.f12124b = rk7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a421)) {
            return false;
        }
        a421 a421Var = (a421) obj;
        return wj50.m88271j(this.f12123a, a421Var.f12123a) && this.f12124b == a421Var.f12124b;
    }

    public final int hashCode() {
        return this.f12124b.hashCode() + (this.f12123a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f12123a, i);
        parcel.writeString(this.f12124b.name());
    }
}
