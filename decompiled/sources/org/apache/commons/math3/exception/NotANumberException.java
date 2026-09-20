package org.apache.commons.math3.exception;

import p204p.lfa0;

/* JADX INFO: loaded from: classes14.dex */
public class NotANumberException extends MathIllegalNumberException {
    public NotANumberException() {
        super(lfa0.NAN_NOT_ALLOWED, Double.valueOf(Double.NaN), new Object[0]);
    }
}
