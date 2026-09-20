package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class na80 implements Parcelable {
    public static final Parcelable.Creator<na80> CREATOR = new i980(4);

    /* JADX INFO: renamed from: a */
    public final String f151968a;

    /* JADX INFO: renamed from: b */
    public final String f151969b;

    public na80(String str, String str2) {
        this.f151968a = str;
        this.f151969b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na80)) {
            return false;
        }
        na80 na80Var = (na80) obj;
        return wj50.m88271j(this.f151968a, na80Var.f151968a) && wj50.m88271j(this.f151969b, na80Var.f151969b);
    }

    public final int hashCode() {
        return this.f151969b.hashCode() + (this.f151968a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f151968a);
        parcel.writeString(this.f151969b);
    }
}
