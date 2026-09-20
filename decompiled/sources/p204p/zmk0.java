package p204p;

import io.reactivex.rxjava3.core.Notification;

/* JADX INFO: loaded from: classes10.dex */
public final class zmk0 extends bnk0 {

    /* JADX INFO: renamed from: a */
    public final Notification f284312a;

    public zmk0(Notification notification) {
        this.f284312a = notification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmk0) && wj50.m88271j(this.f284312a, ((zmk0) obj).f284312a);
    }

    public final int hashCode() {
        return this.f284312a.hashCode();
    }
}
