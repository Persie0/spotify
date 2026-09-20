package p204p;

import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class v200 extends x200 {
    public static final Parcelable.Creator<v200> CREATOR = new ygz(22);

    /* JADX INFO: renamed from: a */
    public final int f236507a;

    /* JADX INFO: renamed from: b */
    public final Notification f236508b;

    /* JADX INFO: renamed from: c */
    public final boolean f236509c;

    /* JADX INFO: renamed from: d */
    public final Integer f236510d;

    public v200(int i, Notification notification, boolean z, Integer num) {
        this.f236507a = i;
        this.f236508b = notification;
        this.f236509c = z;
        this.f236510d = num;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m84487c() {
        return this.f236510d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m84488g() {
        return this.f236509c;
    }

    /* JADX INFO: renamed from: h */
    public final int m84489h() {
        return this.f236507a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f236507a);
        parcel.writeParcelable(this.f236508b, i);
        parcel.writeInt(this.f236509c ? 1 : 0);
        Integer num = this.f236510d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
