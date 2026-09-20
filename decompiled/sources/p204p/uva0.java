package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class uva0 implements Parcelable {
    public static final Parcelable.Creator<uva0> CREATOR = new ama0(13);

    /* JADX INFO: renamed from: a */
    public final String f234403a;

    /* JADX INFO: renamed from: b */
    public final String f234404b;

    /* JADX INFO: renamed from: c */
    public final tyv f234405c;

    /* JADX INFO: renamed from: d */
    public final Boolean f234406d;

    /* JADX INFO: renamed from: e */
    public final Integer f234407e;

    /* JADX INFO: renamed from: f */
    public final boolean f234408f;

    /* JADX INFO: renamed from: g */
    public final voc1 f234409g;

    /* JADX INFO: renamed from: h */
    public final voc1 f234410h;

    public uva0(String str, String str2, tyv tyvVar, Boolean bool, Integer num, boolean z, voc1 voc1Var, voc1 voc1Var2) {
        this.f234403a = str;
        this.f234404b = str2;
        this.f234405c = tyvVar;
        this.f234406d = bool;
        this.f234407e = num;
        this.f234408f = z;
        this.f234409g = voc1Var;
        this.f234410h = voc1Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uva0)) {
            return false;
        }
        uva0 uva0Var = (uva0) obj;
        return wj50.m88271j(this.f234403a, uva0Var.f234403a) && wj50.m88271j(this.f234404b, uva0Var.f234404b) && wj50.m88271j(this.f234405c, uva0Var.f234405c) && wj50.m88271j(this.f234406d, uva0Var.f234406d) && wj50.m88271j(this.f234407e, uva0Var.f234407e) && this.f234408f == uva0Var.f234408f && wj50.m88271j(this.f234409g, uva0Var.f234409g) && wj50.m88271j(this.f234410h, uva0Var.f234410h);
    }

    public final int hashCode() {
        int iHashCode = (this.f234405c.hashCode() + s571.m77243b(this.f234403a.hashCode() * 31, 31, this.f234404b)) * 31;
        Boolean bool = this.f234406d;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f234407e;
        return this.f234410h.f243453a.hashCode() + s571.m77243b(s571.m77245d((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f234408f), 31, this.f234409g.f243453a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f234403a);
        parcel.writeString(this.f234404b);
        parcel.writeParcelable(this.f234405c, i);
        Boolean bool = this.f234406d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool);
        }
        Integer num = this.f234407e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeInt(this.f234408f ? 1 : 0);
        parcel.writeParcelable(this.f234409g, i);
        parcel.writeParcelable(this.f234410h, i);
    }

    public /* synthetic */ uva0(String str, String str2, tyv tyvVar, Boolean bool, Integer num, boolean z) {
        this(str, str2, tyvVar, bool, num, z, ptl.m70998s("spotify:internal:parental-control:login-different-device:", str, xoc1.f264167q0), ptl.m70998s("spotify:internal:parental-control:login-current-device:", str, xoc1.f264159p0));
    }
}
