package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class p581 implements l581 {
    public static final Parcelable.Creator<p581> CREATOR = new sr71(26);

    /* JADX INFO: renamed from: a */
    public final ArrayList f174107a;

    /* JADX INFO: renamed from: b */
    public final Integer f174108b;

    /* JADX INFO: renamed from: c */
    public final Timestamp f174109c;

    /* JADX INFO: renamed from: d */
    public final String f174110d;

    public p581(ArrayList arrayList, Integer num, Timestamp timestamp, String str) {
        this.f174107a = arrayList;
        this.f174108b = num;
        this.f174109c = timestamp;
        this.f174110d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p581)) {
            return false;
        }
        p581 p581Var = (p581) obj;
        return wj50.m88271j(this.f174107a, p581Var.f174107a) && wj50.m88271j(this.f174108b, p581Var.f174108b) && wj50.m88271j(this.f174109c, p581Var.f174109c) && wj50.m88271j(this.f174110d, p581Var.f174110d);
    }

    @Override // p204p.zz41
    public final String getId() {
        return this.f174110d;
    }

    @Override // p204p.l581
    public final List getItems() {
        return this.f174107a;
    }

    public final int hashCode() {
        int iHashCode = this.f174107a.hashCode() * 31;
        Integer num = this.f174108b;
        return this.f174110d.hashCode() + ((this.f174109c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    @Override // p204p.l581
    /* JADX INFO: renamed from: r */
    public final Integer mo58212r() {
        return this.f174108b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f174107a, parcel);
        while (itM42469m.hasNext()) {
            ((o581) itM42469m.next()).writeToParcel(parcel, i);
        }
        Integer num = this.f174108b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        Timestamp timestamp = this.f174109c;
        parcel.writeLong(timestamp.m1969s());
        parcel.writeInt(timestamp.m1968r());
        parcel.writeString(this.f174110d);
    }

    public /* synthetic */ p581(ArrayList arrayList, Integer num, Timestamp timestamp, int i) {
        this(arrayList, (i & 2) != 0 ? null : num, timestamp, "TopArtists");
    }
}
