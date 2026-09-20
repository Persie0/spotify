package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class jg70 implements Parcelable {
    public static final Parcelable.Creator<jg70> CREATOR = new w270(10);

    /* JADX INFO: renamed from: a */
    public final String f112098a;

    /* JADX INFO: renamed from: b */
    public final String f112099b;

    /* JADX INFO: renamed from: c */
    public final List f112100c;

    /* JADX INFO: renamed from: d */
    public final boolean f112101d;

    public jg70(String str, String str2, List list, boolean z) {
        this.f112098a = str;
        this.f112099b = str2;
        this.f112100c = list;
        this.f112101d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg70)) {
            return false;
        }
        jg70 jg70Var = (jg70) obj;
        return wj50.m88271j(this.f112098a, jg70Var.f112098a) && wj50.m88271j(this.f112099b, jg70Var.f112099b) && wj50.m88271j(this.f112100c, jg70Var.f112100c) && this.f112101d == jg70Var.f112101d;
    }

    public final int hashCode() {
        int iHashCode = this.f112098a.hashCode() * 31;
        String str = this.f112099b;
        return Boolean.hashCode(this.f112101d) + s571.m77244c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f112100c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f112098a);
        parcel.writeString(this.f112099b);
        Iterator itM42468l = fr0.m42468l(parcel, this.f112100c);
        while (itM42468l.hasNext()) {
            ((ff70) itM42468l.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f112101d ? 1 : 0);
    }

    public /* synthetic */ jg70() {
        this("", null, lau.f131415a, false);
    }
}
