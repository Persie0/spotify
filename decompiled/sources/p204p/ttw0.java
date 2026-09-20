package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class ttw0 implements utw0 {
    public static final Parcelable.Creator<ttw0> CREATOR = new b8w0(25);

    /* JADX INFO: renamed from: a */
    public final Map f223690a;

    public ttw0(Map map) {
        this.f223690a = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ttw0) && wj50.m88271j(this.f223690a, ((ttw0) obj).f223690a);
    }

    public final int hashCode() {
        return this.f223690a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM91403l = xl81.m91403l(parcel, this.f223690a);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeInt(((fk80) entry.getKey()).f70497a);
            parcel.writeString(((qk80) entry.getValue()).f189495a);
        }
    }
}
