package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class yiy0 implements ajy0 {
    public static final Parcelable.Creator<yiy0> CREATOR = new csx0(27);

    /* JADX INFO: renamed from: a */
    public final int f273224a;

    /* JADX INFO: renamed from: b */
    public final List f273225b;

    public yiy0(int i, List list) {
        this.f273224a = i;
        this.f273225b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yiy0)) {
            return false;
        }
        yiy0 yiy0Var = (yiy0) obj;
        return this.f273224a == yiy0Var.f273224a && wj50.m88271j(this.f273225b, yiy0Var.f273225b);
    }

    public final int hashCode() {
        return this.f273225b.hashCode() + (edb.m38547C(this.f273224a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(AbstractC0000a.m25x(this.f273224a));
        Iterator itM42468l = fr0.m42468l(parcel, this.f273225b);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
    }

    public /* synthetic */ yiy0(int i, int i2) {
        this((i2 & 1) != 0 ? 1 : i, lau.f131415a);
    }
}
