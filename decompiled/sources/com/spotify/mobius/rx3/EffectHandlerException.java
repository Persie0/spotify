package com.spotify.mobius.rx3;

import com.spotify.mobius.ConnectionException;

/* JADX INFO: loaded from: classes8.dex */
class EffectHandlerException extends ConnectionException {
    /* JADX INFO: renamed from: a */
    public static EffectHandlerException m15652a(Object obj, Throwable th) {
        EffectHandlerException effectHandlerException = new EffectHandlerException("Error in effect handler", th);
        StackTraceElement[] stackTrace = effectHandlerException.getStackTrace();
        stackTrace[0] = new StackTraceElement(obj.getClass().getName(), "apply", null, -1);
        effectHandlerException.setStackTrace(stackTrace);
        return effectHandlerException;
    }
}
