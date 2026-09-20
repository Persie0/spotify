package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class bc51 implements Parcelable {
    public static final Parcelable.Creator<bc51> CREATOR = new q051(29);

    /* JADX INFO: renamed from: a */
    public final String f25781a;

    /* JADX INFO: renamed from: b */
    public final String f25782b;

    /* JADX INFO: renamed from: c */
    public final qf40 f25783c;

    /* JADX INFO: renamed from: d */
    public final qf40 f25784d;

    /* JADX INFO: renamed from: e */
    public final int f25785e;

    public bc51(String str, String str2, qf40 qf40Var, qf40 qf40Var2, int i) {
        this.f25781a = str;
        this.f25782b = str2;
        this.f25783c = qf40Var;
        this.f25784d = qf40Var2;
        this.f25785e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc51)) {
            return false;
        }
        bc51 bc51Var = (bc51) obj;
        return wj50.m88271j(this.f25781a, bc51Var.f25781a) && wj50.m88271j(this.f25782b, bc51Var.f25782b) && wj50.m88271j(this.f25783c, bc51Var.f25783c) && wj50.m88271j(this.f25784d, bc51Var.f25784d) && this.f25785e == bc51Var.f25785e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f25785e) + fr0.m42461e(this.f25784d, fr0.m42461e(this.f25783c, s571.m77243b(this.f25781a.hashCode() * 31, 31, this.f25782b), 31), 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f25781a);
        parcel.writeString(this.f25782b);
        parcel.writeStringList(this.f25783c);
        qf40 qf40Var = this.f25784d;
        parcel.writeInt(((AbstractC2282q6) qf40Var).mo33075a());
        Iterator it = qf40Var.iterator();
        while (it.hasNext()) {
            ((ut31) it.next()).writeToParcel(parcel, i);
        }
        int i2 = this.f25785e;
        if (i2 == 1) {
            str = "UNSPECIFIED";
        } else if (i2 == 2) {
            str = "EVERGREEN";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "TIMELY";
        }
        parcel.writeString(str);
    }
}
