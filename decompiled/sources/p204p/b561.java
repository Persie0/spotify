package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b561 implements Parcelable {
    public static final Parcelable.Creator<b561> CREATOR = new e361(4);

    /* JADX INFO: renamed from: a */
    public final c561 f23523a;

    /* JADX INFO: renamed from: b */
    public final Object f23524b;

    public b561(c561 c561Var, List list) {
        this.f23523a = c561Var;
        this.f23524b = list;
    }

    /* JADX INFO: renamed from: c */
    public final c561 m28146c() {
        return this.f23523a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b561)) {
            return false;
        }
        b561 b561Var = (b561) obj;
        return wj50.m88271j(this.f23523a, b561Var.f23523a) && this.f23524b.equals(b561Var.f23524b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: g */
    public final List m28147g() {
        return this.f23524b;
    }

    public final int hashCode() {
        return this.f23524b.hashCode() + (this.f23523a.hashCode() * 31);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f23523a, i);
        ?? r0 = this.f23524b;
        parcel.writeInt(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
