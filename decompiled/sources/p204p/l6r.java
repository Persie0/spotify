package p204p;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes4.dex */
public final class l6r implements Parcelable {
    public static final Parcelable.Creator<l6r> CREATOR = new o5r(2);

    /* JADX INFO: renamed from: a */
    public String f130465a;

    /* JADX INFO: renamed from: b */
    public String f130466b;

    /* JADX INFO: renamed from: c */
    public long f130467c = 0;

    /* JADX INFO: renamed from: c */
    public final void m58385c(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int i = parcel.readInt();
        try {
            if (i < 4) {
                throw new BadParcelableException("Parcelable too small");
            }
            if (parcel.dataPosition() - iDataPosition >= i) {
                if (iDataPosition > Alert.DURATION_SHOW_INDEFINITELY - i) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(iDataPosition + i);
                return;
            }
            this.f130465a = parcel.readString();
            if (parcel.dataPosition() - iDataPosition >= i) {
                if (iDataPosition > Alert.DURATION_SHOW_INDEFINITELY - i) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(iDataPosition + i);
                return;
            }
            this.f130466b = parcel.readString();
            if (parcel.dataPosition() - iDataPosition >= i) {
                if (iDataPosition > Alert.DURATION_SHOW_INDEFINITELY - i) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(iDataPosition + i);
            } else {
                this.f130467c = parcel.readLong();
                if (iDataPosition > Alert.DURATION_SHOW_INDEFINITELY - i) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(iDataPosition + i);
            }
        } catch (Throwable th) {
            if (iDataPosition > Alert.DURATION_SHOW_INDEFINITELY - i) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(iDataPosition + i);
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.f130465a);
        parcel.writeString(this.f130466b);
        parcel.writeLong(this.f130467c);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
