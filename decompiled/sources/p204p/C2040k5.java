package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: p.k5 */
/* JADX INFO: loaded from: classes8.dex */
public final class C2040k5 extends as01 {
    public static final Parcelable.Creator<C2040k5> CREATOR = new ora(9);

    /* JADX INFO: renamed from: a */
    public final String f119371a;

    /* JADX INFO: renamed from: b */
    public final List f119372b;

    public C2040k5(String str, List list) {
        this.f119371a = str;
        this.f119372b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2040k5)) {
            return false;
        }
        C2040k5 c2040k5 = (C2040k5) obj;
        return wj50.m88271j(this.f119371a, c2040k5.f119371a) && wj50.m88271j(this.f119372b, c2040k5.f119372b);
    }

    public final int hashCode() {
        return this.f119372b.hashCode() + (this.f119371a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f119371a);
        parcel.writeStringList(this.f119372b);
    }
}
