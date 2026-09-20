package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class rab0 implements Parcelable {
    public static final Parcelable.Creator<rab0> CREATOR = new l0b0(16);

    /* JADX INFO: renamed from: a */
    public final long f197248a;

    /* JADX INFO: renamed from: b */
    public final String f197249b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f197250c;

    public rab0(long j, String str, ArrayList arrayList) {
        this.f197248a = j;
        this.f197249b = str;
        this.f197250c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rab0)) {
            return false;
        }
        rab0 rab0Var = (rab0) obj;
        return this.f197248a == rab0Var.f197248a && wj50.m88271j(this.f197249b, rab0Var.f197249b) && this.f197250c.equals(rab0Var.f197250c);
    }

    public final int hashCode() {
        return this.f197250c.hashCode() + s571.m77243b(Long.hashCode(this.f197248a) * 31, 31, this.f197249b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f197248a);
        parcel.writeString(this.f197249b);
        Iterator itM42469m = fr0.m42469m(this.f197250c, parcel);
        while (itM42469m.hasNext()) {
            ((tab0) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
