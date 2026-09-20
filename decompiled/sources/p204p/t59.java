package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class t59 extends dla {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f217245g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t59(Context context, o0e1 o0e1Var, int i) {
        super(context, o0e1Var);
        this.f217245g = i;
    }

    @Override // p204p.l7j
    /* JADX INFO: renamed from: a */
    public final Object mo36122a() {
        int i = this.f217245g;
        Context context = this.f130662b;
        boolean z = true;
        switch (i) {
            case 0:
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    gaz gazVarM44190b = gaz.m44190b();
                    int i2 = u59.f226949a;
                    gazVarM44190b.getClass();
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver2 = context.registerReceiver(null, mo36350e());
                if (intentRegisterReceiver2 != null && intentRegisterReceiver2.getAction() != null) {
                    String action = intentRegisterReceiver2.getAction();
                    if (action == null) {
                        z = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // p204p.dla
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo36350e() {
        switch (this.f217245g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p204p.dla
    /* JADX INFO: renamed from: f */
    public final void mo36351f(Intent intent) {
        switch (this.f217245g) {
            case 0:
                String action = intent.getAction();
                if (action != null) {
                    gaz gazVarM44190b = gaz.m44190b();
                    int i = u59.f226949a;
                    gazVarM44190b.getClass();
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                m58416b(Boolean.FALSE);
                                break;
                            }
                            break;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                m58416b(Boolean.FALSE);
                                break;
                            }
                            break;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                m58416b(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                m58416b(Boolean.TRUE);
                                break;
                            }
                            break;
                    }
                }
                break;
            default:
                if (intent.getAction() != null) {
                    gaz gazVarM44190b2 = gaz.m44190b();
                    int i2 = a851.f13196a;
                    intent.getAction();
                    gazVarM44190b2.getClass();
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int iHashCode = action2.hashCode();
                        if (iHashCode != -1181163412) {
                            if (iHashCode == -730838620 && action2.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                m58416b(Boolean.TRUE);
                            }
                            break;
                        } else if (action2.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            m58416b(Boolean.FALSE);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
