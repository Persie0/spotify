package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleToObservable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class ScalarXMapZHelper {
    /* JADX INFO: renamed from: a */
    public static boolean m23590a(Object obj, Function function, CompletableObserver completableObserver) {
        CompletableSource completableSource;
        EmptyDisposable emptyDisposable = EmptyDisposable.f7220a;
        if (!(obj instanceof Supplier)) {
            return false;
        }
        try {
            Object obj2 = ((Supplier) obj).get();
            if (obj2 != null) {
                Object objMo98394apply = function.mo98394apply(obj2);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null CompletableSource");
                completableSource = (CompletableSource) objMo98394apply;
            } else {
                completableSource = null;
            }
            if (completableSource != null) {
                completableSource.subscribe(completableObserver);
                return true;
            }
            completableObserver.onSubscribe(emptyDisposable);
            completableObserver.onComplete();
            return true;
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            completableObserver.onSubscribe(emptyDisposable);
            completableObserver.onError(th);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m23591b(Object obj, Function function, Observer observer) {
        MaybeSource maybeSource;
        if (!(obj instanceof Supplier)) {
            return false;
        }
        try {
            Object obj2 = ((Supplier) obj).get();
            if (obj2 != null) {
                Object objMo98394apply = function.mo98394apply(obj2);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null MaybeSource");
                maybeSource = (MaybeSource) objMo98394apply;
            } else {
                maybeSource = null;
            }
            if (maybeSource == null) {
                EmptyDisposable.m23420b(observer);
                return true;
            }
            maybeSource.subscribe(MaybeToObservable.m23573a(observer));
            return true;
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            EmptyDisposable.m23421c(th, observer);
            return true;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m23592c(Object obj, Function function, Observer observer) {
        SingleSource singleSource;
        if (!(obj instanceof Supplier)) {
            return false;
        }
        try {
            Object obj2 = ((Supplier) obj).get();
            if (obj2 != null) {
                Object objMo98394apply = function.mo98394apply(obj2);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null SingleSource");
                singleSource = (SingleSource) objMo98394apply;
            } else {
                singleSource = null;
            }
            if (singleSource == null) {
                EmptyDisposable.m23420b(observer);
                return true;
            }
            singleSource.subscribe(SingleToObservable.m23710a(observer));
            return true;
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            EmptyDisposable.m23421c(th, observer);
            return true;
        }
    }
}
