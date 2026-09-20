package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class kcm implements Parcelable {
    public static final Parcelable.Creator<kcm> CREATOR = new pkl(19);

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f121509a;

    public kcm(LinkedHashMap linkedHashMap) {
        this.f121509a = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcm) && this.f121509a.equals(((kcm) obj).f121509a);
    }

    public final int hashCode() {
        return this.f121509a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkedHashMap linkedHashMap = this.f121509a;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
