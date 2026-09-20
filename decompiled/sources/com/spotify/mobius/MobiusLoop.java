package com.spotify.mobius;

import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.runners.WorkRunner;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p204p.fpr;
import p204p.j4x;
import p204p.klh;
import p204p.o7t0;
import p204p.rnh0;

/* JADX INFO: loaded from: classes2.dex */
public class MobiusLoop<M, E, F> implements Loop<M, E, F> {

    /* JADX INFO: renamed from: a */
    public final DiscardAfterDisposeWrapper f5583a;

    /* JADX INFO: renamed from: b */
    public final DiscardAfterDisposeWrapper f5584b;

    /* JADX INFO: renamed from: c */
    public final MessageDispatcher f5585c;

    /* JADX INFO: renamed from: d */
    public final MessageDispatcher f5586d;

    /* JADX INFO: renamed from: e */
    public final EventProcessor f5587e;

    /* JADX INFO: renamed from: f */
    public final Connection f5588f;

    /* JADX INFO: renamed from: g */
    public final QueuingConnection f5589g;

    /* JADX INFO: renamed from: i */
    public volatile Object f5591i;

    /* JADX INFO: renamed from: h */
    public final CopyOnWriteArrayList f5590h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t */
    public volatile RunState f5592t = RunState.f5599a;

    public interface Builder<M, E, F> extends Factory<M, E, F> {
        /* JADX INFO: renamed from: b */
        Builder mo15590b(Producer producer);

        /* JADX INFO: renamed from: c */
        Builder mo15591c(EventSource eventSource, EventSource... eventSourceArr);

        /* JADX INFO: renamed from: d */
        Builder mo15592d(Producer producer);

        /* JADX INFO: renamed from: e */
        Builder mo15593e(Init init);

        /* JADX INFO: renamed from: f */
        Builder mo15594f(Logger logger);

        /* JADX INFO: renamed from: h */
        Builder mo15596h(EventSource eventSource);

        /* JADX INFO: renamed from: i */
        Builder mo15597i(Connectable connectable);
    }

    public interface Controller<M, E> {
        /* JADX INFO: renamed from: a */
        Object mo15602a();

        /* JADX INFO: renamed from: b */
        void mo15603b(fpr fprVar);

        /* JADX INFO: renamed from: c */
        void mo15604c(Connectable connectable);

        void disconnect();

        boolean isRunning();

        void start();

        void stop();
    }

    public interface Factory<M, E, F> {
        /* JADX INFO: renamed from: a */
        MobiusLoop mo15589a(Object obj, Set set);

        /* JADX INFO: renamed from: g */
        MobiusLoop mo15595g(Object obj);
    }

    public interface Logger<M, E, F> {
        /* JADX INFO: renamed from: a */
        void mo15583a(Object obj, Object obj2, Next next);

        /* JADX INFO: renamed from: b */
        void mo15584b(Object obj, Object obj2, Exception exc);

        /* JADX INFO: renamed from: c */
        void mo15585c(Object obj, First first);

        /* JADX INFO: renamed from: d */
        void mo15586d(Object obj, Object obj2);

        /* JADX INFO: renamed from: e */
        void mo15587e(Object obj);

        /* JADX INFO: renamed from: f */
        void mo15588f(Object obj, Exception exc);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunState {

        /* JADX INFO: renamed from: a */
        public static final RunState f5599a;

        /* JADX INFO: renamed from: b */
        public static final RunState f5600b;

        /* JADX INFO: renamed from: c */
        public static final RunState f5601c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ RunState[] f5602d;

        static {
            RunState runState = new RunState("RUNNING", 0);
            f5599a = runState;
            RunState runState2 = new RunState("DISPOSING", 1);
            f5600b = runState2;
            RunState runState3 = new RunState("DISPOSED", 2);
            f5601c = runState3;
            f5602d = new RunState[]{runState, runState2, runState3};
        }

        public static RunState valueOf(String str) {
            return (RunState) Enum.valueOf(RunState.class, str);
        }

        public static RunState[] values() {
            return (RunState[]) f5602d.clone();
        }
    }

    public MobiusLoop(EventProcessor.Factory factory, Object obj, Set set, Connectable connectable, Connectable connectable2, WorkRunner workRunner, WorkRunner workRunner2) {
        DiscardAfterDisposeWrapper discardAfterDisposeWrapper = new DiscardAfterDisposeWrapper(new Consumer<Object>() { // from class: com.spotify.mobius.MobiusLoop.1
            @Override // com.spotify.mobius.functions.Consumer
            public final void accept(Object obj2) {
                Next nextMo15577a;
                EventProcessor eventProcessor = MobiusLoop.this.f5587e;
                synchronized (eventProcessor) {
                    MobiusStore mobiusStore = eventProcessor.f5551a;
                    synchronized (mobiusStore) {
                        Update update = mobiusStore.f5613a;
                        Object obj3 = mobiusStore.f5614b;
                        Preconditions.m15649b(obj2);
                        nextMo15577a = ((LoggingUpdate) update).mo15577a(obj3, obj2);
                        mobiusStore.f5614b = nextMo15577a.m15612f(mobiusStore.f5614b);
                    }
                    nextMo15577a.m15611e(new Consumer<Object>() { // from class: com.spotify.mobius.EventProcessor.1
                        public C10121() {
                        }

                        @Override // com.spotify.mobius.functions.Consumer
                        public final void accept(Object obj4) {
                            EventProcessor.this.f5553c.accept(obj4);
                        }
                    });
                    Iterator it = ((AutoValue_Next) nextMo15577a).f5532b.iterator();
                    while (it.hasNext()) {
                        ((MessageDispatcher) eventProcessor.f5552b).accept(it.next());
                    }
                }
            }
        }, null);
        this.f5583a = discardAfterDisposeWrapper;
        DiscardAfterDisposeWrapper discardAfterDisposeWrapper2 = new DiscardAfterDisposeWrapper(new Consumer<Object>() { // from class: com.spotify.mobius.MobiusLoop.2
            @Override // com.spotify.mobius.functions.Consumer
            public final void accept(Object obj2) {
                try {
                    MobiusLoop.this.f5588f.accept(obj2);
                } catch (Throwable th) {
                    throw new ConnectionException(obj2, th);
                }
            }
        }, null);
        this.f5584b = discardAfterDisposeWrapper2;
        this.f5589g = new QueuingConnection();
        Consumer<Object> consumer = new Consumer<Object>() { // from class: com.spotify.mobius.MobiusLoop.3
            @Override // com.spotify.mobius.functions.Consumer
            public final void accept(Object obj2) {
                MobiusLoop.this.f5591i = obj2;
                MobiusLoop.this.f5589g.accept(obj2);
                Iterator<E> it = MobiusLoop.this.f5590h.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).accept(obj2);
                }
            }
        };
        this.f5585c = new MessageDispatcher(workRunner, discardAfterDisposeWrapper);
        MessageDispatcher messageDispatcher = new MessageDispatcher(workRunner2, discardAfterDisposeWrapper2);
        this.f5586d = messageDispatcher;
        this.f5587e = new EventProcessor(factory.f5555a, messageDispatcher, consumer);
        Consumer<Object> consumer2 = new Consumer<Object>() { // from class: com.spotify.mobius.MobiusLoop.4
            @Override // com.spotify.mobius.functions.Consumer
            public final void accept(Object obj2) {
                MobiusLoop.this.m15600a(obj2);
            }
        };
        this.f5588f = connectable.mo3269P(consumer2);
        this.f5591i = obj;
        consumer.accept(obj);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f5586d.accept(it.next());
        }
        QueuingConnection queuingConnection = this.f5589g;
        Connection connectionMo3269P = connectable2.mo3269P(consumer2);
        QueuingConnection.QueuingDelegate queuingDelegate = queuingConnection.f5616a;
        AtomicReference atomicReference = queuingConnection.f5617b;
        if (atomicReference.get() == QueuingConnection.f5615c) {
            return;
        }
        if (!o7t0.m66397k(atomicReference, queuingDelegate, connectionMo3269P)) {
            throw new IllegalStateException("Attempt at setting the active delegate twice");
        }
        QueuingConnection queuingConnection2 = QueuingConnection.this;
        Connection connection = (Connection) queuingConnection2.f5617b.get();
        if (connection == queuingConnection2.f5616a) {
            return;
        }
        while (true) {
            Object objPoll = queuingDelegate.f5618a.poll();
            if (objPoll == null) {
                return;
            } else {
                connection.accept(objPoll);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15600a(Object obj) {
        if (this.f5592t == RunState.f5601c) {
            throw new IllegalStateException(String.format("This loop has already been disposed. You cannot dispatch events after disposal - event received: %s=%s, currentModel: %s", obj.getClass().getName(), obj, this.f5591i));
        }
        if (this.f5592t == RunState.f5600b) {
            return;
        }
        try {
            MessageDispatcher messageDispatcher = this.f5585c;
            Preconditions.m15649b(obj);
            messageDispatcher.accept(obj);
        } catch (RuntimeException e) {
            throw new IllegalStateException(klh.m56833e(obj, "Exception processing event: "), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Disposable m15601b(Consumer consumer) {
        if (this.f5592t == RunState.f5601c) {
            throw new IllegalStateException("This loop has already been disposed. You cannot observe a disposed loop");
        }
        if (this.f5592t == RunState.f5600b) {
            return new rnh0();
        }
        final FireAtLeastOnceObserver fireAtLeastOnceObserver = new FireAtLeastOnceObserver(consumer);
        this.f5590h.add(fireAtLeastOnceObserver);
        Object obj = this.f5591i;
        if (obj != null) {
            if (j4x.m52412j(fireAtLeastOnceObserver.f5561d, new AtomicReference(obj))) {
                fireAtLeastOnceObserver.m15573a();
            }
        }
        return new Disposable() { // from class: com.spotify.mobius.MobiusLoop.5
            @Override // com.spotify.mobius.disposables.Disposable
            public final void dispose() {
                MobiusLoop.this.f5590h.remove(fireAtLeastOnceObserver);
            }
        };
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final synchronized void dispose() {
        RunState runState = this.f5592t;
        RunState runState2 = RunState.f5601c;
        if (runState == runState2) {
            return;
        }
        this.f5592t = RunState.f5600b;
        this.f5590h.clear();
        this.f5583a.dispose();
        this.f5584b.dispose();
        this.f5589g.dispose();
        this.f5588f.dispose();
        this.f5585c.dispose();
        this.f5586d.dispose();
        this.f5592t = runState2;
    }
}
