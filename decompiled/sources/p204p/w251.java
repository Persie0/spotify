package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class w251 implements Parcelable {
    public static final Parcelable.Creator<w251> CREATOR = new q051(14);

    /* JADX INFO: renamed from: a */
    public final String f247233a;

    /* JADX INFO: renamed from: b */
    public final String f247234b;

    /* JADX INFO: renamed from: c */
    public final String f247235c;

    /* JADX INFO: renamed from: d */
    public final String f247236d;

    /* JADX INFO: renamed from: e */
    public final boolean f247237e;

    /* JADX INFO: renamed from: f */
    public final u251 f247238f;

    /* JADX INFO: renamed from: g */
    public final a351 f247239g;

    /* JADX INFO: renamed from: h */
    public final boolean f247240h;

    /* JADX INFO: renamed from: i */
    public final boolean f247241i;

    public w251(String str, String str2, String str3, String str4, boolean z, u251 u251Var, a351 a351Var, boolean z2, boolean z3) {
        this.f247233a = str;
        this.f247234b = str2;
        this.f247235c = str3;
        this.f247236d = str4;
        this.f247237e = z;
        this.f247238f = u251Var;
        this.f247239g = a351Var;
        this.f247240h = z2;
        this.f247241i = z3;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m87061c() {
        return this.f247240h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w251)) {
            return false;
        }
        w251 w251Var = (w251) obj;
        return wj50.m88271j(this.f247233a, w251Var.f247233a) && wj50.m88271j(this.f247234b, w251Var.f247234b) && wj50.m88271j(this.f247235c, w251Var.f247235c) && wj50.m88271j(this.f247236d, w251Var.f247236d) && this.f247237e == w251Var.f247237e && wj50.m88271j(this.f247238f, w251Var.f247238f) && wj50.m88271j(this.f247239g, w251Var.f247239g) && this.f247240h == w251Var.f247240h && this.f247241i == w251Var.f247241i;
    }

    /* JADX INFO: renamed from: g */
    public final a351 m87062g() {
        return this.f247239g;
    }

    public final String getContextUri() {
        return this.f247236d;
    }

    /* JADX INFO: renamed from: h */
    public final String m87063h() {
        return this.f247233a;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f247233a.hashCode() * 31, 31, this.f247234b), 31, this.f247235c), 31, this.f247236d), 31, this.f247237e);
        u251 u251Var = this.f247238f;
        return Boolean.hashCode(this.f247241i) + s571.m77245d((this.f247239g.hashCode() + ((iM77245d + (u251Var == null ? 0 : u251Var.hashCode())) * 31)) * 31, 31, this.f247240h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f247233a);
        parcel.writeString(this.f247234b);
        parcel.writeString(this.f247235c);
        parcel.writeString(this.f247236d);
        parcel.writeInt(this.f247237e ? 1 : 0);
        u251 u251Var = this.f247238f;
        if (u251Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            u251Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f247239g, i);
        parcel.writeInt(this.f247240h ? 1 : 0);
        parcel.writeInt(this.f247241i ? 1 : 0);
    }

    public /* synthetic */ w251(String str, String str2, String str3, String str4, boolean z, u251 u251Var, a351 a351Var, boolean z2, int i) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : u251Var, (i & 64) != 0 ? z251.f278498a : a351Var, (i & 128) != 0 ? false : z2, false);
    }
}
