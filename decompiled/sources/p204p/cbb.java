package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class cbb implements ebb {
    public static final Parcelable.Creator<cbb> CREATOR = new jja(8);

    /* JADX INFO: renamed from: a */
    public final String f36070a;

    /* JADX INFO: renamed from: b */
    public final String f36071b;

    /* JADX INFO: renamed from: c */
    public final String f36072c;

    /* JADX INFO: renamed from: d */
    public final int f36073d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f36074e;

    public cbb(String str, String str2, String str3, int i, LinkedHashMap linkedHashMap) {
        this.f36070a = str;
        this.f36071b = str2;
        this.f36072c = str3;
        this.f36073d = i;
        this.f36074e = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbb)) {
            return false;
        }
        cbb cbbVar = (cbb) obj;
        return this.f36070a.equals(cbbVar.f36070a) && this.f36071b.equals(cbbVar.f36071b) && this.f36072c.equals(cbbVar.f36072c) && this.f36073d == cbbVar.f36073d && this.f36074e.equals(cbbVar.f36074e);
    }

    public final int hashCode() {
        return this.f36074e.hashCode() + mt60.m62800g(this.f36073d, s571.m77243b(s571.m77243b(this.f36070a.hashCode() * 31, 31, this.f36071b), 31, this.f36072c), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36070a);
        parcel.writeString(this.f36071b);
        parcel.writeString(this.f36072c);
        parcel.writeInt(this.f36073d);
        LinkedHashMap linkedHashMap = this.f36074e;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
