package p204p;

import android.app.Notification;

/* JADX INFO: loaded from: classes3.dex */
public final class m200 {

    /* JADX INFO: renamed from: a */
    public final int f139176a;

    /* JADX INFO: renamed from: b */
    public final int f139177b;

    /* JADX INFO: renamed from: c */
    public final Notification f139178c;

    public m200(int i, Notification notification, int i2) {
        this.f139176a = i;
        this.f139178c = notification;
        this.f139177b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m200.class != obj.getClass()) {
            return false;
        }
        m200 m200Var = (m200) obj;
        if (this.f139176a == m200Var.f139176a && this.f139177b == m200Var.f139177b) {
            return this.f139178c.equals(m200Var.f139178c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f139178c.hashCode() + (((this.f139176a * 31) + this.f139177b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f139176a + ", mForegroundServiceType=" + this.f139177b + ", mNotification=" + this.f139178c + '}';
    }
}
