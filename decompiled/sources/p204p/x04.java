package p204p;

import androidx.media3.common.PlaybackException;

/* JADX INFO: loaded from: classes2.dex */
public final class x04 implements d7p0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a14 f256795a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqb f256796b;

    public x04(a14 a14Var, hqb hqbVar) {
        this.f256795a = a14Var;
        this.f256796b = hqbVar;
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: F */
    public final void mo34736F(int i) {
        if (i == 4) {
            xs6 xs6Var = a14.f11316f;
            this.f256795a.m24418c(this, false);
            hqb hqbVar = this.f256796b;
            if (hqbVar.isActive()) {
                hqbVar.resumeWith(w2a1.f247311a);
            }
        }
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: k */
    public final void mo34772k(PlaybackException playbackException) {
        a14.m24417b(this.f256795a, this, this.f256796b, playbackException);
    }
}
