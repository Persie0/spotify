package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p204p.tf60;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, m24212d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, m24213k = 1, m24214mv = {2, 2, 0}, m24216xi = 48)
public final class TimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient tf60 f10916a;

    public TimeoutCancellationException(String str, tf60 tf60Var) {
        super(str);
        this.f10916a = tf60Var;
    }
}
