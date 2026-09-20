package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Notification<T> {

    /* JADX INFO: renamed from: b */
    public static final Notification f7193b = new Notification(null);

    /* JADX INFO: renamed from: a */
    public final Object f7194a;

    public Notification(Object obj) {
        this.f7194a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static Notification m23377a(Throwable th) {
        Objects.requireNonNull(th, "error is null");
        return new Notification(NotificationLite.m23763e(th));
    }

    /* JADX INFO: renamed from: b */
    public static Notification m23378b(Object obj) {
        Objects.requireNonNull(obj, "value is null");
        return new Notification(obj);
    }

    /* JADX INFO: renamed from: c */
    public final Throwable m23379c() {
        Object obj = this.f7194a;
        if (NotificationLite.m23766h(obj)) {
            return NotificationLite.m23764f(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Object m23380d() {
        Object obj = this.f7194a;
        if (obj == null || NotificationLite.m23766h(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m23381e() {
        Object obj = this.f7194a;
        return (obj == null || NotificationLite.m23766h(obj)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Notification) {
            return Objects.equals(this.f7194a, ((Notification) obj).f7194a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f7194a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f7194a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.m23766h(obj)) {
            return "OnErrorNotification[" + NotificationLite.m23764f(obj) + "]";
        }
        return "OnNextNotification[" + obj + "]";
    }
}
