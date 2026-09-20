package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.o5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2202o5 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Parcelable f161807a;

    /* JADX INFO: renamed from: b */
    public static final C2152n5 f161806b = new C2152n5();
    public static final Parcelable.Creator<AbstractC2202o5> CREATOR = new xum0(1);

    public AbstractC2202o5() {
        this.f161807a = null;
    }

    /* JADX INFO: renamed from: c */
    public final Parcelable m66261c() {
        return this.f161807a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f161807a, i);
    }

    public AbstractC2202o5(Parcelable parcelable) {
        if (parcelable != null) {
            this.f161807a = parcelable == f161806b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC2202o5(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f161807a = parcelable == null ? f161806b : parcelable;
    }
}
