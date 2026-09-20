package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes9.dex */
public final class evf extends AbstractC1895gf {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f63228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ evf(int i, Intent intent, String str) {
        super(str, intent);
        this.f63228c = i;
    }

    @Override // p204p.AbstractC1895gf
    /* JADX INFO: renamed from: s */
    public final String mo40107s() {
        switch (this.f63228c) {
            case 0:
                return "Activity";
            case 1:
                return "BroadcastReceiver";
            default:
                return "Service";
        }
    }
}
