package org.apache.commons.math3.exception;

import java.util.Locale;
import p204p.bgx;
import p204p.lfa0;

/* JADX INFO: loaded from: classes14.dex */
public class MathArithmeticException extends ArithmeticException {

    /* JADX INFO: renamed from: a */
    public final bgx f10945a;

    public MathArithmeticException() {
        bgx bgxVar = new bgx(this);
        this.f10945a = bgxVar;
        bgxVar.m29152a(lfa0.ARITHMETIC_EXCEPTION, new Object[0]);
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        bgx bgxVar = this.f10945a;
        bgxVar.getClass();
        return bgxVar.m29153b(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        bgx bgxVar = this.f10945a;
        bgxVar.getClass();
        return bgxVar.m29153b(Locale.US);
    }
}
