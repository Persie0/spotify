package androidx.p004xr.runtime.internal;

import android.app.Activity;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p204p.op60;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Landroidx/xr/runtime/internal/RenderingRuntimeFactory;", "", "", "Lp/op60;", "runtimes", "Landroid/app/Activity;", "activity", "create", "(Ljava/util/List;Landroid/app/Activity;)Lp/op60;", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public interface RenderingRuntimeFactory {
    op60 create(List<? extends op60> runtimes, Activity activity);

    /* synthetic */ Set getRequirements();
}
