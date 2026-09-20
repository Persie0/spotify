package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class lh2 implements Parcelable {
    public static final Parcelable.Creator<lh2> CREATOR = new lb2(13);

    /* JADX INFO: renamed from: a */
    public final int f133341a;

    /* JADX INFO: renamed from: b */
    public final int f133342b;

    /* JADX INFO: renamed from: c */
    public final List f133343c;

    /* JADX INFO: renamed from: d */
    public final int f133344d;

    public lh2(int i, int i2, int i3, List list) {
        this.f133341a = i;
        this.f133342b = i2;
        this.f133343c = list;
        this.f133344d = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh2)) {
            return false;
        }
        lh2 lh2Var = (lh2) obj;
        return this.f133341a == lh2Var.f133341a && this.f133342b == lh2Var.f133342b && wj50.m88271j(this.f133343c, lh2Var.f133343c) && this.f133344d == lh2Var.f133344d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f133344d) + s571.m77244c(mt60.m62800g(this.f133342b, Integer.hashCode(this.f133341a) * 31, 31), 31, this.f133343c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f133341a);
        parcel.writeInt(this.f133342b);
        Iterator itM42468l = fr0.m42468l(parcel, this.f133343c);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeInt(this.f133344d);
    }
}
