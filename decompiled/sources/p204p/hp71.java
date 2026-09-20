package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class hp71 implements kp71 {
    public static final Parcelable.Creator<hp71> CREATOR = new c071(21);

    /* JADX INFO: renamed from: a */
    public final ArrayList f93709a;

    /* JADX INFO: renamed from: b */
    public final int f93710b;

    public hp71(int i, ArrayList arrayList) {
        this.f93709a = arrayList;
        this.f93710b = i;
    }

    @Override // p204p.kp71
    /* JADX INFO: renamed from: S0 */
    public final List mo39624S0() {
        return this.f93709a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp71)) {
            return false;
        }
        hp71 hp71Var = (hp71) obj;
        return this.f93709a.equals(hp71Var.f93709a) && this.f93710b == hp71Var.f93710b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93710b) + (this.f93709a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f93709a, parcel);
        while (itM42469m.hasNext()) {
            ((tr71) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f93710b);
    }
}
