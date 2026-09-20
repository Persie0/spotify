package p204p;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.VideoFrameProcessingException;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.karaoke.esperanto.proto.KaraokePostVocalVolumeRequest;
import com.spotify.music.R;
import com.spotify.nowplaying.carousel.CarouselView;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCache;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeTimeoutMaybe;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class wgb0 implements Function, Predicate, ant, wxb1, zhv, xak, w1j0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251017a;

    /* JADX INFO: renamed from: b */
    public Object f251018b;

    public /* synthetic */ wgb0(int i, boolean z) {
        this.f251017a = i;
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: a */
    public void mo33237a(VideoFrameProcessingException videoFrameProcessingException) {
        pci0 pci0Var = (pci0) this.f251018b;
        pci0Var.f176120f.execute(new mpd0(7, pci0Var, videoFrameProcessingException));
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0244  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        csc1 csc1Var;
        int size;
        gpb0 epb0Var;
        kpb0 hpb0Var;
        int i;
        switch (this.f251017a) {
            case 0:
                ueb0 ueb0Var = (ueb0) obj;
                int iOrdinal = ueb0Var.f229477a.ordinal();
                if (iOrdinal == 0) {
                    csc1Var = csc1.f41517c;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    csc1Var = csc1.f41516b;
                }
                bsc1 bsc1Var = (bsc1) this.f251018b;
                bsc1Var.getClass();
                bt60 bt60VarM12066o = KaraokePostVocalVolumeRequest.m12066o();
                bt60VarM12066o.m30457m(csc1Var.m33768a());
                KaraokePostVocalVolumeRequest karaokePostVocalVolumeRequest = (KaraokePostVocalVolumeRequest) bt60VarM12066o.build();
                C2048kd c2048kd = bsc1Var.f30293d;
                wj50.m88279p(karaokePostVocalVolumeRequest);
                return Completable.m23288l(c2048kd.m56128e(karaokePostVocalVolumeRequest)).m23293d(Observable.just(new yfb0(true, csc1Var))).onErrorReturn(new esa0(ueb0Var, 2));
            case 1:
                zl81 zl81Var = (zl81) obj;
                vnb0 vnb0Var = (vnb0) this.f251018b;
                ?? r3 = vnb0Var.f243034a;
                int i2 = vnb0Var.f243035b;
                int i3 = zl81Var.f283946a;
                if (i2 == 1) {
                    hpb0Var = ipb0.f104465a;
                } else {
                    int i4 = 2;
                    if (r3.isEmpty()) {
                        size = -1;
                    } else {
                        long j = i3;
                        long j2 = 100;
                        if (j < ((kib0) r3.get(0)).f122910c - j2) {
                            size = -1;
                        } else {
                            size = r3.size() - 1;
                            int i5 = 0;
                            while (i5 < size) {
                                int i6 = (i5 + size) / i4;
                                long j3 = ((kib0) r3.get(i6)).f122910c - j2;
                                int i7 = i6 + 1;
                                int i8 = size;
                                long j4 = ((kib0) r3.get(i7)).f122910c - j2;
                                if (j3 > j || j >= j4) {
                                    if (j < j3) {
                                        size = i6 - 1;
                                    } else {
                                        i5 = i7;
                                        size = i8;
                                    }
                                    i4 = 2;
                                } else {
                                    size = i6;
                                }
                            }
                        }
                    }
                    int iM38547C = edb.m38547C(i2);
                    if (iM38547C == 0) {
                        throw new IllegalStateException();
                    }
                    if (iM38547C == 1) {
                        epb0Var = new epb0(size);
                    } else {
                        if (iM38547C != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kib0 kib0Var = (kib0) g6f.m43747t0(size, r3);
                        if (kib0Var == null || i3 == -1) {
                            i = 0;
                        } else {
                            i = 0;
                            for (tab0 tab0Var : kib0Var.f122911d) {
                                if (tab0Var.f218531a <= i3) {
                                    i += tab0Var.f218532b;
                                }
                            }
                        }
                        epb0Var = new fpb0(size, i);
                    }
                    int i9 = zl81Var.f283947b;
                    hpb0Var = new hpb0(epb0Var, i9 == 2, i9 != 2);
                }
                return new bob0(hpb0Var);
            case 2:
                tac0 tac0Var = (tac0) obj;
                uac0 uac0Var = (uac0) this.f251018b;
                eg7 eg7Var = tac0Var.f218539b;
                return tac0Var.f218538a ? uac0Var.f228446a.m95888f(true).map(new esa0(tac0Var, uac0Var)).onErrorReturnItem(new gac0(vac0.f239180c, eg7Var)) : Single.just(new gac0(wac0.f249448c, eg7Var));
            case 3:
                zc80 zc80Var = (zc80) obj;
                if (zc80Var instanceof xc80) {
                    return (Observable) ((vmb0) this.f251018b).invoke();
                }
                if (zc80Var instanceof yc80) {
                    return Observable.just(n5d0.f150526a);
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                Integer num = ((d1s) obj).f44341a;
                return Integer.valueOf(num != null ? num.intValue() : ((Number) ((wg61) ((ugz) this.f251018b).f230292d).getValue()).intValue());
            case 12:
                Integer num2 = (Integer) obj;
                boolean zBooleanValue = ((Boolean) ((lcj0) ((kcj0) this.f251018b).f121498b).invoke()).booleanValue();
                return (!(zBooleanValue && num2.intValue() == 0) && (zBooleanValue || num2.intValue() != 1)) ? jcj0.f111137c : jcj0.f111136b;
            case 14:
                return ((r2k0) this.f251018b).f195165a;
            case 19:
                return new pqm0((he61) this.f251018b, ((xul0) obj).mo49278b());
            case 20:
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (hashSet.add(((zyk0) obj2).f287607a)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    arrayList2.add(obj3);
                }
                return g6f.m43714b1(g6f.m43711Y0(arrayList2, ((q1l0) this.f251018b).f184367c), 20);
            case 25:
                return new xtw(4, ((cgt) this.f251018b).f37787a, null, (Throwable) obj);
            case 26:
                if (((Boolean) obj).booleanValue()) {
                    return k0e1.m54988g(new vgk0(new vgk0(new gq0(bzf1.m31021m(((bjn0) this.f251018b).f27724b.f175141e), 12), 7), 8), dau.f47107a);
                }
                Observable observableEmpty = Observable.empty();
                wj50.m88279p(observableEmpty);
                return observableEmpty;
            case 28:
                y5b y5bVar = (y5b) obj;
                muo0 muo0Var = (muo0) this.f251018b;
                y5b y5bVarM92845c = y5b.m92845c(y5bVar, null, null, 0, 63);
                nuo0 nuo0Var = muo0Var.f147396a;
                return k0e1.m54988g(((fuo0) nuo0Var.f158686b.get()).f73536b, dau.f47107a).observeOn(nuo0Var.f158687c).onErrorReturnItem(Boolean.FALSE).switchMap(new a9i0(22, nuo0Var, y5bVarM92845c)).filter(yby.f271298X0).map(new phn0(muo0Var, y5bVar));
            default:
                return Boolean.valueOf(((j0p0) this.f251018b).f107508n.f116130b && ((Boolean) obj).booleanValue());
        }
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: b */
    public void mo81148b(long j, boolean z) {
        if (j == 0) {
            ((pci0) this.f251018b).f176135u = true;
        }
        pci0 pci0Var = (pci0) this.f251018b;
        pci0Var.f176134t = j;
        pci0Var.f176120f.execute(new mci0(this, j, z, 0));
    }

    @Override // p204p.xak
    /* JADX INFO: renamed from: c */
    public Observable mo27364c() {
        return (Observable) this.f251018b;
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: d */
    public void mo81149d(int i, int i2) {
        ((pci0) this.f251018b).f176120f.execute(new lci0(this, i, i2, 0));
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: e */
    public void mo81150e(float f) {
        ((pci0) this.f251018b).f176120f.execute(new kci0(this, f, 0));
    }

    @Override // p204p.zhv
    /* JADX INFO: renamed from: f */
    public avt mo28679f(yhv yhvVar) {
        return mhf1.m61771p(yhvVar).m94133b(new ctf0(this, 18), vui0.f244980X0);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        return oyy0.m68568b((oyy0) this.f251018b, intent, e301Var, xoc1.f263914J3);
    }

    /* JADX INFO: renamed from: h */
    public boolean m88014h() {
        return ((qs4) this.f251018b).m73675a();
    }

    /* JADX INFO: renamed from: i */
    public r2h0 m88015i(String str) {
        return new r2h0((Integer) null, str, (st91) this.f251018b);
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: j */
    public void mo33243j() {
        ((pci0) this.f251018b).f176120f.execute(new ig10(this, 21));
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: o */
    public void mo88016o() {
        ((pci0) this.f251018b).m69588p();
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        jkj0 jkj0Var;
        switch (this.f251017a) {
            case 6:
                jnc1 jnc1Var = (jnc1) obj;
                mei meiVar = (mei) this.f251018b;
                z9j0 z9j0Var = (z9j0) meiVar.f142734e;
                q831 q831Var = (q831) meiVar.f142735f;
                yho yhoVar = (yho) meiVar.f142736g;
                if (jnc1Var.equals(rlc1.f200279a)) {
                    ((EncoreButton) yhoVar.f272932g).setEnabled(false);
                    ((ProgressBar) yhoVar.f272931f).setVisibility(8);
                    meiVar.m61576b();
                    return;
                }
                if (jnc1Var.equals(zmc1.f284218a)) {
                    ((EncoreButton) yhoVar.f272932g).setEnabled(true);
                    ((ProgressBar) yhoVar.f272931f).setVisibility(8);
                    meiVar.m61576b();
                    return;
                }
                if (jnc1Var.equals(dmc1.f50488a)) {
                    EncoreButton encoreButton = (EncoreButton) yhoVar.f272932g;
                    EncoreTextView encoreTextView = (EncoreTextView) yhoVar.f272929d;
                    encoreButton.setEnabled(false);
                    ((ProgressBar) yhoVar.f272931f).setVisibility(8);
                    encoreTextView.setVisibility(0);
                    EditText editText = (EditText) yhoVar.f272928c;
                    editText.setTextColor(-65536);
                    Resources resources = ((ConstraintLayout) yhoVar.f272927b).getResources();
                    ThreadLocal threadLocal = u1x0.f225931a;
                    editText.setBackground(resources.getDrawable(R.drawable.edittext_input_error_bg, null));
                    encoreTextView.performAccessibilityAction(64, null);
                    return;
                }
                if (jnc1Var.equals(bnc1.f28807a)) {
                    ((EncoreButton) yhoVar.f272932g).setEnabled(true);
                    ((ProgressBar) yhoVar.f272931f).setVisibility(8);
                    meiVar.m61576b();
                    q831Var.m72305j(new g631(null, ((ConstraintLayout) yhoVar.f272927b).getResources().getString(R.string.member_details_generic_error), null, null, null, null, null, null, false));
                    return;
                }
                if (jnc1Var.equals(enc1.f61140a)) {
                    z9j0Var.mo47345e();
                    q831Var.m72305j(new g631(null, ((ConstraintLayout) yhoVar.f272927b).getResources().getString(R.string.parental_control_update_birthday_snackbar), null, null, null, null, null, null, false));
                    return;
                } else if (jnc1Var.equals(fnc1.f71263a)) {
                    meiVar.m61576b();
                    ((EncoreButton) yhoVar.f272932g).setEnabled(false);
                    ((ProgressBar) yhoVar.f272931f).setVisibility(0);
                    return;
                } else {
                    if (!jnc1Var.equals(plc1.f178696a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z9j0Var.mo47345e();
                    return;
                }
            case 15:
                xt81 xt81Var = (xt81) obj;
                C2636z3 c2636z3 = (C2636z3) this.f251018b;
                a8k0 a8k0Var = ((p8k0) c2636z3.f278727f).f174986c;
                List list = xt81Var.f265799a;
                oir oirVarM45541n = grl0.m45541n(new xx0(a8k0Var.f13315e, a8k0Var.f13317g, list));
                a8k0Var.f13317g = list;
                oirVarM45541n.m67057b(a8k0Var);
                CarouselView carouselView = (CarouselView) c2636z3.f278724c;
                carouselView.mo1035v0(xt81Var.f265800b);
                e5x0 e5x0Var = xt81Var.f265801c;
                carouselView.setDisallowScrollLeft(e5x0Var.f56492c);
                carouselView.setDisallowScrollRight(e5x0Var.f56490a);
                return;
            case 16:
                String str = (String) obj;
                gbk0 gbk0Var = (gbk0) this.f251018b;
                j9f j9fVar = gbk0Var.f78334b1;
                if (gbk0Var.f78331a.f57952b == null) {
                    try {
                        j9fVar.m52742a(ztg1.m96916g(0.5f, Color.parseColor(str)));
                        return;
                    } catch (Exception unused) {
                        j9fVar.m52742a(Color.parseColor("#ff282828"));
                        return;
                    }
                }
                return;
            default:
                o0o0 o0o0Var = (o0o0) obj;
                for (EditText editText2 : (List) ((xq3) this.f251018b).f264858c) {
                    if (o0o0Var.equals(n0o0.f149124b)) {
                        jkj0Var = null;
                    } else {
                        if (!o0o0Var.equals(n0o0.f149123a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jkj0Var = new jkj0();
                    }
                    editText2.setTransformationMethod(jkj0Var);
                }
                return;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        ((s4p0) ((prd0) this.f251018b).f180559d).m77206b();
        return true;
    }

    public /* synthetic */ wgb0(Object obj, int i) {
        this.f251017a = i;
        this.f251018b = obj;
    }

    public wgb0(int i) {
        this.f251017a = i;
        switch (i) {
            case 18:
                this.f251018b = Observable.just(Boolean.TRUE);
                break;
            default:
                this.f251018b = new i8g0(0, (byte) 0);
                break;
        }
    }

    public wgb0(wm0 wm0Var, vv41 vv41Var) {
        this.f251017a = 22;
        this.f251018b = wm0Var;
        new MaybeCache((MaybeOnErrorComplete) new MaybeTimeoutMaybe(n0e1.m63407O(dau.f47107a, new r0m0(vv41Var, null, 0)), Maybe.m23364m(10L, TimeUnit.SECONDS, Schedulers.f10369b), null).m23371i());
    }
}
