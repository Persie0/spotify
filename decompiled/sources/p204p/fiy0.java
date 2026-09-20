package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fiy0 implements oiy0 {
    public static final Parcelable.Creator<fiy0> CREATOR = new csx0(18);

    /* JADX INFO: renamed from: d */
    public static final fiy0 f70021d = new fiy0("", lau.f131415a, "");

    /* JADX INFO: renamed from: a */
    public final Object f70022a;

    /* JADX INFO: renamed from: b */
    public final String f70023b;

    /* JADX INFO: renamed from: c */
    public final String f70024c;

    public fiy0(String str, List list, String str2) {
        this.f70022a = list;
        this.f70023b = str;
        this.f70024c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.oiy0
    /* JADX INFO: renamed from: e0 */
    public final String mo41778e0() {
        return "Carousel";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fiy0)) {
            return false;
        }
        fiy0 fiy0Var = (fiy0) obj;
        return this.f70022a.equals(fiy0Var.f70022a) && wj50.m88271j(this.f70023b, fiy0Var.f70023b) && wj50.m88271j(this.f70024c, fiy0Var.f70024c);
    }

    public final int hashCode() {
        return this.f70024c.hashCode() + s571.m77243b(this.f70022a.hashCode() * 31, 31, this.f70023b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? r0 = this.f70022a;
        parcel.writeInt(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((eiy0) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f70023b);
        parcel.writeString(this.f70024c);
    }
}
