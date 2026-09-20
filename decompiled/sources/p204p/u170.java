package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class u170 implements Parcelable {
    public static final Parcelable.Creator<u170> CREATOR = new pq50(25);

    /* JADX INFO: renamed from: a */
    public final int f225693a;

    /* JADX INFO: renamed from: b */
    public final int f225694b;

    /* JADX INFO: renamed from: c */
    public final agr0 f225695c;

    /* JADX INFO: renamed from: d */
    public final dlx f225696d;

    public u170(int i, int i2, agr0 agr0Var, dlx dlxVar) {
        this.f225693a = i;
        this.f225694b = i2;
        this.f225695c = agr0Var;
        this.f225696d = dlxVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u170)) {
            return false;
        }
        u170 u170Var = (u170) obj;
        return this.f225693a == u170Var.f225693a && this.f225694b == u170Var.f225694b && this.f225695c == u170Var.f225695c && wj50.m88271j(this.f225696d, u170Var.f225696d);
    }

    public final int hashCode() {
        return this.f225696d.hashCode() + ((this.f225695c.hashCode() + mt60.m62800g(this.f225694b, Integer.hashCode(this.f225693a) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f225693a);
        parcel.writeInt(this.f225694b);
        parcel.writeParcelable(this.f225695c, i);
        parcel.writeParcelable(this.f225696d, i);
    }

    public /* synthetic */ u170(int i, agr0 agr0Var) {
        this(0, i, agr0Var, blx.f28299a);
    }
}
