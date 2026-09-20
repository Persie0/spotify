package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hmi implements jmi {
    public static final Parcelable.Creator<hmi> CREATOR = new f2i(10);

    /* JADX INFO: renamed from: a */
    public final String f92985a;

    /* JADX INFO: renamed from: b */
    public final String f92986b;

    /* JADX INFO: renamed from: c */
    public final String f92987c;

    /* JADX INFO: renamed from: d */
    public final List f92988d;

    public hmi(String str, List list, String str2, String str3) {
        this.f92985a = str;
        this.f92986b = str2;
        this.f92987c = str3;
        this.f92988d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmi)) {
            return false;
        }
        hmi hmiVar = (hmi) obj;
        return wj50.m88271j(this.f92985a, hmiVar.f92985a) && wj50.m88271j(this.f92986b, hmiVar.f92986b) && wj50.m88271j(this.f92987c, hmiVar.f92987c) && wj50.m88271j(this.f92988d, hmiVar.f92988d);
    }

    public final int hashCode() {
        return this.f92988d.hashCode() + s571.m77243b(s571.m77243b(this.f92985a.hashCode() * 31, 31, this.f92986b), 31, this.f92987c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f92985a);
        parcel.writeString(this.f92986b);
        parcel.writeString(this.f92987c);
        parcel.writeStringList(this.f92988d);
    }
}
