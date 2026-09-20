package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p204p.s571;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ExceptionHelper {

    /* JADX INFO: renamed from: a */
    public static final Throwable f10258a = new Termination();

    public static final class Termination extends Throwable {
        public Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23749a(AtomicReference atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == f10258a) {
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            while (!atomicReference.compareAndSet(th2, compositeException)) {
                if (atomicReference.get() != th2) {
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static NullPointerException m23750b(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    /* JADX INFO: renamed from: c */
    public static void m23751c(Object obj, String str) {
        if (obj == null) {
            throw m23750b(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Throwable m23752d(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f10258a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    /* JADX INFO: renamed from: e */
    public static String m23753e(long j, TimeUnit timeUnit) {
        StringBuilder sbM77254m = s571.m77254m(j, "The source did not signal an event for ", " ");
        sbM77254m.append(timeUnit.toString().toLowerCase());
        sbM77254m.append(" and has been terminated.");
        return sbM77254m.toString();
    }

    /* JADX INFO: renamed from: f */
    public static RuntimeException m23754f(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
