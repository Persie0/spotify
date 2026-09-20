package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class krp0 extends mrp0 {
    public static final Parcelable.Creator<krp0> CREATOR = new vnp0(4);

    /* JADX INFO: renamed from: a */
    public final String f125702a;

    /* JADX INFO: renamed from: b */
    public final lnn0 f125703b;

    /* JADX INFO: renamed from: c */
    public final String f125704c;

    /* JADX INFO: renamed from: d */
    public final boolean f125705d;

    public krp0(String str, String str2, lnn0 lnn0Var, boolean z) {
        this.f125702a = str;
        this.f125703b = lnn0Var;
        this.f125704c = str2;
        this.f125705d = z;
    }

    @Override // p204p.mrp0
    /* JADX INFO: renamed from: c */
    public final lnn0 mo57169c() {
        return this.f125703b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krp0)) {
            return false;
        }
        krp0 krp0Var = (krp0) obj;
        return wj50.m88271j(this.f125702a, krp0Var.f125702a) && this.f125703b == krp0Var.f125703b && wj50.m88271j(this.f125704c, krp0Var.f125704c) && this.f125705d == krp0Var.f125705d;
    }

    @Override // p204p.mrp0
    /* JADX INFO: renamed from: g */
    public final String mo57170g() {
        return this.f125702a;
    }

    @Override // p204p.mrp0
    /* JADX INFO: renamed from: h */
    public final String mo57171h() {
        return this.f125704c;
    }

    public final int hashCode() {
        String str = this.f125702a;
        return Boolean.hashCode(this.f125705d) + s571.m77243b((this.f125703b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f125704c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f125702a);
        parcel.writeString(this.f125703b.name());
        parcel.writeString(this.f125704c);
        parcel.writeInt(this.f125705d ? 1 : 0);
    }
}
