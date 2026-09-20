package p204p;

import android.app.Activity;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class doa0 {

    /* JADX INFO: renamed from: a */
    public final Activity f50995a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f50996b;

    /* JADX INFO: renamed from: c */
    public final iqq0 f50997c;

    /* JADX INFO: renamed from: d */
    public final apa0 f50998d;

    /* JADX INFO: renamed from: e */
    public final q831 f50999e;

    /* JADX INFO: renamed from: f */
    public final luk f51000f;

    /* JADX INFO: renamed from: g */
    public final luk f51001g;

    public doa0(Activity activity, z9j0 z9j0Var, iqq0 iqq0Var, apa0 apa0Var, q831 q831Var, luk lukVar, luk lukVar2) {
        this.f50995a = activity;
        this.f50996b = z9j0Var;
        this.f50997c = iqq0Var;
        this.f50998d = apa0Var;
        this.f50999e = q831Var;
        this.f51000f = lukVar;
        this.f51001g = lukVar2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3 A[Catch: Exception -> 0x00df, CancellationException -> 0x0110, TRY_LEAVE, TryCatch #1 {Exception -> 0x00df, blocks: (B:44:0x00ba, B:46:0x00c3), top: B:66:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m36526a(doa0 doa0Var, rna0 rna0Var, ibk ibkVar) {
        coa0 coa0Var;
        String string;
        String strM88495s1;
        Exception e;
        String str;
        rna0 rna0Var2;
        String str2;
        luk lukVar;
        una0 una0Var;
        String str3;
        rna0 rna0Var3;
        if (ibkVar instanceof coa0) {
            coa0Var = (coa0) ibkVar;
            int i = coa0Var.f40218f;
            if ((i & Integer.MIN_VALUE) != 0) {
                coa0Var.f40218f = i - Integer.MIN_VALUE;
            } else {
                coa0Var = new coa0(doa0Var, ibkVar);
            }
        } else {
            coa0Var = new coa0(doa0Var, ibkVar);
        }
        Object obj = coa0Var.f40216d;
        int i2 = coa0Var.f40218f;
        fbk fbkVar = null;
        int i3 = 2;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                string = doa0Var.f50995a.getString(R.string.lock_state_callback_error);
                String str4 = rna0Var.f200857a;
                if (wl51.m88497u0(str4, '\\')) {
                    strM88495s1 = null;
                } else {
                    strM88495s1 = wl51.m88495s1(str4, '/');
                    if (strM88495s1.length() == 0 || wl51.m88496t0(strM88495s1, "://", false) || wl51.m88496t0(strM88495s1, "..", false)) {
                        strM88495s1 = null;
                    }
                }
                if (strM88495s1 == null) {
                    Logger.m3973i(edb.m38564m("LockStateCallback: Rejected unsafe callback path: ", rna0Var.f200857a), new Object[0]);
                    return new joa0(rna0Var.f200859c, string);
                }
                try {
                    apa0 apa0Var = doa0Var.f50998d;
                    coa0Var.f40213a = rna0Var;
                    coa0Var.f40214b = string;
                    coa0Var.f40215c = strM88495s1;
                    coa0Var.f40218f = 1;
                    if (apa0Var.m26671b(strM88495s1, coa0Var) != yukVar) {
                        rna0Var2 = rna0Var;
                        str2 = strM88495s1;
                        xtf1.m92047v(rna0Var2.f200858b);
                        if (rna0Var2.f200860d) {
                            lukVar = doa0Var.f51001g;
                            una0Var = new una0(doa0Var, fbkVar, i3);
                            coa0Var.f40213a = rna0Var2;
                            coa0Var.f40214b = string;
                            coa0Var.f40215c = str2;
                            coa0Var.f40218f = 2;
                            if (x0h1.m89557A(lukVar, una0Var, coa0Var) != yukVar) {
                                str = str2;
                                str3 = string;
                                rna0Var3 = rna0Var2;
                                string = str3;
                                rna0Var = rna0Var3;
                            }
                        } else {
                            str = str2;
                            rna0Var = rna0Var2;
                        }
                        return new koa0(rna0Var.f200858b);
                    }
                    return yukVar;
                } catch (Exception e2) {
                    e = e2;
                    str = strM88495s1;
                }
            } else if (i2 == 1) {
                str2 = coa0Var.f40215c;
                String str5 = coa0Var.f40214b;
                rna0Var2 = coa0Var.f40213a;
                try {
                    bga.m29073P(obj);
                    string = str5;
                    try {
                        xtf1.m92047v(rna0Var2.f200858b);
                        if (rna0Var2.f200860d) {
                            lukVar = doa0Var.f51001g;
                            una0Var = new una0(doa0Var, fbkVar, i3);
                            coa0Var.f40213a = rna0Var2;
                            coa0Var.f40214b = string;
                            coa0Var.f40215c = str2;
                            coa0Var.f40218f = 2;
                            if (x0h1.m89557A(lukVar, una0Var, coa0Var) != yukVar) {
                                str = str2;
                                str3 = string;
                                rna0Var3 = rna0Var2;
                                string = str3;
                                rna0Var = rna0Var3;
                            }
                            return yukVar;
                        }
                        str = str2;
                        rna0Var = rna0Var2;
                        return new koa0(rna0Var.f200858b);
                    } catch (Exception e3) {
                        e = e3;
                        str = str2;
                        rna0Var = rna0Var2;
                    }
                } catch (Exception e4) {
                    str = str2;
                    e = e4;
                    string = str5;
                    rna0Var = rna0Var2;
                    Logger.m3973i(edb.m38566o("LockStateCallback: Callback failed for path: ", str, ", follow-up: ", xtf1.m92047v(rna0Var.f200859c)), e);
                    return new joa0(rna0Var.f200859c, string);
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = coa0Var.f40215c;
                str3 = coa0Var.f40214b;
                rna0Var3 = coa0Var.f40213a;
                try {
                    bga.m29073P(obj);
                    string = str3;
                    rna0Var = rna0Var3;
                    try {
                        return new koa0(rna0Var.f200858b);
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Exception e6) {
                    string = str3;
                    rna0Var = rna0Var3;
                    e = e6;
                }
            }
            Logger.m3973i(edb.m38566o("LockStateCallback: Callback failed for path: ", str, ", follow-up: ", xtf1.m92047v(rna0Var.f200859c)), e);
            return new joa0(rna0Var.f200859c, string);
        } catch (CancellationException e7) {
            throw e7;
        }
    }
}
