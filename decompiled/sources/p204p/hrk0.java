package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class hrk0 implements fvb0 {

    /* JADX INFO: renamed from: a */
    public final r7p f94448a;

    public hrk0(irk0 irk0Var, r7p r7pVar) {
        this.f94448a = r7pVar;
    }

    @Override // p204p.fvb0
    /* JADX INFO: renamed from: a */
    public final void mo42778a(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            if (action.equals("OFF_NETWORK_CLICK")) {
                r7p.m74953j(this.f94448a, null, 6);
            } else {
                action.equals("OFF_NETWORK_CANCEL");
            }
        }
    }
}
