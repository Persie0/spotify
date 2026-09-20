package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class k1u implements Parcelable {
    public static final Parcelable.Creator<k1u> CREATOR = new qct(7);

    /* JADX INFO: renamed from: a */
    public final String f118434a;

    /* JADX INFO: renamed from: b */
    public final Object f118435b;

    /* JADX INFO: renamed from: c */
    public final boolean f118436c;

    public k1u(String str, List list, boolean z) {
        this.f118434a = str;
        this.f118435b = list;
        this.f118436c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1u)) {
            return false;
        }
        k1u k1uVar = (k1u) obj;
        return wj50.m88271j(this.f118434a, k1uVar.f118434a) && this.f118435b.equals(k1uVar.f118435b) && this.f118436c == k1uVar.f118436c;
    }

    public final int hashCode() {
        String str = this.f118434a;
        return Boolean.hashCode(this.f118436c) + dq60.m36604d((str == null ? 0 : str.hashCode()) * 31, 31, this.f118435b);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f118434a);
        ?? r3 = this.f118435b;
        parcel.writeInt(r3.size());
        Iterator it = r3.iterator();
        while (it.hasNext()) {
            parcel.writeString(((l1u) it.next()).name());
        }
        parcel.writeInt(this.f118436c ? 1 : 0);
    }
}
