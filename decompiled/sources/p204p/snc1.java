package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class snc1 implements cwr {

    /* JADX INFO: renamed from: a */
    public final View f210883a;

    /* JADX INFO: renamed from: b */
    public volatile pjq f210884b;

    public snc1(View view, pjq pjqVar) {
        this.f210883a = view;
        this.f210884b = pjqVar;
    }

    @Override // p204p.cwr
    /* JADX INFO: renamed from: d */
    public final ojq mo34152d() {
        return this.f210884b;
    }

    @Override // p204p.cwr
    public final void dispose() {
        boolean z;
        unc1 unc1VarM85485z = vgg1.m85485z(this.f210883a);
        synchronized (unc1VarM85485z) {
            z = this != unc1VarM85485z.f232146b;
        }
        if (z) {
            return;
        }
        vgg1.m85485z(this.f210883a).m83546a();
    }
}
