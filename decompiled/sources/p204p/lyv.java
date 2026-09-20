package p204p;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class lyv implements Parcelable {
    public static final Parcelable.Creator<lyv> CREATOR = new bwv(3);

    /* JADX INFO: renamed from: a */
    public float f138119a;

    /* JADX INFO: renamed from: b */
    public Parcelable f138120b = null;

    /* JADX INFO: renamed from: c */
    public float f138121c;

    public lyv(float f, float f2) {
        this.f138119a = f2;
        this.f138121c = f;
    }

    /* JADX INFO: renamed from: c */
    public float mo30764c() {
        return this.f138119a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.f138121c + " y: " + mo30764c();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f138121c);
        parcel.writeFloat(mo30764c());
        Parcelable parcelable = this.f138120b;
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            if (!(parcelable instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable(this.f138120b, i);
        }
    }
}
