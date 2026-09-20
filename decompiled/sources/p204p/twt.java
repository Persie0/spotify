package p204p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class twt implements ywt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xh00 f224478a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f224479b;

    public twt(xh00 xh00Var, boolean z) {
        this.f224478a = xh00Var;
        this.f224479b = z;
    }

    @Override // p204p.ywt
    /* JADX INFO: renamed from: a */
    public final owt mo39576a(Context context, ViewGroup viewGroup, rwt rwtVar, gh00 gh00Var) {
        owt owtVar = (owt) this.f224478a.mo24818M(new au4(context, viewGroup, rwtVar), context, viewGroup, gh00Var);
        owtVar.getView().setSaveEnabled(this.f224479b);
        return owtVar;
    }
}
