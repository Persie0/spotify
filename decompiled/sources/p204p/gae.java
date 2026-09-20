package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class gae implements tja1 {

    /* JADX INFO: renamed from: a */
    public final qja1 f78040a;

    /* JADX INFO: renamed from: b */
    public final nja1 f78041b;

    public gae(qja1 qja1Var, nja1 nja1Var) {
        this.f78040a = qja1Var;
        this.f78041b = nja1Var;
    }

    @Override // p204p.tja1
    /* JADX INFO: renamed from: a */
    public final boolean mo40533a(Uri uri) {
        return this.f78040a.mo27923l(uri);
    }

    @Override // p204p.tja1
    /* JADX INFO: renamed from: c */
    public final boolean mo40534c(Uri uri) {
        if (!this.f78040a.mo27923l(uri)) {
            return false;
        }
        this.f78041b.mo30787a(uri);
        return true;
    }
}
