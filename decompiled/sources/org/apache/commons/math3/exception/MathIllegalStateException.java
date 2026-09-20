package org.apache.commons.math3.exception;

import java.util.Locale;
import p204p.bgx;
import p204p.lfa0;

/* JADX INFO: loaded from: classes14.dex */
public class MathIllegalStateException extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    public final bgx f10947a;

    public MathIllegalStateException(lfa0 lfa0Var, Object... objArr) {
        bgx bgxVar = new bgx(this);
        this.f10947a = bgxVar;
        bgxVar.m29152a(lfa0Var, objArr);
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        bgx bgxVar = this.f10947a;
        bgxVar.getClass();
        return bgxVar.m29153b(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        bgx bgxVar = this.f10947a;
        bgxVar.getClass();
        return bgxVar.m29153b(Locale.US);
    }

    public MathIllegalStateException() {
        this(lfa0.ILLEGAL_STATE, new Object[0]);
    }
}
