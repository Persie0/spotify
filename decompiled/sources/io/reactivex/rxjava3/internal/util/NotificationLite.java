package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.Serializable;
import java.util.Objects;
import p204p.ft51;
import p204p.ot51;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class NotificationLite {

    /* JADX INFO: renamed from: a */
    public static final NotificationLite f10261a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ NotificationLite[] f10262b;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class DisposableNotification implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Disposable f10263a;

        public DisposableNotification(Disposable disposable) {
            this.f10263a = disposable;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.f10263a + "]";
        }
    }

    public static final class ErrorNotification implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Throwable f10264a;

        public ErrorNotification(Throwable th) {
            this.f10264a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return Objects.equals(this.f10264a, ((ErrorNotification) obj).f10264a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f10264a.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.f10264a + "]";
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class SubscriptionNotification implements Serializable {

        /* JADX INFO: renamed from: a */
        public final ot51 f10265a;

        public SubscriptionNotification(ot51 ot51Var) {
            this.f10265a = ot51Var;
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.f10265a + "]";
        }
    }

    static {
        NotificationLite notificationLite = new NotificationLite("COMPLETE", 0);
        f10261a = notificationLite;
        f10262b = new NotificationLite[]{notificationLite};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23759a(Observer observer, Object obj) {
        if (obj == f10261a) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f10264a);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m23760b(Object obj, ft51 ft51Var) {
        if (obj == f10261a) {
            ft51Var.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            ft51Var.onError(((ErrorNotification) obj).f10264a);
            return true;
        }
        ft51Var.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m23761c(Observer observer, Object obj) {
        if (obj == f10261a) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f10264a);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.onSubscribe(((DisposableNotification) obj).f10263a);
            return false;
        }
        observer.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static Object m23762d(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    /* JADX INFO: renamed from: e */
    public static Object m23763e(Throwable th) {
        return new ErrorNotification(th);
    }

    /* JADX INFO: renamed from: f */
    public static Throwable m23764f(Object obj) {
        return ((ErrorNotification) obj).f10264a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m23765g(Object obj) {
        return obj == f10261a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m23766h(Object obj) {
        return obj instanceof ErrorNotification;
    }

    /* JADX INFO: renamed from: i */
    public static Object m23767i(ot51 ot51Var) {
        return new SubscriptionNotification(ot51Var);
    }

    public static NotificationLite valueOf(String str) {
        return (NotificationLite) Enum.valueOf(NotificationLite.class, str);
    }

    public static NotificationLite[] values() {
        return (NotificationLite[]) f10262b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
