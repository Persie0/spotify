package p204p;

import androidx.compose.p002ui.platform.ComposeView;

/* JADX INFO: loaded from: classes8.dex */
public final class hrd extends dkv0 {

    /* JADX INFO: renamed from: S0 */
    public final vyc f94410S0;

    /* JADX INFO: renamed from: T0 */
    public final ird f94411T0;

    /* JADX INFO: renamed from: U0 */
    public final yum0 f94412U0;

    /* JADX INFO: renamed from: V0 */
    public final lq91 f94413V0;

    public hrd(ComposeView composeView, vyc vycVar, ird irdVar, kv91 kv91Var, lt91 lt91Var) {
        super(composeView);
        this.f94410S0 = vycVar;
        this.f94411T0 = irdVar;
        this.f94412U0 = sam.m77645B(null);
        this.f94413V0 = new lq91(lt91Var, null, kv91Var);
        composeView.setViewCompositionStrategy(mkr0.f144646T0);
        composeView.setContent(new fyf(new whb(this, 15), true, 37922788));
    }
}
