package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Predicate;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public class AppendOnlyLinkedArrayList<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f10245a;

    /* JADX INFO: renamed from: b */
    public Object[] f10246b;

    /* JADX INFO: renamed from: c */
    public int f10247c;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
    }

    public AppendOnlyLinkedArrayList() {
        Object[] objArr = new Object[5];
        this.f10245a = objArr;
        this.f10246b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m23734a(ft51 ft51Var) {
        Object obj;
        Object[] objArr = this.f10245a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj == NotificationLite.f10261a) {
                    ft51Var.onComplete();
                    return true;
                }
                if (obj instanceof NotificationLite.ErrorNotification) {
                    ft51Var.onError(((NotificationLite.ErrorNotification) obj).f10264a);
                    return true;
                }
                if (obj instanceof NotificationLite.SubscriptionNotification) {
                    ft51Var.onSubscribe(((NotificationLite.SubscriptionNotification) obj).f10265a);
                } else {
                    ft51Var.onNext(obj);
                }
            }
            objArr = objArr[4];
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m23735b(Object obj) {
        int i = this.f10247c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.f10246b[4] = objArr;
            this.f10246b = objArr;
            i = 0;
        }
        this.f10246b[i] = obj;
        this.f10247c = i + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m23736c(NonThrowingPredicate nonThrowingPredicate) {
        Object obj;
        for (Object[] objArr = this.f10245a; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (nonThrowingPredicate.test(obj)) {
                    return;
                }
            }
        }
    }
}
