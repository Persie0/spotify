package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class o0x0 implements Parcelable {
    public static final Parcelable.Creator<o0x0> CREATOR = new xxw0(4);

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f160537a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f160538b;

    public o0x0(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f160537a = linkedHashMap;
        this.f160538b = linkedHashMap2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0x0)) {
            return false;
        }
        o0x0 o0x0Var = (o0x0) obj;
        return this.f160537a.equals(o0x0Var.f160537a) && this.f160538b.equals(o0x0Var.f160538b);
    }

    public final int hashCode() {
        return this.f160538b.hashCode() + (this.f160537a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkedHashMap linkedHashMap = this.f160537a;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString(((h4b0) entry.getKey()).name());
            ((g4b0) entry.getValue()).writeToParcel(parcel, i);
        }
        LinkedHashMap linkedHashMap2 = this.f160538b;
        parcel.writeInt(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            parcel.writeString(((hg60) entry2.getKey()).name());
            ((gg60) entry2.getValue()).writeToParcel(parcel, i);
        }
    }
}
