package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class w5u0 implements Parcelable {
    public static final Parcelable.Creator<w5u0> CREATOR = new v5u0(0);

    /* JADX INFO: renamed from: a */
    public final String f248199a;

    /* JADX INFO: renamed from: b */
    public final List f248200b;

    /* JADX INFO: renamed from: c */
    public final String f248201c;

    /* JADX INFO: renamed from: d */
    public final gp8 f248202d;

    public w5u0(String str, List list, String str2, gp8 gp8Var) {
        this.f248199a = str;
        this.f248200b = list;
        this.f248201c = str2;
        this.f248202d = gp8Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m87258c() {
        return this.f248201c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5u0)) {
            return false;
        }
        w5u0 w5u0Var = (w5u0) obj;
        return wj50.m88271j(this.f248199a, w5u0Var.f248199a) && wj50.m88271j(this.f248200b, w5u0Var.f248200b) && wj50.m88271j(this.f248201c, w5u0Var.f248201c) && wj50.m88271j(this.f248202d, w5u0Var.f248202d);
    }

    /* JADX INFO: renamed from: g */
    public final gp8 m87259g() {
        return this.f248202d;
    }

    /* JADX INFO: renamed from: h */
    public final List m87260h() {
        return this.f248200b;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f248199a.hashCode() * 31, 31, this.f248200b);
        String str = this.f248201c;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        gp8 gp8Var = this.f248202d;
        return iHashCode + (gp8Var != null ? gp8Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: j */
    public final String m87261j() {
        return this.f248199a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f248199a);
        Iterator itM42468l = fr0.m42468l(parcel, this.f248200b);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeString(this.f248201c);
        parcel.writeParcelable(this.f248202d, i);
    }
}
