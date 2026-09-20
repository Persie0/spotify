package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class pgm0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f177366a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f177367b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pgm0(Object obj, int i) {
        super(0);
        this.f177366a = i;
        this.f177367b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f177366a) {
            case 0:
                zox zoxVar = (zox) ((g480) ((sgm0) this.f177367b).m78107c().mo24326a().mo15684j0(zox.class)).mo31538a();
                return Boolean.valueOf(zoxVar != null ? zoxVar.f284880a : false);
            case 1:
                return hug1.m48669n((wkm0) this.f177367b);
            case 2:
                return nxf1.m65842u((ConstraintLayout) ((flw0) this.f177367b).f70880d);
            case 3:
                dmm0 dmm0Var = (dmm0) this.f177367b;
                return new atr(((kgm0) dmm0Var.f50564a.f62825d).mo38306a(dmm0Var.f50565b.f208901g), dmm0Var.f50566c);
            case 4:
                ((rvm0) this.f177367b).f203101a.m63782a(bda.f26063c);
                return w2a1.f247311a;
            case 5:
                l3n0 l3n0Var = (l3n0) this.f177367b;
                bji bjiVar = l3n0Var.f129355b;
                if (bjiVar != null) {
                    return (l3n0) bjiVar.mo29483e(new c3f(l3n0Var, 28));
                }
                return null;
            case 6:
                d4n0 d4n0Var = (d4n0) this.f177367b;
                bji bjiVar2 = d4n0Var.f45213c;
                if (bjiVar2 != null) {
                    return (d4n0) bjiVar2.mo29483e(new c3f(d4n0Var, 29));
                }
                return null;
            case 7:
                ((h7n0) ((yk0) this.f177367b).f273514c).mo24869a();
                return w2a1.f247311a;
            case 8:
                return (ijc1) ((hen0) this.f177367b).invoke();
            case 9:
                miq0 miq0Var = (miq0) this.f177367b;
                miq0Var.f144073d = true;
                eh00 eh00Var = miq0Var.f144076g;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                return w2a1.f247311a;
            case 10:
                a5a0 a5a0Var = ((vln0) this.f177367b).f242579h;
                if (a5a0Var != null) {
                    return a5a0Var.mo3039c().path();
                }
                wj50.m88260d0("pageIdentifierProvider");
                throw null;
            case 11:
                cwn0 cwn0Var = (cwn0) ((wel0) this.f177367b).f250581b;
                boolean z = false;
                if (cwn0Var.m34148a() && cwn0Var.f42792b.mo48713h(dwn0.f53728a, false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                kzn0 kzn0Var = (kzn0) this.f177367b;
                bji bjiVar3 = kzn0Var.f128167b;
                if (bjiVar3 != null) {
                    return (kzn0) bjiVar3.mo29483e(new jzn0(kzn0Var, 0));
                }
                return null;
            case 13:
                lzn0 lzn0Var = (lzn0) this.f177367b;
                bji bjiVar4 = lzn0Var.f138396b;
                if (bjiVar4 != null) {
                    return (lzn0) bjiVar4.mo29483e(new jzn0(lzn0Var, 1));
                }
                return null;
            case 14:
                String str = ((c3o0) this.f177367b).f33712a;
                if (str == null) {
                    str = "";
                }
                return sam.m77645B(str);
            case 15:
                return ((f4o0) this.f177367b).f65814h;
            case 16:
                j4o0 j4o0Var = (j4o0) this.f177367b;
                j4o0Var.f108751t.m93560g(j4o0Var.f108737P0);
                return w2a1.f247311a;
            case 17:
                return ((hqe1) ((t6o0) this.f177367b).f217585b).m48249h() ? x6o0.f258718a : v6o0.f237927a;
            case 18:
                return ((hqe1) ((t6o0) this.f177367b).f217585b).m48249h() ? y6o0.f269884a : w6o0.f248427a;
            case 19:
                return ((jco0) this.f177367b).f111155a.getString(R.string.settings_item_plan_overview_placeholder_title);
            case 20:
                return Long.valueOf(((mgz0) this.f177367b).f143675a);
            case 21:
                return ((lq81) ((za7) this.f177367b).f280994c).mo33803j();
            case 22:
                return h1k.m46460a(((vmo0) this.f177367b).f242887d);
            case 23:
                ((aiq) this.f177367b).f16074a.onNext(tdd1.f219290a);
                return w2a1.f247311a;
            case 24:
                npo0 npo0Var = (npo0) this.f177367b;
                boolean z2 = npo0Var.f157038d;
                LinkedHashSet linkedHashSet = npo0Var.f157036b;
                nsk nskVar = npo0Var.f157035a;
                if (!z2 || nskVar == null || linkedHashSet.isEmpty()) {
                    return null;
                }
                int iM31820L = c95.m31820L(i6f.m49804T(linkedHashSet, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj : linkedHashSet) {
                    z9p z9pVar = nskVar.f157831b;
                    linkedHashMap.put(obj, (rpo0) ((ConcurrentHashMap) z9pVar.f280848g).computeIfAbsent(((qpo0) obj).m73453b(), new oid(z9pVar, 4)));
                }
                return linkedHashMap;
            case 25:
                return Boolean.valueOf(((o89) this.f177367b).m66420a().f151397A1);
            case 26:
                return BehaviorSubject.m23796g(Boolean.valueOf(((hv31) ((luo0) this.f177367b).f137120a.get()).mo48713h(luo0.f137119d, false)));
            case 27:
                tfm0 tfm0Var = (tfm0) this.f177367b;
                pqk0 pqk0Var = (pqk0) tfm0Var.f220021c;
                Context context = (Context) tfm0Var.f220020b;
                String string = ((guo0) pqk0Var.f180346b).f84518a;
                boolean z3 = context.getResources().getConfiguration().getLayoutDirection() == 1;
                int iM88767v = wqg1.m88767v(1280.0f, context.getResources());
                Drawable drawableM50639w = ihf1.m50639w(context, R.drawable.playable_cache_cover_art);
                Bitmap bitmapM92066M = drawableM50639w != null ? xtm0.m92066M(drawableM50639w, iM88767v, iM88767v, Bitmap.Config.ARGB_8888) : null;
                if (bitmapM92066M == null) {
                    return null;
                }
                Canvas canvas = new Canvas(bitmapM92066M);
                TextPaint textPaintM70654e = pqk0.m70654e(context);
                Rect rect = new Rect();
                float fM88767v = wqg1.m88767v(48.0f, context.getResources());
                float width = canvas.getWidth() - (2 * fM88767v);
                textPaintM70654e.setTextSize(wqg1.m88767v(150.0f, context.getResources()));
                textPaintM70654e.getTextBounds(string, 0, string.length(), rect);
                if (rect.width() > width) {
                    float fM88767v2 = width - wqg1.m88767v(20.0f, context.getResources());
                    TextPaint textPaintM70654e2 = pqk0.m70654e(context);
                    int i = 150;
                    do {
                        i--;
                        float f = i;
                        textPaintM70654e2.setTextSize(wqg1.m88767v(f, context.getResources()));
                        if (i > 50) {
                        }
                        textPaintM70654e.setTextSize(wqg1.m88767v(f, context.getResources()));
                        string = TextUtils.ellipsize(string, textPaintM70654e, fM88767v2, TextUtils.TruncateAt.END).toString();
                        textPaintM70654e.getTextBounds(string, 0, string.length(), rect);
                    } while (textPaintM70654e2.measureText(string) > fM88767v2);
                    textPaintM70654e.setTextSize(wqg1.m88767v(f, context.getResources()));
                    string = TextUtils.ellipsize(string, textPaintM70654e, fM88767v2, TextUtils.TruncateAt.END).toString();
                    textPaintM70654e.getTextBounds(string, 0, string.length(), rect);
                }
                if (z3) {
                    fM88767v = (canvas.getWidth() - rect.width()) - fM88767v;
                }
                canvas.drawText(string, fM88767v, canvas.getHeight() - wqg1.m88767v(104.0f, context.getResources()), textPaintM70654e);
                return bitmapM92066M;
            case 28:
                return ((zuo0) this.f177367b).f286482a.m25127i();
            default:
                return ((rwo0) this.f177367b).f203387f;
        }
    }
}
