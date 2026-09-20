package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class glq0 implements Parcelable {
    public static final Parcelable.Creator<glq0> CREATOR = new vnp0(23);

    /* JADX INFO: renamed from: a */
    public final String f81161a;

    /* JADX INFO: renamed from: b */
    public final x9r0 f81162b;

    /* JADX INFO: renamed from: c */
    public final boolean f81163c;

    /* JADX INFO: renamed from: d */
    public final String f81164d;

    public glq0(String str, String str2, x9r0 x9r0Var, boolean z) {
        this.f81161a = str;
        this.f81162b = x9r0Var;
        this.f81163c = z;
        this.f81164d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glq0)) {
            return false;
        }
        glq0 glq0Var = (glq0) obj;
        return wj50.m88271j(this.f81161a, glq0Var.f81161a) && wj50.m88271j(this.f81162b, glq0Var.f81162b) && this.f81163c == glq0Var.f81163c && wj50.m88271j(this.f81164d, glq0Var.f81164d);
    }

    public final int hashCode() {
        String str = this.f81161a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        x9r0 x9r0Var = this.f81162b;
        int iM77245d = s571.m77245d((iHashCode + (x9r0Var == null ? 0 : x9r0Var.hashCode())) * 31, 31, this.f81163c);
        String str2 = this.f81164d;
        return iM77245d + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f81161a);
        parcel.writeParcelable(this.f81162b, i);
        parcel.writeInt(this.f81163c ? 1 : 0);
        parcel.writeString(this.f81164d);
    }

    public /* synthetic */ glq0(String str, x9r0 x9r0Var, boolean z, String str2, int i) {
        this(str, (i & 8) != 0 ? null : str2, (i & 2) != 0 ? null : x9r0Var, z);
    }
}
