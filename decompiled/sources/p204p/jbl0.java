package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class jbl0 extends nbl0 {
    public static final Parcelable.Creator<jbl0> CREATOR = new hbl0(1);

    /* JADX INFO: renamed from: a */
    public final qf40 f110827a;

    /* JADX INFO: renamed from: b */
    public final String f110828b;

    /* JADX INFO: renamed from: c */
    public final j3r f110829c;

    /* JADX INFO: renamed from: d */
    public final w9j0 f110830d;

    public jbl0(qf40 qf40Var, String str, j3r j3rVar, w9j0 w9j0Var) {
        this.f110827a = qf40Var;
        this.f110828b = str;
        this.f110829c = j3rVar;
        this.f110830d = w9j0Var;
    }

    @Override // p204p.nbl0
    /* JADX INFO: renamed from: c */
    public final j3r mo50186c() {
        return this.f110829c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbl0)) {
            return false;
        }
        jbl0 jbl0Var = (jbl0) obj;
        return wj50.m88271j(this.f110827a, jbl0Var.f110827a) && wj50.m88271j(this.f110828b, jbl0Var.f110828b) && wj50.m88271j(this.f110829c, jbl0Var.f110829c) && wj50.m88271j(this.f110830d, jbl0Var.f110830d);
    }

    @Override // p204p.nbl0
    /* JADX INFO: renamed from: g */
    public final w9j0 mo50187g() {
        return this.f110830d;
    }

    public final int hashCode() {
        return this.f110830d.f249183a.hashCode() + ((this.f110829c.hashCode() + s571.m77243b(this.f110827a.hashCode() * 31, 31, this.f110828b)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qf40 qf40Var = this.f110827a;
        parcel.writeInt(((AbstractC2282q6) qf40Var).mo33075a());
        Iterator it = qf40Var.iterator();
        while (it.hasNext()) {
            ((ycl0) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f110828b);
        parcel.writeParcelable(this.f110829c, i);
        this.f110830d.writeToParcel(parcel, i);
    }
}
