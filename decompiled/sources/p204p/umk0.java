package p204p;

import io.reactivex.rxjava3.core.Notification;

/* JADX INFO: loaded from: classes10.dex */
public final class umk0 extends xmk0 {

    /* JADX INFO: renamed from: a */
    public final Notification f231898a;

    public umk0(Notification notification) {
        this.f231898a = notification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof umk0) && wj50.m88271j(this.f231898a, ((umk0) obj).f231898a);
    }

    public final int hashCode() {
        return this.f231898a.hashCode();
    }
}
