package p204p;

import android.media.SoundPool;

/* JADX INFO: loaded from: classes8.dex */
public final class pt31 implements SoundPool.OnLoadCompleteListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qt31 f181038a;

    public pt31(qt31 qt31Var) {
        this.f181038a = qt31Var;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        fuf fufVar = (fuf) this.f181038a.f192278f.remove(Integer.valueOf(i));
        if (fufVar != null) {
            if (i2 == 0) {
                ((guf) fufVar).m38797k0(Integer.valueOf(i));
            } else {
                ((guf) fufVar).m45754w0(new RuntimeException(s571.m77246e(i2, "SoundPool load failed: ")));
            }
        }
    }
}
