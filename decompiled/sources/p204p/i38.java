package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class i38 implements Parcelable {
    public static final Parcelable.Creator<i38> CREATOR = new na7(19);

    /* JADX INFO: renamed from: a */
    public final String f98055a;

    /* JADX INFO: renamed from: b */
    public final j38 f98056b;

    public i38(String str, j38 j38Var) {
        this.f98055a = str;
        this.f98056b = j38Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i38)) {
            return false;
        }
        i38 i38Var = (i38) obj;
        return wj50.m88271j(this.f98055a, i38Var.f98055a) && wj50.m88271j(this.f98056b, i38Var.f98056b);
    }

    public final int hashCode() {
        return this.f98056b.f108303a.hashCode() + (this.f98055a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f98055a);
        parcel.writeParcelable(this.f98056b, i);
    }
}
