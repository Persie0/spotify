package p204p;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Lp/on10;", "Lp/ugr;", "Lp/xn90;", "<init>", "()V", "src_main_java_com_spotify_livesharing_googlemeetui-googlemeetui"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class on10 extends ugr implements xn90 {

    /* JADX INFO: renamed from: Q1 */
    public final LinkedHashSet f167136Q1 = new LinkedHashSet();

    @Override // p204p.i500
    /* JADX INFO: renamed from: M0 */
    public final void mo3094M0() {
        this.f98702f1 = true;
        Iterator it = this.f167136Q1.iterator();
        while (it.hasNext()) {
            ((zn90) it.next()).getClass();
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: N0 */
    public final void mo3095N0() {
        this.f98702f1 = true;
        Iterator it = this.f167136Q1.iterator();
        while (it.hasNext()) {
            ((zn90) it.next()).mo68865c();
        }
    }

    @Override // p204p.xn90
    /* JADX INFO: renamed from: g0 */
    public final void mo67379g0(zn90 zn90Var) {
        this.f167136Q1.add(zn90Var);
    }

    /* JADX INFO: renamed from: r1 */
    public abstract String mo33478r1();

    /* JADX INFO: renamed from: s1 */
    public final void m67380s1() {
        Iterator it = this.f167136Q1.iterator();
        while (it.hasNext()) {
            ((zn90) it.next()).mo92671b();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final void m67381t1() {
        Iterator it = this.f167136Q1.iterator();
        while (it.hasNext()) {
            ((zn90) it.next()).mo68864a();
        }
    }

    @Override // p204p.xn90
    /* JADX INFO: renamed from: u */
    public final void mo67382u(c700 c700Var) {
        mo63162p1(c700Var, mo33478r1());
    }
}
