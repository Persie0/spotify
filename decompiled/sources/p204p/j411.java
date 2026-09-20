package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class j411 implements Parcelable {
    public static final Parcelable.Creator<j411> CREATOR = new u111(8);

    /* JADX INFO: renamed from: a */
    public final e2r f108546a;

    /* JADX INFO: renamed from: b */
    public final String f108547b;

    /* JADX INFO: renamed from: c */
    public final String f108548c;

    /* JADX INFO: renamed from: d */
    public final String f108549d;

    /* JADX INFO: renamed from: e */
    public final ku01 f108550e;

    /* JADX INFO: renamed from: f */
    public final u311 f108551f;

    /* JADX INFO: renamed from: g */
    public final ox01 f108552g;

    /* JADX INFO: renamed from: h */
    public final String f108553h;

    public j411(String str, String str2, String str3, String str4, e2r e2rVar, ku01 ku01Var, ox01 ox01Var, u311 u311Var) {
        this.f108546a = e2rVar;
        this.f108547b = str;
        this.f108548c = str2;
        this.f108549d = str3;
        this.f108550e = ku01Var;
        this.f108551f = u311Var;
        this.f108552g = ox01Var;
        this.f108553h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j411)) {
            return false;
        }
        j411 j411Var = (j411) obj;
        return wj50.m88271j(this.f108546a, j411Var.f108546a) && wj50.m88271j(this.f108547b, j411Var.f108547b) && wj50.m88271j(this.f108548c, j411Var.f108548c) && wj50.m88271j(this.f108549d, j411Var.f108549d) && wj50.m88271j(this.f108550e, j411Var.f108550e) && wj50.m88271j(this.f108551f, j411Var.f108551f) && wj50.m88271j(this.f108552g, j411Var.f108552g) && wj50.m88271j(this.f108553h, j411Var.f108553h);
    }

    public final int hashCode() {
        int iHashCode = (this.f108552g.hashCode() + ((this.f108551f.hashCode() + ((this.f108550e.f126425a.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f108546a.hashCode() * 31, 31, this.f108547b), 31, this.f108548c), 31, this.f108549d)) * 31)) * 31)) * 31;
        String str = this.f108553h;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f108546a, i);
        parcel.writeString(this.f108547b);
        parcel.writeString(this.f108548c);
        parcel.writeParcelable(new xs01(this.f108549d), i);
        parcel.writeParcelable(this.f108550e, i);
        parcel.writeParcelable(this.f108551f, i);
        parcel.writeParcelable(this.f108552g, i);
        parcel.writeString(this.f108553h);
    }
}
