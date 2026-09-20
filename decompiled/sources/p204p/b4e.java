package p204p;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes2.dex */
public final class b4e {

    /* JADX INFO: renamed from: a */
    public final Context f23316a;

    /* JADX INFO: renamed from: b */
    public final rta0 f23317b;

    /* JADX INFO: renamed from: c */
    public final if0 f23318c;

    /* JADX INFO: renamed from: d */
    public final dic1 f23319d;

    /* JADX INFO: renamed from: e */
    public final z3e f23320e;

    /* JADX INFO: renamed from: f */
    public final d4e f23321f;

    /* JADX INFO: renamed from: g */
    public final ezm0 f23322g;

    /* JADX INFO: renamed from: h */
    public final c9k f23323h;

    public b4e(Context context, rta0 rta0Var, if0 if0Var, dic1 dic1Var, z3e z3eVar, d4e d4eVar, ezm0 ezm0Var, luk lukVar) {
        this.f23316a = context;
        this.f23317b = rta0Var;
        this.f23318c = if0Var;
        this.f23319d = dic1Var;
        this.f23320e = z3eVar;
        this.f23321f = d4eVar;
        this.f23322g = ezm0Var;
        this.f23323h = dq60.m36621u(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: a */
    public static final Object m28087a(b4e b4eVar, String str, ibk ibkVar) {
        a4e a4eVar;
        b4eVar.getClass();
        Context context = b4eVar.f23316a;
        if (ibkVar instanceof a4e) {
            a4eVar = (a4e) ibkVar;
            int i = a4eVar.f12209c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a4eVar.f12209c = i - Integer.MIN_VALUE;
            } else {
                a4eVar = new a4e(b4eVar, ibkVar);
            }
        } else {
            a4eVar = new a4e(b4eVar, ibkVar);
        }
        Object objM95270a = a4eVar.f12207a;
        int i2 = a4eVar.f12209c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM95270a);
                ((e4e) b4eVar.f23321f).m37770a();
                z3e z3eVar = b4eVar.f23320e;
                a4eVar.f12209c = 1;
                objM95270a = z3eVar.m95270a(str, a4eVar);
                yuk yukVar = yuk.f276404a;
                if (objM95270a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM95270a);
            }
            kv7 kv7Var = (kv7) objM95270a;
            ezm0 ezm0Var = b4eVar.f23322g;
            String strM57447b = kv7Var.m57447b();
            String strM57446a = kv7Var.m57446a();
            ezm0Var.getClass();
            Uri uri = Uri.parse("https://accounts.spotify.com/login/ott/music#username=" + strM57447b + "&token=" + strM57446a + "&flow=parental_consent");
            rta0 rta0Var = b4eVar.f23317b;
            k791 k791VarM36074a = b4eVar.f23319d.m36074a(context, WidgetInteraction.Background.DESTINATION_HOME);
            k791VarM36074a.m55637c();
            context.startActivity(rta0.m76376c(rta0Var, context, k791VarM36074a.m55636b(), uri, 116));
        } catch (Exception e) {
            Logger.m3966b(edb.m38564m("Failed to login transitioned account: ", e.getMessage()), new Object[0]);
            b4eVar.f23318c.m50413e(new j0r(false), true);
        }
        return w2a1.f247311a;
    }
}
