package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class fu1 implements iet0 {
    public static final Parcelable.Creator<fu1> CREATOR = new zt1(3);

    /* JADX INFO: renamed from: a */
    public final int f73368a;

    /* JADX INFO: renamed from: b */
    public final String f73369b;

    /* JADX INFO: renamed from: c */
    public final String f73370c;

    /* JADX INFO: renamed from: d */
    public final String f73371d;

    /* JADX INFO: renamed from: e */
    public final String f73372e;

    public fu1(int i, String str, String str2, String str3, String str4) {
        this.f73368a = i;
        this.f73369b = str;
        this.f73370c = str2;
        this.f73371d = str3;
        this.f73372e = str4;
    }

    @Override // p204p.iet0
    /* JADX INFO: renamed from: I0 */
    public final int mo33720I0() {
        return this.f73368a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu1)) {
            return false;
        }
        fu1 fu1Var = (fu1) obj;
        return this.f73368a == fu1Var.f73368a && wj50.m88271j(this.f73369b, fu1Var.f73369b) && wj50.m88271j(this.f73370c, fu1Var.f73370c) && wj50.m88271j(this.f73371d, fu1Var.f73371d) && wj50.m88271j(this.f73372e, fu1Var.f73372e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f73368a) * 31, 31, this.f73369b), 31, this.f73370c), 31, this.f73371d);
        String str = this.f73372e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f73368a);
        parcel.writeString(this.f73369b);
        parcel.writeString(this.f73370c);
        parcel.writeString(this.f73371d);
        parcel.writeString(this.f73372e);
    }
}
