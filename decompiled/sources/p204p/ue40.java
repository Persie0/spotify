package p204p;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class ue40 extends mjq {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f229397o = 0;

    /* JADX INFO: renamed from: p */
    public final Object f229398p;

    public ue40(Surface surface, Size size, int i) {
        super(size, i);
        this.f229398p = surface;
    }

    @Override // p204p.mjq
    /* JADX INFO: renamed from: f */
    public final u790 mo61988f() {
        switch (this.f229397o) {
            case 0:
                return x4w0.m89916G((Surface) this.f229398p);
            default:
                return ((s861) this.f229398p).f206581f;
        }
    }

    public ue40(Surface surface) {
        super(mjq.f144301k, 0);
        this.f229398p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue40(s861 s861Var, Size size) {
        super(size, 34);
        this.f229398p = s861Var;
    }
}
