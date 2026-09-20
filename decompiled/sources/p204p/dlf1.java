package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class dlf1 extends AbstractC2206o9 implements Parcelable {
    public static final Parcelable.Creator<dlf1> CREATOR = new c5f1(28);

    /* JADX INFO: renamed from: a */
    public final String f50203a;

    /* JADX INFO: renamed from: b */
    public final String f50204b;

    /* JADX INFO: renamed from: c */
    public final String f50205c;

    public dlf1(String str, String str2, String str3) {
        ig31.m50506x(str);
        this.f50203a = str;
        ig31.m50506x(str2);
        this.f50204b = str2;
        ig31.m50506x(str3);
        this.f50205c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dlf1)) {
            return false;
        }
        dlf1 dlf1Var = (dlf1) obj;
        return this.f50203a.equals(dlf1Var.f50203a) && mvl0.m62956s(dlf1Var.f50204b, this.f50204b) && mvl0.m62956s(dlf1Var.f50205c, this.f50205c);
    }

    public final int hashCode() {
        return this.f50203a.hashCode();
    }

    public final String toString() {
        String str = this.f50203a;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String strTrim = str.trim();
        int length = strTrim.length();
        if (length > 25) {
            strTrim = strTrim.substring(0, 10) + "..." + strTrim.substring(length - 10, length) + "::" + i;
        }
        return dq60.m36616p(this.f50205c, "}", edb.m38573v("Channel{token=", strTrim, ", nodeId=", this.f50204b, ", path="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26308N(parcel, 2, this.f50203a);
        alf1.m26308N(parcel, 3, this.f50204b);
        alf1.m26308N(parcel, 4, this.f50205c);
        alf1.m26316V(iM26314T, parcel);
    }
}
