package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class v320 implements x320 {
    public static final Parcelable.Creator<v320> CREATOR = new t320(1);

    /* JADX INFO: renamed from: a */
    public final qf40 f236754a;

    public v320(qf40 qf40Var) {
        this.f236754a = qf40Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v320) && wj50.m88271j(this.f236754a, ((v320) obj).f236754a);
    }

    public final int hashCode() {
        return this.f236754a.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qf40 qf40Var = this.f236754a;
        parcel.writeInt(((AbstractC2282q6) qf40Var).size());
        Iterator it = qf40Var.iterator();
        while (it.hasNext()) {
            ((u320) it.next()).writeToParcel(parcel, i);
        }
    }
}
