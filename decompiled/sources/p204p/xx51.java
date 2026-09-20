package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class xx51 implements Parcelable {
    public static final Parcelable.Creator<xx51> CREATOR = new nc51(28);

    /* JADX INFO: renamed from: a */
    public final String f266870a;

    /* JADX INFO: renamed from: b */
    public final List f266871b;

    public xx51(String str, List list) {
        this.f266870a = str;
        this.f266871b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx51)) {
            return false;
        }
        xx51 xx51Var = (xx51) obj;
        return wj50.m88271j(this.f266870a, xx51Var.f266870a) && wj50.m88271j(this.f266871b, xx51Var.f266871b);
    }

    public final int hashCode() {
        String str = this.f266870a;
        return this.f266871b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f266870a);
        Iterator itM42468l = fr0.m42468l(parcel, this.f266871b);
        while (itM42468l.hasNext()) {
            ((wx51) itM42468l.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ xx51() {
        this(null, lau.f131415a);
    }
}
