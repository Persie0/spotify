package p204p;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ihy0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f102380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicInteger f102381b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f102382c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sir0 f102383d;

    public /* synthetic */ ihy0(AtomicInteger atomicInteger, int i, sir0 sir0Var, int i2) {
        this.f102380a = i2;
        this.f102381b = atomicInteger;
        this.f102382c = i;
        this.f102383d = sir0Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        Object objMo30229d;
        Object objMo30229d2;
        switch (this.f102380a) {
            case 0:
                return (this.f102381b.get() == this.f102382c && (objMo30229d = this.f102383d.mo30229d(obj, fbkVar)) == yuk.f276404a) ? objMo30229d : w2a1.f247311a;
            default:
                return (this.f102381b.get() == this.f102382c && (objMo30229d2 = this.f102383d.mo30229d(obj, fbkVar)) == yuk.f276404a) ? objMo30229d2 : w2a1.f247311a;
        }
    }
}
