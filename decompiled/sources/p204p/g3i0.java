package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class g3i0 implements Parcelable {
    public static final Parcelable.Creator<g3i0> CREATOR = new ruh0(21);

    /* JADX INFO: renamed from: a */
    public final List f76221a;

    /* JADX INFO: renamed from: b */
    public final String f76222b;

    public g3i0(List list, String str) {
        this.f76221a = list;
        this.f76222b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3i0)) {
            return false;
        }
        g3i0 g3i0Var = (g3i0) obj;
        return wj50.m88271j(this.f76221a, g3i0Var.f76221a) && wj50.m88271j(this.f76222b, g3i0Var.f76222b);
    }

    public final int hashCode() {
        int iHashCode = this.f76221a.hashCode() * 31;
        String str = this.f76222b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f76221a);
        parcel.writeString(this.f76222b);
    }
}
