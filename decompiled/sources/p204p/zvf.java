package p204p;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class zvf extends pg0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ cwf f286700h;

    public zvf(cwf cwfVar) {
        this.f286700h = cwfVar;
    }

    @Override // p204p.pg0
    /* JADX INFO: renamed from: d */
    public final void mo34318d(int i, hsg1 hsg1Var, Object obj) {
        Bundle bundleExtra;
        int i2;
        cwf cwfVar = this.f286700h;
        s5f1 s5f1VarMo32678s = hsg1Var.mo32678s(cwfVar, obj);
        if (s5f1VarMo32678s != null) {
            new Handler(Looper.getMainLooper()).post(new scb(this, i, s5f1VarMo32678s, 4));
            return;
        }
        Intent intentMo32677q = hsg1Var.mo32677q(cwfVar, obj);
        if (intentMo32677q.getExtras() != null) {
            Bundle extras = intentMo32677q.getExtras();
            wj50.m88279p(extras);
            if (extras.getClassLoader() == null) {
                intentMo32677q.setExtrasClassLoader(cwfVar.getClassLoader());
            }
        }
        if (intentMo32677q.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentMo32677q.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo32677q.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo32677q.getAction())) {
            String[] stringArrayExtra = intentMo32677q.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ze0.m95954t0(cwfVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo32677q.getAction())) {
            ze0.m95956v0(cwfVar, intentMo32677q, i, bundle);
            return;
        }
        x550 x550Var = (x550) intentMo32677q.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            wj50.m88279p(x550Var);
            i2 = i;
            try {
                ze0.m95957w0(cwfVar, x550Var.m89967j(), i2, x550Var.m89964c(), x550Var.m89965g(), x550Var.m89966h(), bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new scb(this, i2, e, 5));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }
}
