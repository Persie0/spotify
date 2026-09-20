package p204p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.widgets.widgetstate.WidgetState;
import com.spotify.widgets.widgetstate.WidgetStateKt;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class fjc1 {

    /* JADX INFO: renamed from: a */
    public final Context f70160a;

    /* JADX INFO: renamed from: b */
    public final er70 f70161b;

    /* JADX INFO: renamed from: c */
    public final er70 f70162c;

    /* JADX INFO: renamed from: d */
    public final er70 f70163d;

    /* JADX INFO: renamed from: e */
    public final xo4 f70164e;

    /* JADX INFO: renamed from: f */
    public final er70 f70165f;

    /* JADX INFO: renamed from: g */
    public final fiz f70166g;

    /* JADX INFO: renamed from: h */
    public final bsi f70167h;

    /* JADX INFO: renamed from: i */
    public final zza0 f70168i;

    /* JADX INFO: renamed from: j */
    public final jv4 f70169j;

    /* JADX INFO: renamed from: k */
    public final x4b f70170k;

    public fjc1(Context context, er70 er70Var, er70 er70Var2, er70 er70Var3, xo4 xo4Var, er70 er70Var4, fiz fizVar, bsi bsiVar, zza0 zza0Var, jv4 jv4Var, x4b x4bVar, er70 er70Var5) {
        this.f70160a = context;
        this.f70161b = er70Var;
        this.f70162c = er70Var2;
        this.f70163d = er70Var3;
        this.f70164e = xo4Var;
        this.f70165f = er70Var4;
        this.f70166g = fizVar;
        this.f70167h = bsiVar;
        this.f70168i = zza0Var;
        this.f70169j = jv4Var;
        this.f70170k = x4bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m41799a(fjc1 fjc1Var, PlayerState playerState, sr4 sr4Var, ibk ibkVar) {
        ajc1 ajc1Var;
        Object obj;
        if (ibkVar instanceof ajc1) {
            ajc1Var = (ajc1) ibkVar;
            int i = ajc1Var.f16243d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ajc1Var.f16243d = i - Integer.MIN_VALUE;
            } else {
                ajc1Var = new ajc1(fjc1Var, ibkVar);
            }
        } else {
            ajc1Var = new ajc1(fjc1Var, ibkVar);
        }
        Object objM25412a = ajc1Var.f16241b;
        int i2 = ajc1Var.f16243d;
        if (i2 == 0) {
            bga.m29073P(objM25412a);
            if (!fjc1Var.f70169j.m54364d()) {
                return jx81.f117066a;
            }
            sr4Var.getClass();
            sr4Var.m79019k("traits_metadata_fetch", null, (4 & 4) != 0);
            ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
            String strUri = contextTrack != null ? contextTrack.uri() : null;
            if (strUri == null) {
                obj = kx81.f127361a;
            } else {
                ac10 ac10Var = (ac10) fjc1Var.f70165f.get();
                ajc1Var.f16240a = sr4Var;
                ajc1Var.f16243d = 1;
                objM25412a = ac10Var.m25412a(strUri, ajc1Var);
                yuk yukVar = yuk.f276404a;
                if (objM25412a == yukVar) {
                    return yukVar;
                }
            }
            sr4Var.m79016f("traits_metadata_fetch");
            return obj;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sr4Var = ajc1Var.f16240a;
        bga.m29073P(objM25412a);
        obj = (mx81) objM25412a;
        sr4Var.m79016f("traits_metadata_fetch");
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: b */
    public final Object m41800b(String str, String str2, sr4 sr4Var, boolean z, ibk ibkVar) {
        bjc1 bjc1Var;
        String str3;
        String str4;
        String str5;
        if (ibkVar instanceof bjc1) {
            bjc1Var = (bjc1) ibkVar;
            int i = bjc1Var.f27664d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bjc1Var.f27664d = i - Integer.MIN_VALUE;
            } else {
                bjc1Var = new bjc1(this, ibkVar);
            }
        } else {
            bjc1Var = new bjc1(this, ibkVar);
        }
        bjc1 bjc1Var2 = bjc1Var;
        Object objM76979t = bjc1Var2.f27662b;
        int i2 = bjc1Var2.f27664d;
        bsi bsiVar = this.f70167h;
        if (i2 == 0) {
            bga.m29073P(objM76979t);
            try {
                long j = gjc1.f80437b;
                cjc1 cjc1Var = new cjc1(this, sr4Var, str, str2, z, null);
                bjc1Var2.f27661a = str;
                bjc1Var2.f27664d = 1;
                objM76979t = s1h1.m76979t(j, cjc1Var, bjc1Var2);
                yuk yukVar = yuk.f276404a;
                if (objM76979t == yukVar) {
                    return yukVar;
                }
                str5 = str;
            } catch (TimeoutCancellationException e) {
                e = e;
                str4 = str;
                bsiVar.m30441f(str4, 3, new TimeoutException(e.getMessage()));
                return new WidgetState.TapToReload(str4);
            } catch (Exception e2) {
                e = e2;
                str3 = str;
                Logger.m3974j(e, "Widget can't load recommendations", new Object[0]);
                bsiVar.m30440e(str3, 1, e);
                return new WidgetState.TapToReload(str3);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = bjc1Var2.f27661a;
            try {
                bga.m29073P(objM76979t);
            } catch (TimeoutCancellationException e3) {
                e = e3;
                str4 = str5;
                bsiVar.m30441f(str4, 3, new TimeoutException(e.getMessage()));
                return new WidgetState.TapToReload(str4);
            } catch (Exception e4) {
                e = e4;
                str3 = str5;
                Logger.m3974j(e, "Widget can't load recommendations", new Object[0]);
                bsiVar.m30440e(str3, 1, e);
                return new WidgetState.TapToReload(str3);
            }
        }
        return (WidgetState) objM76979t;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m41801c(String str, sr4 sr4Var, boolean z, ibk ibkVar) {
        djc1 djc1Var;
        String str2;
        if (ibkVar instanceof djc1) {
            djc1Var = (djc1) ibkVar;
            int i = djc1Var.f49657d;
            if ((i & Integer.MIN_VALUE) != 0) {
                djc1Var.f49657d = i - Integer.MIN_VALUE;
            } else {
                djc1Var = new djc1(this, ibkVar);
            }
        } else {
            djc1Var = new djc1(this, ibkVar);
        }
        djc1 djc1Var2 = djc1Var;
        Object objM76979t = djc1Var2.f49655b;
        int i2 = djc1Var2.f49657d;
        bsi bsiVar = this.f70167h;
        if (i2 == 0) {
            bga.m29073P(objM76979t);
            try {
                long j = gjc1.f80437b;
                ml1 ml1Var = new ml1(this, str, sr4Var, z, (fbk) null);
                djc1Var2.f49654a = str;
                djc1Var2.f49657d = 1;
                objM76979t = s1h1.m76979t(j, ml1Var, djc1Var2);
                yuk yukVar = yuk.f276404a;
                if (objM76979t == yukVar) {
                    return yukVar;
                }
                str2 = str;
            } catch (TimeoutCancellationException e) {
                e = e;
                str2 = str;
                bsiVar.m30441f(str2, 1, new TimeoutException(e.getMessage()));
                cks.m33200s(gjc1.f80437b);
                return new WidgetState.TapToReload(str2);
            } catch (Exception e2) {
                e = e2;
                str2 = str;
                Logger.m3974j(e, "Widget can't load recommendations", new Object[0]);
                bsiVar.m30440e(str2, 2, e);
                return new WidgetState.TapToReload(str2);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = djc1Var2.f49654a;
            try {
                bga.m29073P(objM76979t);
            } catch (TimeoutCancellationException e3) {
                e = e3;
                bsiVar.m30441f(str2, 1, new TimeoutException(e.getMessage()));
                cks.m33200s(gjc1.f80437b);
                return new WidgetState.TapToReload(str2);
            } catch (Exception e4) {
                e = e4;
                Logger.m3974j(e, "Widget can't load recommendations", new Object[0]);
                bsiVar.m30440e(str2, 2, e);
                return new WidgetState.TapToReload(str2);
            }
        }
        return (WidgetState) objM76979t;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:53:0x0150  */
    /* JADX WARN: Code duplicated, block: B:57:0x017d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0193  */
    /* JADX WARN: Code duplicated, block: B:63:0x019b  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0200  */
    /* JADX WARN: Code duplicated, block: B:78:0x020b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:82:0x0227 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        if (r0 == r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0175, code lost:
    
        if (r0 == r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ae, code lost:
    
        if (r0 == r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d6, code lost:
    
        if (r0 == r9) goto L82;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m41802d(int i, String str, ctd1 ctd1Var, sr4 sr4Var, String str2, boolean z, ibk ibkVar) throws Throwable {
        ejc1 ejc1Var;
        ctd1 ctd1Var2;
        sr4 sr4Var2;
        String str3;
        String str4;
        boolean z2;
        int iOrdinal;
        ejc1 ejc1Var2;
        int i2;
        boolean z3;
        zza0 zza0Var;
        sr4 sr4Var3;
        String str5;
        sr4 sr4Var4;
        String str6;
        WidgetState widgetState;
        if (ibkVar instanceof ejc1) {
            ejc1Var = (ejc1) ibkVar;
            int i3 = ejc1Var.f60195i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ejc1Var.f60195i = i3 - Integer.MIN_VALUE;
            } else {
                ejc1Var = new ejc1(this, ibkVar);
            }
        } else {
            ejc1Var = new ejc1(this, ibkVar);
        }
        Object objM89557A = ejc1Var.f60193g;
        int i4 = ejc1Var.f60195i;
        wza0 wza0Var = wza0.f256546a;
        x4b x4bVar = this.f70170k;
        er70 er70Var = this.f70163d;
        Object obj = yuk.f276404a;
        switch (i4) {
            case 0:
                bga.m29073P(objM89557A);
                jv4 jv4Var = this.f70169j;
                if (jv4Var.m54361a()) {
                    return new WidgetState.Custom(str, false, 2, null);
                }
                jv4Var.m54370j();
                ctd1Var2 = ctd1Var;
                sr4Var2 = sr4Var;
                str3 = str2;
                str4 = str;
                z2 = z;
                iOrdinal = ctd1Var2.ordinal();
                if (iOrdinal != 1) {
                    zza0Var = this.f70168i;
                    if (iOrdinal != 6) {
                        ejc1Var2 = ejc1Var;
                        ejc1Var2.f60188b = str4;
                        ejc1Var2.f60189c = sr4Var2;
                        ejc1Var2.f60190d = null;
                        ejc1Var2.f60187a = i;
                        ejc1Var2.f60192f = z2;
                        ejc1Var2.f60195i = 4;
                        objM89557A = zza0Var.m97286a(ejc1Var2);
                        if (objM89557A != obj) {
                            boolean z4 = z2;
                            i2 = i;
                            z3 = z4;
                            sr4Var3 = sr4Var2;
                            if (((wza0) objM89557A) == wza0Var) {
                                uz91 uz91Var = (uz91) er70Var.get();
                                ejc1Var2.f60188b = null;
                                ejc1Var2.f60189c = null;
                                ejc1Var2.f60190d = null;
                                ejc1Var2.f60191e = null;
                                ejc1Var2.f60187a = i2;
                                ejc1Var2.f60192f = z3;
                                ejc1Var2.f60195i = 6;
                                yz91 yz91Var = (yz91) uz91Var;
                                objM89557A = x0h1.m89557A(yz91Var.f277739d, new xz91(yz91Var, str4, null), ejc1Var2);
                            } else {
                                ejc1Var2.f60188b = null;
                                ejc1Var2.f60189c = null;
                                ejc1Var2.f60190d = null;
                                ejc1Var2.f60191e = null;
                                ejc1Var2.f60187a = i2;
                                ejc1Var2.f60192f = z3;
                                ejc1Var2.f60195i = 5;
                                objM89557A = m41801c(str4, sr4Var3, z3, ejc1Var2);
                            }
                        }
                    } else {
                        ejc1Var.f60188b = str4;
                        ejc1Var.f60189c = sr4Var2;
                        ejc1Var.f60190d = str3;
                        ejc1Var.f60187a = i;
                        ejc1Var.f60192f = z2;
                        ejc1Var.f60195i = 7;
                        objM89557A = zza0Var.m97286a(ejc1Var);
                        if (objM89557A != obj) {
                            boolean z5 = z2;
                            i2 = i;
                            z3 = z5;
                            str5 = str3;
                            sr4Var4 = sr4Var2;
                            str6 = str4;
                            if (((wza0) objM89557A) == wza0Var) {
                                String str7 = str6;
                                ejc1Var2 = ejc1Var;
                                uz91 uz91Var2 = (uz91) er70Var.get();
                                ejc1Var2.f60188b = null;
                                ejc1Var2.f60189c = null;
                                ejc1Var2.f60190d = null;
                                ejc1Var2.f60191e = null;
                                ejc1Var2.f60187a = i2;
                                ejc1Var2.f60192f = z3;
                                ejc1Var2.f60195i = 9;
                                yz91 yz91Var2 = (yz91) uz91Var2;
                                objM89557A = x0h1.m89557A(yz91Var2.f277739d, new xz91(yz91Var2, str7, null), ejc1Var2);
                            } else {
                                ejc1Var.f60188b = null;
                                ejc1Var.f60189c = null;
                                ejc1Var.f60190d = null;
                                ejc1Var.f60191e = null;
                                ejc1Var.f60187a = i2;
                                ejc1Var.f60192f = z3;
                                ejc1Var.f60195i = 8;
                                boolean z6 = z3;
                                ejc1 ejc1Var3 = ejc1Var;
                                objM89557A = m41800b(str6, str5, sr4Var4, z6, ejc1Var3);
                                z3 = z6;
                                ejc1Var2 = ejc1Var3;
                            }
                        }
                    }
                    break;
                } else {
                    ejc1Var2 = ejc1Var;
                    uz91 uz91Var3 = (uz91) er70Var.get();
                    ejc1Var2.f60188b = null;
                    ejc1Var2.f60189c = null;
                    ejc1Var2.f60190d = null;
                    ejc1Var2.f60187a = i;
                    ejc1Var2.f60192f = z2;
                    ejc1Var2.f60195i = 3;
                    yz91 yz91Var3 = (yz91) uz91Var3;
                    objM89557A = x0h1.m89557A(yz91Var3.f277739d, new xz91(yz91Var3, str4, null), ejc1Var2);
                    if (objM89557A != obj) {
                        boolean z7 = z2;
                        i2 = i;
                        z3 = z7;
                        widgetState = (WidgetState) objM89557A;
                        if (widgetState.getIsWorkProfile() && WidgetStateKt.hasArtwork(widgetState)) {
                            ejc1Var2.f60188b = null;
                            ejc1Var2.f60189c = null;
                            ejc1Var2.f60190d = null;
                            ejc1Var2.f60191e = widgetState;
                            ejc1Var2.f60187a = i2;
                            ejc1Var2.f60192f = z3;
                            ejc1Var2.f60195i = 10;
                            if (x4bVar.m89857G(widgetState, ejc1Var2) == obj) {
                            }
                        }
                        return widgetState;
                    }
                }
                return obj;
            case 1:
                boolean z8 = ejc1Var.f60192f;
                int i5 = ejc1Var.f60187a;
                str3 = ejc1Var.f60190d;
                sr4Var2 = ejc1Var.f60189c;
                str4 = ejc1Var.f60188b;
                bga.m29073P(objM89557A);
                WidgetState widgetState2 = (WidgetState) objM89557A;
                if (widgetState2 != null) {
                    if (widgetState2.getIsWorkProfile() && WidgetStateKt.hasArtwork(widgetState2)) {
                        ejc1Var.f60188b = null;
                        ejc1Var.f60189c = null;
                        ejc1Var.f60190d = null;
                        ejc1Var.f60191e = widgetState2;
                        ejc1Var.f60187a = i5;
                        ejc1Var.f60192f = z8;
                        ejc1Var.f60195i = 2;
                        if (x4bVar.m89857G(widgetState2, ejc1Var) == obj) {
                        }
                    }
                    return widgetState2;
                }
                z2 = z8;
                i = i5;
                ctd1Var2 = null;
                iOrdinal = ctd1Var2.ordinal();
                if (iOrdinal != 1) {
                    zza0Var = this.f70168i;
                    if (iOrdinal != 6) {
                        ejc1Var2 = ejc1Var;
                        ejc1Var2.f60188b = str4;
                        ejc1Var2.f60189c = sr4Var2;
                        ejc1Var2.f60190d = null;
                        ejc1Var2.f60187a = i;
                        ejc1Var2.f60192f = z2;
                        ejc1Var2.f60195i = 4;
                        objM89557A = zza0Var.m97286a(ejc1Var2);
                        if (objM89557A != obj) {
                            boolean z9 = z2;
                            i2 = i;
                            z3 = z9;
                            sr4Var3 = sr4Var2;
                            if (((wza0) objM89557A) == wza0Var) {
                                uz91 uz91Var4 = (uz91) er70Var.get();
                                ejc1Var2.f60188b = null;
                                ejc1Var2.f60189c = null;
                                ejc1Var2.f60190d = null;
                                ejc1Var2.f60191e = null;
                                ejc1Var2.f60187a = i2;
                                ejc1Var2.f60192f = z3;
                                ejc1Var2.f60195i = 6;
                                yz91 yz91Var4 = (yz91) uz91Var4;
                                objM89557A = x0h1.m89557A(yz91Var4.f277739d, new xz91(yz91Var4, str4, null), ejc1Var2);
                            } else {
                                ejc1Var2.f60188b = null;
                                ejc1Var2.f60189c = null;
                                ejc1Var2.f60190d = null;
                                ejc1Var2.f60191e = null;
                                ejc1Var2.f60187a = i2;
                                ejc1Var2.f60192f = z3;
                                ejc1Var2.f60195i = 5;
                                objM89557A = m41801c(str4, sr4Var3, z3, ejc1Var2);
                            }
                        }
                    } else {
                        ejc1Var.f60188b = str4;
                        ejc1Var.f60189c = sr4Var2;
                        ejc1Var.f60190d = str3;
                        ejc1Var.f60187a = i;
                        ejc1Var.f60192f = z2;
                        ejc1Var.f60195i = 7;
                        objM89557A = zza0Var.m97286a(ejc1Var);
                        if (objM89557A != obj) {
                            boolean z10 = z2;
                            i2 = i;
                            z3 = z10;
                            str5 = str3;
                            sr4Var4 = sr4Var2;
                            str6 = str4;
                            if (((wza0) objM89557A) == wza0Var) {
                                String str8 = str6;
                                ejc1Var2 = ejc1Var;
                                uz91 uz91Var5 = (uz91) er70Var.get();
                                ejc1Var2.f60188b = null;
                                ejc1Var2.f60189c = null;
                                ejc1Var2.f60190d = null;
                                ejc1Var2.f60191e = null;
                                ejc1Var2.f60187a = i2;
                                ejc1Var2.f60192f = z3;
                                ejc1Var2.f60195i = 9;
                                yz91 yz91Var5 = (yz91) uz91Var5;
                                objM89557A = x0h1.m89557A(yz91Var5.f277739d, new xz91(yz91Var5, str8, null), ejc1Var2);
                            } else {
                                ejc1Var.f60188b = null;
                                ejc1Var.f60189c = null;
                                ejc1Var.f60190d = null;
                                ejc1Var.f60191e = null;
                                ejc1Var.f60187a = i2;
                                ejc1Var.f60192f = z3;
                                ejc1Var.f60195i = 8;
                                boolean z11 = z3;
                                ejc1 ejc1Var4 = ejc1Var;
                                objM89557A = m41800b(str6, str5, sr4Var4, z11, ejc1Var4);
                                z3 = z11;
                                ejc1Var2 = ejc1Var4;
                            }
                        }
                    }
                } else {
                    ejc1Var2 = ejc1Var;
                    uz91 uz91Var6 = (uz91) er70Var.get();
                    ejc1Var2.f60188b = null;
                    ejc1Var2.f60189c = null;
                    ejc1Var2.f60190d = null;
                    ejc1Var2.f60187a = i;
                    ejc1Var2.f60192f = z2;
                    ejc1Var2.f60195i = 3;
                    yz91 yz91Var6 = (yz91) uz91Var6;
                    objM89557A = x0h1.m89557A(yz91Var6.f277739d, new xz91(yz91Var6, str4, null), ejc1Var2);
                    if (objM89557A != obj) {
                        boolean z12 = z2;
                        i2 = i;
                        z3 = z12;
                        widgetState = (WidgetState) objM89557A;
                        if (widgetState.getIsWorkProfile()) {
                            ejc1Var2.f60188b = null;
                            ejc1Var2.f60189c = null;
                            ejc1Var2.f60190d = null;
                            ejc1Var2.f60191e = widgetState;
                            ejc1Var2.f60187a = i2;
                            ejc1Var2.f60192f = z3;
                            ejc1Var2.f60195i = 10;
                            if (x4bVar.m89857G(widgetState, ejc1Var2) == obj) {
                            }
                        }
                        return widgetState;
                    }
                }
                break;
                return obj;
            case 2:
                WidgetState widgetState3 = ejc1Var.f60191e;
                bga.m29073P(objM89557A);
                return widgetState3;
            case 3:
                z3 = ejc1Var.f60192f;
                i2 = ejc1Var.f60187a;
                bga.m29073P(objM89557A);
                ejc1Var2 = ejc1Var;
                widgetState = (WidgetState) objM89557A;
                if (widgetState.getIsWorkProfile()) {
                    ejc1Var2.f60188b = null;
                    ejc1Var2.f60189c = null;
                    ejc1Var2.f60190d = null;
                    ejc1Var2.f60191e = widgetState;
                    ejc1Var2.f60187a = i2;
                    ejc1Var2.f60192f = z3;
                    ejc1Var2.f60195i = 10;
                    if (x4bVar.m89857G(widgetState, ejc1Var2) == obj) {
                        return obj;
                    }
                }
                return widgetState;
            case 4:
                z3 = ejc1Var.f60192f;
                i2 = ejc1Var.f60187a;
                sr4Var3 = ejc1Var.f60189c;
                String str9 = ejc1Var.f60188b;
                bga.m29073P(objM89557A);
                str4 = str9;
                ejc1Var2 = ejc1Var;
                if (((wza0) objM89557A) == wza0Var) {
                    ejc1Var2.f60188b = null;
                    ejc1Var2.f60189c = null;
                    ejc1Var2.f60190d = null;
                    ejc1Var2.f60191e = null;
                    ejc1Var2.f60187a = i2;
                    ejc1Var2.f60192f = z3;
                    ejc1Var2.f60195i = 5;
                    objM89557A = m41801c(str4, sr4Var3, z3, ejc1Var2);
                    break;
                } else {
                    uz91 uz91Var7 = (uz91) er70Var.get();
                    ejc1Var2.f60188b = null;
                    ejc1Var2.f60189c = null;
                    ejc1Var2.f60190d = null;
                    ejc1Var2.f60191e = null;
                    ejc1Var2.f60187a = i2;
                    ejc1Var2.f60192f = z3;
                    ejc1Var2.f60195i = 6;
                    yz91 yz91Var7 = (yz91) uz91Var7;
                    objM89557A = x0h1.m89557A(yz91Var7.f277739d, new xz91(yz91Var7, str4, null), ejc1Var2);
                    break;
                }
                return obj;
            case 5:
                z3 = ejc1Var.f60192f;
                i2 = ejc1Var.f60187a;
                bga.m29073P(objM89557A);
                ejc1Var2 = ejc1Var;
                widgetState = (WidgetState) objM89557A;
                if (widgetState.getIsWorkProfile()) {
                    ejc1Var2.f60188b = null;
                    ejc1Var2.f60189c = null;
                    ejc1Var2.f60190d = null;
                    ejc1Var2.f60191e = widgetState;
                    ejc1Var2.f60187a = i2;
                    ejc1Var2.f60192f = z3;
                    ejc1Var2.f60195i = 10;
                    if (x4bVar.m89857G(widgetState, ejc1Var2) == obj) {
                        return obj;
                    }
                }
                return widgetState;
            case 6:
                z3 = ejc1Var.f60192f;
                i2 = ejc1Var.f60187a;
                bga.m29073P(objM89557A);
                ejc1Var2 = ejc1Var;
                widgetState = (WidgetState) objM89557A;
                if (widgetState.getIsWorkProfile()) {
                    ejc1Var2.f60188b = null;
                    ejc1Var2.f60189c = null;
                    ejc1Var2.f60190d = null;
                    ejc1Var2.f60191e = widgetState;
                    ejc1Var2.f60187a = i2;
                    ejc1Var2.f60192f = z3;
                    ejc1Var2.f60195i = 10;
                    if (x4bVar.m89857G(widgetState, ejc1Var2) == obj) {
                        return obj;
                    }
                }
                return widgetState;
            case 7:
                z3 = ejc1Var.f60192f;
                i2 = ejc1Var.f60187a;
                str5 = ejc1Var.f60190d;
                sr4Var4 = ejc1Var.f60189c;
                str6 = ejc1Var.f60188b;
                bga.m29073P(objM89557A);
                if (((wza0) objM89557A) == wza0Var) {
                    ejc1Var.f60188b = null;
                    ejc1Var.f60189c = null;
                    ejc1Var.f60190d = null;
                    ejc1Var.f60191e = null;
                    ejc1Var.f60187a = i2;
                    ejc1Var.f60192f = z3;
                    ejc1Var.f60195i = 8;
                    boolean z13 = z3;
                    ejc1 ejc1Var5 = ejc1Var;
                    objM89557A = m41800b(str6, str5, sr4Var4, z13, ejc1Var5);
                    z3 = z13;
                    ejc1Var2 = ejc1Var5;
                    break;
                } else {
                    String str10 = str6;
                    ejc1Var2 = ejc1Var;
                    uz91 uz91Var8 = (uz91) er70Var.get();
                    ejc1Var2.f60188b = null;
                    ejc1Var2.f60189c = null;
                    ejc1Var2.f60190d = null;
                    ejc1Var2.f60191e = null;
                    ejc1Var2.f60187a = i2;
                    ejc1Var2.f60192f = z3;
                    ejc1Var2.f60195i = 9;
                    yz91 yz91Var8 = (yz91) uz91Var8;
                    objM89557A = x0h1.m89557A(yz91Var8.f277739d, new xz91(yz91Var8, str10, null), ejc1Var2);
                    break;
                }
                return obj;
            case 8:
                z3 = ejc1Var.f60192f;
                i2 = ejc1Var.f60187a;
                bga.m29073P(objM89557A);
                ejc1Var2 = ejc1Var;
                widgetState = (WidgetState) objM89557A;
                if (widgetState.getIsWorkProfile()) {
                    ejc1Var2.f60188b = null;
                    ejc1Var2.f60189c = null;
                    ejc1Var2.f60190d = null;
                    ejc1Var2.f60191e = widgetState;
                    ejc1Var2.f60187a = i2;
                    ejc1Var2.f60192f = z3;
                    ejc1Var2.f60195i = 10;
                    if (x4bVar.m89857G(widgetState, ejc1Var2) == obj) {
                        return obj;
                    }
                }
                return widgetState;
            case 9:
                z3 = ejc1Var.f60192f;
                i2 = ejc1Var.f60187a;
                bga.m29073P(objM89557A);
                ejc1Var2 = ejc1Var;
                widgetState = (WidgetState) objM89557A;
                if (widgetState.getIsWorkProfile()) {
                    ejc1Var2.f60188b = null;
                    ejc1Var2.f60189c = null;
                    ejc1Var2.f60190d = null;
                    ejc1Var2.f60191e = widgetState;
                    ejc1Var2.f60187a = i2;
                    ejc1Var2.f60192f = z3;
                    ejc1Var2.f60195i = 10;
                    if (x4bVar.m89857G(widgetState, ejc1Var2) == obj) {
                        return obj;
                    }
                }
                return widgetState;
            case 10:
                WidgetState widgetState4 = ejc1Var.f60191e;
                bga.m29073P(objM89557A);
                return widgetState4;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
