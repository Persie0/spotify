package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class u7i implements Parcelable {
    public static final Parcelable.Creator<u7i> CREATOR = new f2i(1);

    /* JADX INFO: renamed from: a */
    public final String f227703a;

    /* JADX INFO: renamed from: b */
    public final String f227704b;

    /* JADX INFO: renamed from: c */
    public final String f227705c;

    /* JADX INFO: renamed from: d */
    public final boolean f227706d;

    public u7i(String str, String str2, String str3, boolean z) {
        this.f227703a = str;
        this.f227704b = str2;
        this.f227705c = str3;
        this.f227706d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7i)) {
            return false;
        }
        u7i u7iVar = (u7i) obj;
        return wj50.m88271j(this.f227703a, u7iVar.f227703a) && wj50.m88271j(this.f227704b, u7iVar.f227704b) && wj50.m88271j(this.f227705c, u7iVar.f227705c) && this.f227706d == u7iVar.f227706d;
    }

    public final String getUri() {
        return this.f227704b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227706d) + s571.m77243b(s571.m77243b(this.f227703a.hashCode() * 31, 31, this.f227704b), 31, this.f227705c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f227703a);
        parcel.writeString(this.f227704b);
        parcel.writeString(this.f227705c);
        parcel.writeInt(this.f227706d ? 1 : 0);
    }
}
