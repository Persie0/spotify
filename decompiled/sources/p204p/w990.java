package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class w990 implements Parcelable {
    public static final Parcelable.Creator<w990> CREATOR = new x390(18);

    /* JADX INFO: renamed from: a */
    public final String f249124a;

    /* JADX INFO: renamed from: b */
    public final String f249125b;

    public w990(String str, String str2) {
        this.f249124a = str;
        this.f249125b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w990)) {
            return false;
        }
        w990 w990Var = (w990) obj;
        return wj50.m88271j(this.f249124a, w990Var.f249124a) && wj50.m88271j(this.f249125b, w990Var.f249125b);
    }

    public final int hashCode() {
        return this.f249125b.hashCode() + (this.f249124a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f249124a);
        parcel.writeString(this.f249125b);
    }
}
