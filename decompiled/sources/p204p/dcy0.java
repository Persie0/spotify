package p204p;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class dcy0 implements tlm0 {

    /* JADX INFO: renamed from: a */
    public final rmm0 f47661a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f47662b;

    /* JADX INFO: renamed from: c */
    public d850 f47663c;

    public dcy0(rmm0 rmm0Var, z9j0 z9j0Var) {
        this.f47661a = rmm0Var;
        this.f47662b = z9j0Var;
    }

    @Override // p204p.tlm0
    /* JADX INFO: renamed from: b */
    public final boolean mo35686b(olm0 olm0Var) {
        if (!(olm0Var instanceof tg0)) {
            return false;
        }
        Intent intent = ((tg0) olm0Var).f220094a;
        String stringExtra = intent != null ? intent.getStringExtra("com.spotify.scannables.scannables.RESULT") : null;
        if (stringExtra != null) {
            Bundle bundleM50936h = ikc0.m50936h("from_scannable", true);
            d850 d850Var = this.f47663c;
            if (d850Var != null) {
                this.f47662b.mo47342b(stringExtra, d850Var, bundleM50936h);
            }
        }
        return true;
    }
}
