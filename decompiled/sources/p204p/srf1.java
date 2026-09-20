package p204p;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class srf1 extends i500 implements ac80 {

    /* JADX INFO: renamed from: B1 */
    public static final WeakHashMap f213316B1 = new WeakHashMap();

    /* JADX INFO: renamed from: A1 */
    public final ob31 f213317A1 = new ob31(8, false);

    @Override // p204p.i500
    /* JADX INFO: renamed from: D0 */
    public final void mo26182D0(int i, int i2, Intent intent) {
        super.mo26182D0(i, i2, intent);
        this.f213317A1.m66616p(i, i2, intent);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        this.f213317A1.m66612l(bundle);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: H0 */
    public final void mo3093H0() {
        this.f98702f1 = true;
        this.f213317A1.m66619t();
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: N0 */
    public final void mo3095N0() {
        this.f98702f1 = true;
        this.f213317A1.m66615o();
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: O0 */
    public final void mo880O0(Bundle bundle) {
        this.f213317A1.m66617r(bundle);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: P0 */
    public final void mo3104P0() {
        this.f98702f1 = true;
        this.f213317A1.m66614n();
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: Q0 */
    public final void mo3105Q0() {
        this.f98702f1 = true;
        this.f213317A1.m66618s();
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: l0 */
    public final void mo49713l0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo49713l0(str, fileDescriptor, printWriter, strArr);
        this.f213317A1.m66620u();
    }

    @Override // p204p.ac80
    /* JADX INFO: renamed from: m */
    public final void mo25446m(l3f1 l3f1Var) {
        this.f213317A1.m66611k(l3f1Var);
    }

    @Override // p204p.ac80
    /* JADX INFO: renamed from: t */
    public final l3f1 mo25447t() {
        return this.f213317A1.m66609i();
    }
}
