package p204p;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class lwj0 {

    /* JADX INFO: renamed from: a */
    public final String f137588a;

    /* JADX INFO: renamed from: b */
    public final int f137589b;

    /* JADX INFO: renamed from: c */
    public final Notification f137590c;

    public lwj0(String str, int i, Notification notification) {
        this.f137588a = str;
        this.f137589b = i;
        this.f137590c = notification;
    }

    /* JADX INFO: renamed from: a */
    public final void m60124a(qv30 qv30Var) {
        String str = this.f137588a;
        int i = this.f137589b;
        ov30 ov30Var = (ov30) qv30Var;
        ov30Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(qv30.f192860h);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(null);
            Notification notification = this.f137590c;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            ov30Var.f170414a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f137588a);
        sb.append(", id:");
        return klh.m56832d(this.f137589b, ", tag:null]", sb);
    }
}
