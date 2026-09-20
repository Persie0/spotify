package com.spotify.mobius.rx3;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.Preconditions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p204p.ajz;
import p204p.bo90;
import p204p.tg3;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RxConnectables {

    /* JADX INFO: renamed from: com.spotify.mobius.rx3.RxConnectables$1 */
    class C10511 implements Connectable<Object, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ObservableTransformer f5784a;

        public C10511(ObservableTransformer observableTransformer) {
            this.f5784a = observableTransformer;
        }

        @Override // com.spotify.mobius.Connectable
        /* JADX INFO: renamed from: P */
        public final Connection mo3269P(final Consumer consumer) {
            final PublishSubject publishSubject = new PublishSubject();
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            final Disposable disposableSubscribe = publishSubject.compose(this.f5784a).subscribe((io.reactivex.rxjava3.functions.Consumer<? super R>) new io.reactivex.rxjava3.functions.Consumer<Object>() { // from class: com.spotify.mobius.rx3.RxConnectables.1.1
                @Override // io.reactivex.rxjava3.functions.Consumer
                public final void accept(Object obj) {
                    synchronized (atomicBoolean) {
                        try {
                            if (!atomicBoolean.get()) {
                                consumer.accept(obj);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
            return new Connection<Object>() { // from class: com.spotify.mobius.rx3.RxConnectables.1.2
                @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
                public final void accept(Object obj) {
                    publishSubject.onNext(obj);
                }

                @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
                public final void dispose() {
                    synchronized (atomicBoolean) {
                        atomicBoolean.set(true);
                    }
                    disposableSubscribe.dispose();
                }
            };
        }
    }

    /* JADX INFO: renamed from: a */
    public static Connectable m15653a(ObservableTransformer observableTransformer) {
        Preconditions.m15649b(observableTransformer);
        return new DiscardAfterDisposeConnectable(new C10511(observableTransformer));
    }

    /* JADX INFO: renamed from: b */
    public static ObservableTransformer m15654b(final bo90 bo90Var) {
        return new ObservableTransformer<Object, Object>() { // from class: com.spotify.mobius.rx3.RxConnectables.2
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource apply(final Observable observable) {
                return Observable.create(new ObservableOnSubscribe<Object>() { // from class: com.spotify.mobius.rx3.RxConnectables.2.1
                    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
                    public final void subscribe(final ObservableEmitter<Object> observableEmitter) {
                        Objects.requireNonNull(observableEmitter);
                        final ajz ajzVar = new ajz(observableEmitter, 2);
                        final AtomicBoolean atomicBoolean = new AtomicBoolean();
                        final tg3 tg3Var = new tg3(bo90Var, new Consumer() { // from class: p.zvx0
                            @Override // com.spotify.mobius.functions.Consumer
                            public final void accept(Object obj) {
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                ajz ajzVar2 = ajzVar;
                                synchronized (atomicBoolean2) {
                                    try {
                                        if (!atomicBoolean2.get()) {
                                            ajzVar2.accept(obj);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        });
                        final Disposable disposableSubscribe = observable.subscribe(new io.reactivex.rxjava3.functions.Consumer<Object>() { // from class: com.spotify.mobius.rx3.RxConnectables.2.1.1
                            @Override // io.reactivex.rxjava3.functions.Consumer
                            public final void accept(Object obj) {
                                tg3Var.accept(obj);
                            }
                        }, new io.reactivex.rxjava3.functions.Consumer<Throwable>() { // from class: com.spotify.mobius.rx3.RxConnectables.2.1.2
                            @Override // io.reactivex.rxjava3.functions.Consumer
                            public final void accept(Object obj) {
                                observableEmitter.onError((Throwable) obj);
                            }
                        }, new Action() { // from class: com.spotify.mobius.rx3.RxConnectables.2.1.3
                            @Override // io.reactivex.rxjava3.functions.Action
                            public final void run() {
                                observableEmitter.onComplete();
                            }
                        });
                        observableEmitter.setCancellable(new Cancellable() { // from class: com.spotify.mobius.rx3.RxConnectables.2.1.4
                            @Override // io.reactivex.rxjava3.functions.Cancellable
                            public final void cancel() {
                                synchronized (atomicBoolean) {
                                    atomicBoolean.set(true);
                                }
                                disposableSubscribe.dispose();
                                tg3Var.dispose();
                            }
                        });
                    }
                });
            }
        };
    }
}
