package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class opr extends ppr implements bs50 {
    public static final Parcelable.Creator<opr> CREATOR = new o5r(22);

    /* JADX INFO: renamed from: a */
    public final String f167997a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f167998b;

    /* JADX INFO: renamed from: c */
    public final String f167999c;

    /* JADX INFO: renamed from: d */
    public final String f168000d;

    /* JADX INFO: renamed from: e */
    public boolean f168001e;

    /* JADX INFO: renamed from: f */
    public final String f168002f;

    public opr(String str, LinkedHashMap linkedHashMap, String str2, String str3, boolean z, String str4) {
        this.f167997a = str;
        this.f167998b = linkedHashMap;
        this.f167999c = str2;
        this.f168000d = str3;
        this.f168001e = z;
        this.f168002f = str4;
    }

    @Override // p204p.ppr
    /* JADX INFO: renamed from: c */
    public final String mo53972c() {
        return this.f168002f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opr)) {
            return false;
        }
        opr oprVar = (opr) obj;
        return wj50.m88271j(this.f167997a, oprVar.f167997a) && this.f167998b.equals(oprVar.f167998b) && wj50.m88271j(this.f167999c, oprVar.f167999c) && wj50.m88271j(this.f168000d, oprVar.f168000d) && this.f168001e == oprVar.f168001e && wj50.m88271j(this.f168002f, oprVar.f168002f);
    }

    @Override // p204p.ppr
    /* JADX INFO: renamed from: g */
    public final boolean mo53973g() {
        return this.f168001e;
    }

    @Override // p204p.ppr
    public final String getContextUri() {
        return this.f168000d;
    }

    @Override // p204p.bs50
    public final String getItemId() {
        return this.f167999c;
    }

    @Override // p204p.ppr
    /* JADX INFO: renamed from: h */
    public final void mo53974h() {
        this.f168001e = false;
    }

    public final int hashCode() {
        int iHashCode = (this.f167998b.hashCode() + (this.f167997a.hashCode() * 31)) * 31;
        String str = this.f167999c;
        return this.f168002f.hashCode() + s571.m77245d(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f168000d), 31, this.f168001e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f167997a);
        LinkedHashMap linkedHashMap = this.f167998b;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.f167999c);
        parcel.writeString(this.f168000d);
        parcel.writeInt(this.f168001e ? 1 : 0);
        parcel.writeString(this.f168002f);
    }
}
