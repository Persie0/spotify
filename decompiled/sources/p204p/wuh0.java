package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wuh0 implements Parcelable {
    public static final Parcelable.Creator<wuh0> CREATOR = new ruh0(7);

    /* JADX INFO: renamed from: a */
    public final String f255201a;

    /* JADX INFO: renamed from: b */
    public final String f255202b;

    /* JADX INFO: renamed from: c */
    public final List f255203c;

    public wuh0(String str, List list, String str2) {
        this.f255201a = str;
        this.f255202b = str2;
        this.f255203c = list;
    }

    /* JADX INFO: renamed from: c */
    public static wuh0 m89051c(wuh0 wuh0Var, ArrayList arrayList) {
        String str = wuh0Var.f255201a;
        String str2 = wuh0Var.f255202b;
        wuh0Var.getClass();
        return new wuh0(str, arrayList, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wuh0)) {
            return false;
        }
        wuh0 wuh0Var = (wuh0) obj;
        return wj50.m88271j(this.f255201a, wuh0Var.f255201a) && wj50.m88271j(this.f255202b, wuh0Var.f255202b) && wj50.m88271j(this.f255203c, wuh0Var.f255203c);
    }

    public final int hashCode() {
        String str = this.f255201a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f255202b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f255203c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f255201a);
        parcel.writeString(this.f255202b);
        List list = this.f255203c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((vuh0) it.next()).writeToParcel(parcel, i);
        }
    }
}
