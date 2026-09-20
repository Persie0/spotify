package com.google.android.gms.tasks;

import p204p.y7h1;

/* JADX INFO: loaded from: classes4.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    /* JADX INFO: renamed from: a */
    public static IllegalStateException m1508a(y7h1 y7h1Var) {
        String strConcat;
        if (!y7h1Var.mo1517i()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excMo1514f = y7h1Var.mo1514f();
        if (excMo1514f != null) {
            strConcat = "failure";
        } else if (y7h1Var.mo1518j()) {
            strConcat = "result ".concat(String.valueOf(y7h1Var.mo1515g()));
        } else {
            strConcat = y7h1Var.f270088d ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), excMo1514f);
    }
}
