package p204p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.elements.quickactions.ban.BanButton;
import com.spotify.encoreconsumermobile.elements.selection.SelectionView;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import spotify.autodownload.esperanto.proto.SetShowStateRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;

/* JADX INFO: loaded from: classes4.dex */
public final class xvo implements wc40, Function, yh00, ant, lfe {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266439a;

    /* JADX INFO: renamed from: b */
    public Object f266440b;

    public /* synthetic */ xvo(Object obj, int i) {
        this.f266439a = i;
        this.f266440b = obj;
    }

    @Override // p204p.lfe
    /* JADX INFO: renamed from: a */
    public kfe mo58864a(vfe vfeVar) {
        kfe kfeVarMo58864a;
        q3m0 q3m0Var = (q3m0) this.f266440b;
        y400 y400Var = vfeVar.f240966a;
        ArrayList<m3m0> arrayList = new ArrayList();
        ofg1.m66837f(q3m0Var, y400Var, arrayList);
        for (m3m0 m3m0Var : arrayList) {
            if ((m3m0Var instanceof wqa) && (kfeVarMo58864a = ((wqa) m3m0Var).f253958t.mo58864a(vfeVar)) != null) {
                return kfeVarMo58864a;
            }
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f266439a) {
            case 1:
                wt7 wt7Var = (wt7) this.f266440b;
                wj50.m88279p(wt7Var);
                return new azo(wt7Var, ((Boolean) obj).booleanValue());
            case 2:
                return ((wys0) this.f266440b).get(obj);
            case 12:
                c4q0 c4q0Var = (c4q0) obj;
                qyp qypVar = (qyp) this.f266440b;
                if (!(c4q0Var instanceof u3q0)) {
                    return c4q0Var instanceof w3q0 ? ((Single) ((jt7) qypVar.f193962g).f115751c.getValue()).map(lew0.f132743X).flatMapCompletable(new0.f153133Y) : CompletableEmpty.f7437a;
                }
                xt7 xt7Var = qypVar.f193960e;
                u3q0 u3q0Var = (u3q0) c4q0Var;
                String str = u3q0Var.f226420a;
                boolean z = u3q0Var.f226421b;
                mt7 mt7Var = ((fzo) xt7Var).f75131a;
                k601 k601VarM97423p = SetShowStateRequest.m97423p();
                k601VarM97423p.m55574q(str);
                k601VarM97423p.m55573m(z);
                return mt7Var.callSingle("spotify.autodownload_esperanto.proto.AutoDownloadService", "SetShowState", (SetShowStateRequest) k601VarM97423p.build()).map(use.f233617t).ignoreElement();
            case 16:
                return new pqm0((gaq) this.f266440b, (xul0) obj);
            case 22:
                f0j f0jVar = (f0j) obj;
                zkr zkrVar = (zkr) this.f266440b;
                return f0jVar == f0j.f64673b ? Observable.defer(new yh1(zkrVar.f283837d, 29)).firstOrError().flatMapCompletable(new b5p(zkrVar, 16)).m23300q(njy0.f154686W0) : CompletableEmpty.f7437a;
            case 24:
                qa5 qa5Var = (qa5) obj;
                kb5 kb5Var = (kb5) this.f266440b;
                return Single.create(new r0e1(20, kb5Var, qa5Var.f186753a)).subscribeOn(kb5Var.f121087a).map(new b5p(qa5Var, 18));
            case 25:
                jqe1 jqe1VarM98173q = YourLibraryRequest.m98173q();
                kqe1 kqe1VarM98179G = YourLibraryRequestHeader.m98179G();
                kqe1VarM98179G.m57098H((YourLibraryConfig$YourLibrarySortOrder) this.f266440b);
                aoe1 aoe1VarM98214r = YourLibraryConfig$YourLibraryFilters.m98214r();
                aoe1VarM98214r.m26586q(boe1.DOWNLOADED);
                kqe1VarM98179G.m57107u((YourLibraryConfig$YourLibraryFilters) aoe1VarM98214r.build());
                kqe1VarM98179G.m57093C(350);
                jqe1VarM98173q.m54085m(kqe1VarM98179G);
                jqe1VarM98173q.m54087r((YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs) obj);
                return (YourLibraryRequest) jqe1VarM98173q.build();
            case 26:
                ybv ybvVar = ((qu80) obj).f192599e;
                boolean z2 = ybvVar.f271278w.f156638b;
                u300 u300VarM87094a = ((w300) ((v300) ((tgq) this.f266440b).f220238c)).m87094a(ybvVar.f271271p);
                return Boolean.valueOf((!z2 || u300VarM87094a == u300.PROMPT_PLAYLIST || u300VarM87094a == u300.PROMPT_PLAYLIST_TEST) ? false : true);
            default:
                int iOrdinal = ((dej0) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    t2n t2nVar = (t2n) this.f266440b;
                    vcj0 vcj0Var = (vcj0) t2nVar.f216593b;
                    Single map = vcj0Var.m85191c().map(new k0a0(vcj0Var, 15));
                    kbj0 kbj0Var = (kbj0) t2nVar.f216597f;
                    Single map2 = kbj0Var.m55946b().map(new m680(kbj0Var, 21));
                    qwx0 qwx0Var = (qwx0) t2nVar.f216595d;
                    zx3 zx3Var = (zx3) t2nVar.f216594c;
                    return Single.zip(map, map2, ((rwx0) qwx0Var).m76590a("active-session-days", String.valueOf(zx3Var.m97162c())).map(new b5p(t2nVar, 21)).first(Integer.valueOf(zx3Var.m97162c())), s0o0.f204453Y0).map(new bzo(t2nVar, 28));
                }
                return Single.just(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: b */
    public File m92243b(q0m q0mVar) {
        String strM75190h = rbz.m75190h(q0mVar.f184024c, "/", q0mVar.f184023b, "/", q0mVar.f184022a);
        int i = yd20.f271624a;
        vme0 vme0Var = xd20.f260364a;
        Charset charset = vuc.f244913a;
        String string = vme0Var.m93079p(strM75190h, charset).toString();
        return new File((File) this.f266440b, s571.m77252k(vme0Var.m93079p(q0mVar.f184025d, charset).toString().substring(0, 16), "/", string, ".mp3"));
    }

    /* JADX INFO: renamed from: c */
    public f5k m92244c(String str) {
        return new f5k("sts_edit_item", (wwu) wpu.f253840c, (c5k) null, Integer.valueOf(R.string.sts_context_menu_edit_title), (String) null, false, (p221) null, new e5k(new v4k(2), 1, new d5k(kqs.f125401V0, new jss(str, 3)), new szp(27, this, str)), 244);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 p.by50, still in use, count: 2, list:
          (r1v2 p.by50) from 0x019e: MOVE (r22v0 p.by50) = (r1v2 p.by50) (LINE:415)
          (r1v2 p.by50) from 0x01a6: PHI (r22v1 p.by50) = (r22v0 p.by50), (r1v2 p.by50) binds: [B:86:0x019e, B:85:0x0197] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: d */
    public p204p.by50 m92245d(p204p.pj31 r24, p204p.api r25) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.xvo.m92245d(p.pj31, p.api):p.by50");
    }

    /* JADX INFO: renamed from: e */
    public rv41 m92246e() {
        p7u p7uVarM69297a = p7u.m69297a();
        if (p7uVarM69297a.m69300c() == 1) {
            return new af40(true);
        }
        yum0 yum0VarM77645B = sam.m77645B(Boolean.FALSE);
        p7uVarM69297a.m69305i(new flp(0, yum0VarM77645B, this));
        return yum0VarM77645B;
    }

    /* JADX INFO: renamed from: f */
    public rv41 m92247f() {
        rv41 rv41Var = (rv41) this.f266440b;
        if (rv41Var != null) {
            return rv41Var;
        }
        if (!p7u.m69298d()) {
            return q350.f184795a;
        }
        rv41 rv41VarM92246e = m92246e();
        this.f266440b = rv41VarM92246e;
        return rv41VarM92246e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m92248g(String str, Set set, ibk ibkVar) {
        f2q f2qVar;
        if (ibkVar instanceof f2q) {
            f2qVar = (f2q) ibkVar;
            int i = f2qVar.f65252c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2qVar.f65252c = i - Integer.MIN_VALUE;
            } else {
                f2qVar = new f2q(this, ibkVar);
            }
        } else {
            f2qVar = new f2q(this, ibkVar);
        }
        Object objM61505b = f2qVar.f65250a;
        int i2 = f2qVar.f65252c;
        if (i2 == 0) {
            bga.m29073P(objM61505b);
            md31 md31Var = (md31) this.f266440b;
            nau nauVar = nau.f152117a;
            v660 v660Var = new v660(Collections.singletonMap(new z660(str, nauVar), set), nauVar);
            f2qVar.f65252c = 1;
            objM61505b = md31Var.m61505b(v660Var, f2qVar);
            yuk yukVar = yuk.f276404a;
            if (objM61505b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM61505b);
        }
        g760 g760Var = (g760) objM61505b;
        if (g760Var instanceof e760) {
            return g760Var;
        }
        if (g760Var instanceof f760) {
            return new f760((cx50) g6f.m43745s0((List) ((f760) g760Var).f66569a));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: h */
    public void mo26031h(int i, Bitmap bitmap) {
        ((SingleEmitter) this.f266440b).onSuccess(Integer.valueOf(bitmap.getPixel(0, 0)));
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: o */
    public void mo26038o(Drawable drawable) {
        ((SingleEmitter) this.f266440b).tryOnError(new Throwable((Throwable) null));
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f266439a) {
            case 3:
                j5p j5pVar = (j5p) this.f266440b;
                String str = ((d7i) obj).f46201b;
                ((TextView) j5pVar.f109053d.f225646Y).setText(str);
                d03 d03Var = j5pVar.f109054e;
                rxj.m76659a((TextView) d03Var.f43720S0, str);
                ((TextView) d03Var.f43716O0).setText(str);
                ContextMenuButton contextMenuButton = (ContextMenuButton) j5pVar.f109055f.f226729h;
                contextMenuButton.setEnabled(true);
                contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(R.string.show_context_menu_content_description_artist, str));
                break;
            case 5:
                Long l = (Long) obj;
                iin iinVar = (iin) this.f266440b;
                TextView textView = (TextView) ((hol0) iinVar.f102607c).f93563c;
                wj50.m88279p(l);
                textView.setText(iin.m50736d(iinVar, R.plurals.days_label, l.longValue()));
                break;
            case 8:
                ((PlayButtonView) ((kkx0) ((suo) this.f266440b).f214158c).f123733i).mo2820d(new jeo0(((Boolean) obj).booleanValue(), new cgo0(false), null, 4));
                break;
            case 11:
                List list = (List) obj;
                ytp ytpVar = (ytp) this.f266440b;
                wj50.m88279p(list);
                String strM43753y0 = g6f.m43753y0(list, " • ", null, null, null, 54);
                e6a0 e6a0Var = ytpVar.f276189e;
                ((TextView) e6a0Var.f56601e).setText(strM43753y0);
                TextView textView2 = (TextView) e6a0Var.f56600d;
                Resources resources = ytpVar.f276185a.getResources();
                int size = list.size();
                textView2.setText(size > 3 ? String.format(resources.getString(R.string.more_artist_text), Arrays.copyOf(new Object[]{Integer.valueOf(size - 3)}, 1)) : "");
                break;
            case 13:
                dwk dwkVar = (dwk) obj;
                g0q g0qVar = (g0q) this.f266440b;
                wj50.m88279p(dwkVar);
                g0qVar.f75414Y.mo2820d(dwkVar);
                break;
            case 17:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                e60 e60Var = ((adq) this.f266440b).f14659d;
                ((BanButton) e60Var.f56508e).setVisibility(zBooleanValue ? 0 : 8);
                ((AddToButtonView) e60Var.f56507d).setVisibility(zBooleanValue ? 8 : 0);
                ((BanButton) e60Var.f56508e).m9647a(zBooleanValue);
                break;
            case 18:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                tdq tdqVar = (tdq) this.f266440b;
                u12 u12Var = tdqVar.f219454c;
                if (zBooleanValue2) {
                    tdqVar.f219457f = true;
                    ((SelectionView) u12Var.f225655i).mo2820d(alz0.f17016c);
                    erg1.m39804w((SelectionView) u12Var.f225655i, lkr.f134435a, tdqVar.f219450Y, tdqVar.f219458g, 0.0f, 1.0f, new ljb1(12, pib1.f177890R0));
                }
                break;
            default:
                String str2 = (String) obj;
                suo suoVar = (suo) this.f266440b;
                if (str2 == null || str2.length() == 0) {
                    ((TextView) ((tw80) suoVar.f214158c).f224370f).setVisibility(8);
                } else {
                    ((TextView) ((tw80) suoVar.f214158c).f224370f).setVisibility(0);
                    ((TextView) ((tw80) suoVar.f214158c).f224370f).setText(str2);
                }
                break;
        }
    }

    public xvo(File file, xre xreVar) {
        this.f266439a = 23;
        this.f266440b = new File(file, "fitness-tts-cue-store");
    }

    public xvo(mvo mvoVar, w2y0 w2y0Var) {
        this.f266439a = 6;
        this.f266440b = w2y0Var;
    }

    public xvo() {
        this.f266439a = 9;
        this.f266440b = p7u.m69298d() ? m92246e() : null;
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: j */
    public void mo26033j(Drawable drawable) {
    }
}
