package androidx.media3.common;

import java.io.IOException;
import p204p.klh;

/* JADX INFO: loaded from: classes.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: a */
    public final boolean f957a;

    /* JADX INFO: renamed from: b */
    public final int f958b;

    public ParserException(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f957a = z;
        this.f958b = i;
    }

    /* JADX INFO: renamed from: a */
    public static ParserException m752a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    /* JADX INFO: renamed from: b */
    public static ParserException m753b(String str) {
        return new ParserException(str, null, true, 4);
    }

    /* JADX INFO: renamed from: c */
    public static ParserException m754c(String str) {
        return new ParserException(str, null, true, 8);
    }

    /* JADX INFO: renamed from: d */
    public static ParserException m755d(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f957a);
        sb.append(", dataType=");
        return klh.m56832d(this.f958b, "}", sb);
    }
}
