package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class fa80 implements Parcelable {
    public static final Parcelable.Creator<fa80> CREATOR = new i980(3);

    /* JADX INFO: renamed from: a */
    public final Map f67458a;

    public fa80(Map map) {
        this.f67458a = map;
    }

    /* JADX INFO: renamed from: c */
    public final Object m41144c(ea80 ea80Var) {
        Object obj = this.f67458a.get(ea80Var);
        return obj == null ? ea80Var.getDefault() : obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa80) && wj50.m88271j(this.f67458a, ((fa80) obj).f67458a);
    }

    public final int hashCode() {
        return this.f67458a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM91403l = xl81.m91403l(parcel, this.f67458a);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeValue(entry.getValue());
        }
    }
}
