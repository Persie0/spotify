package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: p.zw */
/* JADX INFO: loaded from: classes9.dex */
public final class C2665zw extends AbstractC1683ax {
    public static final Parcelable.Creator<C2665zw> CREATOR = new C2267ps(9);

    /* JADX INFO: renamed from: a */
    public final String f286854a;

    /* JADX INFO: renamed from: b */
    public final boolean f286855b;

    /* JADX INFO: renamed from: c */
    public final boolean f286856c;

    /* JADX INFO: renamed from: d */
    public final boolean f286857d;

    /* JADX INFO: renamed from: e */
    public final boolean f286858e;

    /* JADX INFO: renamed from: f */
    public final boolean f286859f;

    /* JADX INFO: renamed from: g */
    public final String f286860g;

    /* JADX INFO: renamed from: h */
    public final List f286861h;

    /* JADX INFO: renamed from: i */
    public final boolean f286862i;

    public C2665zw(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, List list, boolean z6) {
        this.f286854a = str;
        this.f286855b = z;
        this.f286856c = z2;
        this.f286857d = z3;
        this.f286858e = z4;
        this.f286859f = z5;
        this.f286860g = str2;
        this.f286861h = list;
        this.f286862i = z6;
    }

    /* JADX INFO: renamed from: c */
    public static C2665zw m97104c(C2665zw c2665zw, boolean z) {
        String str = c2665zw.f286854a;
        boolean z2 = c2665zw.f286855b;
        boolean z3 = c2665zw.f286857d;
        boolean z4 = c2665zw.f286858e;
        boolean z5 = c2665zw.f286859f;
        String str2 = c2665zw.f286860g;
        List list = c2665zw.f286861h;
        boolean z6 = c2665zw.f286862i;
        c2665zw.getClass();
        return new C2665zw(str, z2, z, z3, z4, z5, str2, list, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2665zw)) {
            return false;
        }
        C2665zw c2665zw = (C2665zw) obj;
        return wj50.m88271j(this.f286854a, c2665zw.f286854a) && this.f286855b == c2665zw.f286855b && this.f286856c == c2665zw.f286856c && this.f286857d == c2665zw.f286857d && this.f286858e == c2665zw.f286858e && this.f286859f == c2665zw.f286859f && wj50.m88271j(this.f286860g, c2665zw.f286860g) && wj50.m88271j(this.f286861h, c2665zw.f286861h) && this.f286862i == c2665zw.f286862i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f286862i) + s571.m77244c(s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f286854a.hashCode() * 31, 31, this.f286855b), 31, this.f286856c), 31, this.f286857d), 31, this.f286858e), 31, this.f286859f), 31, this.f286860g), 31, this.f286861h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f286854a);
        parcel.writeInt(this.f286855b ? 1 : 0);
        parcel.writeInt(this.f286856c ? 1 : 0);
        parcel.writeInt(this.f286857d ? 1 : 0);
        parcel.writeInt(this.f286858e ? 1 : 0);
        parcel.writeInt(this.f286859f ? 1 : 0);
        parcel.writeString(this.f286860g);
        parcel.writeStringList(this.f286861h);
        parcel.writeInt(this.f286862i ? 1 : 0);
    }
}
