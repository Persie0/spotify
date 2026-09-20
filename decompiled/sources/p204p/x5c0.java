package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class x5c0 implements Parcelable {
    public static final Parcelable.Creator<x5c0> CREATOR = new f4c0(1);

    /* JADX INFO: renamed from: a */
    public final String f258374a;

    /* JADX INFO: renamed from: b */
    public final z5c0 f258375b;

    /* JADX INFO: renamed from: c */
    public final voc1 f258376c;

    public x5c0(String str, z5c0 z5c0Var, voc1 voc1Var) {
        this.f258374a = str;
        this.f258375b = z5c0Var;
        this.f258376c = voc1Var;
    }

    /* JADX INFO: renamed from: c */
    public final voc1 m89982c() {
        return this.f258376c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5c0)) {
            return false;
        }
        x5c0 x5c0Var = (x5c0) obj;
        return wj50.m88271j(this.f258374a, x5c0Var.f258374a) && this.f258375b == x5c0Var.f258375b && wj50.m88271j(this.f258376c, x5c0Var.f258376c);
    }

    public final int hashCode() {
        return this.f258376c.f243453a.hashCode() + ((this.f258375b.hashCode() + (this.f258374a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f258374a);
        parcel.writeString(this.f258375b.name());
        parcel.writeParcelable(this.f258376c, i);
    }
}
