package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xq2 implements Parcelable {
    public static final Parcelable.Creator<xq2> CREATOR = new lb2(18);

    /* JADX INFO: renamed from: a */
    public final String f264846a;

    /* JADX INFO: renamed from: b */
    public final String f264847b;

    /* JADX INFO: renamed from: c */
    public final String f264848c;

    /* JADX INFO: renamed from: d */
    public final String f264849d;

    /* JADX INFO: renamed from: e */
    public final List f264850e;

    /* JADX INFO: renamed from: f */
    public final boolean f264851f;

    public xq2(String str, String str2, String str3, String str4, boolean z, List list) {
        this.f264846a = str;
        this.f264847b = str2;
        this.f264848c = str3;
        this.f264849d = str4;
        this.f264850e = list;
        this.f264851f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq2)) {
            return false;
        }
        xq2 xq2Var = (xq2) obj;
        return wj50.m88271j(this.f264846a, xq2Var.f264846a) && wj50.m88271j(this.f264847b, xq2Var.f264847b) && wj50.m88271j(this.f264848c, xq2Var.f264848c) && wj50.m88271j(this.f264849d, xq2Var.f264849d) && wj50.m88271j(this.f264850e, xq2Var.f264850e) && this.f264851f == xq2Var.f264851f;
    }

    public final int hashCode() {
        int iHashCode = this.f264846a.hashCode() * 31;
        String str = this.f264847b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f264848c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f264849d;
        return Boolean.hashCode(this.f264851f) + s571.m77244c((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f264850e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f264846a);
        parcel.writeString(this.f264847b);
        parcel.writeString(this.f264848c);
        parcel.writeString(this.f264849d);
        Iterator itM42468l = fr0.m42468l(parcel, this.f264850e);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeInt(this.f264851f ? 1 : 0);
    }

    public /* synthetic */ xq2(int i, String str, String str2, String str3, ArrayList arrayList) {
        this(str, str2, null, str3, true, (i & 16) != 0 ? lau.f131415a : arrayList);
    }
}
