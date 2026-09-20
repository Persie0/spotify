package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ry6 implements Parcelable {
    public static final Parcelable.Creator<ry6> CREATOR = new fi6(23);

    /* JADX INFO: renamed from: a */
    public final String f203821a;

    /* JADX INFO: renamed from: b */
    public final List f203822b;

    public ry6(String str, List list) {
        this.f203821a = str;
        this.f203822b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry6)) {
            return false;
        }
        ry6 ry6Var = (ry6) obj;
        return wj50.m88271j(this.f203821a, ry6Var.f203821a) && wj50.m88271j(this.f203822b, ry6Var.f203822b);
    }

    public final int hashCode() {
        return this.f203822b.hashCode() + (this.f203821a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f203821a);
        Iterator itM42468l = fr0.m42468l(parcel, this.f203822b);
        while (itM42468l.hasNext()) {
            ((qy6) itM42468l.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ry6() {
        this("", lau.f131415a);
    }
}
