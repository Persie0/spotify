package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class qee1 implements Parcelable {
    public static final Parcelable.Creator<qee1> CREATOR = new xed1(19);

    /* JADX INFO: renamed from: a */
    public final String f187914a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f187915b;

    /* JADX INFO: renamed from: c */
    public final int f187916c;

    public qee1(int i, String str, ArrayList arrayList) {
        this.f187914a = str;
        this.f187915b = arrayList;
        this.f187916c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qee1)) {
            return false;
        }
        qee1 qee1Var = (qee1) obj;
        return wj50.m88271j(this.f187914a, qee1Var.f187914a) && this.f187915b.equals(qee1Var.f187915b) && this.f187916c == qee1Var.f187916c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f187916c) + lq51.m59700f(this.f187915b, this.f187914a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f187914a);
        Iterator itM42469m = fr0.m42469m(this.f187915b, parcel);
        while (itM42469m.hasNext()) {
            ((ree1) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f187916c);
    }
}
