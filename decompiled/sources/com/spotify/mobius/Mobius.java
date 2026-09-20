package com.spotify.mobius;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.internal_util.ImmutableUtil;
import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.runners.ExecutorServiceWorkRunner;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p204p.m3n;
import p204p.yps;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Mobius {

    /* JADX INFO: renamed from: a */
    public static final C1032b f5572a = new C1032b();

    /* JADX INFO: renamed from: b */
    public static final MobiusLoop.Logger f5573b = new MobiusLoop.Logger<Object, Object, Object>() { // from class: com.spotify.mobius.Mobius.2
        @Override // com.spotify.mobius.MobiusLoop.Logger
        /* JADX INFO: renamed from: a */
        public final void mo15583a(Object obj, Object obj2, Next next) {
        }

        @Override // com.spotify.mobius.MobiusLoop.Logger
        /* JADX INFO: renamed from: b */
        public final void mo15584b(Object obj, Object obj2, Exception exc) {
            System.err.println("error updating model: '" + obj + "' with event: '" + obj2 + "' - " + exc);
            exc.printStackTrace(System.err);
        }

        @Override // com.spotify.mobius.MobiusLoop.Logger
        /* JADX INFO: renamed from: c */
        public final void mo15585c(Object obj, First first) {
        }

        @Override // com.spotify.mobius.MobiusLoop.Logger
        /* JADX INFO: renamed from: d */
        public final void mo15586d(Object obj, Object obj2) {
        }

        @Override // com.spotify.mobius.MobiusLoop.Logger
        /* JADX INFO: renamed from: e */
        public final void mo15587e(Object obj) {
        }

        @Override // com.spotify.mobius.MobiusLoop.Logger
        /* JADX INFO: renamed from: f */
        public final void mo15588f(Object obj, Exception exc) {
            System.err.println("error initialising from model: '" + obj + "' - " + exc);
            exc.printStackTrace(System.err);
        }
    };

    public static final class Builder<M, E, F> implements MobiusLoop.Builder<M, E, F> {

        /* JADX INFO: renamed from: a */
        public final Update f5574a;

        /* JADX INFO: renamed from: b */
        public final Connectable f5575b;

        /* JADX INFO: renamed from: c */
        public final Init f5576c;

        /* JADX INFO: renamed from: d */
        public final Connectable f5577d;

        /* JADX INFO: renamed from: e */
        public final Producer f5578e;

        /* JADX INFO: renamed from: f */
        public final Producer f5579f;

        /* JADX INFO: renamed from: g */
        public final MobiusLoop.Logger f5580g;

        public Builder(Update update, Connectable connectable, Init init, Connectable connectable2, MobiusLoop.Logger logger, Producer producer, Producer producer2) {
            Preconditions.m15649b(update);
            this.f5574a = update;
            Preconditions.m15649b(connectable);
            this.f5575b = connectable;
            this.f5576c = init;
            Preconditions.m15649b(connectable2);
            this.f5577d = connectable2;
            Preconditions.m15649b(producer);
            this.f5578e = producer;
            Preconditions.m15649b(producer2);
            this.f5579f = producer2;
            Preconditions.m15649b(logger);
            this.f5580g = logger;
        }

        @Override // com.spotify.mobius.MobiusLoop.Factory
        /* JADX INFO: renamed from: a */
        public final MobiusLoop mo15589a(Object obj, Set set) {
            if (this.f5576c == null) {
                return m15598j(obj, set);
            }
            throw new IllegalArgumentException("cannot pass in start effects when a loop has init defined");
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        /* JADX INFO: renamed from: b */
        public final MobiusLoop.Builder mo15590b(Producer producer) {
            return new Builder(this.f5574a, this.f5575b, this.f5576c, this.f5577d, this.f5580g, this.f5578e, producer);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        /* JADX INFO: renamed from: c */
        public final MobiusLoop.Builder mo15591c(EventSource eventSource, EventSource... eventSourceArr) {
            return new Builder(this.f5574a, this.f5575b, this.f5576c, new EventSourceConnectable(MergedEventSource.m15578b(eventSource, eventSourceArr)), this.f5580g, this.f5578e, this.f5579f);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        /* JADX INFO: renamed from: d */
        public final MobiusLoop.Builder mo15592d(Producer producer) {
            return new Builder(this.f5574a, this.f5575b, this.f5576c, this.f5577d, this.f5580g, producer, this.f5579f);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        /* JADX INFO: renamed from: e */
        public final MobiusLoop.Builder mo15593e(Init init) {
            return new Builder(this.f5574a, this.f5575b, init, this.f5577d, this.f5580g, this.f5578e, this.f5579f);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        /* JADX INFO: renamed from: f */
        public final MobiusLoop.Builder mo15594f(MobiusLoop.Logger logger) {
            return new Builder(this.f5574a, this.f5575b, this.f5576c, this.f5577d, logger, this.f5578e, this.f5579f);
        }

        @Override // com.spotify.mobius.MobiusLoop.Factory
        /* JADX INFO: renamed from: g */
        public final MobiusLoop mo15595g(Object obj) {
            ImmutableUtil.m15646a();
            Set set = Collections.EMPTY_SET;
            Init init = this.f5576c;
            if (init != null) {
                LoggingInit loggingInit = new LoggingInit(init, this.f5580g);
                Preconditions.m15649b(obj);
                AutoValue_First autoValue_First = (AutoValue_First) loggingInit.mo15576f0(obj);
                Object obj2 = autoValue_First.f5529a;
                set = autoValue_First.f5530b;
                obj = obj2;
            }
            return m15598j(obj, set);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        /* JADX INFO: renamed from: h */
        public final MobiusLoop.Builder mo15596h(EventSource eventSource) {
            return new Builder(this.f5574a, this.f5575b, this.f5576c, new EventSourceConnectable(eventSource), this.f5580g, this.f5578e, this.f5579f);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        /* JADX INFO: renamed from: i */
        public final MobiusLoop.Builder mo15597i(Connectable connectable) {
            return new Builder(this.f5574a, this.f5575b, this.f5576c, connectable, this.f5580g, this.f5578e, this.f5579f);
        }

        /* JADX INFO: renamed from: j */
        public final MobiusLoop m15598j(Object obj, Set set) {
            LoggingUpdate loggingUpdate = new LoggingUpdate(this.f5574a, this.f5580g);
            WorkRunner workRunner = (WorkRunner) this.f5578e.get();
            Preconditions.m15649b(workRunner);
            WorkRunner workRunner2 = (WorkRunner) this.f5579f.get();
            Preconditions.m15649b(workRunner2);
            Preconditions.m15649b(obj);
            EventProcessor.Factory factory = new EventProcessor.Factory(new MobiusStore(loggingUpdate, obj));
            Preconditions.m15649b(set);
            Connectable connectable = this.f5575b;
            Preconditions.m15649b(connectable);
            Connectable connectable2 = this.f5577d;
            Preconditions.m15649b(connectable2);
            return new MobiusLoop(factory, obj, set, connectable, connectable2, workRunner, workRunner2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static MobiusLoop.Controller m15579a(MobiusLoop.Factory factory, Object obj, Init init) {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
        return new MobiusLoopController(factory, obj, init, new ImmediateWorkRunner());
    }

    /* JADX INFO: renamed from: b */
    public static MobiusLoop.Controller m15580b(MobiusLoop.Factory factory, Object obj, Init init, WorkRunner workRunner) {
        return new MobiusLoopController(factory, obj, init, workRunner);
    }

    /* JADX INFO: renamed from: c */
    public static MobiusLoop.Controller m15581c(MobiusLoop.Factory factory, Object obj, WorkRunner workRunner) {
        return new MobiusLoopController(factory, obj, null, workRunner);
    }

    /* JADX INFO: renamed from: d */
    public static MobiusLoop.Builder m15582d(Update update, Connectable connectable) {
        return new Builder(update, connectable, null, f5572a, f5573b, new Producer<WorkRunner>() { // from class: com.spotify.mobius.Mobius.3
            @Override // com.spotify.mobius.functions.Producer
            public final Object get() {
                yps ypsVar = MobiusPlugins.f5612b;
                return ypsVar != null ? (WorkRunner) ypsVar.get() : WorkRunners.m15651a();
            }
        }, new Producer<WorkRunner>() { // from class: com.spotify.mobius.Mobius.4
            @Override // com.spotify.mobius.functions.Producer
            public final Object get() {
                m3n m3nVar = MobiusPlugins.f5611a;
                if (m3nVar != null) {
                    return (WorkRunner) m3nVar.get();
                }
                ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(WorkRunners.f5771a);
                Preconditions.m15649b(executorServiceNewCachedThreadPool);
                return new ExecutorServiceWorkRunner(executorServiceNewCachedThreadPool);
            }
        });
    }
}
