package p204p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class hb1 {

    /* JADX INFO: renamed from: a */
    public final Context f89349a;

    /* JADX INFO: renamed from: b */
    public final Resources f89350b;

    /* JADX INFO: renamed from: c */
    public final ft01 f89351c;

    /* JADX INFO: renamed from: d */
    public final er70 f89352d;

    /* JADX INFO: renamed from: e */
    public final er70 f89353e;

    /* JADX INFO: renamed from: f */
    public final ic1 f89354f;

    /* JADX INFO: renamed from: g */
    public final er70 f89355g;

    /* JADX INFO: renamed from: h */
    public final er70 f89356h;

    /* JADX INFO: renamed from: i */
    public final luk f89357i;

    public hb1(Context context, Resources resources, ft01 ft01Var, er70 er70Var, er70 er70Var2, ic1 ic1Var, er70 er70Var3, er70 er70Var4, luk lukVar) {
        this.f89349a = context;
        this.f89350b = resources;
        this.f89351c = ft01Var;
        this.f89352d = er70Var;
        this.f89353e = er70Var2;
        this.f89354f = ic1Var;
        this.f89355g = er70Var3;
        this.f89356h = er70Var4;
        this.f89357i = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m46958a(hb1 hb1Var, ibk ibkVar) {
        fb1 fb1Var;
        if (ibkVar instanceof fb1) {
            fb1Var = (fb1) ibkVar;
            int i = fb1Var.f67687c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fb1Var.f67687c = i - Integer.MIN_VALUE;
            } else {
                fb1Var = new fb1(hb1Var, ibkVar);
            }
        } else {
            fb1Var = new fb1(hb1Var, ibkVar);
        }
        Object objM67758f = fb1Var.f67685a;
        int i2 = fb1Var.f67687c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM67758f);
                ft01 ft01Var = hb1Var.f89351c;
                fb1Var.f67687c = 1;
                objM67758f = ((ot01) ft01Var).m67758f(fb1Var);
                Object obj = yuk.f276404a;
                if (objM67758f == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM67758f);
            }
            return new qb1((List) objM67758f);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "AddFriends: Failed to load destinations", new Object[0]);
            return pb1.f175686a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m46959b(hb1 hb1Var, kb1 kb1Var, ibk ibkVar) {
        gb1 gb1Var;
        if (ibkVar instanceof gb1) {
            gb1Var = (gb1) ibkVar;
            int i = gb1Var.f78164d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb1Var.f78164d = i - Integer.MIN_VALUE;
            } else {
                gb1Var = new gb1(hb1Var, ibkVar);
            }
        } else {
            gb1Var = new gb1(hb1Var, ibkVar);
        }
        Object objM37675j = gb1Var.f78162b;
        int i2 = gb1Var.f78164d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM37675j);
                e3p e3pVar = (e3p) hb1Var.f89353e.get();
                String str = kb1Var.f121030a;
                gb1Var.f78161a = kb1Var;
                gb1Var.f78164d = 1;
                objM37675j = e3pVar.m37675j(str, gb1Var);
                yuk yukVar = yuk.f276404a;
                if (objM37675j == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kb1Var = gb1Var.f78161a;
                bga.m29073P(objM37675j);
            }
            return new sb1(kb1Var.f121030a, ((rvc) objM37675j).f203049a, kb1Var.f121031b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, edb.m38564m("AddFriends: Failed to send invite to ", kb1Var.f121030a), new Object[0]);
            return new rb1(kb1Var.f121030a);
        }
    }
}
