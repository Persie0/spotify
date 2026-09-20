package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplaySubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: d */
    public static final ReplayDisposable[] f10407d = new ReplayDisposable[0];

    /* JADX INFO: renamed from: e */
    public static final ReplayDisposable[] f10408e = new ReplayDisposable[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f10409f = new Object[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference f10410a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f10411b = new AtomicReference(f10407d);

    /* JADX INFO: renamed from: c */
    public boolean f10412c;

    public static final class Node<T> extends AtomicReference<Node<T>> {

        /* JADX INFO: renamed from: a */
        public final Object f10413a;

        public Node(Object obj) {
            this.f10413a = obj;
        }
    }

    public interface ReplayBuffer<T> {
        /* JADX INFO: renamed from: a */
        void mo23807a(ReplayDisposable replayDisposable);

        void add(Object obj);

        /* JADX INFO: renamed from: b */
        void mo23808b(Serializable serializable);

        boolean compareAndSet(Object obj, Object obj2);
    }

    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f10414a;

        /* JADX INFO: renamed from: b */
        public final ReplaySubject f10415b;

        /* JADX INFO: renamed from: c */
        public Serializable f10416c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f10417d;

        public ReplayDisposable(Observer observer, ReplaySubject replaySubject) {
            this.f10414a = observer;
            this.f10415b = replaySubject;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.f10417d) {
                return;
            }
            this.f10417d = true;
            this.f10415b.m23806h(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f10417d;
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {

        /* JADX INFO: renamed from: a */
        public final int f10418a;

        /* JADX INFO: renamed from: b */
        public int f10419b;

        /* JADX INFO: renamed from: c */
        public volatile Node f10420c;

        /* JADX INFO: renamed from: d */
        public Node f10421d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f10422e;

        public SizeBoundReplayBuffer(int i) {
            this.f10418a = i;
            Node node = new Node(null);
            this.f10421d = node;
            this.f10420c = node;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        /* JADX INFO: renamed from: a */
        public final void mo23807a(ReplayDisposable replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            Observer observer = replayDisposable.f10414a;
            Node<T> node = (Node) replayDisposable.f10416c;
            if (node == null) {
                node = this.f10420c;
            }
            int iAddAndGet = 1;
            while (!replayDisposable.f10417d) {
                Node<T> node2 = node.get();
                if (node2 != null) {
                    Object obj = node2.f10413a;
                    if (this.f10422e && node2.get() == null) {
                        if (NotificationLite.m23765g(obj)) {
                            observer.onComplete();
                        } else {
                            observer.onError(NotificationLite.m23764f(obj));
                        }
                        replayDisposable.f10416c = null;
                        replayDisposable.f10417d = true;
                        return;
                    }
                    observer.onNext(obj);
                    node = node2;
                } else if (node.get() != null) {
                    continue;
                } else {
                    replayDisposable.f10416c = node;
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.f10416c = null;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public final void add(Object obj) {
            Node node = new Node(obj);
            Node node2 = this.f10421d;
            this.f10421d = node;
            this.f10419b++;
            node2.set(node);
            int i = this.f10419b;
            if (i > this.f10418a) {
                this.f10419b = i - 1;
                this.f10420c = this.f10420c.get();
            }
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        /* JADX INFO: renamed from: b */
        public final void mo23808b(Serializable serializable) {
            Node node = new Node(serializable);
            Node node2 = this.f10421d;
            this.f10421d = node;
            this.f10419b++;
            node2.lazySet(node);
            Node node3 = this.f10420c;
            if (node3.f10413a != null) {
                Node node4 = new Node(null);
                node4.lazySet(node3.get());
                this.f10420c = node4;
            }
            this.f10422e = true;
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {

        /* JADX INFO: renamed from: a */
        public final ArrayList f10423a = new ArrayList(1);

        /* JADX INFO: renamed from: b */
        public volatile boolean f10424b;

        /* JADX INFO: renamed from: c */
        public volatile int f10425c;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        /* JADX INFO: renamed from: a */
        public final void mo23807a(ReplayDisposable replayDisposable) {
            int iIntValue;
            int i;
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            ArrayList arrayList = this.f10423a;
            Observer observer = replayDisposable.f10414a;
            Integer num = (Integer) replayDisposable.f10416c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                replayDisposable.f10416c = 0;
            }
            int iAddAndGet = 1;
            while (!replayDisposable.f10417d) {
                int i2 = this.f10425c;
                while (i2 != iIntValue) {
                    if (replayDisposable.f10417d) {
                        replayDisposable.f10416c = null;
                        return;
                    }
                    Object obj = arrayList.get(iIntValue);
                    if (this.f10424b && (i = iIntValue + 1) == i2 && i == (i2 = this.f10425c)) {
                        if (NotificationLite.m23765g(obj)) {
                            observer.onComplete();
                        } else {
                            observer.onError(NotificationLite.m23764f(obj));
                        }
                        replayDisposable.f10416c = null;
                        replayDisposable.f10417d = true;
                        return;
                    }
                    observer.onNext(obj);
                    iIntValue++;
                }
                if (iIntValue == this.f10425c) {
                    replayDisposable.f10416c = Integer.valueOf(iIntValue);
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.f10416c = null;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public final void add(Object obj) {
            this.f10423a.add(obj);
            this.f10425c++;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        /* JADX INFO: renamed from: b */
        public final void mo23808b(Serializable serializable) {
            this.f10423a.add(serializable);
            this.f10425c++;
            this.f10424b = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplaySubject(ReplayBuffer replayBuffer) {
        this.f10410a = (AtomicReference) replayBuffer;
    }

    /* JADX INFO: renamed from: f */
    public static ReplaySubject m23804f() {
        ObjectHelper.m23450a(1, "capacityHint");
        return new ReplaySubject(new UnboundedReplayBuffer());
    }

    /* JADX INFO: renamed from: g */
    public static ReplaySubject m23805g(int i) {
        ObjectHelper.m23450a(i, "maxSize");
        return new ReplaySubject(new SizeBoundReplayBuffer(i));
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    /* JADX INFO: renamed from: a */
    public final boolean mo23797a() {
        return ((ReplayDisposable[]) this.f10411b.get()).length != 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m23806h(ReplayDisposable replayDisposable) {
        AtomicReference atomicReference;
        ReplayDisposable[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            atomicReference = this.f10411b;
            replayDisposableArr = (ReplayDisposable[]) atomicReference.get();
            if (replayDisposableArr == f10408e || replayDisposableArr == (replayDisposableArr2 = f10407d)) {
                return;
            }
            int length = replayDisposableArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (replayDisposableArr[i] == replayDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                replayDisposableArr2 = new ReplayDisposable[length - 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, i);
                System.arraycopy(replayDisposableArr, i + 1, replayDisposableArr2, i, (length - i) - 1);
            }
        } while (!tfe.m80660r(atomicReference, replayDisposableArr, replayDisposableArr2));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.rxjava3.subjects.ReplaySubject$ReplayBuffer, java.util.concurrent.atomic.AtomicReference] */
    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (this.f10412c) {
            return;
        }
        this.f10412c = true;
        ?? r0 = this.f10410a;
        NotificationLite notificationLite = NotificationLite.f10261a;
        r0.mo23808b(notificationLite);
        r0.compareAndSet(null, notificationLite);
        for (ReplayDisposable replayDisposable : (ReplayDisposable[]) this.f10411b.getAndSet(f10408e)) {
            r0.mo23807a(replayDisposable);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.rxjava3.subjects.ReplaySubject$ReplayBuffer, java.util.concurrent.atomic.AtomicReference] */
    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        ExceptionHelper.m23751c(th, "onError called with a null Throwable.");
        if (this.f10412c) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        this.f10412c = true;
        Serializable serializable = (Serializable) NotificationLite.m23763e(th);
        ?? r0 = this.f10410a;
        r0.mo23808b(serializable);
        r0.compareAndSet(null, serializable);
        for (ReplayDisposable replayDisposable : (ReplayDisposable[]) this.f10411b.getAndSet(f10408e)) {
            r0.mo23807a(replayDisposable);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.rxjava3.subjects.ReplaySubject$ReplayBuffer, java.util.concurrent.atomic.AtomicReference] */
    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.m23751c(obj, "onNext called with a null value.");
        if (this.f10412c) {
            return;
        }
        ?? r0 = this.f10410a;
        r0.add(obj);
        for (ReplayDisposable replayDisposable : (ReplayDisposable[]) this.f10411b.get()) {
            r0.mo23807a(replayDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (this.f10412c) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [io.reactivex.rxjava3.subjects.ReplaySubject$ReplayBuffer, java.util.concurrent.atomic.AtomicReference] */
    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ReplayDisposable[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        ReplayDisposable replayDisposable = new ReplayDisposable(observer, this);
        observer.onSubscribe(replayDisposable);
        AtomicReference atomicReference = this.f10411b;
        do {
            replayDisposableArr = (ReplayDisposable[]) atomicReference.get();
            if (replayDisposableArr != f10408e) {
                int length = replayDisposableArr.length;
                replayDisposableArr2 = new ReplayDisposable[length + 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
                replayDisposableArr2[length] = replayDisposable;
            }
            this.f10410a.mo23807a(replayDisposable);
        } while (!tfe.m80660r(atomicReference, replayDisposableArr, replayDisposableArr2));
        if (replayDisposable.f10417d) {
            m23806h(replayDisposable);
            return;
        }
        this.f10410a.mo23807a(replayDisposable);
    }
}
