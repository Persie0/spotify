package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fm71 implements Parcelable {
    public static final Parcelable.Creator<fm71> CREATOR = new c071(15);

    /* JADX INFO: renamed from: a */
    public final boolean f70983a;

    /* JADX INFO: renamed from: b */
    public final String f70984b;

    public fm71(boolean z, String str) {
        this.f70983a = z;
        this.f70984b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm71)) {
            return false;
        }
        fm71 fm71Var = (fm71) obj;
        return this.f70983a == fm71Var.f70983a && wj50.m88271j(this.f70984b, fm71Var.f70984b);
    }

    public final int hashCode() {
        return this.f70984b.hashCode() + (Boolean.hashCode(this.f70983a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f70983a ? 1 : 0);
        parcel.writeString(this.f70984b);
    }
}
