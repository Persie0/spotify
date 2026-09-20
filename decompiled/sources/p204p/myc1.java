package p204p;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class myc1 extends VolumeProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oyc1 f148425a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myc1(oyc1 oyc1Var, int i, int i2, int i3) {
        super(i, i2, i3);
        this.f148425a = oyc1Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        this.f148425a.mo44645b(i);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        this.f148425a.mo44646c(i);
    }
}
