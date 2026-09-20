package com.spotify.widgets.npvwidget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import p204p.a7s0;
import p204p.av91;
import p204p.bga;
import p204p.bu91;
import p204p.bud1;
import p204p.bv91;
import p204p.byz0;
import p204p.cks;
import p204p.d850;
import p204p.dv91;
import p204p.edb;
import p204p.f550;
import p204p.fbk;
import p204p.g550;
import p204p.hvi0;
import p204p.ibk;
import p204p.ihf1;
import p204p.ils;
import p204p.jwg1;
import p204p.kk40;
import p204p.kkc0;
import p204p.n6j0;
import p204p.na6;
import p204p.p6j0;
import p204p.pqm0;
import p204p.pwb1;
import p204p.qgy0;
import p204p.qtd1;
import p204p.s1h1;
import p204p.sag0;
import p204p.st91;
import p204p.t4t0;
import p204p.upf;
import p204p.voc1;
import p204p.w2a1;
import p204p.w6j0;
import p204p.wj50;
import p204p.x2j0;
import p204p.xoc1;
import p204p.yt91;
import p204p.yuk;
import p204p.z2j0;
import p204p.z650;
import p204p.z9j0;
import p204p.zt91;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.r */
/* JADX INFO: loaded from: classes11.dex */
public final class C1378r {

    /* JADX INFO: renamed from: a */
    public final Context f7073a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f7074b;

    /* JADX INFO: renamed from: c */
    public final f550 f7075c;

    /* JADX INFO: renamed from: d */
    public final C1372l f7076d;

    /* JADX INFO: renamed from: e */
    public final w6j0 f7077e;

    /* JADX INFO: renamed from: f */
    public final C1371k f7078f;

    /* JADX INFO: renamed from: g */
    public final qgy0 f7079g;

    public C1378r(Context context, z9j0 z9j0Var, f550 f550Var, C1372l c1372l, w6j0 w6j0Var, C1371k c1371k, qgy0 qgy0Var) {
        this.f7073a = context;
        this.f7074b = z9j0Var;
        this.f7075c = f550Var;
        this.f7076d = c1372l;
        this.f7077e = w6j0Var;
        this.f7078f = c1371k;
        this.f7079g = qgy0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m23090a(ibk ibkVar) {
        t4t0 t4t0Var;
        if (ibkVar instanceof t4t0) {
            t4t0Var = (t4t0) ibkVar;
            int i = t4t0Var.f217073c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t4t0Var.f217073c = i - Integer.MIN_VALUE;
            } else {
                t4t0Var = new t4t0(this, ibkVar);
            }
        } else {
            t4t0Var = new t4t0(this, ibkVar);
        }
        Object objM76981v = t4t0Var.f217071a;
        int i2 = t4t0Var.f217073c;
        if (i2 == 0) {
            bga.m29073P(objM76981v);
            hvi0 hvi0Var = cks.f39079b;
            long jM54449D = jwg1.m54449D(5, ils.SECONDS);
            a7s0 a7s0Var = new a7s0(this, (fbk) null, 3);
            t4t0Var.f217073c = 1;
            objM76981v = s1h1.m76981v(jM54449D, a7s0Var, t4t0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76981v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76981v);
        }
        byz0 byz0Var = (byz0) objM76981v;
        if (byz0Var == null) {
            na6.m63971s("Session scope not entered within timeout, widget attribution skipped");
        }
        return byz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: b */
    public final Object m23091b(C1372l c1372l, WidgetInteraction.Background background, String str, ibk ibkVar) {
        C1374n c1374n;
        d850 d850VarMo57453r;
        WidgetInteraction.Background background2;
        String str2;
        Object objM23090a;
        bud1 bud1VarMo30912E;
        if (ibkVar instanceof C1374n) {
            c1374n = (C1374n) ibkVar;
            int i = c1374n.f7055f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1374n.f7055f = i - Integer.MIN_VALUE;
            } else {
                c1374n = new C1374n(this, ibkVar);
            }
        } else {
            c1374n = new C1374n(this, ibkVar);
        }
        Object obj = c1374n.f7053d;
        int i2 = c1374n.f7055f;
        if (i2 == 0) {
            bga.m29073P(obj);
            Objects.toString(background.getSessionState());
            c1372l.getClass();
            String pageIdentifier = background.getPageIdentifier();
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
            yt91VarM50626j.f276052f = "7.1.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276048b = pageIdentifier;
            yt91 yt91VarM96903c = yt91VarM50626j.m94607a().m96903c();
            yt91VarM96903c.f276055i.add(new bu91("background", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            String destinationViewUri = background.getDestinationViewUri();
            dv91 dv91Var = new dv91("hit", 1);
            String string = destinationViewUri != null ? destinationViewUri.toString() : null;
            if (string == null) {
                string = "";
            }
            av91 av91Var = new av91("", "", dv91Var, new bv91("open_app", 1, kkc0.m56695h0(new pqm0("destination", string), new pqm0("app", "music"))), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
            c1372l.m23089b(background.getPageIdentifier());
            d850VarMo57453r = c1372l.f7047a.mo57453r(av91Var, null);
            background2 = background;
            c1374n.f7050a = background2;
            str2 = str;
            c1374n.f7051b = str2;
            c1374n.f7052c = d850VarMo57453r;
            c1374n.f7055f = 1;
            objM23090a = m23090a(c1374n);
            Object obj2 = yuk.f276404a;
            if (objM23090a == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d850VarMo57453r = c1374n.f7052c;
            str2 = c1374n.f7051b;
            WidgetInteraction.Background background3 = c1374n.f7050a;
            bga.m29073P(obj);
            objM23090a = obj;
            background2 = background3;
        }
        byz0 byz0Var = (byz0) objM23090a;
        if (byz0Var != null && (bud1VarMo30912E = byz0Var.mo30912E()) != null) {
            bud1VarMo30912E.m30511c(new qtd1(d850VarMo57453r.f46380a.f279709a, background2.getSessionState() == WidgetInteraction.BackgroundSessionState.ACTIVE ? background2.getUri() : "", str2));
        }
        m23096g(background2.getDestinationViewUri(), d850VarMo57453r.f46380a);
        int i3 = AbstractC1373m.f7049a[background2.getSessionState().ordinal()];
        Context context = this.f7073a;
        if (i3 == 1) {
            Intent intentM43588a = ((g550) this.f7075c).m43588a(context);
            intentM43588a.setAction("com.spotify.mobile.android.ui.action.player.SHOW");
            intentM43588a.setFlags(805306368);
            context.startActivity(intentM43588a);
        } else if (i3 == 2) {
            String destinationViewUri2 = background2.getDestinationViewUri();
            n6j0 n6j0Var = new n6j0(d850VarMo57453r);
            if (destinationViewUri2 == null) {
                throw new IllegalStateException("uri was not set!");
            }
            this.f7074b.mo63651f(new p6j0(destinationViewUri2, "", true, false, 0, 0, false, null, null, n6j0Var));
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(background2.getDestinationViewUri()));
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m23092c(Intent intent, pwb1 pwb1Var) {
        Object objM23091b;
        Uri uri;
        boolean zHasExtra = intent.hasExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION");
        w2a1 w2a1Var = w2a1.f247311a;
        if (zHasExtra) {
            WidgetInteraction widgetInteraction = Build.VERSION.SDK_INT >= 33 ? (WidgetInteraction) intent.getParcelableExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION", WidgetInteraction.class) : (WidgetInteraction) intent.getParcelableExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION");
            String stringExtra = intent.getStringExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_CATEGORY");
            if (stringExtra == null) {
                stringExtra = "";
            }
            boolean z = widgetInteraction instanceof WidgetInteraction.ItemClick;
            yuk yukVar = yuk.f276404a;
            C1372l c1372l = this.f7076d;
            if (z) {
                Object objM23093d = m23093d(c1372l, (WidgetInteraction.ItemClick) widgetInteraction, stringExtra, pwb1Var);
                if (objM23093d == yukVar) {
                    return objM23093d;
                }
            } else {
                if (widgetInteraction instanceof WidgetInteraction.Login) {
                    WidgetInteraction.Login login = (WidgetInteraction.Login) widgetInteraction;
                    boolean zHasExtra2 = intent.hasExtra("com.spotify.widgets.npvwidget.EXTRA_BRANCH_CAMPAIGN");
                    Context context = this.f7073a;
                    if (zHasExtra2) {
                        String stringExtra2 = intent.getStringExtra("com.spotify.widgets.npvwidget.EXTRA_BRANCH_CAMPAIGN");
                        String stringExtra3 = intent.getStringExtra("com.spotify.widgets.npvwidget.EXTRA_BRANCH_DEEPLINK_PATH");
                        if (stringExtra3 == null) {
                            stringExtra3 = xoc1.f263839A0.f243453a;
                        }
                        String packageName = context.getPackageName();
                        StringBuilder sbM38573v = edb.m38573v("https://spotify.link/content_linking?~campaign=", stringExtra2, "&~feature=content_linking&$deeplink_path=", stringExtra3, "&$fallback_url=open.spotify.com&~channel=");
                        sbM38573v.append(packageName);
                        uri = Uri.parse(sbM38573v.toString());
                        wj50.m88279p(uri);
                    } else {
                        uri = Uri.parse(xoc1.f263839A0.f243453a);
                        wj50.m88279p(uri);
                    }
                    uri.toString();
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(uri);
                    intent2.setFlags(268435456);
                    String pageIdentifier = login.getPageIdentifier();
                    zt91 zt91Var = zt91.f286105i;
                    yt91 yt91VarM50626j = ihf1.m50626j();
                    yt91VarM50626j.f276054h = "music";
                    yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
                    yt91VarM50626j.f276052f = "7.1.0";
                    yt91VarM50626j.f276053g = "20.0.5";
                    yt91VarM50626j.f276048b = pageIdentifier;
                    yt91 yt91VarM96903c = yt91VarM50626j.m94607a().m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("login_button", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                    voc1 voc1Var = xoc1.f263839A0;
                    String str = voc1Var.f243453a;
                    dv91 dv91Var = new dv91("hit", 1);
                    String string = str != null ? str.toString() : null;
                    m23096g(voc1Var.f243453a, c1372l.f7047a.mo57452p(new av91("", "", dv91Var, new bv91("open_app", 1, kkc0.m56695h0(new pqm0("destination", string != null ? string : ""), new pqm0("app", "music"))), zt91VarM94607a, st91.f213865b, System.currentTimeMillis())).f46380a);
                    context.startActivity(intent2);
                    return w2a1Var;
                }
                if (widgetInteraction instanceof WidgetInteraction.SpotifyLogo) {
                    Object objM23095f = m23095f(c1372l, (WidgetInteraction.SpotifyLogo) widgetInteraction, stringExtra, pwb1Var);
                    if (objM23095f == yukVar) {
                        return objM23095f;
                    }
                } else if (widgetInteraction instanceof WidgetInteraction.NpvMetadata) {
                    Object objM23094e = m23094e(c1372l, (WidgetInteraction.NpvMetadata) widgetInteraction, stringExtra, pwb1Var);
                    if (objM23094e == yukVar) {
                        return objM23094e;
                    }
                } else if ((widgetInteraction instanceof WidgetInteraction.Background) && (objM23091b = m23091b(c1372l, (WidgetInteraction.Background) widgetInteraction, stringExtra, pwb1Var)) == yukVar) {
                    return objM23091b;
                }
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: d */
    public final Object m23093d(C1372l c1372l, WidgetInteraction.ItemClick itemClick, String str, ibk ibkVar) {
        C1375o c1375o;
        av91 av91Var;
        d850 d850VarMo57453r;
        WidgetInteraction.ItemClick itemClick2;
        String str2;
        bud1 bud1VarMo30912E;
        if (ibkVar instanceof C1375o) {
            c1375o = (C1375o) ibkVar;
            int i = c1375o.f7061f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1375o.f7061f = i - Integer.MIN_VALUE;
            } else {
                c1375o = new C1375o(this, ibkVar);
            }
        } else {
            c1375o = new C1375o(this, ibkVar);
        }
        Object obj = c1375o.f7059d;
        int i2 = c1375o.f7061f;
        Object obj2 = w2a1.f247311a;
        Object obj3 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            c1372l.getClass();
            if (itemClick instanceof WidgetInteraction.ItemClick.GridItemClick) {
                WidgetInteraction.ItemClick.GridItemClick gridItemClick = (WidgetInteraction.ItemClick.GridItemClick) itemClick;
                sag0 sag0VarM23088a = C1372l.m23088a(gridItemClick);
                String string = gridItemClick.getItemUri().toString();
                dv91 dv91Var = new dv91("hit", 1);
                String string2 = string != null ? string.toString() : null;
                av91Var = new av91("", "", dv91Var, new bv91("open_app", 1, kkc0.m56695h0(new pqm0("destination", string2 != null ? string2 : ""), new pqm0("app", "music"))), sag0VarM23088a.f207208b, st91.f213865b, System.currentTimeMillis());
            } else {
                if (!(itemClick instanceof WidgetInteraction.ItemClick.HeroItemClick)) {
                    throw new NoWhenBranchMatchedException();
                }
                WidgetInteraction.ItemClick.HeroItemClick heroItemClick = (WidgetInteraction.ItemClick.HeroItemClick) itemClick;
                String pageIdentifier = heroItemClick.getPageIdentifier();
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
                yt91VarM50626j.f276052f = "7.1.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = pageIdentifier;
                zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
                String string3 = heroItemClick.getHeroItemUri().toString();
                yt91 yt91VarM96903c = zt91VarM94607a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("hero_item", null, null, string3, null));
                yt91VarM96903c.f276056j = true;
                zt91 zt91VarM94607a2 = yt91VarM96903c.m94607a();
                String string4 = heroItemClick.getHeroItemUri().toString();
                dv91 dv91Var2 = new dv91("hit", 1);
                String string5 = string4 != null ? string4.toString() : null;
                av91Var = new av91("", "", dv91Var2, new bv91("open_app", 1, kkc0.m56695h0(new pqm0("destination", string5 != null ? string5 : ""), new pqm0("app", "music"))), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
            }
            c1372l.m23089b(itemClick.getPageIdentifier());
            d850VarMo57453r = c1372l.f7047a.mo57453r(av91Var, null);
            c1375o.f7056a = itemClick;
            c1375o.f7057b = str;
            c1375o.f7058c = d850VarMo57453r;
            c1375o.f7061f = 1;
            Object objM23090a = m23090a(c1375o);
            if (objM23090a != obj3) {
                itemClick2 = itemClick;
                str2 = str;
                obj = objM23090a;
            }
            return obj3;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj2;
        }
        d850VarMo57453r = c1375o.f7058c;
        String str3 = c1375o.f7057b;
        WidgetInteraction.ItemClick itemClick3 = c1375o.f7056a;
        bga.m29073P(obj);
        str2 = str3;
        itemClick2 = itemClick3;
        d850 d850Var = d850VarMo57453r;
        byz0 byz0Var = (byz0) obj;
        if (byz0Var != null && (bud1VarMo30912E = byz0Var.mo30912E()) != null) {
            bud1VarMo30912E.m30511c(new qtd1(d850Var.f46380a.f279709a, itemClick2.getUri().toString(), str2));
        }
        this.f7074b.mo47342b(itemClick2.getUri().toString(), d850Var, null);
        if (itemClick2.getShouldStartPlayback()) {
            c1375o.f7056a = null;
            c1375o.f7057b = null;
            c1375o.f7058c = null;
            c1375o.f7061f = 2;
            C1371k c1371k = this.f7078f;
            upf.m83659C(c1371k.f7045i, new C1365e(d850Var, itemClick2, str2));
            Object objM56684z = kk40.m56684z(new C1367g(c1371k, itemClick2, d850Var, str2, null), c1375o);
            if (objM56684z != obj3) {
                objM56684z = obj2;
            }
            if (objM56684z != obj3) {
                objM56684z = obj2;
            }
            if (objM56684z == obj3) {
                return obj3;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: e */
    public final Object m23094e(C1372l c1372l, WidgetInteraction.NpvMetadata npvMetadata, String str, ibk ibkVar) {
        C1376p c1376p;
        d850 d850VarMo57453r;
        WidgetInteraction.NpvMetadata npvMetadata2;
        String str2;
        Object objM23090a;
        bud1 bud1VarMo30912E;
        if (ibkVar instanceof C1376p) {
            c1376p = (C1376p) ibkVar;
            int i = c1376p.f7067f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1376p.f7067f = i - Integer.MIN_VALUE;
            } else {
                c1376p = new C1376p(this, ibkVar);
            }
        } else {
            c1376p = new C1376p(this, ibkVar);
        }
        Object obj = c1376p.f7065d;
        int i2 = c1376p.f7067f;
        if (i2 == 0) {
            bga.m29073P(obj);
            c1372l.getClass();
            String pageIdentifier = npvMetadata.getPageIdentifier();
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
            yt91VarM50626j.f276052f = "7.1.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276048b = pageIdentifier;
            yt91 yt91VarM96903c = yt91VarM50626j.m94607a().m96903c();
            yt91VarM96903c.f276055i.add(new bu91("npv", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            String uri = npvMetadata.getUri();
            yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("metadata", null, null, uri, null));
            yt91VarM96903c2.f276056j = true;
            zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
            String str3 = xoc1.f264152o1.f243453a;
            dv91 dv91Var = new dv91("hit", 1);
            String string = str3 != null ? str3.toString() : null;
            if (string == null) {
                string = "";
            }
            av91 av91Var = new av91("", "", dv91Var, new bv91("open_app", 1, kkc0.m56695h0(new pqm0("destination", string), new pqm0("app", "music"))), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
            c1372l.m23089b(npvMetadata.getPageIdentifier());
            d850VarMo57453r = c1372l.f7047a.mo57453r(av91Var, null);
            npvMetadata2 = npvMetadata;
            c1376p.f7062a = npvMetadata2;
            str2 = str;
            c1376p.f7063b = str2;
            c1376p.f7064c = d850VarMo57453r;
            c1376p.f7067f = 1;
            objM23090a = m23090a(c1376p);
            Object obj2 = yuk.f276404a;
            if (objM23090a == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d850VarMo57453r = c1376p.f7064c;
            str2 = c1376p.f7063b;
            WidgetInteraction.NpvMetadata npvMetadata3 = c1376p.f7062a;
            bga.m29073P(obj);
            objM23090a = obj;
            npvMetadata2 = npvMetadata3;
        }
        byz0 byz0Var = (byz0) objM23090a;
        if (byz0Var != null && (bud1VarMo30912E = byz0Var.mo30912E()) != null) {
            bud1VarMo30912E.m30511c(new qtd1(d850VarMo57453r.f46380a.f279709a, npvMetadata2.getUri(), str2));
        }
        m23096g(xoc1.f264152o1.f243453a, d850VarMo57453r.f46380a);
        g550 g550Var = (g550) this.f7075c;
        Context context = this.f7073a;
        Intent intentM43588a = g550Var.m43588a(context);
        intentM43588a.setAction("com.spotify.mobile.android.ui.action.player.SHOW");
        intentM43588a.setFlags(805306368);
        context.startActivity(intentM43588a);
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: f */
    public final Object m23095f(C1372l c1372l, WidgetInteraction.SpotifyLogo spotifyLogo, String str, ibk ibkVar) {
        C1377q c1377q;
        d850 d850VarMo57453r;
        String str2;
        Object objM23090a;
        bud1 bud1VarMo30912E;
        if (ibkVar instanceof C1377q) {
            c1377q = (C1377q) ibkVar;
            int i = c1377q.f7072e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1377q.f7072e = i - Integer.MIN_VALUE;
            } else {
                c1377q = new C1377q(this, ibkVar);
            }
        } else {
            c1377q = new C1377q(this, ibkVar);
        }
        Object obj = c1377q.f7070c;
        int i2 = c1377q.f7072e;
        if (i2 == 0) {
            bga.m29073P(obj);
            c1372l.getClass();
            String pageIdentifier = spotifyLogo.getPageIdentifier();
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
            yt91VarM50626j.f276052f = "7.1.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276048b = pageIdentifier;
            zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
            String reason = spotifyLogo.getReason();
            yt91 yt91VarM96903c = zt91VarM94607a.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("logo", null, null, null, reason));
            yt91VarM96903c.f276056j = false;
            zt91 zt91VarM94607a2 = yt91VarM96903c.m94607a();
            String str3 = xoc1.f263839A0.f243453a;
            dv91 dv91Var = new dv91("hit", 1);
            String string = str3 != null ? str3.toString() : null;
            if (string == null) {
                string = "";
            }
            av91 av91Var = new av91("", "", dv91Var, new bv91("open_app", 1, kkc0.m56695h0(new pqm0("destination", string), new pqm0("app", "music"))), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
            c1372l.m23089b(spotifyLogo.getPageIdentifier());
            d850VarMo57453r = c1372l.f7047a.mo57453r(av91Var, null);
            str2 = str;
            c1377q.f7068a = str2;
            c1377q.f7069b = d850VarMo57453r;
            c1377q.f7072e = 1;
            objM23090a = m23090a(c1377q);
            Object obj2 = yuk.f276404a;
            if (objM23090a == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d850VarMo57453r = c1377q.f7069b;
            String str4 = c1377q.f7068a;
            bga.m29073P(obj);
            objM23090a = obj;
            str2 = str4;
        }
        byz0 byz0Var = (byz0) objM23090a;
        if (byz0Var != null && (bud1VarMo30912E = byz0Var.mo30912E()) != null) {
            bud1VarMo30912E.m30511c(new qtd1(d850VarMo57453r.f46380a.f279709a, "", str2));
        }
        String str5 = xoc1.f263839A0.f243453a;
        n6j0 n6j0Var = d850VarMo57453r != null ? new n6j0(d850VarMo57453r) : null;
        if (str5 == null) {
            throw new IllegalStateException("uri was not set!");
        }
        this.f7074b.mo63651f(new p6j0(str5, "", true, false, 0, 0, false, null, null, n6j0Var));
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    public final void m23096g(String str, z650 z650Var) {
        this.f7077e.m87294e(z650Var != null ? new z2j0(str, z650Var) : x2j0.f257512a);
    }
}
