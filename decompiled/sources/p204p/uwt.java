package p204p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class uwt implements ywt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qe70 f234732a;

    /* JADX WARN: Multi-variable type inference failed */
    public uwt(xh00 xh00Var) {
        this.f234732a = (qe70) xh00Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [p.qe70, p.xh00] */
    @Override // p204p.ywt
    /* JADX INFO: renamed from: a */
    public final owt mo39576a(Context context, ViewGroup viewGroup, rwt rwtVar, gh00 gh00Var) {
        owt owtVar = (owt) this.f234732a.mo24818M(new au4(context, viewGroup, rwtVar), context, viewGroup, gh00Var);
        owtVar.getView().setSaveEnabled(false);
        return owtVar;
    }
}
