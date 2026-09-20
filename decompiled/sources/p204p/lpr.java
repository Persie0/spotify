package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class lpr extends ppr implements bs50 {
    public static final Parcelable.Creator<lpr> CREATOR = new o5r(19);

    /* JADX INFO: renamed from: a */
    public final Object f135834a;

    /* JADX INFO: renamed from: b */
    public final String f135835b;

    /* JADX INFO: renamed from: c */
    public final String f135836c;

    /* JADX INFO: renamed from: d */
    public boolean f135837d;

    /* JADX INFO: renamed from: e */
    public final String f135838e;

    public lpr(Map map, String str, String str2, boolean z, String str3) {
        this.f135834a = map;
        this.f135835b = str;
        this.f135836c = str2;
        this.f135837d = z;
        this.f135838e = str3;
    }

    @Override // p204p.ppr
    /* JADX INFO: renamed from: c */
    public final String mo53972c() {
        return this.f135838e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpr)) {
            return false;
        }
        lpr lprVar = (lpr) obj;
        return this.f135834a.equals(lprVar.f135834a) && wj50.m88271j(this.f135835b, lprVar.f135835b) && wj50.m88271j(this.f135836c, lprVar.f135836c) && this.f135837d == lprVar.f135837d && wj50.m88271j(this.f135838e, lprVar.f135838e);
    }

    @Override // p204p.ppr
    /* JADX INFO: renamed from: g */
    public final boolean mo53973g() {
        return this.f135837d;
    }

    @Override // p204p.ppr
    public final String getContextUri() {
        return this.f135836c;
    }

    @Override // p204p.bs50
    public final String getItemId() {
        return this.f135835b;
    }

    @Override // p204p.ppr
    /* JADX INFO: renamed from: h */
    public final void mo53974h() {
        this.f135837d = false;
    }

    public final int hashCode() {
        int iHashCode = this.f135834a.hashCode() * 31;
        String str = this.f135835b;
        return this.f135838e.hashCode() + s571.m77245d(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f135836c), 31, this.f135837d);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? r4 = this.f135834a;
        parcel.writeInt(r4.size());
        for (Map.Entry entry : r4.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.f135835b);
        parcel.writeString(this.f135836c);
        parcel.writeInt(this.f135837d ? 1 : 0);
        parcel.writeString(this.f135838e);
    }
}
