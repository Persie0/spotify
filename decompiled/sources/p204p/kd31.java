package p204p;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class kd31 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121596a;

    /* JADX INFO: renamed from: b */
    public int f121597b;

    /* JADX INFO: renamed from: c */
    public Object f121598c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f121599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd31(Object obj, Object obj2, fbk fbkVar, int i) {
        super(1, fbkVar);
        this.f121596a = i;
        this.f121598c = obj;
        this.f121599d = obj2;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        switch (this.f121596a) {
            case 0:
                return new kd31((md31) this.f121598c, (ArrayList) this.f121599d, fbkVar, 0);
            case 1:
                return new kd31((xh91) this.f121599d, fbkVar, 1);
            case 2:
                return new kd31((hsb1) this.f121599d, fbkVar, 2);
            default:
                return new kd31((smg1) this.f121598c, (w7g1) this.f121599d, fbkVar, 3);
        }
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fbk fbkVar = (fbk) obj;
        switch (this.f121596a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((kd31) create(fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objM84971b;
        tg91 tg91Var;
        pze1 pze1Var;
        WebView webView;
        Object obj2;
        switch (this.f121596a) {
            case 0:
                int i = this.f121597b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                md31 md31Var = (md31) this.f121598c;
                luk lukVar = md31Var.f142304h;
                vx01 vx01Var = new vx01(md31Var, (ArrayList) this.f121599d, null, 27);
                this.f121597b = 1;
                Object objM89557A = x0h1.m89557A(lukVar, vx01Var, this);
                yuk yukVar = yuk.f276404a;
                return objM89557A == yukVar ? yukVar : objM89557A;
            case 1:
                xh91 xh91Var = (xh91) this.f121599d;
                int i2 = this.f121597b;
                String str = null;
                yuk yukVar2 = yuk.f276404a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        bga.m29073P(obj);
                        objM84971b = ((s6x0) obj).f206218a;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tg91Var = (tg91) this.f121598c;
                        bga.m29073P(obj);
                    }
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    pze1Var = tg91Var.f220142a;
                    if (pze1Var != null) {
                        str = xh91Var.f261493f.f259975d.format(Long.valueOf(pze1Var.toEpochSecond() * ((long) 1000)));
                    }
                    return new uf91(str, tg91Var.f220143b, xh91Var.f261492e.f120616a.m64115g(), zBooleanValue);
                }
                bga.m29073P(obj);
                v9l0 v9l0Var = xh91Var.f261490c;
                this.f121597b = 1;
                objM84971b = v9l0Var.m84971b(this);
                if (objM84971b == yukVar2) {
                    return yukVar2;
                }
                tg91 tg91Var2 = new tg91(null, true, null);
                if (objM84971b instanceof c6x0) {
                    objM84971b = tg91Var2;
                }
                tg91Var = (tg91) objM84971b;
                fiz fizVarM38250a = xh91Var.f261491d.m38250a();
                this.f121598c = tg91Var;
                this.f121597b = 2;
                obj = vyf1.m86755t(fizVarM38250a, this);
                if (obj == yukVar2) {
                    return yukVar2;
                }
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                pze1Var = tg91Var.f220142a;
                if (pze1Var != null) {
                    str = xh91Var.f261493f.f259975d.format(Long.valueOf(pze1Var.toEpochSecond() * ((long) 1000)));
                }
                return new uf91(str, tg91Var.f220143b, xh91Var.f261492e.f120616a.m64115g(), zBooleanValue2);
            case 2:
                if (this.f121597b == 0) {
                    bga.m29073P(obj);
                    hsb1 hsb1Var = (hsb1) this.f121599d;
                    guf gufVarM62210c = mlg1.m62210c();
                    WebView webView2 = new WebView(new MutableContextWrapper(((Context) hsb1Var.f94657e).getApplicationContext()));
                    webView2.getSettings().setJavaScriptEnabled(true);
                    webView2.addJavascriptInterface((c4d1) hsb1Var.f94656d, "recaptchaMobileBridge");
                    webView2.setWebViewClient(new jp7(gufVarM62210c, webView2, hsb1Var));
                    String languageTag = Locale.getDefault().toLanguageTag();
                    String str2 = (String) ((sef0) hsb1Var.f94655c).f208289f;
                    int length = str2.length();
                    int length2 = String.valueOf(languageTag).length();
                    String str3 = (String) hsb1Var.f94654b;
                    StringBuilder sb = new StringBuilder(length + 4 + length2 + 3 + String.valueOf(str3).length());
                    klh.m56844p(sb, str2, "?hl=", languageTag, "&k=");
                    sb.append(str3);
                    webView2.loadUrl(sb.toString());
                    try {
                        u0a u0aVar = new u0a(gufVarM62210c, null, 5);
                        this.f121598c = webView2;
                        this.f121597b = 1;
                        obj = s1h1.m76978s(15000L, u0aVar, this);
                        yuk yukVar3 = yuk.f276404a;
                        obj2 = yukVar3;
                        if (obj != yukVar3) {
                            webView = webView2;
                        }
                        return obj2;
                    } catch (Exception e) {
                        e = e;
                        webView = webView2;
                        webView.stopLoading();
                        webView.destroy();
                        throw e;
                    }
                }
                webView = (WebView) this.f121598c;
                try {
                    bga.m29073P(obj);
                    webView = webView;
                } catch (Exception e2) {
                    e = e2;
                    webView.stopLoading();
                    webView.destroy();
                    throw e;
                }
                obj2 = webView;
                return obj2;
            default:
                int i3 = this.f121597b;
                bga.m29073P(obj);
                if (i3 != 0) {
                    return obj;
                }
                smg1 smg1Var = (smg1) this.f121598c;
                gud1 gud1Var = new gud1((w7g1) this.f121599d, null, 13);
                this.f121597b = 1;
                smg1Var.getClass();
                Object objM26589a = new aog1(54, gud1Var, null).m26589a(smg1Var.f210653a, this);
                yuk yukVar4 = yuk.f276404a;
                return objM26589a == yukVar4 ? yukVar4 : objM26589a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd31(Object obj, fbk fbkVar, int i) {
        super(1, fbkVar);
        this.f121596a = i;
        this.f121599d = obj;
    }
}
