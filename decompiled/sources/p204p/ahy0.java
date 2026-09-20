package p204p;

/* JADX INFO: loaded from: classes2.dex */
public class ahy0 extends AbstractC2522w6 implements zuk {

    /* JADX INFO: renamed from: d */
    public final fbk f15825d;

    public ahy0(fbk fbkVar, juk jukVar) {
        super(jukVar, true, true);
        this.f15825d = fbkVar;
    }

    @Override // p204p.eg60
    /* JADX INFO: renamed from: H */
    public void mo26007H(Object obj) {
        vvx.m86496A(rlg1.m75858y(obj), seg1.m77914f(this.f15825d));
    }

    @Override // p204p.eg60
    /* JADX INFO: renamed from: O */
    public void mo26008O(Object obj) {
        this.f15825d.resumeWith(rlg1.m75858y(obj));
    }

    @Override // p204p.zuk
    public final zuk getCallerFrame() {
        fbk fbkVar = this.f15825d;
        if (fbkVar instanceof zuk) {
            return (zuk) fbkVar;
        }
        return null;
    }

    @Override // p204p.eg60
    /* JADX INFO: renamed from: j0 */
    public final boolean mo26009j0() {
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public void mo26010z0() {
    }
}
