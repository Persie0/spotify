package androidx.p004xr.runtime.internal;

import android.app.Activity;
import java.util.Set;
import kotlin.Metadata;
import p204p.op60;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m24212d2 = {"Landroidx/xr/runtime/internal/SceneRuntimeFactory;", "", "Landroid/app/Activity;", "activity", "Lp/op60;", "create", "(Landroid/app/Activity;)Lp/op60;", "", "unscaledGravityAlignedActivitySpace", "(Landroid/app/Activity;Z)Lp/op60;", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public interface SceneRuntimeFactory {
    op60 create(Activity activity);

    op60 create(Activity activity, boolean unscaledGravityAlignedActivitySpace);

    /* synthetic */ Set getRequirements();
}
