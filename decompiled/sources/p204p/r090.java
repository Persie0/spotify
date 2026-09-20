package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class r090 implements t090 {
    public static final Parcelable.Creator<r090> CREATOR = new ct80(18);

    /* JADX INFO: renamed from: a */
    public final String f194403a;

    /* JADX INFO: renamed from: b */
    public final String f194404b;

    public r090(String str, String str2) {
        this.f194403a = str;
        this.f194404b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r090)) {
            return false;
        }
        r090 r090Var = (r090) obj;
        return wj50.m88271j(this.f194403a, r090Var.f194403a) && wj50.m88271j(this.f194404b, r090Var.f194404b);
    }

    public final int hashCode() {
        return this.f194404b.hashCode() + (this.f194403a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f194403a);
        parcel.writeString(this.f194404b);
    }
}
