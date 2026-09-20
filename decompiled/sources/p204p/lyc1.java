package p204p;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class lyc1 extends VolumeProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oyc1 f138035a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyc1(oyc1 oyc1Var, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.f138035a = oyc1Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        this.f138035a.mo44645b(i);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        this.f138035a.mo44646c(i);
    }
}
