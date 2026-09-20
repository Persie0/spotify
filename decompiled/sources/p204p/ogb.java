package p204p;

import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* JADX INFO: loaded from: classes3.dex */
public final class ogb implements scx0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f165081b;

    /* JADX INFO: renamed from: c */
    public final scx0 f165082c;

    public ogb(int i, long j) {
        this.f165081b = i;
        switch (i) {
            case 1:
                this.f165082c = new eu71(j, new ngb(j));
                break;
            default:
                this.f165082c = new ogb(1, j);
                break;
        }
    }

    @Override // p204p.scx0
    /* JADX INFO: renamed from: a */
    public final rcx0 mo40039a(mgb mgbVar) {
        switch (this.f165081b) {
            case 0:
                if (((eu71) ((ogb) this.f165082c).f165082c).mo40039a(mgbVar).f197945b) {
                    return rcx0.f197942e;
                }
                Throwable th = (Throwable) mgbVar.f143428c;
                if (th instanceof CameraValidator$CameraIdListIncorrectException) {
                    vie1.m85626h("CameraX");
                    if (((CameraValidator$CameraIdListIncorrectException) th).f394a > 0) {
                        return rcx0.f197943f;
                    }
                }
                return rcx0.f197941d;
            default:
                return ((eu71) this.f165082c).mo40039a(mgbVar);
        }
    }

    @Override // p204p.scx0
    /* JADX INFO: renamed from: b */
    public final long mo40040b() {
        switch (this.f165081b) {
            case 0:
                return ((eu71) ((ogb) this.f165082c).f165082c).f62896b;
            default:
                return ((eu71) this.f165082c).f62896b;
        }
    }
}
