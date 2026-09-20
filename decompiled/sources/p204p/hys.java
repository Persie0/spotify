package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class hys implements Parcelable {
    public static final Parcelable.Creator<hys> CREATOR = new f9s(15);

    /* JADX INFO: renamed from: a */
    public final String f96654a;

    /* JADX INFO: renamed from: b */
    public final String f96655b;

    /* JADX INFO: renamed from: c */
    public final int f96656c;

    /* JADX INFO: renamed from: d */
    public final String f96657d;

    /* JADX INFO: renamed from: e */
    public final String f96658e;

    /* JADX INFO: renamed from: f */
    public final boolean f96659f;

    /* JADX INFO: renamed from: g */
    public final boolean f96660g;

    /* JADX INFO: renamed from: h */
    public final String f96661h;

    /* JADX INFO: renamed from: i */
    public final List f96662i;

    /* JADX INFO: renamed from: t */
    public final Map f96663t;

    public hys(String str, String str2, int i, String str3, String str4, boolean z, boolean z2, String str5, List list, Map map) {
        this.f96654a = str;
        this.f96655b = str2;
        this.f96656c = i;
        this.f96657d = str3;
        this.f96658e = str4;
        this.f96659f = z;
        this.f96660g = z2;
        this.f96661h = str5;
        this.f96662i = list;
        this.f96663t = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hys)) {
            return false;
        }
        hys hysVar = (hys) obj;
        return wj50.m88271j(this.f96654a, hysVar.f96654a) && wj50.m88271j(this.f96655b, hysVar.f96655b) && this.f96656c == hysVar.f96656c && wj50.m88271j(this.f96657d, hysVar.f96657d) && wj50.m88271j(this.f96658e, hysVar.f96658e) && this.f96659f == hysVar.f96659f && this.f96660g == hysVar.f96660g && wj50.m88271j(this.f96661h, hysVar.f96661h) && wj50.m88271j(this.f96662i, hysVar.f96662i) && wj50.m88271j(this.f96663t, hysVar.f96663t);
    }

    public final String getId() {
        return this.f96654a;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(mt60.m62800g(this.f96656c, s571.m77243b(this.f96654a.hashCode() * 31, 31, this.f96655b), 31), 31, this.f96657d), 31, this.f96658e), 31, this.f96659f), 31, this.f96660g);
        String str = this.f96661h;
        return this.f96663t.hashCode() + s571.m77244c((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f96662i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f96654a);
        parcel.writeString(this.f96655b);
        parcel.writeInt(this.f96656c);
        parcel.writeString(this.f96657d);
        parcel.writeString(this.f96658e);
        parcel.writeInt(this.f96659f ? 1 : 0);
        parcel.writeInt(this.f96660g ? 1 : 0);
        parcel.writeString(this.f96661h);
        parcel.writeStringList(this.f96662i);
        Iterator itM91403l = xl81.m91403l(parcel, this.f96663t);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
