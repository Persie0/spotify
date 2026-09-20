package p204p;

import android.os.Handler;
import androidx.media3.session.legacy.VolumeProviderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class kqd0 extends VolumeProviderCompat {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Handler f125261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pdp0 f125262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqd0(int i, int i2, int i3, String str, Handler handler, pdp0 pdp0Var) {
        super(i, i2, i3, str);
        this.f125261a = handler;
        this.f125262b = pdp0Var;
    }

    @Override // androidx.media3.session.legacy.VolumeProviderCompat
    public final void onAdjustVolume(int i) {
        h0b1.m46304c0(this.f125261a, new jqd0(this.f125262b, i, 1));
    }

    @Override // androidx.media3.session.legacy.VolumeProviderCompat
    public final void onSetVolumeTo(int i) {
        h0b1.m46304c0(this.f125261a, new jqd0(this.f125262b, i, 0));
    }
}
