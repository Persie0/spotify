package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class jnd implements Parcelable {
    public static final Parcelable.Creator<jnd> CREATOR = new fjd(4);

    /* JADX INFO: renamed from: a */
    public final String f114077a;

    /* JADX INFO: renamed from: b */
    public final ind f114078b;

    /* JADX INFO: renamed from: c */
    public final String f114079c;

    /* JADX INFO: renamed from: d */
    public final String f114080d;

    /* JADX INFO: renamed from: e */
    public final xcl0 f114081e;

    /* JADX INFO: renamed from: f */
    public final ovd f114082f;

    /* JADX INFO: renamed from: g */
    public final boolean f114083g;

    public jnd(String str, ind indVar, String str2, String str3, xcl0 xcl0Var, ovd ovdVar, boolean z) {
        this.f114077a = str;
        this.f114078b = indVar;
        this.f114079c = str2;
        this.f114080d = str3;
        this.f114081e = xcl0Var;
        this.f114082f = ovdVar;
        this.f114083g = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m53818c() {
        return this.f114077a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnd)) {
            return false;
        }
        jnd jndVar = (jnd) obj;
        return wj50.m88271j(this.f114077a, jndVar.f114077a) && wj50.m88271j(this.f114078b, jndVar.f114078b) && wj50.m88271j(this.f114079c, jndVar.f114079c) && wj50.m88271j(this.f114080d, jndVar.f114080d) && wj50.m88271j(this.f114081e, jndVar.f114081e) && this.f114082f == jndVar.f114082f && this.f114083g == jndVar.f114083g;
    }

    /* JADX INFO: renamed from: g */
    public final String m53819g() {
        return this.f114079c;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m53820h() {
        return this.f114083g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f114078b.hashCode() + (this.f114077a.hashCode() * 31)) * 31, 31, this.f114079c);
        String str = this.f114080d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        xcl0 xcl0Var = this.f114081e;
        return Boolean.hashCode(this.f114083g) + ((this.f114082f.hashCode() + ((iHashCode + (xcl0Var != null ? xcl0Var.hashCode() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f114077a);
        parcel.writeParcelable(this.f114078b, i);
        parcel.writeString(this.f114079c);
        parcel.writeString(this.f114080d);
        parcel.writeParcelable(this.f114081e, i);
        parcel.writeString(this.f114082f.name());
        parcel.writeInt(this.f114083g ? 1 : 0);
    }

    public /* synthetic */ jnd(String str, ind indVar, String str2, String str3, xcl0 xcl0Var, ovd ovdVar, int i) {
        this(str, indVar, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : xcl0Var, (i & 32) != 0 ? ovd.f170476a : ovdVar, (i & 64) == 0);
    }
}
