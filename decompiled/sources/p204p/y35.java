package p204p;

import android.os.PowerManager;

/* JADX INFO: loaded from: classes3.dex */
public final class y35 {

    /* JADX INFO: renamed from: a */
    public static final y35 f268754a = new y35();

    /* JADX INFO: renamed from: a */
    public final boolean m92727a(PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }
}
