package p204p;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class jj1 implements o5k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112857a;

    /* JADX INFO: renamed from: b */
    public final Object f112858b;

    /* JADX INFO: renamed from: c */
    public final Object f112859c;

    /* JADX INFO: renamed from: d */
    public final Object f112860d;

    /* JADX INFO: renamed from: e */
    public final Object f112861e;

    public /* synthetic */ jj1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f112857a = i;
        this.f112858b = obj;
        this.f112859c = obj2;
        this.f112860d = obj3;
        this.f112861e = obj4;
    }

    @Override // p204p.o5k
    /* JADX INFO: renamed from: a */
    public final fiz mo28140a(vhe0 vhe0Var, ago agoVar) {
        hz80 hz80Var;
        switch (this.f112857a) {
            case 0:
                return !m53490d(vhe0Var) ? new ysk(null, 27) : ((ihj0) this.f112858b).m50647f(vhe0Var, agoVar);
            case 1:
                return new ysk(m53491e(vhe0Var), 27);
            case 2:
                gle1 gle1Var = (gle1) this.f112859c;
                String str = vhe0Var.f241502a;
                gle1Var.getClass();
                return (str.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq") && ((l3v) this.f112860d).f129445a.m38349j()) ? new ner(((vmz) this.f112858b).m86024a("dj-voice-data-collection-eligibility", false), this, vhe0Var, 2) : new ysk(null, 27);
            case 3:
                if (((m240) this.f112860d).f139216a && (hz80Var = vhe0Var.f241505d) != null) {
                    if (((w300) ((v300) this.f112859c)).m87094a(hz80Var.f96829e) != u300.ALBUM) {
                        return new ner(k0e1.m54985d(((b5p) this.f112858b).m28193q(vhe0Var.f241502a).toObservable()), this, vhe0Var, 12);
                    }
                }
                return new ysk(null, 27);
            default:
                k9l0 k9l0Var = (k9l0) this.f112859c;
                fbk fbkVar = null;
                if (((dxk0) this.f112861e).m37261b()) {
                    return new ysk(null, 27);
                }
                if (!k9l0Var.f120616a.m64115g()) {
                    return new ysk(null, 27);
                }
                hz80 hz80Var2 = vhe0Var.f241505d;
                if (hz80Var2 == null) {
                    return new ysk(null, 27);
                }
                String str2 = vhe0Var.f241502a;
                if (m3l.m60708o(hz80Var2.f96812M0, in80.f103921b) || Boolean.parseBoolean((String) hz80Var2.f96822X.get("is_video_first"))) {
                    return new ysk(null, 27);
                }
                return g0g1.m43302g(new phw0(fag1.m41173v(agoVar, pag1.m69486v(new rko(t6x0.f217619L0, 1, mg91.f143396b, new pko(mg91.f143402f), mg91.f143398c), new rko(kas.f120954a, 1, mg91.f143400d, new pko(mg91.f143403g), mg91.f143401e), m191.f138881O0), str2), 8), new vjz(k9l0Var.m55838e(ii91.DOWNLOAD_MENU_ITEM), new far0(3, 16, fbkVar), 2), ((vmz) this.f112858b).f242953a, new ng91(this, vhe0Var, str2, hz80Var2, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    @Override // p204p.o5k
    /* JADX INFO: renamed from: b */
    public final Object mo28141b(vhe0 vhe0Var, ago agoVar, fbk fbkVar) {
        j6v j6vVar;
        k240 k240Var;
        hz80 hz80Var;
        String str;
        jj1 jj1Var;
        switch (this.f112857a) {
            case 0:
                if (m53490d(vhe0Var)) {
                    return ((ihj0) this.f112858b).m50646e(vhe0Var, agoVar, (ibk) fbkVar);
                }
                return null;
            case 1:
                return m53491e(vhe0Var);
            case 2:
                if (fbkVar instanceof j6v) {
                    j6vVar = (j6v) fbkVar;
                    int i = j6vVar.f109403d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        j6vVar.f109403d = i - Integer.MIN_VALUE;
                    } else {
                        j6vVar = new j6v(this, (ibk) fbkVar);
                    }
                } else {
                    j6vVar = new j6v(this, (ibk) fbkVar);
                }
                Object objM86755t = j6vVar.f109401b;
                int i2 = j6vVar.f109403d;
                if (i2 == 0) {
                    bga.m29073P(objM86755t);
                    gle1 gle1Var = (gle1) this.f112859c;
                    String str2 = vhe0Var.f241502a;
                    gle1Var.getClass();
                    if (!str2.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq") || !((l3v) this.f112860d).f129445a.m38349j()) {
                        return null;
                    }
                    fiz fizVarM86024a = ((vmz) this.f112858b).m86024a("dj-voice-data-collection-eligibility", false);
                    j6vVar.f109400a = vhe0Var;
                    j6vVar.f109403d = 1;
                    objM86755t = vyf1.m86755t(fizVarM86024a, j6vVar);
                    yuk yukVar = yuk.f276404a;
                    if (objM86755t == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vhe0Var = j6vVar.f109400a;
                    bga.m29073P(objM86755t);
                }
                if (((Boolean) objM86755t).booleanValue()) {
                    return m53489c(vhe0Var);
                }
                return null;
            case 3:
                if (fbkVar instanceof k240) {
                    k240Var = (k240) fbkVar;
                    int i3 = k240Var.f118493e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        k240Var.f118493e = i3 - Integer.MIN_VALUE;
                    } else {
                        k240Var = new k240(this, (ibk) fbkVar);
                    }
                } else {
                    k240Var = new k240(this, (ibk) fbkVar);
                }
                Object objM96567o = k240Var.f118491c;
                int i4 = k240Var.f118493e;
                if (i4 == 0) {
                    bga.m29073P(objM96567o);
                    if (((m240) this.f112860d).f139216a && (hz80Var = vhe0Var.f241505d) != null) {
                        if (((w300) ((v300) this.f112859c)).m87094a(hz80Var.f96829e) != u300.ALBUM) {
                            str = vhe0Var.f241502a;
                            Single singleM28193q = ((b5p) this.f112858b).m28193q(str);
                            k240Var.f118489a = this;
                            k240Var.f118490b = str;
                            k240Var.f118493e = 1;
                            objM96567o = zn91.m96567o(singleM28193q, k240Var);
                            yuk yukVar2 = yuk.f276404a;
                            if (objM96567o == yukVar2) {
                                return yukVar2;
                            }
                            jj1Var = this;
                        }
                    }
                    return null;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = k240Var.f118490b;
                jj1Var = k240Var.f118489a;
                bga.m29073P(objM96567o);
                return ((x610) jj1Var.f112861e).m90062k(str, 2, ((Boolean) objM96567o).booleanValue());
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public f5k m53489c(vhe0 vhe0Var) {
        ola olaVar = (ola) this.f112861e;
        voc1 voc1Var = vhe0Var.f241503b;
        return new f5k("endless_dj_voice_data_sharing", (wwu) jwu.f116719c, (c5k) null, Integer.valueOf(R.string.context_menu_dj_voice_data_sharing), (String) null, false, (p221) null, new e5k(new y4k(2), 1, new d5k(g1v.f75730P0, new p56(voc1Var, 3)), new f6v(olaVar, 0)), 244);
    }

    /* JADX INFO: renamed from: d */
    public boolean m53490d(vhe0 vhe0Var) {
        if (((dxk0) this.f112861e).m37261b()) {
            return false;
        }
        hz80 hz80Var = vhe0Var.f241505d;
        if (hz80Var == null) {
            return true;
        }
        u300 u300VarM87094a = ((w300) ((v300) this.f112859c)).m87094a(hz80Var.f96829e);
        return ((u300VarM87094a == u300.PROMPT_PLAYLIST || u300VarM87094a == u300.PROMPT_PLAYLIST_TEST) && ((ee4) this.f112860d).m38642a() && hz80Var.f96832h) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public f5k m53491e(vhe0 vhe0Var) {
        AccessibilityManager accessibilityManager;
        Object c6x0Var;
        AccessibilityManager accessibilityManager2;
        wg61 wg61Var = (wg61) this.f112861e;
        if (((sp4) ((gd8) this.f112860d).f78759b).m78851a()) {
            hz80 hz80Var = vhe0Var.f241505d;
            String str = vhe0Var.f241502a;
            if (hz80Var != null && !m3l.m60715v(hz80Var.f96812M0) && ((accessibilityManager = (AccessibilityManager) wg61Var.getValue()) == null || !accessibilityManager.isEnabled() || (accessibilityManager2 = (AccessibilityManager) wg61Var.getValue()) == null || !accessibilityManager2.isTouchExplorationEnabled())) {
                try {
                    Set set = dd41.f47702f;
                    c6x0Var = r46.m74726U(str).m35710h();
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                if (c6x0Var instanceof c6x0) {
                    return null;
                }
                mxk mxkVar = (mxk) this.f112859c;
                Set set2 = dd41.f47702f;
                String strConcat = "spotify:cover-art-snake:".concat(r46.m74726U(str).m35710h());
                return new f5k("cover_art_snake", (wwu) iqu.f104847c, (c5k) null, Integer.valueOf(R.string.cover_art_snake_context_menu_title), (String) null, false, (p221) null, new e5k(new v4k(2), 1, new d5k(cmk.f39707X, new ivg(strConcat, 24)), new q7i(19, mxkVar, strConcat)), 244);
            }
        }
        return null;
    }

    public jj1(Context context, mxk mxkVar, gd8 gd8Var) {
        this.f112857a = 1;
        this.f112858b = context;
        this.f112859c = mxkVar;
        this.f112860d = gd8Var;
        this.f112861e = new wg61(new yfk(this, 10));
    }
}
