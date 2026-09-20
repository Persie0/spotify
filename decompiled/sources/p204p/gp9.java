package p204p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes5.dex */
public final class gp9 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83109a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9j0 f83110b;

    public /* synthetic */ gp9(z9j0 z9j0Var, int i) {
        this.f83109a = i;
        this.f83110b = z9j0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f83109a) {
            case 0:
                Bundle bundleM50936h = ikc0.m50936h("pending_invitation", true);
                this.f83110b.mo47347h(xoc1.f264066d3.f243453a, bundleM50936h);
                return;
            case 1:
                Bundle bundleM50936h2 = ikc0.m50936h("link_expired", true);
                this.f83110b.mo47347h(xoc1.f264066d3.f243453a, bundleM50936h2);
                return;
            case 2:
                this.f83110b.mo47345e();
                return;
            case 3:
                this.f83110b.mo47344d(gn80.LISTENING_PARTY_CHAT);
                return;
            case 4:
                String str = xoc1.f263839A0.f243453a;
                if (str == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                this.f83110b.mo63651f(new p6j0(str, "", false, false, 0, 0, true, null, null, null));
                return;
            case 5:
                String str2 = xoc1.f264032Z0.f243453a;
                if (str2 == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                this.f83110b.mo63651f(new p6j0(str2, "", false, false, 0, 0, false, null, null, null));
                return;
            default:
                this.f83110b.mo47345e();
                return;
        }
    }
}
