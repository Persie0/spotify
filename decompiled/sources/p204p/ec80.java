package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ec80 extends i500 implements ua80 {

    /* JADX INFO: renamed from: A1 */
    public final eb80 f58260A1 = new eb80();

    @Override // p204p.i500
    /* JADX INFO: renamed from: D0 */
    public final void mo26182D0(int i, int i2, Intent intent) {
        super.mo26182D0(i, i2, intent);
        eb80 eb80Var = this.f58260A1;
        eb80Var.getClass();
        eb80Var.m38361a(new wa80(i, i2, intent));
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: F0 */
    public void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        eb80 eb80Var = this.f58260A1;
        eb80Var.getClass();
        eb80Var.m38361a(new cb80(bundle, 3));
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: H0 */
    public void mo3093H0() {
        this.f98702f1 = true;
        this.f58260A1.m38361a(db80.f47242e);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: M0 */
    public void mo3094M0() {
        this.f98702f1 = true;
        this.f58260A1.m38361a(db80.f47241d);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: N0 */
    public void mo3095N0() {
        this.f98702f1 = true;
        this.f58260A1.m38361a(db80.f47240c);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: O0 */
    public void mo880O0(Bundle bundle) {
        this.f58260A1.m38361a(new cb80(bundle, 1));
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: P0 */
    public void mo3104P0() {
        this.f98702f1 = true;
        this.f58260A1.m38361a(db80.f47238a);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: Q0 */
    public void mo3105Q0() {
        this.f98702f1 = true;
        this.f58260A1.m38361a(db80.f47239b);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public void mo881R0(View view, Bundle bundle) {
        this.f58260A1.m38361a(new cb80(bundle, 2));
        m500 m500VarM49699V0 = m49699V0();
        m500VarM49699V0.f42739c.m59038f(new dc80(this), this);
    }

    @Override // p204p.ua80
    /* JADX INFO: renamed from: q */
    public final boolean mo32226q(va80 va80Var) {
        return this.f58260A1.mo32226q(va80Var);
    }

    @Override // p204p.ua80
    /* JADX INFO: renamed from: z */
    public final boolean mo32229z(va80 va80Var) {
        return this.f58260A1.mo32229z(va80Var);
    }
}
