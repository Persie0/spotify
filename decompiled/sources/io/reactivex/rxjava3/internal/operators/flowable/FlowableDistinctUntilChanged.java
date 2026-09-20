package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDistinctUntilChanged<T, K> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Function f7682c;

    /* JADX INFO: renamed from: d */
    public final BiPredicate f7683d;

    public static final class DistinctUntilChangedConditionalSubscriber<T, K> extends BasicFuseableConditionalSubscriber<T, T> {

        /* JADX INFO: renamed from: f */
        public final Function f7684f;

        /* JADX INFO: renamed from: g */
        public final BiPredicate f7685g;

        /* JADX INFO: renamed from: h */
        public Object f7686h;

        /* JADX INFO: renamed from: i */
        public boolean f7687i;

        public DistinctUntilChangedConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Function function, BiPredicate biPredicate) {
            super(conditionalSubscriber);
            this.f7684f = function;
            this.f7685g = biPredicate;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo23502f(Object obj) {
            if (this.f10197d) {
                return false;
            }
            int i = this.f10198e;
            ConditionalSubscriber conditionalSubscriber = this.f10194a;
            if (i != 0) {
                return conditionalSubscriber.mo23502f(obj);
            }
            try {
                Object objMo98394apply = this.f7684f.mo98394apply(obj);
                if (this.f7687i) {
                    boolean zTest = this.f7685g.test(this.f7686h, objMo98394apply);
                    this.f7686h = objMo98394apply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f7687i = true;
                    this.f7686h = objMo98394apply;
                }
                conditionalSubscriber.onNext(obj);
                return true;
            } catch (Throwable th) {
                m23719b(th);
                return true;
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (mo23502f(obj)) {
                return;
            }
            this.f10195b.request(1L);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            while (true) {
                Object objPoll = this.f10196c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objMo98394apply = this.f7684f.mo98394apply(objPoll);
                if (!this.f7687i) {
                    this.f7687i = true;
                    this.f7686h = objMo98394apply;
                    return objPoll;
                }
                if (!this.f7685g.test(this.f7686h, objMo98394apply)) {
                    this.f7686h = objMo98394apply;
                    return objPoll;
                }
                this.f7686h = objMo98394apply;
                if (this.f10198e != 1) {
                    this.f10195b.request(1L);
                }
            }
        }
    }

    public static final class DistinctUntilChangedSubscriber<T, K> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {

        /* JADX INFO: renamed from: f */
        public final Function f7688f;

        /* JADX INFO: renamed from: g */
        public final BiPredicate f7689g;

        /* JADX INFO: renamed from: h */
        public Object f7690h;

        /* JADX INFO: renamed from: i */
        public boolean f7691i;

        public DistinctUntilChangedSubscriber(ft51 ft51Var, Function function, BiPredicate biPredicate) {
            super(ft51Var);
            this.f7688f = function;
            this.f7689g = biPredicate;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo23502f(Object obj) {
            if (this.f10202d) {
                return false;
            }
            int i = this.f10203e;
            ft51 ft51Var = this.f10199a;
            if (i != 0) {
                ft51Var.onNext(obj);
                return true;
            }
            try {
                Object objMo98394apply = this.f7688f.mo98394apply(obj);
                if (this.f7691i) {
                    boolean zTest = this.f7689g.test(this.f7690h, objMo98394apply);
                    this.f7690h = objMo98394apply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f7691i = true;
                    this.f7690h = objMo98394apply;
                }
                ft51Var.onNext(obj);
                return true;
            } catch (Throwable th) {
                m23720b(th);
                return true;
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (mo23502f(obj)) {
                return;
            }
            this.f10200b.request(1L);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            while (true) {
                Object objPoll = this.f10201c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objMo98394apply = this.f7688f.mo98394apply(objPoll);
                if (!this.f7691i) {
                    this.f7691i = true;
                    this.f7690h = objMo98394apply;
                    return objPoll;
                }
                if (!this.f7689g.test(this.f7690h, objMo98394apply)) {
                    this.f7690h = objMo98394apply;
                    return objPoll;
                }
                this.f7690h = objMo98394apply;
                if (this.f10203e != 1) {
                    this.f10200b.request(1L);
                }
            }
        }
    }

    public FlowableDistinctUntilChanged(Flowable flowable, Function function, BiPredicate biPredicate) {
        super(flowable);
        this.f7682c = function;
        this.f7683d = biPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        boolean z = ft51Var instanceof ConditionalSubscriber;
        BiPredicate biPredicate = this.f7683d;
        Function function = this.f7682c;
        Flowable flowable = this.f7529b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new DistinctUntilChangedConditionalSubscriber((ConditionalSubscriber) ft51Var, function, biPredicate));
        } else {
            flowable.subscribe((FlowableSubscriber) new DistinctUntilChangedSubscriber(ft51Var, function, biPredicate));
        }
    }
}
