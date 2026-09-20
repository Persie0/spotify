package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.ScalarSubscription;
import java.util.Objects;
import p204p.ft51;
import p204p.i7t0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FlowableScalarXMap {

    /* JADX INFO: loaded from: classes11.dex */
    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {

        /* JADX INFO: renamed from: b */
        public final Object f8063b;

        /* JADX INFO: renamed from: c */
        public final Function f8064c;

        public ScalarXMapFlowable(Object obj, Function function) {
            this.f8063b = obj;
            this.f8064c = function;
        }

        @Override // io.reactivex.rxjava3.core.Flowable
        /* JADX INFO: renamed from: V */
        public final void mo23341V(ft51 ft51Var) {
            EmptySubscription emptySubscription = EmptySubscription.f10231a;
            try {
                Object objMo98394apply = this.f8064c.mo98394apply(this.f8063b);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null Publisher");
                i7t0 i7t0Var = (i7t0) objMo98394apply;
                if (!(i7t0Var instanceof Supplier)) {
                    i7t0Var.subscribe(ft51Var);
                    return;
                }
                try {
                    Object obj = ((Supplier) i7t0Var).get();
                    if (obj != null) {
                        ft51Var.onSubscribe(new ScalarSubscription(obj, ft51Var));
                    } else {
                        ft51Var.onSubscribe(emptySubscription);
                        ft51Var.onComplete();
                    }
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    ft51Var.onSubscribe(emptySubscription);
                    ft51Var.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                ft51Var.onSubscribe(emptySubscription);
                ft51Var.onError(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Flowable m23556a(Object obj, Function function) {
        return new ScalarXMapFlowable(obj, function);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m23557b(i7t0 i7t0Var, ft51 ft51Var, Function function) {
        EmptySubscription emptySubscription = EmptySubscription.f10231a;
        if (!(i7t0Var instanceof Supplier)) {
            return false;
        }
        try {
            Object obj = ((Supplier) i7t0Var).get();
            if (obj == null) {
                ft51Var.onSubscribe(emptySubscription);
                ft51Var.onComplete();
                return true;
            }
            try {
                Object objMo98394apply = function.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null Publisher");
                i7t0 i7t0Var2 = (i7t0) objMo98394apply;
                if (!(i7t0Var2 instanceof Supplier)) {
                    i7t0Var2.subscribe(ft51Var);
                    return true;
                }
                try {
                    Object obj2 = ((Supplier) i7t0Var2).get();
                    if (obj2 != null) {
                        ft51Var.onSubscribe(new ScalarSubscription(obj2, ft51Var));
                        return true;
                    }
                    ft51Var.onSubscribe(emptySubscription);
                    ft51Var.onComplete();
                    return true;
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    ft51Var.onSubscribe(emptySubscription);
                    ft51Var.onError(th);
                    return true;
                }
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                ft51Var.onSubscribe(emptySubscription);
                ft51Var.onError(th2);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.m23404a(th3);
            ft51Var.onSubscribe(emptySubscription);
            ft51Var.onError(th3);
            return true;
        }
    }
}
