package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class owk implements Parcelable {
    public static final Parcelable.Creator<owk> CREATOR = new kck(24);

    /* JADX INFO: renamed from: a */
    public final String f170727a;

    /* JADX INFO: renamed from: b */
    public final String f170728b;

    /* JADX INFO: renamed from: c */
    public final String f170729c;

    /* JADX INFO: renamed from: d */
    public final Object f170730d;

    public owk(String str, List list, String str2, String str3) {
        this.f170727a = str;
        this.f170728b = str2;
        this.f170729c = str3;
        this.f170730d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owk)) {
            return false;
        }
        owk owkVar = (owk) obj;
        return wj50.m88271j(this.f170727a, owkVar.f170727a) && wj50.m88271j(this.f170728b, owkVar.f170728b) && wj50.m88271j(this.f170729c, owkVar.f170729c) && this.f170730d.equals(owkVar.f170730d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f170727a.hashCode() * 31, 31, this.f170728b);
        String str = this.f170729c;
        return this.f170730d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170727a);
        parcel.writeString(this.f170728b);
        parcel.writeString(this.f170729c);
        ?? r0 = this.f170730d;
        parcel.writeInt(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((mwk) it.next()).writeToParcel(parcel, i);
        }
    }
}
