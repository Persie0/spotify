package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class osw0 implements Parcelable {
    public static final Parcelable.Creator<osw0> CREATOR = new b8w0(21);

    /* JADX INFO: renamed from: a */
    public final String f168907a;

    /* JADX INFO: renamed from: b */
    public final String f168908b;

    /* JADX INFO: renamed from: c */
    public final String f168909c;

    /* JADX INFO: renamed from: d */
    public final Object f168910d;

    public osw0(Map map, String str, String str2, String str3) {
        this.f168907a = str;
        this.f168908b = str2;
        this.f168909c = str3;
        this.f168910d = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osw0)) {
            return false;
        }
        osw0 osw0Var = (osw0) obj;
        return wj50.m88271j(this.f168907a, osw0Var.f168907a) && wj50.m88271j(this.f168908b, osw0Var.f168908b) && wj50.m88271j(this.f168909c, osw0Var.f168909c) && this.f168910d.equals(osw0Var.f168910d);
    }

    public final int hashCode() {
        return this.f168910d.hashCode() + s571.m77243b(s571.m77243b(this.f168907a.hashCode() * 31, 31, this.f168908b), 31, this.f168909c);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f168907a);
        parcel.writeString(this.f168908b);
        parcel.writeString(this.f168909c);
        ?? r4 = this.f168910d;
        parcel.writeInt(r4.size());
        for (Map.Entry entry : r4.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
