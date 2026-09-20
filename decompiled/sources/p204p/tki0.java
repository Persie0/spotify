package p204p;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class tki0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ flw0 f221155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f221156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u4l0 f221157c;

    public tki0(flw0 flw0Var, Context context, u4l0 u4l0Var) {
        this.f221155a = flw0Var;
        this.f221156b = context;
        this.f221157c = u4l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #1 {all -> 0x005c, blocks: (B:20:0x0057, B:41:0x00de, B:44:0x00ec, B:54:0x0123, B:57:0x012e, B:45:0x00f9, B:47:0x00ff, B:49:0x010a, B:51:0x010e, B:53:0x0119, B:52:0x0113, B:48:0x0104), top: B:78:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:20:0x0057, B:41:0x00de, B:44:0x00ec, B:54:0x0123, B:57:0x012e, B:45:0x00f9, B:47:0x00ff, B:49:0x010a, B:51:0x010e, B:53:0x0119, B:52:0x0113, B:48:0x0104), top: B:78:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:20:0x0057, B:41:0x00de, B:44:0x00ec, B:54:0x0123, B:57:0x012e, B:45:0x00f9, B:47:0x00ff, B:49:0x010a, B:51:0x010e, B:53:0x0119, B:52:0x0113, B:48:0x0104), top: B:78:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0104 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:20:0x0057, B:41:0x00de, B:44:0x00ec, B:54:0x0123, B:57:0x012e, B:45:0x00f9, B:47:0x00ff, B:49:0x010a, B:51:0x010e, B:53:0x0119, B:52:0x0113, B:48:0x0104), top: B:78:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010e A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:20:0x0057, B:41:0x00de, B:44:0x00ec, B:54:0x0123, B:57:0x012e, B:45:0x00f9, B:47:0x00ff, B:49:0x010a, B:51:0x010e, B:53:0x0119, B:52:0x0113, B:48:0x0104), top: B:78:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0113 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:20:0x0057, B:41:0x00de, B:44:0x00ec, B:54:0x0123, B:57:0x012e, B:45:0x00f9, B:47:0x00ff, B:49:0x010a, B:51:0x010e, B:53:0x0119, B:52:0x0113, B:48:0x0104), top: B:78:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x012d  */
    /* JADX WARN: Code duplicated, block: B:64:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0172  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018d, code lost:
    
        if (r12.mo30229d(r0, r2) == r10) goto L73;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ski0 ski0Var;
        oki0 oki0Var;
        ili0 ili0Var;
        bqz0 bqz0Var2;
        int i;
        ili0 ili0Var2;
        String str;
        String str2;
        xr01 xr01Var;
        Throwable th;
        int i2;
        oki0 oki0Var2;
        String str3;
        xr01 xr01Var2;
        String strM91911g;
        bqz0 bqz0Var3;
        m811 m811Var;
        Uri uri;
        Context context;
        icr0 fcr0Var;
        Integer num;
        int color;
        Integer num2;
        int color2;
        String strM61105a;
        Object xki0Var;
        String message;
        String str4;
        if (ibkVar instanceof ski0) {
            ski0Var = (ski0) ibkVar;
            int i3 = ski0Var.f210105b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ski0Var.f210105b = i3 - Integer.MIN_VALUE;
            } else {
                ski0Var = new ski0(this, ibkVar);
            }
        } else {
            ski0Var = new ski0(this, ibkVar);
        }
        Object objM42028l = ski0Var.f210104a;
        int i4 = ski0Var.f210105b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i4 == 0) {
                bga.m29073P(objM42028l);
                oki0Var = (oki0) obj;
                ili0Var = (ili0) oki0Var.f166375e.m78984g();
                if (oki0Var.f166377g) {
                    long j = vki0.f242230a;
                    ski0Var.f210107d = bqz0Var;
                    ski0Var.f210108e = oki0Var;
                    ski0Var.f210109f = ili0Var;
                    ski0Var.f210113t = 0;
                    ski0Var.f210105b = 1;
                    if (njg1.m64620m(j, ski0Var) != yukVar) {
                        bqz0Var2 = bqz0Var;
                        i = 0;
                        ili0Var2 = ili0Var;
                    }
                } else {
                    bqz0Var2 = bqz0Var;
                    i = 0;
                    str = ili0Var.f103386a;
                    if (str == null) {
                        str = oki0Var.f166375e.f213201a.f201918a.f136946a;
                    }
                    str2 = str;
                    xr01Var = oki0Var.f166375e.f213201a.f201919b;
                    flw0 flw0Var = this.f221155a;
                    l811 l811Var = new l811(str2, xr01Var, null, null, 12);
                    ski0Var.f210107d = bqz0Var2;
                    ski0Var.f210108e = oki0Var;
                    ski0Var.f210109f = null;
                    ski0Var.f210110g = xr01Var;
                    ski0Var.f210111h = str2;
                    ski0Var.f210113t = i;
                    ski0Var.f210105b = 2;
                    objM42028l = flw0Var.m42028l(l811Var, ski0Var);
                    if (objM42028l != yukVar) {
                        str3 = str2;
                        xr01Var2 = xr01Var;
                        m811Var = (m811) objM42028l;
                        uri = (Uri) g6f.m43745s0(m811Var.f140901g);
                        context = this.f221156b;
                        if (uri != null) {
                            fcr0Var = new gcr0(uri, context.getString(R.string.image_background_default_content_description));
                        } else {
                            num = m811Var.f140896b;
                            if (num != null) {
                                color = num.intValue();
                            } else {
                                color = Color.parseColor("#FF535353");
                            }
                            num2 = m811Var.f140897c;
                            if (num2 != null) {
                                color2 = num2.intValue();
                            } else {
                                color2 = Color.parseColor("#000000");
                            }
                            fcr0Var = new fcr0(color, color2, context.getString(R.string.gradient_background_default_content_description));
                        }
                        Uri uri2 = m811Var.f140895a;
                        strM61105a = m811Var.m61105a();
                        if (strM61105a == null) {
                            strM61105a = "";
                        }
                        xki0Var = new xki0(fcr0Var, new gcr0(uri2, strM61105a));
                        ski0Var.f210107d = null;
                        ski0Var.f210108e = null;
                        ski0Var.f210109f = null;
                        ski0Var.f210110g = null;
                        ski0Var.f210111h = null;
                        ski0Var.f210112i = null;
                        ski0Var.f210105b = 4;
                    }
                }
                return yukVar;
            }
            if (i4 == 1) {
                i = ski0Var.f210113t;
                ili0Var2 = ski0Var.f210109f;
                oki0Var = ski0Var.f210108e;
                bqz0Var2 = ski0Var.f210107d;
                bga.m29073P(objM42028l);
            } else if (i4 == 2) {
                i = ski0Var.f210113t;
                str3 = ski0Var.f210111h;
                xr01Var2 = ski0Var.f210110g;
                oki0Var = ski0Var.f210108e;
                bqz0Var2 = ski0Var.f210107d;
                try {
                    bga.m29073P(objM42028l);
                    m811Var = (m811) objM42028l;
                    uri = (Uri) g6f.m43745s0(m811Var.f140901g);
                    context = this.f221156b;
                    if (uri != null) {
                        fcr0Var = new gcr0(uri, context.getString(R.string.image_background_default_content_description));
                    } else {
                        num = m811Var.f140896b;
                        if (num != null) {
                            color = num.intValue();
                        } else {
                            color = Color.parseColor("#FF535353");
                        }
                        num2 = m811Var.f140897c;
                        if (num2 != null) {
                            color2 = num2.intValue();
                        } else {
                            color2 = Color.parseColor("#000000");
                        }
                        fcr0Var = new fcr0(color, color2, context.getString(R.string.gradient_background_default_content_description));
                    }
                    Uri uri3 = m811Var.f140895a;
                    strM61105a = m811Var.m61105a();
                    if (strM61105a == null) {
                        strM61105a = "";
                    }
                    xki0Var = new xki0(fcr0Var, new gcr0(uri3, strM61105a));
                } catch (Throwable th2) {
                    int i5 = i;
                    th = th2;
                    i2 = i5;
                    oki0Var2 = oki0Var;
                    strM91911g = xr01Var2.m91911g();
                    ski0Var.f210107d = bqz0Var2;
                    ski0Var.f210108e = oki0Var2;
                    ski0Var.f210109f = null;
                    ski0Var.f210110g = null;
                    ski0Var.f210111h = null;
                    ski0Var.f210112i = th;
                    ski0Var.f210113t = i2;
                    ski0Var.f210105b = 3;
                    if (this.f221157c.m82356g(th, str3, strM91911g, ski0Var) != yukVar) {
                        bqz0Var3 = bqz0Var2;
                        Throwable th3 = th;
                        ou31 ou31Var = oki0Var2.f166374d;
                        sr01 sr01Var = oki0Var2.f166375e;
                        int i6 = oki0Var2.f166376f;
                        message = th3.getMessage();
                        if (message == null) {
                            str4 = "";
                        } else {
                            str4 = message;
                        }
                        bqz0Var2 = bqz0Var3;
                        xki0Var = new yki0(ou31Var, sr01Var, i6, str4, th3);
                    }
                    return yukVar;
                }
                ski0Var.f210107d = null;
                ski0Var.f210108e = null;
                ski0Var.f210109f = null;
                ski0Var.f210110g = null;
                ski0Var.f210111h = null;
                ski0Var.f210112i = null;
                ski0Var.f210105b = 4;
            } else if (i4 == 3) {
                th = ski0Var.f210112i;
                oki0Var2 = ski0Var.f210108e;
                bqz0Var3 = ski0Var.f210107d;
                bga.m29073P(objM42028l);
                Throwable th4 = th;
                ou31 ou31Var2 = oki0Var2.f166374d;
                sr01 sr01Var2 = oki0Var2.f166375e;
                int i7 = oki0Var2.f166376f;
                message = th4.getMessage();
                if (message == null) {
                    str4 = "";
                } else {
                    str4 = message;
                }
                bqz0Var2 = bqz0Var3;
                xki0Var = new yki0(ou31Var2, sr01Var2, i7, str4, th4);
                ski0Var.f210107d = null;
                ski0Var.f210108e = null;
                ski0Var.f210109f = null;
                ski0Var.f210110g = null;
                ski0Var.f210111h = null;
                ski0Var.f210112i = null;
                ski0Var.f210105b = 4;
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM42028l);
            }
            return w2a1.f247311a;
            flw0 flw0Var2 = this.f221155a;
            l811 l811Var2 = new l811(str2, xr01Var, null, null, 12);
            ski0Var.f210107d = bqz0Var2;
            ski0Var.f210108e = oki0Var;
            ski0Var.f210109f = null;
            ski0Var.f210110g = xr01Var;
            ski0Var.f210111h = str2;
            ski0Var.f210113t = i;
            ski0Var.f210105b = 2;
            objM42028l = flw0Var2.m42028l(l811Var2, ski0Var);
            if (objM42028l != yukVar) {
                str3 = str2;
                xr01Var2 = xr01Var;
                m811Var = (m811) objM42028l;
                uri = (Uri) g6f.m43745s0(m811Var.f140901g);
                context = this.f221156b;
                if (uri != null) {
                    fcr0Var = new gcr0(uri, context.getString(R.string.image_background_default_content_description));
                } else {
                    num = m811Var.f140896b;
                    if (num != null) {
                        color = num.intValue();
                    } else {
                        color = Color.parseColor("#FF535353");
                    }
                    num2 = m811Var.f140897c;
                    if (num2 != null) {
                        color2 = num2.intValue();
                    } else {
                        color2 = Color.parseColor("#000000");
                    }
                    fcr0Var = new fcr0(color, color2, context.getString(R.string.gradient_background_default_content_description));
                }
                Uri uri4 = m811Var.f140895a;
                strM61105a = m811Var.m61105a();
                if (strM61105a == null) {
                    strM61105a = "";
                }
                xki0Var = new xki0(fcr0Var, new gcr0(uri4, strM61105a));
                ski0Var.f210107d = null;
                ski0Var.f210108e = null;
                ski0Var.f210109f = null;
                ski0Var.f210110g = null;
                ski0Var.f210111h = null;
                ski0Var.f210112i = null;
                ski0Var.f210105b = 4;
            }
        } catch (Throwable th5) {
            int i8 = i;
            th = th5;
            i2 = i8;
            oki0Var2 = oki0Var;
            str3 = str2;
            xr01Var2 = xr01Var;
            strM91911g = xr01Var2.m91911g();
            ski0Var.f210107d = bqz0Var2;
            ski0Var.f210108e = oki0Var2;
            ski0Var.f210109f = null;
            ski0Var.f210110g = null;
            ski0Var.f210111h = null;
            ski0Var.f210112i = th;
            ski0Var.f210113t = i2;
            ski0Var.f210105b = 3;
            if (this.f221157c.m82356g(th, str3, strM91911g, ski0Var) != yukVar) {
                bqz0Var3 = bqz0Var2;
                Throwable th6 = th;
                ou31 ou31Var3 = oki0Var2.f166374d;
                sr01 sr01Var3 = oki0Var2.f166375e;
                int i9 = oki0Var2.f166376f;
                message = th6.getMessage();
                if (message == null) {
                    str4 = "";
                } else {
                    str4 = message;
                }
                bqz0Var2 = bqz0Var3;
                xki0Var = new yki0(ou31Var3, sr01Var3, i9, str4, th6);
                ski0Var.f210107d = null;
                ski0Var.f210108e = null;
                ski0Var.f210109f = null;
                ski0Var.f210110g = null;
                ski0Var.f210111h = null;
                ski0Var.f210112i = null;
                ski0Var.f210105b = 4;
            }
        }
        ili0Var = ili0Var2;
        str = ili0Var.f103386a;
        if (str == null) {
            str = oki0Var.f166375e.f213201a.f201918a.f136946a;
        }
        str2 = str;
        xr01Var = oki0Var.f166375e.f213201a.f201919b;
        return yukVar;
    }
}
