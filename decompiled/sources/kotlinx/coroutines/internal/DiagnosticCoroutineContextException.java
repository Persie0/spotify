package kotlinx.coroutines.internal;

import kotlin.Metadata;
import p204p.juk;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lkotlinx/coroutines/internal/DiagnosticCoroutineContextException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "kotlinx-coroutines-core"}, m24213k = 1, m24214mv = {2, 2, 0}, m24216xi = 48)
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final transient juk f10918a;

    public DiagnosticCoroutineContextException(juk jukVar) {
        this.f10918a = jukVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f10918a);
    }
}
