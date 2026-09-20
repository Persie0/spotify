package androidx.p004xr.runtime.interfaces;

import android.content.Context;
import java.util.Set;
import kotlin.Metadata;
import p204p.che1;
import p204p.gge1;
import p204p.juk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Landroidx/xr/runtime/interfaces/XrDeviceCapabilityProviderFactory;", "", "Landroid/content/Context;", "context", "Lp/juk;", "coroutineContext", "Lp/che1;", "nativeInstanceProvider", "Lp/gge1;", "create", "(Landroid/content/Context;Lp/juk;Lp/che1;)Lp/gge1;", "runtime-interfaces"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public interface XrDeviceCapabilityProviderFactory {
    static /* synthetic */ gge1 create$default(XrDeviceCapabilityProviderFactory xrDeviceCapabilityProviderFactory, Context context, juk jukVar, che1 che1Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
        if ((i & 4) != 0) {
            che1Var = null;
        }
        return xrDeviceCapabilityProviderFactory.create(context, jukVar, che1Var);
    }

    gge1 create(Context context, juk coroutineContext, che1 nativeInstanceProvider);

    /* synthetic */ Set getRequirements();
}
