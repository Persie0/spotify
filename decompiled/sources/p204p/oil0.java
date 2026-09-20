package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class oil0 implements Parcelable {
    public static final Parcelable.Creator<oil0> CREATOR = new hbl0(21);

    /* JADX INFO: renamed from: a */
    public final String f165829a;

    /* JADX INFO: renamed from: b */
    public final String f165830b;

    /* JADX INFO: renamed from: c */
    public final yxv f165831c;

    /* JADX INFO: renamed from: d */
    public final String f165832d;

    /* JADX INFO: renamed from: e */
    public final int f165833e;

    /* JADX INFO: renamed from: f */
    public final String f165834f;

    public oil0(String str, String str2, yxv yxvVar, String str3, int i, String str4) {
        this.f165829a = str;
        this.f165830b = str2;
        this.f165831c = yxvVar;
        this.f165832d = str3;
        this.f165833e = i;
        this.f165834f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oil0)) {
            return false;
        }
        oil0 oil0Var = (oil0) obj;
        return wj50.m88271j(this.f165829a, oil0Var.f165829a) && wj50.m88271j(this.f165830b, oil0Var.f165830b) && this.f165831c == oil0Var.f165831c && wj50.m88271j(this.f165832d, oil0Var.f165832d) && this.f165833e == oil0Var.f165833e && wj50.m88271j(this.f165834f, oil0Var.f165834f);
    }

    public final int hashCode() {
        return this.f165834f.hashCode() + mt60.m62800g(this.f165833e, s571.m77243b((this.f165831c.hashCode() + s571.m77243b(this.f165829a.hashCode() * 31, 31, this.f165830b)) * 31, 31, this.f165832d), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f165829a);
        parcel.writeString(this.f165830b);
        parcel.writeString(this.f165831c.name());
        parcel.writeString(this.f165832d);
        parcel.writeInt(this.f165833e);
        parcel.writeString(this.f165834f);
    }

    public /* synthetic */ oil0(String str, String str2, yxv yxvVar, String str3, int i, String str4, int i2) {
        this(str, str2, yxvVar, str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str4);
    }
}
