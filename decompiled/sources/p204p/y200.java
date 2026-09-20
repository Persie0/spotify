package p204p;

import android.app.Notification;

/* JADX INFO: loaded from: classes7.dex */
public final class y200 {

    /* JADX INFO: renamed from: a */
    public final Notification f268432a;

    /* JADX INFO: renamed from: b */
    public final boolean f268433b;

    /* JADX INFO: renamed from: c */
    public final Integer f268434c;

    public y200(Notification notification, boolean z, Integer num) {
        this.f268432a = notification;
        this.f268433b = z;
        this.f268434c = num;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m92687a() {
        return this.f268434c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m92688b() {
        return this.f268433b;
    }

    /* JADX INFO: renamed from: c */
    public final Notification m92689c() {
        return this.f268432a;
    }

    public final String toString() {
        return this.f268432a + " foreground=" + this.f268433b + " fgsType=" + this.f268434c;
    }
}
