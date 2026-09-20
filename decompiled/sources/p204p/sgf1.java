package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class sgf1 extends AbstractC2206o9 implements bub {
    public static final Parcelable.Creator<sgf1> CREATOR = new c5f1(18);

    /* JADX INFO: renamed from: b */
    public final String f208864b;

    /* JADX INFO: renamed from: c */
    public final List f208865c;

    /* JADX INFO: renamed from: a */
    public final Object f208863a = new Object();

    /* JADX INFO: renamed from: d */
    public HashSet f208866d = null;

    public sgf1(String str, ArrayList arrayList) {
        this.f208864b = str;
        this.f208865c = arrayList;
        ig31.m50506x(str);
        ig31.m50506x(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sgf1.class != obj.getClass()) {
            return false;
        }
        sgf1 sgf1Var = (sgf1) obj;
        List list = sgf1Var.f208865c;
        String str = sgf1Var.f208864b;
        String str2 = this.f208864b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f208865c;
        return list2 == null ? list == null : list2.equals(list);
    }

    @Override // p204p.bub
    /* JADX INFO: renamed from: g */
    public final Set mo30508g() {
        HashSet hashSet;
        synchronized (this.f208863a) {
            try {
                if (this.f208866d == null) {
                    this.f208866d = new HashSet(this.f208865c);
                }
                hashSet = this.f208866d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet;
    }

    public final int hashCode() {
        String str = this.f208864b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List list = this.f208865c;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dq60.m36615o("CapabilityInfo{", this.f208864b, ", ", String.valueOf(this.f208865c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26308N(parcel, 2, this.f208864b);
        alf1.m26312R(parcel, 3, this.f208865c);
        alf1.m26316V(iM26314T, parcel);
    }
}
