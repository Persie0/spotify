package p204p;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rul implements Parcelable {
    public static final Parcelable.Creator<rul> CREATOR = new g7g1(4);

    /* JADX INFO: renamed from: c */
    public abstract PendingIntent mo43755c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo43756g();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        g6f1 g6f1Var = (g6f1) this;
        parcel.writeParcelable(g6f1Var.f77043a, 0);
        parcel.writeInt(g6f1Var.f77044b ? 1 : 0);
    }
}
