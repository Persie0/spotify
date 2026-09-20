package org.apache.commons.math3.exception;

import java.util.Locale;
import p204p.bgx;
import p204p.lfa0;

/* JADX INFO: loaded from: classes14.dex */
public class MathIllegalArgumentException extends IllegalArgumentException {

    /* JADX INFO: renamed from: a */
    public final bgx f10946a;

    public MathIllegalArgumentException(lfa0 lfa0Var, Object... objArr) {
        bgx bgxVar = new bgx(this);
        this.f10946a = bgxVar;
        bgxVar.m29152a(lfa0Var, objArr);
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        bgx bgxVar = this.f10946a;
        bgxVar.getClass();
        return bgxVar.m29153b(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        bgx bgxVar = this.f10946a;
        bgxVar.getClass();
        return bgxVar.m29153b(Locale.US);
    }
}
