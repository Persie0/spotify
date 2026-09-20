package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class i8b0 implements Parcelable {
    public static final Parcelable.Creator<i8b0> CREATOR = new l0b0(13);

    /* JADX INFO: renamed from: a */
    public final String f99754a;

    /* JADX INFO: renamed from: b */
    public final Map f99755b;

    public i8b0(String str, Map map) {
        this.f99754a = str;
        this.f99755b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8b0)) {
            return false;
        }
        i8b0 i8b0Var = (i8b0) obj;
        return wj50.m88271j(this.f99754a, i8b0Var.f99754a) && wj50.m88271j(this.f99755b, i8b0Var.f99755b);
    }

    public final int hashCode() {
        return this.f99755b.hashCode() + (this.f99754a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f99754a);
        Iterator itM91403l = xl81.m91403l(parcel, this.f99755b);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
