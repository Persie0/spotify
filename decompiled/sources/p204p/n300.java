package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class n300 implements ehr0 {
    public static final Parcelable.Creator<n300> CREATOR = new ygz(25);

    /* JADX INFO: renamed from: a */
    public final String f149889a;

    /* JADX INFO: renamed from: b */
    public final String f149890b;

    /* JADX INFO: renamed from: c */
    public final String f149891c;

    /* JADX INFO: renamed from: d */
    public final boolean f149892d;

    /* JADX INFO: renamed from: e */
    public final qf40 f149893e;

    /* JADX INFO: renamed from: f */
    public final boolean f149894f;

    public n300(String str, String str2, String str3, boolean z, qf40 qf40Var) {
        this.f149889a = str;
        this.f149890b = str2;
        this.f149891c = str3;
        this.f149892d = z;
        this.f149893e = qf40Var;
        this.f149894f = z;
    }

    /* JADX INFO: renamed from: c */
    public static n300 m63575c(n300 n300Var, boolean z, qf40 qf40Var, int i) {
        String str = n300Var.f149889a;
        String str2 = n300Var.f149890b;
        String str3 = n300Var.f149891c;
        if ((i & 8) != 0) {
            z = n300Var.f149892d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            qf40Var = n300Var.f149893e;
        }
        n300Var.getClass();
        return new n300(str, str2, str3, z2, qf40Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n300)) {
            return false;
        }
        n300 n300Var = (n300) obj;
        return wj50.m88271j(this.f149889a, n300Var.f149889a) && wj50.m88271j(this.f149890b, n300Var.f149890b) && wj50.m88271j(this.f149891c, n300Var.f149891c) && this.f149892d == n300Var.f149892d && wj50.m88271j(this.f149893e, n300Var.f149893e);
    }

    public final int hashCode() {
        int iHashCode = this.f149889a.hashCode() * 31;
        String str = this.f149890b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f149891c;
        return this.f149893e.hashCode() + s571.m77245d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f149892d);
    }

    @Override // p204p.ehr0
    /* JADX INFO: renamed from: p0 */
    public final boolean mo38997p0() {
        return this.f149894f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f149889a);
        parcel.writeString(this.f149890b);
        parcel.writeString(this.f149891c);
        parcel.writeInt(this.f149892d ? 1 : 0);
        qf40 qf40Var = this.f149893e;
        parcel.writeInt(((AbstractC2282q6) qf40Var).size());
        Iterator it = qf40Var.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
