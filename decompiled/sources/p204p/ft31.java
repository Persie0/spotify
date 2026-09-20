package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ft31 implements Parcelable {
    public static final Parcelable.Creator<ft31> CREATOR = new ln31(13);

    /* JADX INFO: renamed from: a */
    public final List f73102a;

    /* JADX INFO: renamed from: b */
    public final int f73103b;

    /* JADX INFO: renamed from: c */
    public final boolean f73104c;

    /* JADX INFO: renamed from: d */
    public final double f73105d;

    public ft31(List list, int i, boolean z, double d) {
        this.f73102a = list;
        this.f73103b = i;
        this.f73104c = z;
        this.f73105d = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft31)) {
            return false;
        }
        ft31 ft31Var = (ft31) obj;
        return wj50.m88271j(this.f73102a, ft31Var.f73102a) && this.f73103b == ft31Var.f73103b && this.f73104c == ft31Var.f73104c && Double.compare(this.f73105d, ft31Var.f73105d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f73105d) + s571.m77245d(mt60.m62800g(this.f73103b, this.f73102a.hashCode() * 31, 31), 31, this.f73104c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f73102a);
        parcel.writeInt(this.f73103b);
        parcel.writeInt(this.f73104c ? 1 : 0);
        parcel.writeDouble(this.f73105d);
    }
}
