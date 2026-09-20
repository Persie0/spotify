package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class emo implements Parcelable {
    public static final Parcelable.Creator<emo> CREATOR = new pkl(26);

    /* JADX INFO: renamed from: a */
    public final int f60948a;

    /* JADX INFO: renamed from: b */
    public final int f60949b;

    /* JADX INFO: renamed from: c */
    public final int f60950c;

    public emo(int i, int i2, int i3) {
        this.f60948a = i;
        this.f60949b = i2;
        this.f60950c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emo)) {
            return false;
        }
        emo emoVar = (emo) obj;
        return this.f60948a == emoVar.f60948a && this.f60949b == emoVar.f60949b && this.f60950c == emoVar.f60950c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60950c) + mt60.m62800g(this.f60949b, Integer.hashCode(this.f60948a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f60948a);
        parcel.writeInt(this.f60949b);
        parcel.writeInt(this.f60950c);
    }
}
