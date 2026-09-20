package p204p;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.Window;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.ravelin.core.model.Events;
import com.ravelin.core.model.RavelinError;
import com.ravelin.core.model.RavelinJSONError;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0f1 implements cy51, r0f1, hab, r9w0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f204377a;

    /* JADX INFO: renamed from: b */
    public final Object f204378b;

    /* JADX INFO: renamed from: c */
    public final Object f204379c;

    public /* synthetic */ s0f1(int i, Object obj, Object obj2) {
        this.f204377a = i;
        this.f204378b = obj;
        this.f204379c = obj2;
    }

    /* JADX INFO: renamed from: g */
    public static void m76863g(s0f1 s0f1Var, g2a1 g2a1Var) {
        y0i0 y0i0Var = (y0i0) g2a1Var.f75876b;
        y0i0 y0i0Var2 = (y0i0) s0f1Var.f204378b;
        long[] jArr = (long[]) y0i0Var2.f267991d;
        long[] jArr2 = (long[]) y0i0Var.f267991d;
        long[] jArr3 = (long[]) g2a1Var.f75877c;
        upf.m83680X(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) y0i0Var2.f267989b;
        long[] jArr5 = (long[]) y0i0Var.f267989b;
        long[] jArr6 = (long[]) y0i0Var.f267990c;
        upf.m83680X(jArr4, jArr5, jArr6);
        upf.m83680X((long[]) y0i0Var2.f267990c, jArr6, jArr3);
        upf.m83680X((long[]) s0f1Var.f204379c, jArr2, jArr5);
    }

    @Override // p204p.x0f1
    /* JADX INFO: renamed from: a */
    public Object mo49415a() {
        switch (this.f204377a) {
            case 1:
                p0f1 p0f1Var = (p0f1) this.f204379c;
                return new t0f1((d1f1) ((p0f1) this.f204378b).mo49415a(), (h1f1) p0f1Var.mo49415a());
            default:
                return new d1f1(((w2y0) this.f204378b).f247445a, (c3f1) ((p0f1) this.f204379c).mo49415a(), new t5m0());
        }
    }

    @Override // p204p.r9w0
    public /* synthetic */ void accept(Object obj, Object obj2) {
        switch (this.f204377a) {
            case 5:
                ((acf1) ((baf1) obj).m37438q()).m25471j2(new kgf1((thf1) this.f204378b, (ev61) obj2, 1), (wff1) this.f204379c);
                break;
            default:
                ((lkf1) this.f204378b).m59274y((String) this.f204379c, (cbh1) obj, (ev61) obj2);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public y7h1 m76864b(Activity activity, rul rulVar) {
        if (rulVar.mo43756g()) {
            return bga.m29102x(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", rulVar.mo43755c());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        ev61 ev61Var = new ev61();
        intent.putExtra("result_receiver", new nbg1(this, (Handler) this.f204379c, ev61Var));
        activity.startActivity(intent);
        return ev61Var.f63172a;
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: c */
    public void mo25640c(x8b x8bVar, o2x0 o2x0Var) {
        n1f1 n1f1Var = (n1f1) this.f204378b;
        lau0 lau0Var = (lau0) this.f204379c;
        if (o2x0Var.f161171a.f149852O0) {
            if (lau0Var != null) {
                Events eventsM63488i = n1f1Var.m63488i();
                if (eventsM63488i != null) {
                    eventsM63488i.Com8();
                }
                lau0Var.mo46941b();
                return;
            }
            return;
        }
        try {
            p3x0 p3x0Var = o2x0Var.f161173c;
            String strM69093g = p3x0Var != null ? p3x0Var.m69093g() : null;
            RavelinJSONError ravelinJSONError = (RavelinJSONError) (strM69093g != null ? (Parcelable) hv90.m48754w().m41880a(strM69093g, epv0.m39700t(RavelinJSONError.INSTANCE.serializer())) : null);
            if (ravelinJSONError != null) {
                int iLpt5 = ravelinJSONError.getStatus();
                if (lau0Var != null) {
                    lau0Var.mo46940a(new RavelinError(ravelinJSONError.getMessage(), null, 2, null));
                }
                if (1 <= iLpt5 && iLpt5 < 200) {
                    hbg1.m47048s(n1f1.f149409g, "Invalid status code status: " + ravelinJSONError.getStatus());
                    return;
                }
                if (200 <= iLpt5 && iLpt5 < 400) {
                    hbg1.m47048s(n1f1.f149409g, "A successful call status: " + ravelinJSONError.getStatus());
                    return;
                }
                if (400 <= iLpt5 && iLpt5 < 429) {
                    hbg1.m47048s(n1f1.f149409g, "Invalid request status: " + ravelinJSONError.getStatus());
                    return;
                }
                if (iLpt5 == 429) {
                    n1f1Var.m63487h(ravelinJSONError, false);
                    return;
                }
                if (450 <= iLpt5 && iLpt5 < 500) {
                    hbg1.m47048s(n1f1.f149409g, "Custom error-Client error, status: " + ravelinJSONError.getStatus());
                    return;
                }
                if (500 <= iLpt5 && iLpt5 < 506) {
                    n1f1Var.m63487h(ravelinJSONError, false);
                    return;
                }
                hbg1.m47048s(n1f1.f149409g, "We couldn't capture status code: " + iLpt5);
            }
        } catch (Exception e) {
            hbg1.m47048s(n1f1.f149409g, "An unexpected object came from an answer. Couldn't parse. " + e.getMessage());
        }
    }

    @Override // p204p.cy51
    /* JADX INFO: renamed from: d */
    public y7h1 mo27672d(Object obj) {
        t0f1 t0f1Var = (t0f1) this.f204378b;
        return bga.m29102x(new g1f1(t0f1Var.f215879b, ((m2f1) this.f204379c).f139334a, ((Long) obj).longValue()));
    }

    /* JADX INFO: renamed from: e */
    public String m76865e() {
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) this.f204378b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb.append("/");
            sb.append(upperCase);
        }
        Collection<String> collection = (Collection) this.f204379c;
        boolean z = false;
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            boolean z2 = str != null;
            if (str == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z3 = true;
            for (String string : collection) {
                acc.m25452b(string);
                if (!z3) {
                    sb.append(",");
                }
                if (!acc.f14312a.matcher(string).matches()) {
                    StringBuilder sb2 = new StringBuilder(string.length());
                    for (int i = 0; i < string.length(); i++) {
                        char cCharAt = string.charAt(i);
                        if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-' || cCharAt == '.' || cCharAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb2.append(cCharAt);
                        }
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                z3 = false;
            }
            z = z2;
        } else if (str != null) {
            z = true;
        }
        if (true != z && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public Enum m76866f(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) ((Map) this.f204379c).get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: h */
    public Object m76867h(c9h1 c9h1Var) throws GeneralSecurityException {
        Object obj = ((Map) this.f204378b).get(c9h1Var);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(c9h1Var)));
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: l */
    public void mo25646l(x8b x8bVar, Throwable th) {
        boolean z = th instanceof IOException;
        n1f1 n1f1Var = (n1f1) this.f204378b;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        n1f1Var.m63487h(new RavelinJSONError(0, message, (String) null, System.currentTimeMillis(), 4, (DefaultConstructorMarker) null), z);
        lau0 lau0Var = (lau0) this.f204379c;
        if (lau0Var != null) {
            lau0Var.mo46940a(new RavelinError(th.getMessage(), null, 2, null));
        }
    }

    public s0f1(Window window, String str, c4d1 c4d1Var) {
        this.f204377a = 7;
        this.f204378b = str;
        this.f204379c = c4d1Var;
    }

    public s0f1(RunnableC2650zh runnableC2650zh, AlertDialog alertDialog) {
        this.f204377a = 4;
        this.f204378b = alertDialog;
        this.f204379c = runnableC2650zh;
    }

    public s0f1(w2y0 w2y0Var, p0f1 p0f1Var, qbn0 qbn0Var) {
        this.f204377a = 2;
        this.f204378b = w2y0Var;
        this.f204379c = p0f1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s0f1() {
        this(10, new y0i0(21), new long[10]);
        this.f204377a = 10;
    }

    public s0f1(s4g1 s4g1Var) {
        this.f204377a = 8;
        this.f204379c = new Handler(Looper.getMainLooper());
        this.f204378b = s4g1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s0f1(g2a1 g2a1Var) {
        this();
        this.f204377a = 10;
        m76863g(this, g2a1Var);
    }
}
