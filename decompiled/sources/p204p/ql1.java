package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ql1 implements iet0 {
    public static final Parcelable.Creator<ql1> CREATOR = new g11(20);

    /* JADX INFO: renamed from: a */
    public final int f189691a;

    /* JADX INFO: renamed from: b */
    public final String f189692b;

    /* JADX INFO: renamed from: c */
    public final String f189693c;

    /* JADX INFO: renamed from: d */
    public final String f189694d;

    /* JADX INFO: renamed from: e */
    public final String f189695e;

    public ql1(int i, String str, String str2, String str3, String str4) {
        this.f189691a = i;
        this.f189692b = str;
        this.f189693c = str2;
        this.f189694d = str3;
        this.f189695e = str4;
    }

    @Override // p204p.iet0
    /* JADX INFO: renamed from: I0 */
    public final int mo33720I0() {
        return this.f189691a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql1)) {
            return false;
        }
        ql1 ql1Var = (ql1) obj;
        return this.f189691a == ql1Var.f189691a && wj50.m88271j(this.f189692b, ql1Var.f189692b) && wj50.m88271j(this.f189693c, ql1Var.f189693c) && wj50.m88271j(this.f189694d, ql1Var.f189694d) && wj50.m88271j(this.f189695e, ql1Var.f189695e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f189691a) * 31, 31, this.f189692b), 31, this.f189693c), 31, this.f189694d);
        String str = this.f189695e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f189691a);
        parcel.writeString(this.f189692b);
        parcel.writeString(this.f189693c);
        parcel.writeString(this.f189694d);
        parcel.writeString(this.f189695e);
    }
}
