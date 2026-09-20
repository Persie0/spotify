package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableMap<T, U> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: renamed from: b */
    public final Function f9166b;

    public static final class MapObserver<T, U> extends BasicFuseableObserver<T, U> {

        /* JADX INFO: renamed from: f */
        public final Function f9167f;

        public MapObserver(Observer observer, Function function) {
            super(observer);
            this.f9167f = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f7346d) {
                return;
            }
            int i = this.f7347e;
            Observer observer = this.f7343a;
            if (i != 0) {
                observer.onNext(null);
                return;
            }
            try {
                Object objMo98394apply = this.f9167f.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper function returned a null value.");
                observer.onNext(objMo98394apply);
            } catch (Throwable th) {
                m23459b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f7345c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objMo98394apply = this.f9167f.mo98394apply(objPoll);
            Objects.requireNonNull(objMo98394apply, "The mapper function returned a null value.");
            return objMo98394apply;
        }
    }

    public ObservableMap(ObservableSource observableSource, Function function) {
        super(observableSource);
        this.f9166b = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.f8521a.subscribe(new MapObserver(observer, this.f9166b));
    }
}
