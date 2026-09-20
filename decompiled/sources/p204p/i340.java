package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class i340 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f98012a;

    /* JADX INFO: renamed from: b */
    public final int f98013b;

    /* JADX INFO: renamed from: c */
    public final int f98014c;
    public static final x240 Companion = new x240();
    public static final Parcelable.Creator<i340> CREATOR = new bw30(28);

    public /* synthetic */ i340(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, q240.f184478a.getDescriptor());
            throw null;
        }
        this.f98012a = str;
        this.f98013b = i2;
        this.f98014c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i340)) {
            return false;
        }
        i340 i340Var = (i340) obj;
        return wj50.m88271j(this.f98012a, i340Var.f98012a) && this.f98013b == i340Var.f98013b && this.f98014c == i340Var.f98014c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98014c) + mt60.m62800g(this.f98013b, this.f98012a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f98012a);
        parcel.writeInt(this.f98013b);
        parcel.writeInt(this.f98014c);
    }

    public i340(String str, int i, int i2) {
        this.f98012a = str;
        this.f98013b = i;
        this.f98014c = i2;
    }
}
