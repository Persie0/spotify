package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class lcm implements Parcelable {
    public static final Parcelable.Creator<lcm> CREATOR = new pkl(20);

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f131952a;

    /* JADX INFO: renamed from: b */
    public final e6l f131953b;

    public lcm(LinkedHashMap linkedHashMap, e6l e6lVar) {
        this.f131952a = linkedHashMap;
        this.f131953b = e6lVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcm)) {
            return false;
        }
        lcm lcmVar = (lcm) obj;
        return this.f131952a.equals(lcmVar.f131952a) && wj50.m88271j(this.f131953b, lcmVar.f131953b);
    }

    public final int hashCode() {
        return this.f131953b.hashCode() + (this.f131952a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkedHashMap linkedHashMap = this.f131952a;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeParcelable(this.f131953b, i);
    }
}
