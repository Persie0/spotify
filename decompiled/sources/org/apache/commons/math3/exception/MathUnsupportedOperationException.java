package org.apache.commons.math3.exception;

import java.util.Locale;
import p204p.bgx;
import p204p.lfa0;

/* JADX INFO: loaded from: classes14.dex */
public class MathUnsupportedOperationException extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a */
    public final bgx f10948a;

    public MathUnsupportedOperationException() {
        this(lfa0.UNSUPPORTED_OPERATION, new Object[0]);
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        bgx bgxVar = this.f10948a;
        bgxVar.getClass();
        return bgxVar.m29153b(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        bgx bgxVar = this.f10948a;
        bgxVar.getClass();
        return bgxVar.m29153b(Locale.US);
    }

    public MathUnsupportedOperationException(lfa0 lfa0Var, Object... objArr) {
        bgx bgxVar = new bgx(this);
        this.f10948a = bgxVar;
        bgxVar.m29152a(lfa0Var, objArr);
    }
}
