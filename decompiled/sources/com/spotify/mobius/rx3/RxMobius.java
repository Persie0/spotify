package com.spotify.mobius.rx3;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Update;
import com.spotify.mobius.internal_util.Preconditions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.HashMap;
import p204p.jgc1;
import p204p.sfc1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RxMobius {

    public static class SubtypeEffectHandlerBuilder<F, E> {

        /* JADX INFO: renamed from: a */
        public final HashMap f5800a;

        /* JADX INFO: renamed from: b */
        public final C1060b f5801b;

        /* JADX INFO: renamed from: com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder$2 */
        class C10542 implements Consumer<Throwable> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ObservableTransformer f5802a;

            public C10542(ObservableTransformer observableTransformer) {
                this.f5802a = observableTransformer;
            }

            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(Object obj) {
                RxJavaPlugins.m23782b(EffectHandlerException.m15652a(this.f5802a, (Throwable) obj));
            }
        }

        public /* synthetic */ SubtypeEffectHandlerBuilder(int i) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m15659a(Class cls, Action action) {
            m15665g(cls, Transformers.m15668b(action));
        }

        /* JADX INFO: renamed from: b */
        public final void m15660b(Class cls, Action action, Scheduler scheduler) {
            m15665g(cls, Transformers.m15667a(scheduler, action));
        }

        /* JADX INFO: renamed from: c */
        public final void m15661c(Class cls, Consumer consumer) {
            Preconditions.m15649b(consumer);
            m15665g(cls, Transformers.m15669c(consumer));
        }

        /* JADX INFO: renamed from: d */
        public final void m15662d(Class cls, Consumer consumer, Scheduler scheduler) {
            Preconditions.m15649b(consumer);
            m15665g(cls, Transformers.m15670d(consumer, scheduler));
        }

        /* JADX INFO: renamed from: e */
        public final void m15663e(Class cls, Function function) {
            Preconditions.m15649b(function);
            m15665g(cls, Transformers.m15671e(function));
        }

        /* JADX INFO: renamed from: f */
        public final void m15664f(jgc1 jgc1Var, Scheduler scheduler) {
            m15665g(sfc1.class, Transformers.m15672f(jgc1Var, scheduler));
        }

        /* JADX INFO: renamed from: g */
        public final void m15665g(final Class cls, final ObservableTransformer observableTransformer) {
            Preconditions.m15649b(cls);
            Preconditions.m15649b(observableTransformer);
            HashMap map = this.f5800a;
            for (Class<?> cls2 : map.keySet()) {
                if (cls2.isAssignableFrom(cls) || cls.isAssignableFrom(cls2)) {
                    throw new IllegalArgumentException("Effect classes may not be assignable to each other, collision found: " + cls.getSimpleName() + " <-> " + cls2.getSimpleName());
                }
            }
            map.put(cls, new ObservableTransformer() { // from class: com.spotify.mobius.rx3.c
                @Override // io.reactivex.rxjava3.core.ObservableTransformer
                public final ObservableSource apply(Observable observable) {
                    Observable observableOfType = observable.ofType(cls);
                    ObservableTransformer observableTransformer2 = observableTransformer;
                    Observable observableCompose = observableOfType.compose(observableTransformer2);
                    this.f5829a.f5801b.getClass();
                    return observableCompose.doOnError(new RxMobius.SubtypeEffectHandlerBuilder.C10542(observableTransformer2));
                }
            });
        }

        /* JADX INFO: renamed from: h */
        public final ObservableTransformer m15666h() {
            HashMap map = this.f5800a;
            return new MobiusEffectRouter(map.keySet(), map.values());
        }

        private SubtypeEffectHandlerBuilder() {
            this.f5800a = new HashMap();
            this.f5801b = new C1060b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static MobiusLoop.Builder m15656a(Update update, ObservableTransformer observableTransformer) {
        return Mobius.m15582d(update, RxConnectables.m15653a(observableTransformer));
    }

    /* JADX INFO: renamed from: b */
    public static ObservableTransformer m15657b(MobiusLoop.Factory factory, Object obj) {
        return new RxMobiusLoop(factory, obj);
    }

    /* JADX INFO: renamed from: c */
    public static SubtypeEffectHandlerBuilder m15658c() {
        return new SubtypeEffectHandlerBuilder(0);
    }
}
