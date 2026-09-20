package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class xe2 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final int f260617a;

    /* JADX INFO: renamed from: b */
    public final String f260618b;
    public static final we2 Companion = new we2();
    public static final Parcelable.Creator<xe2> CREATOR = new lb2(10);

    public /* synthetic */ xe2(int i, int i2, String str) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, ve2.f240553a.getDescriptor());
            throw null;
        }
        this.f260617a = i2;
        this.f260618b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe2)) {
            return false;
        }
        xe2 xe2Var = (xe2) obj;
        return this.f260617a == xe2Var.f260617a && wj50.m88271j(this.f260618b, xe2Var.f260618b);
    }

    public final int hashCode() {
        return this.f260618b.hashCode() + (Integer.hashCode(this.f260617a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f260617a);
        parcel.writeString(this.f260618b);
    }

    public xe2(int i, String str) {
        this.f260617a = i;
        this.f260618b = str;
    }
}
