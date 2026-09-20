package p204p;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mainlayout.p106ui.view.MainLayout;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutContentContainerView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class xxb0 extends enk0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f266935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zxb0 f266936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxb0(zxb0 zxb0Var, int i) {
        super(null);
        this.f266935b = i;
        this.f266936c = zxb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0185  */
    /* JADX WARN: Code duplicated, block: B:103:0x018a  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0191  */
    /* JADX WARN: Code duplicated, block: B:109:0x019b  */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:117:0x0209  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0176  */
    /* JADX WARN: Code duplicated, block: B:98:0x017e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0182  */
    @Override // p204p.enk0
    /* JADX INFO: renamed from: a */
    public final void mo34343a(qr60 qr60Var, Object obj, Object obj2) {
        View fragmentContainer;
        int i;
        int i2;
        zzq0 zzq0VarM97177d;
        xzq0 xzq0Var;
        int i3;
        int i4;
        int i5;
        MainLayoutContentContainerView bannerContainer;
        ViewGroup.LayoutParams layoutParams;
        int i6;
        ViewGroup.LayoutParams layoutParams2;
        int i7 = this.f266935b;
        zxb0 zxb0Var = this.f266936c;
        switch (i7) {
            case 0:
                MainLayout mainLayout = zxb0Var.f287270a;
                wxb0 wxb0Var = (wxb0) obj2;
                wxb0 wxb0Var2 = (wxb0) obj;
                if (wj50.m88271j(wxb0Var2, wxb0Var)) {
                    return;
                }
                oh5 oh5Var = zxb0.f287268h;
                zzq0 zzq0VarM97177d2 = zxb0Var.m97177d();
                if (zzq0VarM97177d2 == null) {
                    zzq0VarM97177d2 = null;
                } else if (zzq0VarM97177d2 instanceof tzq0) {
                    zzq0VarM97177d2 = ((tzq0) zzq0VarM97177d2).f225288a;
                }
                if (!(zzq0VarM97177d2 instanceof wzq0)) {
                    if (mainLayout.getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view().f256000b) {
                        fragmentContainer = mainLayout.getFragmentOverlayContainer();
                    } else {
                        oh5Var.getClass();
                        fragmentContainer = wj50.m88271j(mainLayout.getFragmentContainer().getParent(), mainLayout) ? mainLayout.getFragmentContainer() : (View) mainLayout.getFragmentContainer().getParent();
                    }
                    View navigationWindowInsetsSpace = mainLayout.getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view().f256000b ? mainLayout.getNavigationWindowInsetsSpace() : mainLayout.getFragmentContainerBottomOverlapTouchEventConsumer();
                    c7j c7jVar = new c7j();
                    c7jVar.m31736f(mainLayout);
                    View snackbarContainer = mainLayout.getSnackbarContainer();
                    oh5Var.getClass();
                    c7jVar.m31737g(snackbarContainer.getId(), 6, fragmentContainer.getId(), 6);
                    c7jVar.m31737g(snackbarContainer.getId(), 7, fragmentContainer.getId(), 7);
                    c7jVar.m31733b(mainLayout);
                    mainLayout.getSnackbarBarrierBottom().setReferencedIds(new int[]{mainLayout.getImeWindowInsetsSpace().getId(), navigationWindowInsetsSpace.getId()});
                }
                zxb0.m97175e(mainLayout.getFragmentContainer(), zxb0Var.m97176c().f255999a);
                ViewGroup nowPlayingMiniContainer = mainLayout.getNowPlayingMiniContainer();
                if (nowPlayingMiniContainer != null) {
                    zxb0.m97175e(nowPlayingMiniContainer, zxb0Var.m97176c().f255999a);
                }
                MainLayoutContentContainerView nowPlayingViewContainer = mainLayout.getNowPlayingViewContainer();
                if (nowPlayingViewContainer != null) {
                    zxb0.m97175e(nowPlayingViewContainer, zxb0Var.m97176c().f255999a);
                }
                MainLayoutContentContainerView nowPlayingViewAttachmentsContainer = mainLayout.getNowPlayingViewAttachmentsContainer();
                if (nowPlayingViewAttachmentsContainer != null) {
                    zxb0.m97175e(nowPlayingViewAttachmentsContainer, zxb0Var.m97176c().f255999a);
                }
                zxb0.m97175e(mainLayout.getNavigationContainer(), zxb0Var.m97176c().f256000b);
                zxb0.m97175e(mainLayout.getLimitedExperienceIndicatorContainer(), zxb0Var.m97176c().f256001c);
                float z = (!zxb0Var.m97176c().f255999a || zxb0Var.m97176c().f256000b) ? 0.0f : mainLayout.getFragmentOverlayContainer().getZ() + 1.0f;
                float f = (!zxb0Var.m97176c().f255999a || zxb0Var.m97176c().f256001c) ? 0.0f : z;
                c0m0 c0m0Var = (c0m0) zxb0Var.f287271b.getValue();
                c0m0Var.f32823b.post(new vod0(5, c0m0Var, new yxb0(zxb0Var, z, f, 0)));
                if (!wxb0Var2.f255999a && wxb0Var.f255999a) {
                    mainLayout.getFragmentContainer().clearFocus();
                }
                zxb0.m97173a(zxb0Var);
                View displayCutoutPlaceholderStart = mainLayout.getDisplayCutoutPlaceholderStart();
                if (displayCutoutPlaceholderStart != null) {
                    displayCutoutPlaceholderStart.setVisibility(!wxb0Var.f255999a ? 4 : 0);
                    return;
                }
                return;
            case 1:
                wg61 wg61Var = zxb0Var.f287271b;
                MainLayout mainLayout2 = zxb0Var.f287270a;
                if (wj50.m88271j((zzq0) obj, (zzq0) obj2)) {
                    return;
                }
                zxb0.m97174b(zxb0Var);
                zzq0 zzq0VarM97177d3 = zxb0Var.m97177d();
                xzq0 xzq0Var2 = zzq0VarM97177d3 instanceof xzq0 ? (xzq0) zzq0VarM97177d3 : null;
                int i8 = xzq0Var2 != null ? xzq0Var2.f267735b : 0;
                if (zxb0Var.f287276g) {
                    c0m0 c0m0Var2 = (c0m0) wg61Var.getValue();
                    View view = c0m0Var2.f32823b;
                    int i9 = c0m0Var2.f32826e;
                    if (i9 != i8) {
                        boolean z2 = i9 != 0;
                        boolean z3 = i8 != 0;
                        boolean z4 = z2 != z3;
                        boolean z5 = z2 && z3;
                        boolean z6 = z2 && !z3;
                        int iM31186b = c0m0Var2.m31186b(i8);
                        c0m0Var2.m31185a();
                        i = 0;
                        i2 = 1;
                        if (z4) {
                            if (iM31186b != 0) {
                                view.setBackgroundColor(iM31186b);
                            }
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), z6 ? 0.0f : 1.0f);
                            objectAnimatorOfFloat.addListener(new b0m0(iM31186b, c0m0Var2));
                            c0m0Var2.f32828g = objectAnimatorOfFloat;
                            objectAnimatorOfFloat.setDuration(300L);
                        }
                        if (z4 || z5) {
                            View view2 = c0m0Var2.f32822a;
                            if (((iM31186b >> 24) & 255) < 255) {
                                view2.setAlpha(1.0f);
                            } else {
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "alpha", view2.getAlpha(), z3 ? 0.0f : 1.0f);
                                c0m0Var2.f32829h = objectAnimatorOfFloat2;
                                if (objectAnimatorOfFloat2 != null) {
                                    objectAnimatorOfFloat2.setDuration(300L);
                                }
                            }
                        }
                        if (z5) {
                            Drawable background = view.getBackground();
                            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0, iM31186b);
                            c0m0Var2.f32827f = valueAnimatorOfArgb;
                            if (valueAnimatorOfArgb != null) {
                                valueAnimatorOfArgb.addUpdateListener(new rx4(c0m0Var2, 16));
                            }
                            ValueAnimator valueAnimator = c0m0Var2.f32827f;
                            if (valueAnimator != null) {
                                valueAnimator.setDuration(300L);
                            }
                        }
                        ValueAnimator valueAnimator2 = c0m0Var2.f32827f;
                        if (valueAnimator2 != null) {
                            valueAnimator2.start();
                        }
                        ObjectAnimator objectAnimator = c0m0Var2.f32828g;
                        if (objectAnimator != null) {
                            objectAnimator.start();
                        }
                        ObjectAnimator objectAnimator2 = c0m0Var2.f32829h;
                        if (objectAnimator2 != null) {
                            objectAnimator2.start();
                        }
                        c0m0Var2.f32826e = i8;
                    }
                    if (mainLayout2.getMode() != qvb0.f192959b) {
                        return;
                    }
                    zzq0VarM97177d = zxb0Var.m97177d();
                    if (zzq0VarM97177d instanceof xzq0) {
                        xzq0Var = (xzq0) zzq0VarM97177d;
                    } else {
                        xzq0Var = null;
                    }
                    if (xzq0Var != null) {
                        i3 = xzq0Var.f267735b;
                    } else {
                        i3 = i;
                    }
                    i4 = i2;
                    if (i3 == i4) {
                        i5 = i4;
                    } else {
                        i5 = i;
                    }
                    bannerContainer = mainLayout2.getBannerContainer();
                    if (i5 != 0) {
                        bannerContainer.m98343setContentMarginBottom0680j_4(mainLayout2.getResources().getDimension(R.dimen.main_layout_large_floating_margin) / mainLayout2.getResources().getDisplayMetrics().density);
                        bannerContainer.m98345setCornerRadius0680j_4(mainLayout2.getResources().getDimension(R.dimen.main_layout_large_floating_corner_radius) / mainLayout2.getResources().getDisplayMetrics().density);
                        layoutParams = bannerContainer.getLayoutParams();
                        if (layoutParams != null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        h6j h6jVar = (h6j) layoutParams;
                        int dimension = (int) mainLayout2.getResources().getDimension(R.dimen.main_layout_large_floating_margin);
                        h6jVar.setMarginStart(dimension);
                        h6jVar.setMarginEnd(dimension);
                        bannerContainer.setLayoutParams(h6jVar);
                        return;
                    }
                    i6 = i;
                    float f2 = i6;
                    bannerContainer.m98343setContentMarginBottom0680j_4(f2);
                    bannerContainer.m98345setCornerRadius0680j_4(f2);
                    layoutParams2 = bannerContainer.getLayoutParams();
                    if (layoutParams2 != null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    h6j h6jVar2 = (h6j) layoutParams2;
                    h6jVar2.setMarginStart(i6);
                    h6jVar2.setMarginEnd(i6);
                    bannerContainer.setLayoutParams(h6jVar2);
                    return;
                }
                zxb0Var.f287276g = true;
                c0m0 c0m0Var3 = (c0m0) wg61Var.getValue();
                View view3 = c0m0Var3.f32822a;
                View view4 = c0m0Var3.f32823b;
                c0m0Var3.m31185a();
                c0m0Var3.f32826e = i8;
                if (i8 != 0) {
                    int iM31186b2 = c0m0Var3.m31186b(i8);
                    view4.setAlpha(1.0f);
                    view4.setBackgroundColor(iM31186b2);
                    view3.setAlpha(((iM31186b2 >> 24) & 255) >= 255 ? 0.0f : 1.0f);
                } else {
                    view4.setAlpha(0.0f);
                    view3.setAlpha(1.0f);
                }
                i2 = 1;
                i = 0;
                if (mainLayout2.getMode() != qvb0.f192959b) {
                    return;
                }
                zzq0VarM97177d = zxb0Var.m97177d();
                if (zzq0VarM97177d instanceof xzq0) {
                    xzq0Var = (xzq0) zzq0VarM97177d;
                } else {
                    xzq0Var = null;
                }
                if (xzq0Var != null) {
                    i3 = xzq0Var.f267735b;
                } else {
                    i3 = i;
                }
                i4 = i2;
                if (i3 == i4) {
                    i5 = i4;
                } else {
                    i5 = i;
                }
                bannerContainer = mainLayout2.getBannerContainer();
                if (i5 != 0) {
                    bannerContainer.m98343setContentMarginBottom0680j_4(mainLayout2.getResources().getDimension(R.dimen.main_layout_large_floating_margin) / mainLayout2.getResources().getDisplayMetrics().density);
                    bannerContainer.m98345setCornerRadius0680j_4(mainLayout2.getResources().getDimension(R.dimen.main_layout_large_floating_corner_radius) / mainLayout2.getResources().getDisplayMetrics().density);
                    layoutParams = bannerContainer.getLayoutParams();
                    if (layoutParams != null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    h6j h6jVar3 = (h6j) layoutParams;
                    int dimension2 = (int) mainLayout2.getResources().getDimension(R.dimen.main_layout_large_floating_margin);
                    h6jVar3.setMarginStart(dimension2);
                    h6jVar3.setMarginEnd(dimension2);
                    bannerContainer.setLayoutParams(h6jVar3);
                    return;
                }
                i6 = i;
                float f3 = i6;
                bannerContainer.m98343setContentMarginBottom0680j_4(f3);
                bannerContainer.m98345setCornerRadius0680j_4(f3);
                layoutParams2 = bannerContainer.getLayoutParams();
                if (layoutParams2 != null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                h6j h6jVar4 = (h6j) layoutParams2;
                h6jVar4.setMarginStart(i6);
                h6jVar4.setMarginEnd(i6);
                bannerContainer.setLayoutParams(h6jVar4);
                return;
            case 2:
                if (wj50.m88271j((tkm0) obj, (tkm0) obj2)) {
                    return;
                }
                zxb0.m97174b(zxb0Var);
                return;
            default:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    zxb0.m97173a(zxb0Var);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxb0(wxb0 wxb0Var, zxb0 zxb0Var) {
        super(wxb0Var);
        this.f266935b = 0;
        this.f266936c = zxb0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xxb0(zxb0 zxb0Var) {
        this.f266935b = 3;
        Boolean bool = Boolean.FALSE;
        this.f266936c = zxb0Var;
        super(bool);
    }
}
