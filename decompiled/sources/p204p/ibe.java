package p204p;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class ibe implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f100516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sbe f100517b;

    public /* synthetic */ ibe(sbe sbeVar, int i) {
        this.f100516a = i;
        this.f100517b = sbeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s7i0 s7i0Var;
        switch (this.f100516a) {
            case 0:
                Context context = this.f100517b.f207436a;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
            case 1:
                sbe sbeVar = this.f100517b;
                lg21 lg21Var = sbeVar.f207453r;
                if (lg21Var != null) {
                    lg21Var.m58929h();
                }
                sbeVar.f207453r = null;
                s9p0 s9p0Var = sbeVar.f207452q;
                if (s9p0Var != null && (s7i0Var = sbeVar.f207451p) != null) {
                    s7i0Var.mo32674b(s9p0Var);
                }
                sbeVar.f207452q = null;
                s7i0 s7i0Var2 = sbeVar.f207451p;
                if (s7i0Var2 != null) {
                    s7i0Var2.mo43758d();
                }
                sbeVar.f207451p = null;
                sbeVar.f207450o = null;
                break;
            default:
                try {
                    lg21 lg21Var2 = this.f100517b.f207453r;
                    if (lg21Var2 != null) {
                        lg21Var2.m58932k();
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
