package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes3.dex */
public final class ybp extends exh0 implements nfs {

    /* JADX INFO: renamed from: M0 */
    public final voi0 f271224M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f271225N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f271226O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f271227P0;

    public ybp(voi0 voi0Var) {
        this.f271224M0 = voi0Var;
    }

    @Override // p204p.nfs
    /* JADX INFO: renamed from: v0 */
    public final void mo25073v0(tgj tgjVar) {
        tgjVar.mo50174s1();
        if (this.f271225N0) {
            DrawScope.m277h0(tgjVar, n6f.m63765b(n6f.f150862b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0L, tgjVar.mo295n(), 0.0f, null, null, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND);
        } else if (this.f271226O0 || this.f271227P0) {
            DrawScope.m277h0(tgjVar, n6f.m63765b(n6f.f150862b, 0.1f, 0.0f, 0.0f, 0.0f, 14), 0L, tgjVar.mo295n(), 0.0f, null, null, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND);
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        x0h1.m89578u(m40262v1(), null, 0, new xuo(this, null, 10), 3);
    }
}
