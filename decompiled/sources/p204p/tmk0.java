package p204p;

import io.reactivex.rxjava3.core.Notification;

/* JADX INFO: loaded from: classes10.dex */
public final class tmk0 extends xmk0 {

    /* JADX INFO: renamed from: a */
    public final Notification f221746a;

    public tmk0(Notification notification) {
        this.f221746a = notification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmk0)) {
            return false;
        }
        tmk0 tmk0Var = (tmk0) obj;
        Object obj2 = jg50.f112044e;
        return obj2.equals(obj2) && wj50.m88271j(this.f221746a, tmk0Var.f221746a);
    }

    public final int hashCode() {
        return this.f221746a.hashCode() + (jg50.f112044e.hashCode() * 31);
    }
}
