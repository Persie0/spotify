package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class xwk implements Parcelable {
    public static final Parcelable.Creator<xwk> CREATOR = new kck(25);

    /* JADX INFO: renamed from: a */
    public final owk f266696a;

    /* JADX INFO: renamed from: b */
    public final String f266697b;

    /* JADX INFO: renamed from: c */
    public final List f266698c;

    public xwk(owk owkVar, String str, List list) {
        this.f266696a = owkVar;
        this.f266697b = str;
        this.f266698c = list;
    }

    /* JADX INFO: renamed from: c */
    public static xwk m92291c(xwk xwkVar, String str, ArrayList arrayList, int i) {
        owk owkVar = xwkVar.f266696a;
        if ((i & 2) != 0) {
            str = xwkVar.f266697b;
        }
        xwkVar.getClass();
        return new xwk(owkVar, str, arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwk)) {
            return false;
        }
        xwk xwkVar = (xwk) obj;
        return wj50.m88271j(this.f266696a, xwkVar.f266696a) && wj50.m88271j(this.f266697b, xwkVar.f266697b) && wj50.m88271j(this.f266698c, xwkVar.f266698c);
    }

    public final int hashCode() {
        return this.f266698c.hashCode() + s571.m77243b(this.f266696a.hashCode() * 31, 31, this.f266697b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f266696a, i);
        parcel.writeString(this.f266697b);
        Iterator itM42468l = fr0.m42468l(parcel, this.f266698c);
        while (itM42468l.hasNext()) {
            ((dxk) itM42468l.next()).writeToParcel(parcel, i);
        }
    }
}
