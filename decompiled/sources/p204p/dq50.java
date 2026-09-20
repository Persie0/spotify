package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class dq50 implements br50, Parcelable {
    public static final Parcelable.Creator<dq50> CREATOR = new gd50(23);

    /* JADX INFO: renamed from: a */
    public final String f51821a;

    /* JADX INFO: renamed from: b */
    public final String f51822b;

    /* JADX INFO: renamed from: c */
    public final String f51823c;

    /* JADX INFO: renamed from: d */
    public final boolean f51824d;

    /* JADX INFO: renamed from: e */
    public final List f51825e;

    /* JADX INFO: renamed from: f */
    public final List f51826f;

    /* JADX INFO: renamed from: g */
    public final List f51827g;

    /* JADX INFO: renamed from: h */
    public final List f51828h;

    public dq50(String str, String str2, String str3, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, ArrayList arrayList3) {
        this.f51821a = str;
        this.f51822b = str2;
        this.f51823c = str3;
        this.f51824d = z;
        this.f51825e = arrayList;
        this.f51826f = arrayList2;
        this.f51827g = list;
        this.f51828h = arrayList3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq50)) {
            return false;
        }
        dq50 dq50Var = (dq50) obj;
        return wj50.m88271j(this.f51821a, dq50Var.f51821a) && wj50.m88271j(this.f51822b, dq50Var.f51822b) && wj50.m88271j(this.f51823c, dq50Var.f51823c) && this.f51824d == dq50Var.f51824d && wj50.m88271j(this.f51825e, dq50Var.f51825e) && wj50.m88271j(this.f51826f, dq50Var.f51826f) && wj50.m88271j(this.f51827g, dq50Var.f51827g) && wj50.m88271j(this.f51828h, dq50Var.f51828h);
    }

    @Override // p204p.br50
    public final String getImageUri() {
        return this.f51823c;
    }

    @Override // p204p.br50
    public final String getName() {
        return this.f51822b;
    }

    @Override // p204p.br50
    public final String getUri() {
        return this.f51821a;
    }

    public final int hashCode() {
        return this.f51828h.hashCode() + s571.m77244c(s571.m77244c(s571.m77244c(s571.m77245d(s571.m77243b(s571.m77243b(this.f51821a.hashCode() * 31, 31, this.f51822b), 31, this.f51823c), 31, this.f51824d), 31, this.f51825e), 31, this.f51826f), 31, this.f51827g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f51821a);
        parcel.writeString(this.f51822b);
        parcel.writeString(this.f51823c);
        parcel.writeInt(this.f51824d ? 1 : 0);
        parcel.writeStringList(this.f51825e);
        parcel.writeStringList(this.f51826f);
        parcel.writeStringList(this.f51827g);
        parcel.writeStringList(this.f51828h);
    }
}
