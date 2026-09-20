package p204p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class x0a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ guf f256836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicBoolean f256837b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hb11 f256838c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ guf f256839d;

    public x0a(guf gufVar, AtomicBoolean atomicBoolean, hb11 hb11Var, guf gufVar2) {
        this.f256836a = gufVar;
        this.f256837b = atomicBoolean;
        this.f256838c = hb11Var;
        this.f256839d = gufVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)) : null;
        w2a1 w2a1Var = w2a1.f247311a;
        guf gufVar = this.f256836a;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            gufVar.m38797k0(w2a1Var);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == -1) {
            if (gufVar.mo26606t()) {
                return;
            }
            gufVar.m45754w0(new IllegalStateException("Bluetooth SCO connection failed"));
        } else if (numValueOf != null && numValueOf.intValue() == 0 && gufVar.mo26606t()) {
            if (!this.f256837b.get()) {
                this.f256838c.mo46962a(w2a1Var);
            }
            this.f256839d.m38797k0(w2a1Var);
        }
    }
}
