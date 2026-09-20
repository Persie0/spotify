package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class ogz implements Parcelable {
    public static final Parcelable.Creator<ogz> CREATOR = new c2z(28);

    /* JADX INFO: renamed from: a */
    public final String f165297a;

    /* JADX INFO: renamed from: b */
    public final String f165298b;

    /* JADX INFO: renamed from: c */
    public final String f165299c;

    /* JADX INFO: renamed from: d */
    public final String f165300d;

    /* JADX INFO: renamed from: e */
    public final String f165301e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f165302f;

    /* JADX INFO: renamed from: g */
    public final String f165303g;

    public ogz(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6) {
        this.f165297a = str;
        this.f165298b = str2;
        this.f165299c = str3;
        this.f165300d = str4;
        this.f165301e = str5;
        this.f165302f = arrayList;
        this.f165303g = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogz)) {
            return false;
        }
        ogz ogzVar = (ogz) obj;
        return wj50.m88271j(this.f165297a, ogzVar.f165297a) && wj50.m88271j(this.f165298b, ogzVar.f165298b) && wj50.m88271j(this.f165299c, ogzVar.f165299c) && wj50.m88271j(this.f165300d, ogzVar.f165300d) && wj50.m88271j(this.f165301e, ogzVar.f165301e) && this.f165302f.equals(ogzVar.f165302f) && wj50.m88271j(this.f165303g, ogzVar.f165303g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f165297a.hashCode() * 31, 31, this.f165298b), 31, this.f165299c);
        String str = this.f165300d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f165301e;
        int iM59700f = lq51.m59700f(this.f165302f, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f165303g;
        return iM59700f + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f165297a);
        parcel.writeString(this.f165298b);
        parcel.writeString(this.f165299c);
        parcel.writeString(this.f165300d);
        parcel.writeString(this.f165301e);
        Iterator itM42469m = fr0.m42469m(this.f165302f, parcel);
        while (itM42469m.hasNext()) {
            ((e8o0) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f165303g);
    }
}
