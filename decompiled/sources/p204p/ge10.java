package p204p;

import android.content.Context;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ge10 {

    /* JADX INFO: renamed from: a */
    public final y101 f78991a = z101.m95089a();

    /* JADX INFO: renamed from: e */
    public static Object m44444e(ge10 ge10Var, Context context, int i, ibk ibkVar) {
        ge10Var.getClass();
        za81.m95766a();
        Object objM92609b = ge10Var.f78991a.m92609b(new af5(context, new ie5(i), ge10Var, (fbk) null), ibkVar);
        return objM92609b == yuk.f276404a ? objM92609b : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m44445a(Context context, int i, ibk ibkVar) throws Throwable {
        fe10 fe10Var;
        ge10 ge10Var;
        Context context2;
        int i2;
        zzx0 zzx0VarMo44447c;
        ye10 ye10Var;
        String strM59157i;
        zzx0 zzx0VarMo44447c2;
        ye10 ye10Var2;
        String strM59157i2;
        zzx0 zzx0VarMo44447c3;
        ye10 ye10Var3;
        String strM59157i3;
        if (ibkVar instanceof fe10) {
            fe10Var = (fe10) ibkVar;
            int i3 = fe10Var.f68655f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fe10Var.f68655f = i3 - Integer.MIN_VALUE;
            } else {
                fe10Var = new fe10(this, ibkVar);
            }
        } else {
            fe10Var = new fe10(this, ibkVar);
        }
        Object obj = fe10Var.f68653d;
        int i4 = fe10Var.f68655f;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        switch (i4) {
            case 0:
                bga.m29073P(obj);
                dmx dmxVar = new dmx(new ie5(i), fbkVar, 23);
                fe10Var.f68650a = this;
                fe10Var.f68651b = context;
                fe10Var.f68652c = i;
                fe10Var.f68655f = 1;
                if (this.f78991a.m92609b(dmxVar, fe10Var) != yukVar) {
                    ge10Var = this;
                    try {
                        fe10Var.f68650a = ge10Var;
                        fe10Var.f68651b = context;
                        fe10Var.f68652c = i;
                        fe10Var.f68655f = 2;
                        ge10Var.getClass();
                        if (w2a1Var != yukVar) {
                            int i5 = i;
                            context2 = context;
                            i2 = i5;
                            zzx0VarMo44447c3 = ge10Var.mo44447c();
                            if (zzx0VarMo44447c3 != null) {
                                ye10Var3 = ye10.f271888a;
                                strM59157i3 = ljf1.m59157i(i2);
                                fe10Var.f68650a = null;
                                fe10Var.f68651b = null;
                                fe10Var.f68655f = 3;
                                if (ye10Var3.m93515a(context2, zzx0VarMo44447c3, strM59157i3, fe10Var) == yukVar) {
                                }
                            }
                            return w2a1Var;
                        }
                    } catch (CancellationException unused) {
                        int i6 = i;
                        context2 = context;
                        i2 = i6;
                        zzx0VarMo44447c2 = ge10Var.mo44447c();
                        if (zzx0VarMo44447c2 != null) {
                            ye10Var2 = ye10.f271888a;
                            strM59157i2 = ljf1.m59157i(i2);
                            fe10Var.f68650a = null;
                            fe10Var.f68651b = null;
                            fe10Var.f68655f = 4;
                            if (ye10Var2.m93515a(context2, zzx0VarMo44447c2, strM59157i2, fe10Var) == yukVar) {
                                return yukVar;
                            }
                        }
                    } catch (Throwable unused2) {
                        int i7 = i;
                        context2 = context;
                        i2 = i7;
                        zzx0VarMo44447c = ge10Var.mo44447c();
                        if (zzx0VarMo44447c != null) {
                            ye10Var = ye10.f271888a;
                            strM59157i = ljf1.m59157i(i2);
                            fe10Var.f68650a = null;
                            fe10Var.f68651b = null;
                            fe10Var.f68655f = 5;
                            if (ye10Var.m93515a(context2, zzx0VarMo44447c, strM59157i, fe10Var) == yukVar) {
                                return yukVar;
                            }
                        }
                    }
                }
                return yukVar;
            case 1:
                i = fe10Var.f68652c;
                context = fe10Var.f68651b;
                ge10Var = fe10Var.f68650a;
                bga.m29073P(obj);
                fe10Var.f68650a = ge10Var;
                fe10Var.f68651b = context;
                fe10Var.f68652c = i;
                fe10Var.f68655f = 2;
                ge10Var.getClass();
                if (w2a1Var != yukVar) {
                    int i8 = i;
                    context2 = context;
                    i2 = i8;
                    zzx0VarMo44447c3 = ge10Var.mo44447c();
                    if (zzx0VarMo44447c3 != null) {
                        ye10Var3 = ye10.f271888a;
                        strM59157i3 = ljf1.m59157i(i2);
                        fe10Var.f68650a = null;
                        fe10Var.f68651b = null;
                        fe10Var.f68655f = 3;
                        if (ye10Var3.m93515a(context2, zzx0VarMo44447c3, strM59157i3, fe10Var) == yukVar) {
                        }
                    }
                    return w2a1Var;
                }
                return yukVar;
            case 2:
                i2 = fe10Var.f68652c;
                context2 = fe10Var.f68651b;
                ge10Var = fe10Var.f68650a;
                try {
                    bga.m29073P(obj);
                    zzx0VarMo44447c3 = ge10Var.mo44447c();
                    if (zzx0VarMo44447c3 != null) {
                        ye10Var3 = ye10.f271888a;
                        strM59157i3 = ljf1.m59157i(i2);
                        fe10Var.f68650a = null;
                        fe10Var.f68651b = null;
                        fe10Var.f68655f = 3;
                        if (ye10Var3.m93515a(context2, zzx0VarMo44447c3, strM59157i3, fe10Var) == yukVar) {
                            return yukVar;
                        }
                    }
                } catch (CancellationException unused3) {
                    zzx0VarMo44447c2 = ge10Var.mo44447c();
                    if (zzx0VarMo44447c2 != null) {
                        ye10Var2 = ye10.f271888a;
                        strM59157i2 = ljf1.m59157i(i2);
                        fe10Var.f68650a = null;
                        fe10Var.f68651b = null;
                        fe10Var.f68655f = 4;
                        if (ye10Var2.m93515a(context2, zzx0VarMo44447c2, strM59157i2, fe10Var) == yukVar) {
                            return yukVar;
                        }
                    }
                } catch (Throwable unused4) {
                    zzx0VarMo44447c = ge10Var.mo44447c();
                    if (zzx0VarMo44447c != null) {
                        ye10Var = ye10.f271888a;
                        strM59157i = ljf1.m59157i(i2);
                        fe10Var.f68650a = null;
                        fe10Var.f68651b = null;
                        fe10Var.f68655f = 5;
                        if (ye10Var.m93515a(context2, zzx0VarMo44447c, strM59157i, fe10Var) == yukVar) {
                            return yukVar;
                        }
                    }
                }
                return w2a1Var;
            case 3:
                bga.m29073P(obj);
                return w2a1Var;
            case 4:
            case 5:
                bga.m29073P(obj);
                return w2a1Var;
            case 6:
                Throwable th = (Throwable) fe10Var.f68650a;
                bga.m29073P(obj);
                throw th;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract ni21 mo44446b();

    /* JADX INFO: renamed from: c */
    public abstract zzx0 mo44447c();

    /* JADX INFO: renamed from: d */
    public abstract void mo44448d(Context context, ie5 ie5Var, fbk fbkVar);
}
