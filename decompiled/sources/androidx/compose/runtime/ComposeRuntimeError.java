package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class ComposeRuntimeError extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    public final String f491a;

    public ComposeRuntimeError(String str) {
        this.f491a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f491a;
    }
}
