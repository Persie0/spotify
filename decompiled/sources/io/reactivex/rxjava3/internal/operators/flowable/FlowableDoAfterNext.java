package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import p204p.ft51;
import p204p.vpy0;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDoAfterNext<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final vpy0 f7692c;

    public static final class DoAfterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {

        /* JADX INFO: renamed from: f */
        public final Consumer f7693f;

        public DoAfterConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, vpy0 vpy0Var) {
            super(conditionalSubscriber);
            this.f7693f = vpy0Var;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo23502f(Object obj) {
            boolean zMo23502f = this.f10194a.mo23502f(obj);
            try {
                this.f7693f.accept(obj);
                return zMo23502f;
            } catch (Throwable th) {
                m23719b(th);
                return zMo23502f;
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f10194a.onNext(obj);
            if (this.f10198e == 0) {
                try {
                    this.f7693f.accept(obj);
                } catch (Throwable th) {
                    m23719b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f10196c.poll();
            if (objPoll != null) {
                this.f7693f.accept(objPoll);
            }
            return objPoll;
        }
    }

    public static final class DoAfterSubscriber<T> extends BasicFuseableSubscriber<T, T> {

        /* JADX INFO: renamed from: f */
        public final Consumer f7694f;

        public DoAfterSubscriber(ft51 ft51Var, vpy0 vpy0Var) {
            super(ft51Var);
            this.f7694f = vpy0Var;
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f10202d) {
                return;
            }
            this.f10199a.onNext(obj);
            if (this.f10203e == 0) {
                try {
                    this.f7694f.accept(obj);
                } catch (Throwable th) {
                    m23720b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f10201c.poll();
            if (objPoll != null) {
                this.f7694f.accept(objPoll);
            }
            return objPoll;
        }
    }

    public FlowableDoAfterNext(FlowableDoOnEach flowableDoOnEach, vpy0 vpy0Var) {
        super(flowableDoOnEach);
        this.f7692c = vpy0Var;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        boolean z = ft51Var instanceof ConditionalSubscriber;
        vpy0 vpy0Var = this.f7692c;
        Flowable flowable = this.f7529b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new DoAfterConditionalSubscriber((ConditionalSubscriber) ft51Var, vpy0Var));
        } else {
            flowable.subscribe((FlowableSubscriber) new DoAfterSubscriber(ft51Var, vpy0Var));
        }
    }
}
