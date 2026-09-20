package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class x9r0 implements Parcelable {
    public static final Parcelable.Creator<x9r0> CREATOR = new vzq0(19);

    /* JADX INFO: renamed from: a */
    public final String f259431a;

    /* JADX INFO: renamed from: b */
    public final Set f259432b;

    /* JADX INFO: renamed from: c */
    public final String f259433c;

    /* JADX INFO: renamed from: d */
    public final String f259434d;

    /* JADX INFO: renamed from: e */
    public final String f259435e;

    public x9r0(String str, String str2, String str3, String str4, Set set) {
        this.f259431a = str;
        this.f259432b = set;
        this.f259433c = str2;
        this.f259434d = str3;
        this.f259435e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9r0)) {
            return false;
        }
        x9r0 x9r0Var = (x9r0) obj;
        return wj50.m88271j(this.f259431a, x9r0Var.f259431a) && wj50.m88271j(this.f259432b, x9r0Var.f259432b) && wj50.m88271j(this.f259433c, x9r0Var.f259433c) && wj50.m88271j(this.f259434d, x9r0Var.f259434d) && wj50.m88271j(this.f259435e, x9r0Var.f259435e);
    }

    public final int hashCode() {
        String str = this.f259431a;
        int iM56830b = klh.m56830b((str == null ? 0 : str.hashCode()) * 31, 31, this.f259432b);
        String str2 = this.f259433c;
        int iHashCode = (iM56830b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f259434d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f259435e;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f259431a);
        Iterator itM64022o = nap.m64022o(this.f259432b, parcel);
        while (itM64022o.hasNext()) {
            parcel.writeString((String) itM64022o.next());
        }
        parcel.writeString(this.f259433c);
        parcel.writeString(this.f259434d);
        parcel.writeString(this.f259435e);
    }
}
