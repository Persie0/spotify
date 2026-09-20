package p204p;

import androidx.media3.common.PlaybackException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rwo implements k890 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlaybackException f203381b;

    public /* synthetic */ rwo(int i, PlaybackException playbackException) {
        this.f203380a = i;
        this.f203381b = playbackException;
    }

    @Override // p204p.k890
    public final void invoke(Object obj) {
        switch (this.f203380a) {
            case 0:
                ((op3) obj).mo67515k(this.f203381b);
                break;
            case 1:
                ((d7p0) obj).mo35224s0(this.f203381b);
                break;
            default:
                ((d7p0) obj).mo34772k(this.f203381b);
                break;
        }
    }

    public /* synthetic */ rwo(np3 np3Var, PlaybackException playbackException) {
        this.f203380a = 0;
        this.f203381b = playbackException;
    }
}
