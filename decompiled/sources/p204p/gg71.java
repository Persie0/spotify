package p204p;

import android.os.PowerManager;

/* JADX INFO: loaded from: classes6.dex */
public final class gg71 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PowerManager f79566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg71(PowerManager powerManager) {
        super(0);
        this.f79566a = powerManager;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        PowerManager powerManager = this.f79566a;
        if (powerManager != null) {
            return Integer.valueOf(powerManager.getCurrentThermalStatus());
        }
        return null;
    }
}
