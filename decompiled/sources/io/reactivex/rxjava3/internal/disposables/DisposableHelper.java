package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class DisposableHelper implements Disposable {

    /* JADX INFO: renamed from: a */
    public static final DisposableHelper f7218a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ DisposableHelper[] f7219b;

    static {
        DisposableHelper disposableHelper = new DisposableHelper("DISPOSED", 0);
        f7218a = disposableHelper;
        f7219b = new DisposableHelper[]{disposableHelper};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23414a(AtomicReference atomicReference) {
        Disposable disposable;
        Disposable disposable2 = (Disposable) atomicReference.get();
        DisposableHelper disposableHelper = f7218a;
        if (disposable2 == disposableHelper || (disposable = (Disposable) atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (disposable == null) {
            return true;
        }
        disposable.dispose();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m23415b(Disposable disposable) {
        return disposable == f7218a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m23416c(AtomicReference atomicReference, Disposable disposable) {
        while (true) {
            Disposable disposable2 = (Disposable) atomicReference.get();
            if (disposable2 != f7218a) {
                while (!atomicReference.compareAndSet(disposable2, disposable)) {
                    if (atomicReference.get() != disposable2) {
                    }
                }
                return true;
            }
            if (disposable == null) {
                return false;
            }
            disposable.dispose();
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m23417f(AtomicReference atomicReference, Disposable disposable) {
        while (true) {
            Disposable disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == f7218a) {
                if (disposable == null) {
                    return false;
                }
                disposable.dispose();
                return false;
            }
            do {
                if (atomicReference.compareAndSet(disposable2, disposable)) {
                    if (disposable2 == null) {
                        return true;
                    }
                    disposable2.dispose();
                    return true;
                }
            } while (atomicReference.get() == disposable2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m23418g(AtomicReference atomicReference, Disposable disposable) {
        Objects.requireNonNull(disposable, "d is null");
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() == f7218a) {
                    return false;
                }
                RxJavaPlugins.m23782b(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m23419h(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            RxJavaPlugins.m23782b(new NullPointerException("next is null"));
            return false;
        }
        if (disposable == null) {
            return true;
        }
        disposable2.dispose();
        RxJavaPlugins.m23782b(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static DisposableHelper valueOf(String str) {
        return (DisposableHelper) Enum.valueOf(DisposableHelper.class, str);
    }

    public static DisposableHelper[] values() {
        return (DisposableHelper[]) f7219b.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }
}
