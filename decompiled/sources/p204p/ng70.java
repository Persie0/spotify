package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ng70 implements Parcelable {
    public static final Parcelable.Creator<ng70> CREATOR = new w270(11);

    /* JADX INFO: renamed from: a */
    public final List f153577a;

    /* JADX INFO: renamed from: b */
    public final String f153578b;

    /* JADX INFO: renamed from: c */
    public final int f153579c;

    public ng70(String str, int i, List list) {
        this.f153577a = list;
        this.f153578b = str;
        this.f153579c = i;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("languages must not be empty");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng70)) {
            return false;
        }
        ng70 ng70Var = (ng70) obj;
        return wj50.m88271j(this.f153577a, ng70Var.f153577a) && wj50.m88271j(this.f153578b, ng70Var.f153578b) && this.f153579c == ng70Var.f153579c;
    }

    public final int hashCode() {
        int iHashCode = this.f153577a.hashCode() * 31;
        String str = this.f153578b;
        return edb.m38547C(this.f153579c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        Iterator itM42468l = fr0.m42468l(parcel, this.f153577a);
        while (itM42468l.hasNext()) {
            ((tf70) itM42468l.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f153578b);
        int i2 = this.f153579c;
        if (i2 == 1) {
            str = "TYPED";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "LEGACY_CALLBACK";
        }
        parcel.writeString(str);
    }
}
