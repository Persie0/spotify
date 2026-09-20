package com.spotify.mobius.extras;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes8.dex */
public final class QueueingEventSubject<E> implements EventSource<E>, Consumer<E> {

    /* JADX INFO: renamed from: a */
    public final ArrayBlockingQueue f5743a = new ArrayBlockingQueue(10);

    /* JADX INFO: renamed from: b */
    public State f5744b = State.f5746a;

    /* JADX INFO: renamed from: c */
    public Consumer f5745c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* JADX INFO: renamed from: a */
        public static final State f5746a;

        /* JADX INFO: renamed from: b */
        public static final State f5747b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ State[] f5748c;

        static {
            State state = new State("NO_SUBSCRIBER", 0);
            f5746a = state;
            State state2 = new State("SUBSCRIBED", 1);
            f5747b = state2;
            f5748c = new State[]{state, state2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f5748c.clone();
        }
    }

    public class Unsubscriber implements Disposable {

        /* JADX INFO: renamed from: a */
        public boolean f5749a = false;

        public Unsubscriber() {
        }

        @Override // com.spotify.mobius.disposables.Disposable
        public final synchronized void dispose() {
            if (this.f5749a) {
                return;
            }
            this.f5749a = true;
            QueueingEventSubject queueingEventSubject = QueueingEventSubject.this;
            synchronized (queueingEventSubject) {
                queueingEventSubject.f5744b = State.f5746a;
                queueingEventSubject.f5745c = null;
            }
        }
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            State state = this.f5744b;
            State state2 = State.f5747b;
            if (state == state2) {
                throw new IllegalStateException("Only a single subscription is supported, previous subscriber is: " + this.f5745c);
            }
            this.f5744b = state2;
            this.f5745c = consumer;
            this.f5743a.drainTo(arrayList);
        }
        Iterator<E> it = arrayList.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
        return new Unsubscriber();
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        Consumer consumer;
        synchronized (this) {
            try {
                int iOrdinal = this.f5744b.ordinal();
                if (iOrdinal == 0) {
                    this.f5743a.add(obj);
                } else if (iOrdinal == 1) {
                    consumer = this.f5745c;
                }
                consumer = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (consumer != null) {
            consumer.accept(obj);
        }
    }
}
