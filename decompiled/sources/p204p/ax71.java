package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ax71 implements i6z0 {
    public static final Parcelable.Creator<ax71> CREATOR = new sr71(12);

    /* JADX INFO: renamed from: a */
    public final int f20781a;

    /* JADX INFO: renamed from: b */
    public final String f20782b;

    public ax71(int i, String str) {
        this.f20781a = i;
        this.f20782b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax71)) {
            return false;
        }
        ax71 ax71Var = (ax71) obj;
        return this.f20781a == ax71Var.f20781a && wj50.m88271j(this.f20782b, ax71Var.f20782b);
    }

    public final int hashCode() {
        return this.f20782b.hashCode() + (Integer.hashCode(this.f20781a) * 31);
    }

    @Override // p204p.i6z0
    /* JADX INFO: renamed from: s */
    public final int mo27367s() {
        return this.f20781a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20781a);
        parcel.writeString(this.f20782b);
    }
}
