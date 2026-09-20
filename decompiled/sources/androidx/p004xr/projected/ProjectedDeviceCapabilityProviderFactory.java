package androidx.p004xr.projected;

import android.content.Context;
import androidx.p004xr.runtime.interfaces.XrDeviceCapabilityProviderFactory;
import java.util.Set;
import kotlin.Metadata;
import p204p.bk5;
import p204p.che1;
import p204p.gge1;
import p204p.jey;
import p204p.juk;
import p204p.n9s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m24212d2 = {"Landroidx/xr/projected/ProjectedDeviceCapabilityProviderFactory;", "Landroidx/xr/runtime/interfaces/XrDeviceCapabilityProviderFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lp/juk;", "coroutineContext", "Lp/che1;", "nativeInstanceProvider", "Lp/gge1;", "create", "(Landroid/content/Context;Lp/juk;Lp/che1;)Lp/gge1;", "", "Lp/jey;", "requirements", "Ljava/util/Set;", "getRequirements", "()Ljava/util/Set;", "projected"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class ProjectedDeviceCapabilityProviderFactory implements XrDeviceCapabilityProviderFactory {
    public static final int $stable = 8;
    private final Set<jey> requirements = bk5.m29624m1(new jey[]{jey.f111736b, jey.f111742e});

    @Override // androidx.p004xr.runtime.interfaces.XrDeviceCapabilityProviderFactory
    public gge1 create(Context context, juk coroutineContext, che1 nativeInstanceProvider) {
        return new n9s0(context, coroutineContext);
    }

    @Override // androidx.p004xr.runtime.interfaces.XrDeviceCapabilityProviderFactory
    public Set<jey> getRequirements() {
        return this.requirements;
    }
}
