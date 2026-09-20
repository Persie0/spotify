package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qav implements Parcelable {
    public static final Parcelable.Creator<qav> CREATOR = new m8v(2);

    /* JADX INFO: renamed from: a */
    public final String f186938a;

    /* JADX INFO: renamed from: b */
    public final long f186939b;

    /* JADX INFO: renamed from: c */
    public final String f186940c;

    /* JADX INFO: renamed from: d */
    public final Object f186941d;

    public qav(String str, long j, String str2, List list) {
        this.f186938a = str;
        this.f186939b = j;
        this.f186940c = str2;
        this.f186941d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qav)) {
            return false;
        }
        qav qavVar = (qav) obj;
        return wj50.m88271j(this.f186938a, qavVar.f186938a) && this.f186939b == qavVar.f186939b && wj50.m88271j(this.f186940c, qavVar.f186940c) && this.f186941d.equals(qavVar.f186941d);
    }

    public final int hashCode() {
        return this.f186941d.hashCode() + s571.m77243b(dq60.m36605e(this.f186938a.hashCode() * 31, this.f186939b, 31), 31, this.f186940c);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f186938a);
        parcel.writeLong(this.f186939b);
        parcel.writeString(this.f186940c);
        ?? r4 = this.f186941d;
        parcel.writeInt(r4.size());
        Iterator it = r4.iterator();
        while (it.hasNext()) {
            parcel.writeInt(((Number) it.next()).intValue());
        }
    }
}
