package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class cc81 implements Parcelable {
    public static final Parcelable.Creator<cc81> CREATOR = new f881(3);

    /* JADX INFO: renamed from: a */
    public final String f36343a;

    /* JADX INFO: renamed from: b */
    public final String f36344b;

    /* JADX INFO: renamed from: c */
    public final String f36345c;

    /* JADX INFO: renamed from: d */
    public final String f36346d;

    /* JADX INFO: renamed from: e */
    public final String f36347e;

    /* JADX INFO: renamed from: f */
    public final Object f36348f;

    public cc81(String str, String str2, String str3, String str4, List list, String str5) {
        this.f36343a = str;
        this.f36344b = str2;
        this.f36345c = str3;
        this.f36346d = str4;
        this.f36347e = str5;
        this.f36348f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc81)) {
            return false;
        }
        cc81 cc81Var = (cc81) obj;
        return wj50.m88271j(this.f36343a, cc81Var.f36343a) && wj50.m88271j(this.f36344b, cc81Var.f36344b) && wj50.m88271j(this.f36345c, cc81Var.f36345c) && wj50.m88271j(this.f36346d, cc81Var.f36346d) && wj50.m88271j(this.f36347e, cc81Var.f36347e) && this.f36348f.equals(cc81Var.f36348f);
    }

    public final int hashCode() {
        return this.f36348f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f36343a.hashCode() * 31, 31, this.f36344b), 31, this.f36345c), 31, this.f36346d), 31, this.f36347e);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36343a);
        parcel.writeString(this.f36344b);
        parcel.writeString(this.f36345c);
        parcel.writeString(this.f36346d);
        parcel.writeString(this.f36347e);
        ?? r0 = this.f36348f;
        parcel.writeInt(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((vb81) it.next()).writeToParcel(parcel, i);
        }
    }
}
