package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class q7c implements Parcelable {
    public static final Parcelable.Creator<q7c> CREATOR = new a5c(5);

    /* JADX INFO: renamed from: a */
    public final String f186066a;

    /* JADX INFO: renamed from: b */
    public final String f186067b;

    /* JADX INFO: renamed from: c */
    public final String f186068c;

    /* JADX INFO: renamed from: d */
    public final Map f186069d;

    public q7c(Map map, String str, String str2, String str3) {
        this.f186066a = str;
        this.f186067b = str2;
        this.f186068c = str3;
        this.f186069d = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7c)) {
            return false;
        }
        q7c q7cVar = (q7c) obj;
        return wj50.m88271j(this.f186066a, q7cVar.f186066a) && wj50.m88271j(this.f186067b, q7cVar.f186067b) && wj50.m88271j(this.f186068c, q7cVar.f186068c) && wj50.m88271j(this.f186069d, q7cVar.f186069d);
    }

    public final int hashCode() {
        return this.f186069d.hashCode() + s571.m77243b(s571.m77243b(this.f186066a.hashCode() * 31, 31, this.f186067b), 31, this.f186068c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f186066a);
        parcel.writeString(this.f186067b);
        parcel.writeString(this.f186068c);
        Iterator itM91403l = xl81.m91403l(parcel, this.f186069d);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
