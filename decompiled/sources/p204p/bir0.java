package p204p;

import android.app.ActivityManager;
import android.os.Build;
import android.os.PowerManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bir0 implements k2l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27533a = 0;

    /* JADX INFO: renamed from: b */
    public final int f27534b;

    /* JADX INFO: renamed from: c */
    public final qe70 f27535c;

    public bir0(PowerManager powerManager) {
        int i = Build.VERSION.SDK_INT;
        gg71 gg71Var = new gg71(powerManager);
        this.f27534b = i;
        this.f27535c = gg71Var;
    }

    @Override // p204p.k2l
    /* JADX INFO: renamed from: a */
    public final List mo29350a() {
        Object c6x0Var;
        air0 air0Var;
        String str;
        int i = this.f27533a;
        qe70 qe70Var = this.f27535c;
        String strValueOf = "unsupported";
        int i2 = this.f27534b;
        switch (i) {
            case 0:
                if (i2 >= 35) {
                    try {
                        c6x0Var = (air0) ((zhr0) qe70Var).invoke();
                    } catch (Throwable th) {
                        c6x0Var = new c6x0(th);
                    }
                    if (c6x0Var instanceof c6x0) {
                        c6x0Var = null;
                    }
                    air0Var = (air0) c6x0Var;
                    break;
                } else {
                    air0Var = null;
                }
                if (i2 < 35) {
                    str = "unsupported";
                } else if (air0Var != null) {
                    switch (air0Var.f16084a) {
                        case 0:
                            str = "alarm";
                            break;
                        case 1:
                            str = "backup";
                            break;
                        case 2:
                            str = "boot_complete";
                            break;
                        case 3:
                            str = "broadcast";
                            break;
                        case 4:
                            str = "content_provider";
                            break;
                        case 5:
                            str = "job";
                            break;
                        case 6:
                            str = "launcher";
                            break;
                        case 7:
                            str = "launcher_recents";
                            break;
                        case 8:
                            str = "other";
                            break;
                        case 9:
                            str = "push";
                            break;
                        case 10:
                            str = "service";
                            break;
                        case 11:
                            str = "start_activity";
                            break;
                        default:
                            str = "unknown";
                            break;
                    }
                } else {
                    str = "unavailable";
                }
                r1l r1lVar = new r1l(str);
                if (i2 >= 36) {
                    if ((air0Var != null ? air0Var.f16085b : null) == null) {
                        strValueOf = "unavailable";
                    } else {
                        int iIntValue = air0Var.f16085b.intValue();
                        if (iIntValue == 1) {
                            strValueOf = "activity";
                        } else if (iIntValue == 2) {
                            strValueOf = "broadcast";
                        } else if (iIntValue == 3) {
                            strValueOf = "content_provider";
                        } else if (iIntValue != 4) {
                            strValueOf = iIntValue != 5 ? "unknown" : "other";
                        } else {
                            strValueOf = "service";
                        }
                    }
                }
                return h6f.m46715L(r1lVar, new q1l(strValueOf));
            default:
                if (i2 >= 29) {
                    try {
                        Integer num = (Integer) ((gg71) qe70Var).invoke();
                        if (num != null) {
                            int iIntValue2 = num.intValue();
                            switch (iIntValue2) {
                                case 0:
                                    strValueOf = "none";
                                    break;
                                case 1:
                                    strValueOf = "light";
                                    break;
                                case 2:
                                    strValueOf = "moderate";
                                    break;
                                case 3:
                                    strValueOf = "severe";
                                    break;
                                case 4:
                                    strValueOf = "critical";
                                    break;
                                case 5:
                                    strValueOf = "emergency";
                                    break;
                                case 6:
                                    strValueOf = "shutdown";
                                    break;
                                default:
                                    strValueOf = String.valueOf(iIntValue2);
                                    break;
                            }
                        } else {
                            strValueOf = "unavailable";
                        }
                    } catch (Throwable unused) {
                    }
                }
                return Collections.singletonList(new c2l(strValueOf));
        }
    }

    public bir0(ActivityManager activityManager) {
        int i = Build.VERSION.SDK_INT;
        zhr0 zhr0Var = new zhr0(activityManager);
        this.f27534b = i;
        this.f27535c = zhr0Var;
    }
}
