package p204p;

import android.content.DialogInterface;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: classes5.dex */
public final class wb01 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nlv0 f249659a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SingleSubject f249660b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f249661c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xb01 f249662d;

    public wb01(nlv0 nlv0Var, SingleSubject singleSubject, String str, xb01 xb01Var) {
        this.f249659a = nlv0Var;
        this.f249660b = singleSubject;
        this.f249661c = str;
        this.f249662d = xb01Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.f249659a.f155174a) {
            this.f249660b.onSuccess(new m901(this.f249661c));
        }
        wz6 wz6Var = this.f249662d.f259811c;
        kv91 kv91Var = wz6Var.f256490a;
        k5h0 k5h0Var = wz6Var.f256491b;
        k5h0Var.getClass();
        yt91 yt91VarM96903c = k5h0Var.f119526b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("dismiss_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), k5h0Var.f119525a, System.currentTimeMillis()), null);
    }
}
