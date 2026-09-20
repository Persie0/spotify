package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class x411 implements Parcelable {
    public static final Parcelable.Creator<x411> CREATOR = new u111(9);

    /* JADX INFO: renamed from: a */
    public final List f257928a;

    /* JADX INFO: renamed from: b */
    public final int f257929b;

    public x411(int i, List list) {
        this.f257928a = list;
        this.f257929b = i;
    }

    /* JADX INFO: renamed from: c */
    public static x411 m89824c(x411 x411Var, ArrayList arrayList, int i, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = x411Var.f257928a;
        }
        if ((i2 & 2) != 0) {
            i = x411Var.f257929b;
        }
        x411Var.getClass();
        return new x411(i, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x411)) {
            return false;
        }
        x411 x411Var = (x411) obj;
        return wj50.m88271j(this.f257928a, x411Var.f257928a) && this.f257929b == x411Var.f257929b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257929b) + (this.f257928a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f257928a);
        parcel.writeInt(this.f257929b);
    }
}
