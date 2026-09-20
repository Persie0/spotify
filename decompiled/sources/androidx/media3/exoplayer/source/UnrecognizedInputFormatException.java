package androidx.media3.exoplayer.source;

import androidx.media3.common.ParserException;
import p204p.pf40;
import p204p.wsv0;

/* JADX INFO: loaded from: classes3.dex */
public class UnrecognizedInputFormatException extends ParserException {

    /* JADX INFO: renamed from: c */
    public final pf40 f1016c;

    public UnrecognizedInputFormatException(String str, wsv0 wsv0Var) {
        super(str, null, false, 1);
        this.f1016c = pf40.m69791p(wsv0Var);
    }

    @Override // androidx.media3.common.ParserException, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        pf40 pf40Var = this.f1016c;
        if (pf40Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + pf40Var;
    }
}
