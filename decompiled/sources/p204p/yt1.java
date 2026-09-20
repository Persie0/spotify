package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class yt1 implements du1 {
    public static final Parcelable.Creator<yt1> CREATOR = new g11(29);

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f275920a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f275921b;

    public yt1(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.f275920a = linkedHashSet;
        this.f275921b = linkedHashSet2;
    }

    /* JADX INFO: renamed from: c */
    public final Set m94581c() {
        return this.f275921b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt1)) {
            return false;
        }
        yt1 yt1Var = (yt1) obj;
        return this.f275920a.equals(yt1Var.f275920a) && this.f275921b.equals(yt1Var.f275921b);
    }

    public final int hashCode() {
        return this.f275921b.hashCode() + (this.f275920a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkedHashSet linkedHashSet = this.f275920a;
        parcel.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
        LinkedHashSet linkedHashSet2 = this.f275921b;
        parcel.writeInt(linkedHashSet2.size());
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            parcel.writeString((String) it2.next());
        }
    }
}
