package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDoOnEach<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Consumer f7706c;

    /* JADX INFO: renamed from: d */
    public final Consumer f7707d;

    /* JADX INFO: renamed from: e */
    public final Action f7708e;

    /* JADX INFO: renamed from: f */
    public final Action f7709f;

    public static final class DoOnEachConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {

        /* JADX INFO: renamed from: f */
        public final Consumer f7710f;

        /* JADX INFO: renamed from: g */
        public final Consumer f7711g;

        /* JADX INFO: renamed from: h */
        public final Action f7712h;

        /* JADX INFO: renamed from: i */
        public final Action f7713i;

        public DoOnEachConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Consumer consumer, Consumer consumer2, Action action, Action action2) {
            super(conditionalSubscriber);
            this.f7710f = consumer;
            this.f7711g = consumer2;
            this.f7712h = action;
            this.f7713i = action2;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo23502f(Object obj) {
            if (this.f10197d) {
                return false;
            }
            try {
                this.f7710f.accept(obj);
                return this.f10194a.mo23502f(obj);
            } catch (Throwable th) {
                m23719b(th);
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber, p204p.ft51
        public final void onComplete() {
            if (this.f10197d) {
                return;
            }
            try {
                this.f7712h.run();
                this.f10197d = true;
                this.f10194a.onComplete();
                try {
                    this.f7713i.run();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
            } catch (Throwable th2) {
                m23719b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber, p204p.ft51
        public final void onError(Throwable th) {
            ConditionalSubscriber conditionalSubscriber = this.f10194a;
            if (this.f10197d) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f10197d = true;
            try {
                this.f7711g.accept(th);
                conditionalSubscriber.onError(th);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                conditionalSubscriber.onError(new CompositeException(th, th2));
            }
            try {
                this.f7713i.run();
            } catch (Throwable th3) {
                Exceptions.m23404a(th3);
                RxJavaPlugins.m23782b(th3);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f10197d) {
                return;
            }
            int i = this.f10198e;
            ConditionalSubscriber conditionalSubscriber = this.f10194a;
            if (i != 0) {
                conditionalSubscriber.onNext(null);
                return;
            }
            try {
                this.f7710f.accept(obj);
                conditionalSubscriber.onNext(obj);
            } catch (Throwable th) {
                m23719b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() throws Exception {
            Consumer consumer = this.f7711g;
            try {
                Object objPoll = this.f10196c.poll();
                Action action = this.f7713i;
                if (objPoll == null) {
                    if (this.f10198e == 1) {
                        this.f7712h.run();
                        action.run();
                    }
                    return objPoll;
                }
                try {
                    this.f7710f.accept(objPoll);
                    action.run();
                    return objPoll;
                } catch (Throwable th) {
                    try {
                        Exceptions.m23404a(th);
                        try {
                            consumer.accept(th);
                            Throwable th2 = ExceptionHelper.f10258a;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th3) {
                            Exceptions.m23404a(th3);
                            throw new CompositeException(th, th3);
                        }
                    } catch (Throwable th4) {
                        action.run();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                Exceptions.m23404a(th5);
                try {
                    consumer.accept(th5);
                    Throwable th6 = ExceptionHelper.f10258a;
                    if (th5 instanceof Exception) {
                        throw th5;
                    }
                    throw th5;
                } catch (Throwable th7) {
                    Exceptions.m23404a(th7);
                    throw new CompositeException(th5, th7);
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class DoOnEachSubscriber<T> extends BasicFuseableSubscriber<T, T> {

        /* JADX INFO: renamed from: f */
        public final Consumer f7714f;

        /* JADX INFO: renamed from: g */
        public final Consumer f7715g;

        /* JADX INFO: renamed from: h */
        public final Action f7716h;

        /* JADX INFO: renamed from: i */
        public final Action f7717i;

        public DoOnEachSubscriber(ft51 ft51Var, Consumer consumer, Consumer consumer2, Action action, Action action2) {
            super(ft51Var);
            this.f7714f = consumer;
            this.f7715g = consumer2;
            this.f7716h = action;
            this.f7717i = action2;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, p204p.ft51
        public final void onComplete() {
            if (this.f10202d) {
                return;
            }
            try {
                this.f7716h.run();
                this.f10202d = true;
                this.f10199a.onComplete();
                try {
                    this.f7717i.run();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
            } catch (Throwable th2) {
                m23720b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, p204p.ft51
        public final void onError(Throwable th) {
            ft51 ft51Var = this.f10199a;
            if (this.f10202d) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f10202d = true;
            try {
                this.f7715g.accept(th);
                ft51Var.onError(th);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                ft51Var.onError(new CompositeException(th, th2));
            }
            try {
                this.f7717i.run();
            } catch (Throwable th3) {
                Exceptions.m23404a(th3);
                RxJavaPlugins.m23782b(th3);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f10202d) {
                return;
            }
            int i = this.f10203e;
            ft51 ft51Var = this.f10199a;
            if (i != 0) {
                ft51Var.onNext(null);
                return;
            }
            try {
                this.f7714f.accept(obj);
                ft51Var.onNext(obj);
            } catch (Throwable th) {
                m23720b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() throws Exception {
            Consumer consumer = this.f7715g;
            try {
                Object objPoll = this.f10201c.poll();
                Action action = this.f7717i;
                if (objPoll == null) {
                    if (this.f10203e == 1) {
                        this.f7716h.run();
                        action.run();
                    }
                    return objPoll;
                }
                try {
                    this.f7714f.accept(objPoll);
                    action.run();
                    return objPoll;
                } catch (Throwable th) {
                    try {
                        Exceptions.m23404a(th);
                        try {
                            consumer.accept(th);
                            Throwable th2 = ExceptionHelper.f10258a;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th3) {
                            Exceptions.m23404a(th3);
                            throw new CompositeException(th, th3);
                        }
                    } catch (Throwable th4) {
                        action.run();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                Exceptions.m23404a(th5);
                try {
                    consumer.accept(th5);
                    Throwable th6 = ExceptionHelper.f10258a;
                    if (th5 instanceof Exception) {
                        throw th5;
                    }
                    throw th5;
                } catch (Throwable th7) {
                    Exceptions.m23404a(th7);
                    throw new CompositeException(th5, th7);
                }
            }
        }
    }

    public FlowableDoOnEach(Flowable flowable, Consumer consumer, Consumer consumer2, Action action, Action action2) {
        super(flowable);
        this.f7706c = consumer;
        this.f7707d = consumer2;
        this.f7708e = action;
        this.f7709f = action2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        boolean z = ft51Var instanceof ConditionalSubscriber;
        Flowable flowable = this.f7529b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new DoOnEachConditionalSubscriber((ConditionalSubscriber) ft51Var, this.f7706c, this.f7707d, this.f7708e, this.f7709f));
        } else {
            flowable.subscribe((FlowableSubscriber) new DoOnEachSubscriber(ft51Var, this.f7706c, this.f7707d, this.f7708e, this.f7709f));
        }
    }
}
