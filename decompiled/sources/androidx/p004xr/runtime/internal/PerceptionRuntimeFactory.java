package androidx.p004xr.runtime.internal;

import android.content.Context;
import java.util.Set;
import kotlin.Metadata;
import p204p.op60;
import p204p.xuk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Landroidx/xr/runtime/internal/PerceptionRuntimeFactory;", "", "Landroid/content/Context;", "context", "Lp/xuk;", "coroutineScope", "Lp/op60;", "createRuntime", "(Landroid/content/Context;Lp/xuk;)Lp/op60;", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public interface PerceptionRuntimeFactory {
    op60 createRuntime(Context context, xuk coroutineScope);

    /* synthetic */ Set getRequirements();
}
