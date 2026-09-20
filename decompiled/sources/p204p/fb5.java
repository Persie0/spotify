package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class fb5 implements Parcelable {
    public static final Parcelable.Creator<fb5> CREATOR = new bc3(26);

    /* JADX INFO: renamed from: a */
    public final za5 f67724a;

    public fb5(za5 za5Var) {
        this.f67724a = za5Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb5) && wj50.m88271j(this.f67724a, ((fb5) obj).f67724a);
    }

    public final int hashCode() {
        za5 za5Var = this.f67724a;
        if (za5Var == null) {
            return 0;
        }
        return za5Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f67724a);
    }
}
