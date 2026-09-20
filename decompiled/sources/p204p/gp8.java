package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class gp8 implements Parcelable {
    public static final Parcelable.Creator<gp8> CREATOR = new yi8(18);

    /* JADX INFO: renamed from: a */
    public final List f83101a;

    /* JADX INFO: renamed from: b */
    public final String f83102b;

    public gp8(List list, String str) {
        this.f83101a = list;
        this.f83102b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp8)) {
            return false;
        }
        gp8 gp8Var = (gp8) obj;
        return wj50.m88271j(this.f83101a, gp8Var.f83101a) && wj50.m88271j(this.f83102b, gp8Var.f83102b);
    }

    public final int hashCode() {
        int iHashCode = this.f83101a.hashCode() * 31;
        String str = this.f83102b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f83101a);
        parcel.writeString(this.f83102b);
    }
}
