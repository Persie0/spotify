package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class f5r implements Parcelable {
    public static final Parcelable.Creator<f5r> CREATOR = new n6f1(14);

    /* JADX INFO: renamed from: a */
    public final String f66136a;

    /* JADX INFO: renamed from: b */
    public final b5r f66137b;

    /* JADX INFO: renamed from: c */
    public final String f66138c;

    /* JADX INFO: renamed from: d */
    public final String f66139d;

    /* JADX INFO: renamed from: e */
    public final int f66140e;

    public f5r(String str, b5r b5rVar, String str2, String str3, int i) {
        this.f66136a = str;
        this.f66137b = b5rVar;
        this.f66138c = str2;
        this.f66139d = str3;
        this.f66140e = i;
    }

    /* JADX INFO: renamed from: c */
    public final String m40772c() {
        return this.f66139d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5r)) {
            return false;
        }
        f5r f5rVar = (f5r) obj;
        return wj50.m88271j(this.f66136a, f5rVar.f66136a) && this.f66137b == f5rVar.f66137b && wj50.m88271j(this.f66138c, f5rVar.f66138c) && wj50.m88271j(this.f66139d, f5rVar.f66139d) && this.f66140e == f5rVar.f66140e;
    }

    /* JADX INFO: renamed from: g */
    public final String m40773g() {
        return this.f66138c;
    }

    /* JADX INFO: renamed from: h */
    public final b5r m40774h() {
        return this.f66137b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66140e) + s571.m77243b(s571.m77243b((this.f66137b.hashCode() + (this.f66136a.hashCode() * 31)) * 31, 31, this.f66138c), 31, this.f66139d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66136a);
        parcel.writeString(this.f66137b.name());
        parcel.writeString(this.f66138c);
        parcel.writeString(this.f66139d);
        parcel.writeInt(this.f66140e);
    }
}
