package io.reactivex.rxjava3.exceptions;

import p204p.ei6;

/* JADX INFO: loaded from: classes11.dex */
public final class UndeliverableException extends IllegalStateException {
    public UndeliverableException(Throwable th) {
        super(ei6.m39073j("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ", th), th);
    }
}
