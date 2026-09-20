package kotlinx.coroutines;

import kotlin.Metadata;
import p204p.juk;
import p204p.luk;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "kotlinx-coroutines-core"}, m24213k = 1, m24214mv = {2, 2, 0}, m24216xi = 48)
public final class DispatchException extends Exception {

    /* JADX INFO: renamed from: a */
    public final Throwable f10914a;

    public DispatchException(Throwable th, luk lukVar, juk jukVar) {
        super("Coroutine dispatcher " + lukVar + " threw an exception, context = " + jukVar, th);
        this.f10914a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f10914a;
    }
}
