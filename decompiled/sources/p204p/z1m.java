package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class z1m implements Parcelable {
    public static final Parcelable.Creator<z1m> CREATOR = new pkl(8);

    /* JADX INFO: renamed from: a */
    public final String f278328a;

    /* JADX INFO: renamed from: b */
    public final String f278329b;

    /* JADX INFO: renamed from: c */
    public final Object f278330c;

    public z1m(String str, String str2, Map map) {
        this.f278328a = str;
        this.f278329b = str2;
        this.f278330c = map;
    }

    /* JADX INFO: renamed from: c */
    public final String m95136c() {
        return this.f278329b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1m)) {
            return false;
        }
        z1m z1mVar = (z1m) obj;
        return wj50.m88271j(this.f278328a, z1mVar.f278328a) && wj50.m88271j(this.f278329b, z1mVar.f278329b) && this.f278330c.equals(z1mVar.f278330c);
    }

    public final String getUri() {
        return this.f278328a;
    }

    public final int hashCode() {
        return this.f278330c.hashCode() + s571.m77243b(this.f278328a.hashCode() * 31, 31, this.f278329b);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f278328a);
        parcel.writeString(this.f278329b);
        ?? r4 = this.f278330c;
        parcel.writeInt(r4.size());
        for (Map.Entry entry : r4.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
