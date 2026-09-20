package com.spotify.allboarding.allboardingimpl.presentation.contentpicker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.comscore.streaming.ContentType;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p204p.b250;
import p204p.b9m;
import p204p.bbm0;
import p204p.bmx;
import p204p.byn0;
import p204p.cbm0;
import p204p.cec1;
import p204p.ciq;
import p204p.e6a0;
import p204p.e940;
import p204p.esj;
import p204p.ezw0;
import p204p.fau;
import p204p.fk3;
import p204p.foj;
import p204p.fr70;
import p204p.fyn0;
import p204p.gl8;
import p204p.goj;
import p204p.hiy0;
import p204p.hk4;
import p204p.hoj;
import p204p.hqk;
import p204p.hta0;
import p204p.hxt;
import p204p.hyn0;
import p204p.i500;
import p204p.i600;
import p204p.ia7;
import p204p.ioj;
import p204p.it9;
import p204p.jc5;
import p204p.jj3;
import p204p.joc1;
import p204p.jsj;
import p204p.jx1;
import p204p.kc3;
import p204p.kv91;
import p204p.lau;
import p204p.lbf;
import p204p.loj;
import p204p.lq91;
import p204p.lt91;
import p204p.lx9;
import p204p.mec1;
import p204p.moj;
import p204p.ohy0;
import p204p.pq91;
import p204p.q3d0;
import p204p.qic1;
import p204p.qpv0;
import p204p.qq91;
import p204p.r250;
import p204p.r7i;
import p204p.rfg1;
import p204p.rkk;
import p204p.rxt;
import p204p.sc21;
import p204p.ssh;
import p204p.thm0;
import p204p.toc1;
import p204p.unj;
import p204p.up60;
import p204p.vg70;
import p204p.vie1;
import p204p.voc1;
import p204p.w9h1;
import p204p.wj50;
import p204p.x150;
import p204p.x8y0;
import p204p.xgg1;
import p204p.xyn0;
import p204p.yj3;
import p204p.zam0;
import p204p.zc3;
import p204p.zxn0;
import p204p.zz11;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/allboarding/allboardingimpl/presentation/contentpicker/ContentPickerFragment;", "Lp/i500;", "Lp/bbm0;", "Lp/toc1;", "Lp/i600;", "injector", "<init>", "(Lp/i600;)V", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ContentPickerFragment extends i500 implements bbm0, toc1 {

    /* JADX INFO: renamed from: A1 */
    public final i600 f2794A1;

    /* JADX INFO: renamed from: B1 */
    public qq91 f2795B1;

    /* JADX INFO: renamed from: C1 */
    public thm0 f2796C1;

    /* JADX INFO: renamed from: D1 */
    public kv91 f2797D1;

    /* JADX INFO: renamed from: E1 */
    public lt91 f2798E1;

    /* JADX INFO: renamed from: F1 */
    public hk4 f2799F1;

    /* JADX INFO: renamed from: G1 */
    public jsj f2800G1;

    /* JADX INFO: renamed from: H1 */
    public final qic1 f2801H1;

    /* JADX INFO: renamed from: I1 */
    public e940 f2802I1;

    /* JADX INFO: renamed from: J1 */
    public zc3 f2803J1;

    /* JADX INFO: renamed from: K1 */
    public boolean f2804K1;

    /* JADX INFO: renamed from: L1 */
    public e6a0 f2805L1;

    /* JADX INFO: renamed from: M1 */
    public hxt f2806M1;

    /* JADX INFO: renamed from: N1 */
    public hxt f2807N1;

    /* JADX INFO: renamed from: O1 */
    public hxt f2808O1;

    /* JADX INFO: renamed from: P1 */
    public hxt f2809P1;

    /* JADX INFO: renamed from: Q1 */
    public FrameLayout f2810Q1;

    /* JADX INFO: renamed from: R1 */
    public FrameLayout f2811R1;

    /* JADX INFO: renamed from: S1 */
    public int f2812S1;

    /* JADX INFO: renamed from: T1 */
    public Object f2813T1;

    /* JADX INFO: renamed from: U1 */
    public List f2814U1;

    /* JADX INFO: renamed from: V1 */
    public xyn0 f2815V1;

    /* JADX INFO: renamed from: W1 */
    public fk3 f2816W1;

    /* JADX INFO: renamed from: X1 */
    public vg70 f2817X1;

    /* JADX INFO: renamed from: Y1 */
    public final foj f2818Y1;

    /* JADX INFO: renamed from: Z1 */
    public final loj f2819Z1;

    /* JADX INFO: renamed from: a2 */
    public boolean f2820a2;

    /* JADX INFO: renamed from: b2 */
    public final voc1 f2821b2;

    public ContentPickerFragment(i600 i600Var) {
        this.f2794A1 = i600Var;
        foj fojVar = new foj(this, 12);
        fr70 fr70VarM72078I = q3d0.m72078I(3, new r7i(new foj(this, 11), 16));
        this.f2801H1 = new qic1(qpv0.f191387a.mo54112b(esj.class), new jx1(fr70VarM72078I, 4), fojVar, new jx1(fr70VarM72078I, 5));
        this.f2813T1 = lau.f131415a;
        this.f2818Y1 = new foj(this, 4);
        this.f2819Z1 = new loj(this);
        this.f2820a2 = true;
        this.f2821b2 = yj3.CONTENT_PICKER.f273280b;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f2794A1.mo24367f(this);
        super.mo875E0(context);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        hk4.m47733d(m3099j1(), ssh.f213621b1);
        super.mo876F0(bundle);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        b250 b250Var;
        if (bundle == null) {
            zc3 zc3Var = this.f2803J1;
            if (zc3Var == null) {
                wj50.m88260d0("screenProvider");
                throw null;
            }
            m3102m1().m15621f(new unj((hiy0) zc3Var.f281446a));
        }
        int i = 2;
        int i2 = 0;
        m3099j1().m47737e(2, false);
        View viewInflate = layoutInflater.inflate(R.layout.picker_content_view, viewGroup, false);
        int i3 = R.id.buttonContainer;
        View viewM85629k = vie1.m85629k(viewInflate, R.id.buttonContainer);
        if (viewM85629k != null) {
            int i4 = R.id.actionButton;
            EncoreButton encoreButton = (EncoreButton) vie1.m85629k(viewM85629k, R.id.actionButton);
            if (encoreButton != null) {
                i4 = R.id.choose_x_or_more_label;
                EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(viewM85629k, R.id.choose_x_or_more_label);
                if (encoreTextView != null) {
                    i4 = R.id.secondaryActionButton;
                    EncoreButton encoreButton2 = (EncoreButton) vie1.m85629k(viewM85629k, R.id.secondaryActionButton);
                    if (encoreButton2 != null) {
                        i4 = R.id.selected_nb_label;
                        EncoreTextView encoreTextView2 = (EncoreTextView) vie1.m85629k(viewM85629k, R.id.selected_nb_label);
                        if (encoreTextView2 != null) {
                            bmx bmxVar = new bmx((LinearLayout) viewM85629k, encoreButton, encoreTextView, encoreButton2, encoreTextView2, 29);
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                            i3 = R.id.picker_collapsing_title;
                            PickerCollapsingTitleBar pickerCollapsingTitleBar = (PickerCollapsingTitleBar) vie1.m85629k(viewInflate, R.id.picker_collapsing_title);
                            if (pickerCollapsingTitleBar != null) {
                                i3 = R.id.picker_recycler_view;
                                GridRecyclerView gridRecyclerView = (GridRecyclerView) vie1.m85629k(viewInflate, R.id.picker_recycler_view);
                                if (gridRecyclerView != null) {
                                    this.f2805L1 = new e6a0(coordinatorLayout, bmxVar, pickerCollapsingTitleBar, gridRecyclerView, 19);
                                    e940 e940Var = this.f2802I1;
                                    if (e940Var == null) {
                                        wj50.m88260d0("imageLoader");
                                        throw null;
                                    }
                                    int i5 = 3;
                                    this.f2816W1 = new fk3(e940Var, new hoj(this, i), new hoj(this, i5));
                                    this.f2817X1 = new vg70(new goj(this, i), new hoj(this, 4));
                                    GridRecyclerView gridRecyclerViewM3101l1 = m3101l1();
                                    fk3 fk3Var = this.f2816W1;
                                    if (fk3Var == null) {
                                        wj50.m88260d0("rvAdapter");
                                        throw null;
                                    }
                                    gridRecyclerViewM3101l1.setAdapter(fk3Var);
                                    m3101l1().setLayoutAnimation(null);
                                    ((sc21) m3101l1().getItemAnimator()).f207636g = false;
                                    PickerCollapsingTitleBar pickerCollapsingTitleBarM3098i1 = m3098i1();
                                    vg70 vg70Var = this.f2817X1;
                                    if (vg70Var == null) {
                                        wj50.m88260d0("tagRvAdapter");
                                        throw null;
                                    }
                                    pickerCollapsingTitleBarM3098i1.setFiltersRecyclerViewAdapter(vg70Var);
                                    if (!this.f2804K1) {
                                        ((CopyOnWriteArraySet) m3098i1().f2893c1.f153884b).add(this.f2819Z1);
                                        GridRecyclerView gridRecyclerViewM3101l2 = m3101l1();
                                        PickerCollapsingTitleBar pickerCollapsingTitleBarM3098i2 = m3098i1();
                                        ezw0 ezw0Var = new ezw0(gridRecyclerViewM3101l2, pickerCollapsingTitleBarM3098i2, new foj(this, 10), 9);
                                        View searchFieldRoot = pickerCollapsingTitleBarM3098i2.getSearchFieldRoot();
                                        if (searchFieldRoot != null) {
                                            Button searchPlaceholder = pickerCollapsingTitleBarM3098i2.getSearchPlaceholder();
                                            gridRecyclerViewM3101l2.setUpwardFocusTarget(searchFieldRoot);
                                            gridRecyclerViewM3101l2.setOnExpandCollapsingTitleBar(new ohy0(ezw0Var, i5));
                                            searchFieldRoot.setOnKeyListener(new ciq(ezw0Var, i));
                                            if (searchPlaceholder != null) {
                                                searchPlaceholder.setOnClickListener(new hta0(ezw0Var, 24));
                                            }
                                        }
                                    }
                                    m3101l1().m1013j(new moj(i2));
                                    m3099j1().m47734a(2);
                                    int i6 = 16;
                                    int i7 = 1;
                                    if (this.f2804K1) {
                                        m3098i1().setHeaderComposeVisible(true);
                                        FrameLayout headerTitleComposeContainer = m3098i1().getF2890Z0();
                                        int dimensionPixelSize = m49721t0().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material);
                                        headerTitleComposeContainer.setMinimumHeight(dimensionPixelSize);
                                        zz11 zz11Var = new zz11(dimensionPixelSize, 8);
                                        WeakHashMap weakHashMap = mec1.f142677a;
                                        cec1.m32550n(headerTitleComposeContainer, zz11Var);
                                        foj fojVar = new foj(this, i5);
                                        goj gojVar = new goj(this, i7);
                                        hoj hojVar = new hoj(this, i7);
                                        foj fojVar2 = this.f2818Y1;
                                        rxt rxtVarM87517y = w9h1.m87517y(new hyn0(fojVar2, fojVar, gojVar, hojVar), null, null, 3);
                                        up60 up60Var = hxt.f96286w;
                                        hxt hxtVarM50020m = ia7.m50020m(headerTitleComposeContainer.getContext(), headerTitleComposeContainer, rxtVarM87517y, fyn0.f74778g, null, ContentType.LONG_FORM_ON_DEMAND);
                                        headerTitleComposeContainer.removeAllViews();
                                        headerTitleComposeContainer.addView(hxtVarM50020m.f96307t);
                                        this.f2807N1 = hxtVarM50020m;
                                        FrameLayout headerContentComposeContainer = m3098i1().getF2891a1();
                                        hxt hxtVarM50020m2 = ia7.m50020m(headerContentComposeContainer.getContext(), headerContentComposeContainer, w9h1.m87517y(new byn0(fojVar2, new foj(this, i2), new goj(this, i2), new hoj(this, i2), new foj(this, i7), new foj(this, i)), null, null, 3), zxn0.f287357e, null, ContentType.LONG_FORM_ON_DEMAND);
                                        headerContentComposeContainer.removeAllViews();
                                        headerContentComposeContainer.addView(hxtVarM50020m2.f96307t);
                                        this.f2808O1 = hxtVarM50020m2;
                                        e6a0 e6a0Var = this.f2805L1;
                                        wj50.m88279p(e6a0Var);
                                        ((LinearLayout) ((bmx) e6a0Var.f56599c).f28644b).setVisibility(8);
                                        FrameLayout frameLayout = new FrameLayout(m49702X0());
                                        hqk hqkVar = new hqk(-1, -2);
                                        hqkVar.f94200c = 81;
                                        frameLayout.setLayoutParams(hqkVar);
                                        frameLayout.setAccessibilityLiveRegion(1);
                                        e6a0 e6a0Var2 = this.f2805L1;
                                        wj50.m88279p(e6a0Var2);
                                        ((CoordinatorLayout) e6a0Var2.f56598b).addView(frameLayout);
                                        this.f2811R1 = frameLayout;
                                        cec1.m32550n(frameLayout, new it9(this, i6));
                                        m3101l1().setVisibility(8);
                                        FrameLayout frameLayout2 = new FrameLayout(m49702X0());
                                        hqk hqkVar2 = new hqk(-1, -1);
                                        hqkVar2.m48293b(new AppBarLayout.ScrollingViewBehavior());
                                        frameLayout2.setLayoutParams(hqkVar2);
                                        e6a0 e6a0Var3 = this.f2805L1;
                                        wj50.m88279p(e6a0Var3);
                                        ((CoordinatorLayout) e6a0Var3.f56598b).addView(frameLayout2, 1);
                                        this.f2810Q1 = frameLayout2;
                                        FrameLayout frameLayout3 = this.f2811R1;
                                        if (frameLayout3 != null) {
                                            if (frameLayout2.getId() == -1) {
                                                frameLayout2.setId(View.generateViewId());
                                            }
                                            if (frameLayout3.getId() == -1) {
                                                frameLayout3.setId(View.generateViewId());
                                            }
                                            frameLayout2.setNextFocusDownId(frameLayout3.getId());
                                            frameLayout2.setNextFocusForwardId(frameLayout3.getId());
                                            frameLayout3.setNextFocusUpId(frameLayout2.getId());
                                        }
                                        m3098i1().setOnCollapseFractionChanged(new goj(this, i5));
                                        e6a0 e6a0Var4 = this.f2805L1;
                                        wj50.m88279p(e6a0Var4);
                                        CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) e6a0Var4.f56598b;
                                        x150 x150Var = new x150(new foj(this, 5));
                                        kv91 kv91Var = this.f2797D1;
                                        if (kv91Var == null) {
                                            wj50.m88260d0("ubiLogger");
                                            throw null;
                                        }
                                        lt91 lt91Var = this.f2798E1;
                                        if (lt91Var == null) {
                                            wj50.m88260d0("ubiDwellTimeLogger");
                                            throw null;
                                        }
                                        r250 r250Var = new r250(new lq91(lt91Var, null, kv91Var));
                                        b250 lbfVar = fau.f67640b;
                                        if (x150Var.equals(lbfVar) && r250Var.equals(lbfVar)) {
                                            b250Var = lbfVar;
                                        } else if (x150Var.equals(lbfVar)) {
                                            b250Var = r250Var;
                                        } else if (!r250Var.equals(lbfVar)) {
                                            b250Var = x150Var;
                                            lbfVar = new lbf(x150Var, r250Var);
                                            b250Var = lbfVar;
                                        }
                                        b250Var = x150Var;
                                        joc1.m53876c(coordinatorLayout2, b250Var);
                                    } else {
                                        e6a0 e6a0Var5 = this.f2805L1;
                                        wj50.m88279p(e6a0Var5);
                                        ((LinearLayout) ((bmx) e6a0Var5.f56599c).f28644b).setAccessibilityLiveRegion(1);
                                        e6a0 e6a0Var6 = this.f2805L1;
                                        wj50.m88279p(e6a0Var6);
                                        LinearLayout linearLayout = (LinearLayout) ((bmx) e6a0Var6.f56599c).f28644b;
                                        gl8 gl8Var = new gl8(this, i6);
                                        WeakHashMap weakHashMap2 = mec1.f142677a;
                                        cec1.m32550n(linearLayout, gl8Var);
                                    }
                                    e6a0 e6a0Var7 = this.f2805L1;
                                    wj50.m88279p(e6a0Var7);
                                    return (CoordinatorLayout) e6a0Var7.f56598b;
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM85629k.getResources().getResourceName(i4)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: I0 */
    public final void mo878I0() {
        this.f98702f1 = true;
        if (this.f2804K1) {
            m3098i1().setOnCollapseFractionChanged(null);
        } else {
            ((CopyOnWriteArraySet) m3098i1().f2893c1.f153884b).remove(this.f2819Z1);
        }
        this.f2806M1 = null;
        this.f2807N1 = null;
        this.f2808O1 = null;
        this.f2809P1 = null;
        this.f2810Q1 = null;
        this.f2811R1 = null;
        this.f2814U1 = null;
        this.f2815V1 = null;
        this.f2813T1 = lau.f131415a;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: M0 */
    public final void mo3094M0() {
        m3099j1().m47735b(3);
        this.f98702f1 = true;
        esj esjVarM3102m1 = m3102m1();
        esjVarM3102m1.f62415g.m90234d(esjVarM3102m1.m15622g(), "VIEW_STATE");
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        m3099j1().m47737e(3, false);
        m3102m1().f5623c.mo15616c(this, new jj3(this, 3));
        m3102m1().f5622b.m33099f(m49724w0(), new ioj(this, 0));
        x8y0 x8y0Var = (x8y0) rfg1.m75453w(this).m84255h(R.id.content_picker).f234932X.getValue();
        x8y0Var.m90233c("skipDialogResult").m33099f(this, new ioj(this, 1));
        x8y0Var.m90233c("searchResult_mobius").m33099f(this, new jc5(2, this, x8y0Var));
        m49699V0().mo31751N().m28385a(m49724w0(), new lx9(this, 4));
        m3099j1().m47734a(3);
    }

    @Override // p204p.toc1
    /* JADX INFO: renamed from: a, reason: from getter */
    public final voc1 getF2858Y1() {
        return this.f2821b2;
    }

    @Override // p204p.bbm0
    /* JADX INFO: renamed from: c */
    public final zam0 mo3039c() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return xgg1.m90662N1("ALLBOARDING_CONTENTPICKER", "allboarding/contentpicker", 144, kc3.f121351b);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h1 */
    public final List m3097h1(hiy0 hiy0Var) {
        xyn0 xyn0VarM28519s = b9m.m28519s(hiy0Var);
        List list = hiy0Var.f91903c;
        if (list == this.f2814U1 && wj50.m88271j(xyn0VarM28519s, this.f2815V1)) {
            return this.f2813T1;
        }
        this.f2814U1 = list;
        this.f2815V1 = xyn0VarM28519s;
        ArrayList arrayListM75768t = rkk.m75768t(list, b9m.m28519s(hiy0Var));
        this.f2813T1 = arrayListM75768t;
        return arrayListM75768t;
    }

    /* JADX INFO: renamed from: i1 */
    public final PickerCollapsingTitleBar m3098i1() {
        e6a0 e6a0Var = this.f2805L1;
        wj50.m88279p(e6a0Var);
        return (PickerCollapsingTitleBar) e6a0Var.f56600d;
    }

    /* JADX INFO: renamed from: j1 */
    public final hk4 m3099j1() {
        hk4 hk4Var = this.f2799F1;
        if (hk4Var != null) {
            return hk4Var;
        }
        wj50.m88260d0("pageLoadTimeKeeper");
        throw null;
    }

    /* JADX INFO: renamed from: k1 */
    public final pq91 m3100k1() {
        qq91 qq91Var = this.f2795B1;
        if (qq91Var != null) {
            return qq91Var;
        }
        wj50.m88260d0("pickerLogger");
        throw null;
    }

    /* JADX INFO: renamed from: l1 */
    public final GridRecyclerView m3101l1() {
        e6a0 e6a0Var = this.f2805L1;
        wj50.m88279p(e6a0Var);
        return (GridRecyclerView) e6a0Var.f56601e;
    }

    /* JADX INFO: renamed from: m1 */
    public final esj m3102m1() {
        return (esj) this.f2801H1.getValue();
    }
}
