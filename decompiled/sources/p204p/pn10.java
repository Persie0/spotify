package p204p;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Lp/pn10;", "Lp/xba;", "Lp/xn90;", "<init>", "()V", "src_main_java_com_spotify_livesharing_googlemeetui-googlemeetui"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class pn10 extends xba implements xn90 {

    /* JADX INFO: renamed from: Q1 */
    public final LinkedHashSet f179286Q1 = new LinkedHashSet();

    @Override // p204p.i500
    /* JADX INFO: renamed from: M0 */
    public final void mo3094M0() {
        this.f98702f1 = true;
        Iterator it = this.f179286Q1.iterator();
        while (it.hasNext()) {
            ((zn90) it.next()).getClass();
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: N0 */
    public final void mo3095N0() {
        this.f98702f1 = true;
        Iterator it = this.f179286Q1.iterator();
        while (it.hasNext()) {
            ((zn90) it.next()).mo68865c();
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        ((View) view.getParent()).setBackgroundColor(0);
    }

    @Override // p204p.xn90
    /* JADX INFO: renamed from: g0 */
    public final void mo67379g0(zn90 zn90Var) {
        this.f179286Q1.add(zn90Var);
    }

    @Override // p204p.xba, p204p.o65, p204p.ugr
    /* JADX INFO: renamed from: l1 */
    public final Dialog mo25833l1(Bundle bundle) {
        wba wbaVar = (wba) super.mo25833l1(bundle);
        wbaVar.m87626g().m1578L(3);
        return wbaVar;
    }

    /* JADX INFO: renamed from: r1 */
    public abstract String mo26554r1();

    @Override // p204p.xn90
    /* JADX INFO: renamed from: u */
    public final void mo67382u(c700 c700Var) {
        mo63162p1(c700Var, mo26554r1());
    }
}
