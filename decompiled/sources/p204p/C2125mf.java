package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: p.mf */
/* JADX INFO: loaded from: classes11.dex */
public final class C2125mf implements Parcelable {
    public static final Parcelable.Creator<C2125mf> CREATOR = new C2047kc(5);

    /* JADX INFO: renamed from: a */
    public final String f142892a;

    /* JADX INFO: renamed from: b */
    public final String f142893b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f142894c;

    public C2125mf(String str, String str2, LinkedHashMap linkedHashMap) {
        this.f142892a = str;
        this.f142893b = str2;
        this.f142894c = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2125mf)) {
            return false;
        }
        C2125mf c2125mf = (C2125mf) obj;
        return wj50.m88271j(this.f142892a, c2125mf.f142892a) && wj50.m88271j(this.f142893b, c2125mf.f142893b) && this.f142894c.equals(c2125mf.f142894c);
    }

    public final int hashCode() {
        String str = this.f142892a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f142893b;
        return this.f142894c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f142892a);
        parcel.writeString(this.f142893b);
        LinkedHashMap linkedHashMap = this.f142894c;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
