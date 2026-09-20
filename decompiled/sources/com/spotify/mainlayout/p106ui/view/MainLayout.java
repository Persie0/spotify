package com.spotify.mainlayout.p106ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutConstrainedContainerView;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutContentContainerView;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutFragmentContainerView;
import com.spotify.mainlayout.p106ui.view.gradient.MainLayoutGradientView;
import com.spotify.music.R;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p204p.azb0;
import p204p.bc5;
import p204p.bpi0;
import p204p.dx40;
import p204p.fxb0;
import p204p.gh00;
import p204p.h6j;
import p204p.pwd1;
import p204p.qr60;
import p204p.qvb0;
import p204p.qwb0;
import p204p.r1m0;
import p204p.rvb0;
import p204p.spi0;
import p204p.svb0;
import p204p.swd1;
import p204p.tkm0;
import p204p.tvb0;
import p204p.twb0;
import p204p.uc5;
import p204p.uek0;
import p204p.vvb0;
import p204p.wg61;
import p204p.wj50;
import p204p.wqi0;
import p204p.wxb0;
import p204p.xvb0;
import p204p.y2u0;
import p204p.zxb0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0006Å\u0001Þ\u0001ß\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\u0011R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b%\u0010&R\u001d\u0010,\u001a\u0004\u0018\u00010(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010+R\u001b\u0010/\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\u0011R\u001d\u00104\u001a\u0004\u0018\u0001008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\u0011R\u001b\u0010:\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\n\u001a\u0004\b9\u0010\u0011R\u001d\u0010=\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\u0011R\u001d\u0010@\u001a\u0004\u0018\u0001008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\n\u001a\u0004\b?\u00103R\u001b\u0010C\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\u0011R\u001b\u0010F\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\n\u001a\u0004\bE\u0010!R\u001d\u0010I\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\u0011R\u001d\u0010L\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\n\u001a\u0004\bK\u0010\u0011R\u001b\u0010Q\u001a\u00020M8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010\n\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010\n\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010\n\u001a\u0004\bX\u0010\u0011R\u001d\u0010\\\u001a\u0004\u0018\u00010\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010\n\u001a\u0004\b[\u0010!R\u001d\u0010_\u001a\u0004\u0018\u0001008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010\n\u001a\u0004\b^\u00103R\u001b\u0010b\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b`\u0010\n\u001a\u0004\ba\u0010\u0011R\u001b\u0010e\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bc\u0010\n\u001a\u0004\bd\u0010\u0011R\u001b\u0010h\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bf\u0010\n\u001a\u0004\bg\u0010!R\u001b\u0010m\u001a\u00020i8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bj\u0010\n\u001a\u0004\bk\u0010lR\u001b\u0010p\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bn\u0010\n\u001a\u0004\bo\u0010&R\u001b\u0010s\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bq\u0010\n\u001a\u0004\br\u0010&R\u001d\u0010v\u001a\u0004\u0018\u00010R8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bt\u0010\n\u001a\u0004\bu\u0010UR\u001d\u0010y\u001a\u0004\u0018\u00010#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bw\u0010\n\u001a\u0004\bx\u0010&R\u001d\u0010|\u001a\u0004\u0018\u00010#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bz\u0010\n\u001a\u0004\b{\u0010&R\u001d\u0010\u007f\u001a\u0004\u0018\u0001008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b}\u0010\n\u001a\u0004\b~\u00103R \u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\n\u001a\u0005\b\u0081\u0001\u0010\u0011R \u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\n\u001a\u0005\b\u0084\u0001\u0010\u0011R&\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020R0\u0086\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0087\u0001\u0010\n\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001e\u0010\u008d\u0001\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\n\u001a\u0005\b\u008c\u0001\u0010&R\u001e\u0010\u0090\u0001\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\n\u001a\u0005\b\u008f\u0001\u0010&R)\u0010\u0096\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u0092\u00010\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0093\u0001\u0010\n\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\"\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0097\u00018@X\u0080\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010\n\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R9\u0010¤\u0001\u001a\u0005\u0018\u00010\u009c\u00012\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00018F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R9\u0010«\u0001\u001a\u0005\u0018\u00010¥\u00012\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010¥\u00018@@@X\u0080\u008e\u0002¢\u0006\u0018\n\u0006\b¦\u0001\u0010\u009f\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R \u0010±\u0001\u001a\u00030¬\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R0\u0010¸\u0001\u001a\u0013\u0012\u0005\u0012\u00030³\u0001\u0012\u0007\u0012\u0005\u0018\u00010³\u00010²\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\"\u0010½\u0001\u001a\u0005\u0018\u00010¹\u00018@X\u0080\u0084\u0002¢\u0006\u000f\n\u0005\bº\u0001\u0010\n\u001a\u0006\b»\u0001\u0010¼\u0001R9\u0010Ä\u0001\u001a\u0005\u0018\u00010¾\u00012\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010¾\u00018F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b¿\u0001\u0010\u009f\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R\u001d\u0010Ê\u0001\u001a\u00030Å\u00018\u0006¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R,\u0010Ò\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R!\u0010Ø\u0001\u001a\u00030Ó\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bÔ\u0001\u0010Õ\u0001*\u0006\bÖ\u0001\u0010×\u0001R,\u0010Ú\u0001\u001a\u00030¥\u00012\b\u0010Ù\u0001\u001a\u00030¥\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001¨\u0006à\u0001"}, m24212d2 = {"Lcom/spotify/mainlayout/ui/view/MainLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/spotify/mainlayout/ui/view/gradient/MainLayoutGradientView;", "R0", "Lp/fr70;", "getBottomGradient", "()Lcom/spotify/mainlayout/ui/view/gradient/MainLayoutGradientView;", "bottomGradient", "Landroid/view/View;", "S0", "getBottomGradientWindowInsets", "()Landroid/view/View;", "bottomGradientWindowInsets", "T0", "getBottomGradientBlackFade", "bottomGradientBlackFade", "U0", "getFragmentContainerInsetBottomSpacing", "fragmentContainerInsetBottomSpacing", "", "V0", "getBottomGradientViews", "()Ljava/util/List;", "bottomGradientViews", "Landroidx/constraintlayout/widget/Barrier;", "W0", "getBottomGradientBarrier", "()Landroidx/constraintlayout/widget/Barrier;", "bottomGradientBarrier", "Lcom/spotify/mainlayout/ui/view/containers/MainLayoutContentContainerView;", "X0", "getNavigationContainer", "()Lcom/spotify/mainlayout/ui/view/containers/MainLayoutContentContainerView;", "navigationContainer", "Lcom/spotify/mainlayout/ui/view/containers/MainLayoutConstrainedContainerView;", "Y0", "getNavigationContainerWrapper", "()Lcom/spotify/mainlayout/ui/view/containers/MainLayoutConstrainedContainerView;", "navigationContainerWrapper", "Z0", "getNavigationContainerTop", "navigationContainerTop", "Landroidx/constraintlayout/widget/Guideline;", "a1", "getNavigationAnimationGuidelineEnd", "()Landroidx/constraintlayout/widget/Guideline;", "navigationAnimationGuidelineEnd", "b1", "getNavigationWindowInsetsSpace", "navigationWindowInsetsSpace", "c1", "getImeWindowInsetsSpace", "imeWindowInsetsSpace", "d1", "getSidePanelBackground", "sidePanelBackground", "e1", "getSidePanelGuideline", "sidePanelGuideline", "f1", "getStatusBarPlaceholder", "statusBarPlaceholder", "g1", "getMainContentTopBarrier", "mainContentTopBarrier", "h1", "getDisplayCutoutPlaceholderEnd", "displayCutoutPlaceholderEnd", "i1", "getDisplayCutoutPlaceholderStart", "displayCutoutPlaceholderStart", "Lcom/spotify/mainlayout/ui/view/containers/MainLayoutFragmentContainerView;", "j1", "getFragmentContainer", "()Lcom/spotify/mainlayout/ui/view/containers/MainLayoutFragmentContainerView;", "fragmentContainer", "Landroid/view/ViewGroup;", "k1", "getFragmentOverlayContainer", "()Landroid/view/ViewGroup;", "fragmentOverlayContainer", "l1", "getFragmentContainerInsetBottom", "fragmentContainerInsetBottom", "m1", "getFragmentContainerBarrierEnd", "fragmentContainerBarrierEnd", "n1", "getFragmentAnimationGuidelineEnd", "fragmentAnimationGuidelineEnd", "o1", "getFragmentContainerBottomOverlapTouchEventConsumer", "fragmentContainerBottomOverlapTouchEventConsumer", "p1", "getSnackbarContainer", "snackbarContainer", "q1", "getSnackbarBarrierBottom", "snackbarBarrierBottom", "Lcom/spotify/encoremobile/tooltip/TooltipContainer;", "r1", "getTooltipContainer", "()Lcom/spotify/encoremobile/tooltip/TooltipContainer;", "tooltipContainer", "s1", "getResponseAgentContainer", "responseAgentContainer", "t1", "getThinkingAgentContainer", "thinkingAgentContainer", "u1", "getNowPlayingMiniContainer", "nowPlayingMiniContainer", "v1", "getNowPlayingViewContainer", "nowPlayingViewContainer", "w1", "getNowPlayingViewAttachmentsContainer", "nowPlayingViewAttachmentsContainer", "x1", "getNowPlayingViewAnimationGuidelineBottom", "nowPlayingViewAnimationGuidelineBottom", "y1", "getNowPlayingViewRegionExpanded", "nowPlayingViewRegionExpanded", "z1", "getNowPlayingViewRegionCollapsed", "nowPlayingViewRegionCollapsed", "", "A1", "getNowPlayingViews", "()Ljava/util/Set;", "nowPlayingViews", "B1", "getBannerContainer", "bannerContainer", "C1", "getLimitedExperienceIndicatorContainer", "limitedExperienceIndicatorContainer", "Lp/azb0;", "Lp/wyb0;", "F1", "getVisibilityManager", "()Lp/azb0;", "visibilityManager", "Lp/fxb0;", "G1", "getNowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/fxb0;", "nowPlayingViewAnimator", "Lp/uek0;", "<set-?>", "H1", "Ljava/lang/Object;", "getNowPlayingViewMode", "()Lp/uek0;", "setNowPlayingViewMode", "(Lp/uek0;)V", "nowPlayingViewMode", "", "I1", "getNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view", "()Ljava/lang/Boolean;", "setNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view", "(Ljava/lang/Boolean;)V", "nowPlayingViewPopulated", "Lp/qwb0;", "J1", "Lp/qwb0;", "getInsets$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/qwb0;", "insets", "Lkotlin/Function1;", "Landroid/view/WindowInsets;", "K1", "Lp/gh00;", "getLegacyOverlayPageInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/gh00;", "legacyOverlayPageInsetsTransformer", "Lp/xvb0;", "M1", "getBottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/xvb0;", "bottomGradientManager", "Lp/tkm0;", "N1", "getPageSurroundingsProperty", "()Lp/tkm0;", "setPageSurroundingsProperty", "(Lp/tkm0;)V", "pageSurroundingsProperty", "Lp/qvb0;", "O1", "Lp/qvb0;", "getMode", "()Lp/qvb0;", "mode", "Lp/r1m0;", "P1", "Lp/r1m0;", "getOverlayTouchDispatcher", "()Lp/r1m0;", "setOverlayTouchDispatcher", "(Lp/r1m0;)V", "overlayTouchDispatcher", "Lp/wxb0;", "getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/wxb0;", "getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view$delegate", "(Lcom/spotify/mainlayout/ui/view/MainLayout;)Ljava/lang/Object;", "overlayMode", "value", "isOverlayTouchPassthroughActive", "()Z", "setOverlayTouchPassthroughActive", "(Z)V", "p/rvb0", "p/bc5", "src_main_java_com_spotify_mainlayout_ui_view-view"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MainLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: A1 */
    public final wg61 f5356A1;

    /* JADX INFO: renamed from: B1 */
    public final wg61 f5357B1;

    /* JADX INFO: renamed from: C1 */
    public final wg61 f5358C1;

    /* JADX INFO: renamed from: D1 */
    public final twb0 f5359D1;

    /* JADX INFO: renamed from: E1 */
    public final zxb0 f5360E1;

    /* JADX INFO: renamed from: F1 */
    public final wg61 f5361F1;

    /* JADX INFO: renamed from: G1 */
    public final wg61 f5362G1;

    /* JADX INFO: renamed from: H1 */
    public final vvb0 f5363H1;

    /* JADX INFO: renamed from: I1 */
    public final vvb0 f5364I1;

    /* JADX INFO: renamed from: J1 */
    public final bpi0 f5365J1;

    /* JADX INFO: renamed from: K1 */
    public final tvb0 f5366K1;

    /* JADX INFO: renamed from: L1 */
    public final wg61 f5367L1;

    /* JADX INFO: renamed from: M1 */
    public final wg61 f5368M1;

    /* JADX INFO: renamed from: N1 */
    public final vvb0 f5369N1;

    /* JADX INFO: renamed from: O1, reason: from kotlin metadata */
    public final qvb0 mode;

    /* JADX INFO: renamed from: P1, reason: from kotlin metadata */
    public r1m0 overlayTouchDispatcher;

    /* JADX INFO: renamed from: R0 */
    public final wg61 f5372R0;

    /* JADX INFO: renamed from: S0 */
    public final wg61 f5373S0;

    /* JADX INFO: renamed from: T0 */
    public final wg61 f5374T0;

    /* JADX INFO: renamed from: U0 */
    public final wg61 f5375U0;

    /* JADX INFO: renamed from: V0 */
    public final wg61 f5376V0;

    /* JADX INFO: renamed from: W0 */
    public final wg61 f5377W0;

    /* JADX INFO: renamed from: X0 */
    public final wg61 f5378X0;

    /* JADX INFO: renamed from: Y0 */
    public final wg61 f5379Y0;

    /* JADX INFO: renamed from: Z0 */
    public final wg61 f5380Z0;

    /* JADX INFO: renamed from: a1 */
    public final wg61 f5381a1;

    /* JADX INFO: renamed from: b1 */
    public final wg61 f5382b1;

    /* JADX INFO: renamed from: c1 */
    public final wg61 f5383c1;

    /* JADX INFO: renamed from: d1 */
    public final wg61 f5384d1;

    /* JADX INFO: renamed from: e1 */
    public final wg61 f5385e1;

    /* JADX INFO: renamed from: f1 */
    public final wg61 f5386f1;

    /* JADX INFO: renamed from: g1 */
    public final wg61 f5387g1;

    /* JADX INFO: renamed from: h1 */
    public final wg61 f5388h1;

    /* JADX INFO: renamed from: i1 */
    public final wg61 f5389i1;

    /* JADX INFO: renamed from: j1 */
    public final wg61 f5390j1;

    /* JADX INFO: renamed from: k1 */
    public final wg61 f5391k1;

    /* JADX INFO: renamed from: l1 */
    public final wg61 f5392l1;

    /* JADX INFO: renamed from: m1 */
    public final wg61 f5393m1;

    /* JADX INFO: renamed from: n1 */
    public final wg61 f5394n1;

    /* JADX INFO: renamed from: o1 */
    public final wg61 f5395o1;

    /* JADX INFO: renamed from: p1 */
    public final wg61 f5396p1;

    /* JADX INFO: renamed from: q1 */
    public final wg61 f5397q1;

    /* JADX INFO: renamed from: r1 */
    public final wg61 f5398r1;

    /* JADX INFO: renamed from: s1 */
    public final wg61 f5399s1;

    /* JADX INFO: renamed from: t1 */
    public final wg61 f5400t1;

    /* JADX INFO: renamed from: u1 */
    public final wg61 f5401u1;

    /* JADX INFO: renamed from: v1 */
    public final wg61 f5402v1;

    /* JADX INFO: renamed from: w1 */
    public final wg61 f5403w1;

    /* JADX INFO: renamed from: x1 */
    public final wg61 f5404x1;

    /* JADX INFO: renamed from: y1 */
    public final wg61 f5405y1;

    /* JADX INFO: renamed from: z1 */
    public final wg61 f5406z1;

    /* JADX INFO: renamed from: R1 */
    public static final /* synthetic */ qr60[] f5355R1 = {new spi0(MainLayout.class, "nowPlayingViewMode", "getNowPlayingViewMode()Lcom/spotify/mainlayout/preferences/NowPlayingViewMainLayoutMode;", 0), new spi0(MainLayout.class, "nowPlayingViewPopulated", "getNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view()Ljava/lang/Boolean;", 0), new spi0(MainLayout.class, "pageSurroundingsProperty", "getPageSurroundingsProperty()Lcom/spotify/mainlayout/pageproperties/PageSurroundings;", 0)};

    /* JADX INFO: renamed from: Q1 */
    public static final bc5 f5354Q1 = new bc5(16);

    @SuppressLint({"UseKtx"})
    public MainLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f5354Q1.getClass();
        this.f5372R0 = bc5.m28675m(this, R.id.bottom_gradient);
        this.f5373S0 = bc5.m28675m(this, R.id.bottom_gradient_window_insets);
        this.f5374T0 = bc5.m28675m(this, R.id.bottom_gradient_black_fade);
        this.f5375U0 = bc5.m28675m(this, R.id.fragment_container_inset_bottom_spacing);
        this.f5376V0 = new wg61(new svb0(this, 1));
        this.f5377W0 = bc5.m28675m(this, R.id.bottom_gradient_barrier);
        this.f5378X0 = bc5.m28675m(this, R.id.navigation_bar);
        this.f5379Y0 = bc5.m28675m(this, R.id.navigation_bar_wrapper);
        this.f5380Z0 = new wg61(new svb0(this, 3));
        this.f5381a1 = bc5.m28675m(this, R.id.navigation_bar_animation_guideline_end);
        this.f5382b1 = bc5.m28675m(this, R.id.navigation_bar_window_insets_space);
        this.f5383c1 = bc5.m28675m(this, R.id.ime_window_insets_space);
        this.f5384d1 = bc5.m28675m(this, R.id.side_panel_background);
        this.f5385e1 = bc5.m28675m(this, R.id.side_panel_guideline);
        this.f5386f1 = bc5.m28675m(this, R.id.status_bar_placeholder);
        this.f5387g1 = bc5.m28675m(this, R.id.main_content_top_barrier);
        this.f5388h1 = bc5.m28675m(this, R.id.display_cutout_placeholder_end);
        this.f5389i1 = bc5.m28675m(this, R.id.display_cutout_placeholder_start);
        this.f5390j1 = bc5.m28675m(this, R.id.fragment_container);
        this.f5391k1 = bc5.m28675m(this, R.id.fragment_overlay_container);
        this.f5392l1 = bc5.m28675m(this, R.id.fragment_container_inset_bottom);
        this.f5393m1 = bc5.m28675m(this, R.id.fragment_container_barrier_end);
        this.f5394n1 = bc5.m28675m(this, R.id.fragment_animation_guideline_end);
        this.f5395o1 = bc5.m28675m(this, R.id.fragment_container_bottom_overlap_touch_event_consumer);
        this.f5396p1 = bc5.m28675m(this, R.id.snackbarContainer);
        this.f5397q1 = bc5.m28675m(this, R.id.snackbar_barrier_bottom);
        this.f5398r1 = bc5.m28675m(this, R.id.tooltip_container);
        this.f5399s1 = bc5.m28675m(this, R.id.response_agent_container);
        this.f5400t1 = bc5.m28675m(this, R.id.thinking_agent_container);
        this.f5401u1 = bc5.m28675m(this, R.id.now_playing_mini_container);
        this.f5402v1 = bc5.m28675m(this, R.id.now_playing_view_container);
        this.f5403w1 = bc5.m28675m(this, R.id.now_playing_view_attachments_container);
        this.f5404x1 = bc5.m28675m(this, R.id.now_playing_view_animation_guideline_bottom);
        this.f5405y1 = bc5.m28675m(this, R.id.now_playing_view_region_expanded);
        this.f5406z1 = bc5.m28675m(this, R.id.now_playing_view_region_collapsed);
        this.f5356A1 = new wg61(new svb0(this, 5));
        this.f5357B1 = bc5.m28675m(this, R.id.bannerContainer);
        this.f5358C1 = bc5.m28675m(this, R.id.limited_experience_indicator_container);
        twb0 twb0Var = new twb0(this);
        this.f5359D1 = twb0Var;
        this.f5360E1 = new zxb0(this);
        this.f5361F1 = new wg61(new svb0(this, 6));
        this.f5362G1 = new wg61(new svb0(this, 4));
        this.f5363H1 = new vvb0(this, 0);
        this.f5364I1 = new vvb0(this, 1);
        this.f5365J1 = twb0Var.f224404d;
        this.f5366K1 = new tvb0(this, 1);
        this.f5367L1 = new wg61(new svb0(this, 2));
        this.f5368M1 = new wg61(new svb0(this, 0));
        this.f5369N1 = new vvb0(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2u0.f268679a);
        wj50.m88279p(typedArrayObtainStyledAttributes);
        if (!typedArrayObtainStyledAttributes.hasValue(0)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
        this.mode = (qvb0) qvb0.f192961d.get(typedArrayObtainStyledAttributes.getInteger(0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainLayoutGradientView getBottomGradient() {
        return (MainLayoutGradientView) this.f5372R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Barrier getBottomGradientBarrier() {
        return (Barrier) this.f5377W0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBottomGradientBlackFade() {
        return (View) this.f5374T0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBottomGradientWindowInsets() {
        return (View) this.f5373S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getFragmentContainerInsetBottomSpacing() {
        return (View) this.f5375U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final azb0 getVisibilityManager() {
        return (azb0) this.f5361F1.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        twb0 twb0Var = this.f5359D1;
        twb0Var.getClass();
        pwd1 pwd1Var = swd1.m79536g(null, windowInsets).f214650a;
        dx40 dx40VarMo51806g = pwd1Var.mo51806g(519);
        twb0Var.f224405e.m39516c(twb0.f224399j[0], twb0Var, dx40VarMo51806g);
        MainLayout mainLayout = twb0Var.f224401a;
        uc5 uc5Var = twb0.f224398i;
        uc5.m82739g(uc5Var, mainLayout.getNavigationWindowInsetsSpace(), dx40VarMo51806g.f53851d);
        uc5.m82739g(uc5Var, mainLayout.getImeWindowInsetsSpace(), pwd1Var.mo51806g(8).f53851d);
        dx40 dx40VarMo51806g2 = pwd1Var.mo51806g(128);
        int i = dx40VarMo51806g2.f53850c;
        int i2 = dx40VarMo51806g2.f53848a;
        View displayCutoutPlaceholderStart = mainLayout.getDisplayCutoutPlaceholderStart();
        if (displayCutoutPlaceholderStart != null) {
            ViewGroup.LayoutParams layoutParams = displayCutoutPlaceholderStart.getLayoutParams();
            int i3 = displayCutoutPlaceholderStart.getLayoutDirection() == 0 ? i2 : i;
            if (layoutParams.width != i3) {
                layoutParams.width = i3;
                displayCutoutPlaceholderStart.setLayoutParams(layoutParams);
            }
        }
        View displayCutoutPlaceholderEnd = mainLayout.getDisplayCutoutPlaceholderEnd();
        if (displayCutoutPlaceholderEnd != null) {
            ViewGroup.LayoutParams layoutParams2 = displayCutoutPlaceholderEnd.getLayoutParams();
            if (displayCutoutPlaceholderEnd.getLayoutDirection() != 0) {
                i = i2;
            }
            if (layoutParams2.width != i) {
                layoutParams2.width = i;
                displayCutoutPlaceholderEnd.setLayoutParams(layoutParams2);
            }
        }
        int i4 = dx40VarMo51806g.f53849b;
        uc5.m82739g(uc5Var, mainLayout.getStatusBarPlaceholder(), i4);
        mainLayout.getMainContentTopBarrier().setMargin(-i4);
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        r1m0 r1m0Var = this.overlayTouchDispatcher;
        if (r1m0Var != null) {
            if (!getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view().f255999a) {
                r1m0Var = null;
            }
            if (r1m0Var != null) {
                return ((Boolean) new tvb0(this, 0).invoke(motionEvent)).booleanValue();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final MainLayoutContentContainerView getBannerContainer() {
        return (MainLayoutContentContainerView) this.f5357B1.getValue();
    }

    /* JADX INFO: renamed from: getBottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view */
    public final xvb0 m13391x9d8b00d3() {
        return (xvb0) this.f5368M1.getValue();
    }

    public final List<View> getBottomGradientViews() {
        return (List) this.f5376V0.getValue();
    }

    public final View getDisplayCutoutPlaceholderEnd() {
        return (View) this.f5388h1.getValue();
    }

    public final View getDisplayCutoutPlaceholderStart() {
        return (View) this.f5389i1.getValue();
    }

    public final Guideline getFragmentAnimationGuidelineEnd() {
        return (Guideline) this.f5394n1.getValue();
    }

    public final MainLayoutFragmentContainerView getFragmentContainer() {
        return (MainLayoutFragmentContainerView) this.f5390j1.getValue();
    }

    public final Barrier getFragmentContainerBarrierEnd() {
        return (Barrier) this.f5393m1.getValue();
    }

    public final View getFragmentContainerBottomOverlapTouchEventConsumer() {
        return (View) this.f5395o1.getValue();
    }

    public final View getFragmentContainerInsetBottom() {
        return (View) this.f5392l1.getValue();
    }

    public final ViewGroup getFragmentOverlayContainer() {
        return (ViewGroup) this.f5391k1.getValue();
    }

    public final View getImeWindowInsetsSpace() {
        return (View) this.f5383c1.getValue();
    }

    public final qwb0 getInsets$src_main_java_com_spotify_mainlayout_ui_view_view() {
        return this.f5365J1;
    }

    /* JADX INFO: renamed from: getLegacyOverlayPageInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view */
    public final gh00 m13392x9881177a() {
        return this.f5366K1;
    }

    public final MainLayoutContentContainerView getLimitedExperienceIndicatorContainer() {
        return (MainLayoutContentContainerView) this.f5358C1.getValue();
    }

    public final Barrier getMainContentTopBarrier() {
        return (Barrier) this.f5387g1.getValue();
    }

    public final qvb0 getMode() {
        return this.mode;
    }

    public final Guideline getNavigationAnimationGuidelineEnd() {
        return (Guideline) this.f5381a1.getValue();
    }

    public final MainLayoutContentContainerView getNavigationContainer() {
        return (MainLayoutContentContainerView) this.f5378X0.getValue();
    }

    public final View getNavigationContainerTop() {
        return (View) this.f5380Z0.getValue();
    }

    public final MainLayoutConstrainedContainerView getNavigationContainerWrapper() {
        return (MainLayoutConstrainedContainerView) this.f5379Y0.getValue();
    }

    public final View getNavigationWindowInsetsSpace() {
        return (View) this.f5382b1.getValue();
    }

    public final ViewGroup getNowPlayingMiniContainer() {
        return (ViewGroup) this.f5401u1.getValue();
    }

    public final Guideline getNowPlayingViewAnimationGuidelineBottom() {
        return (Guideline) this.f5404x1.getValue();
    }

    /* JADX INFO: renamed from: getNowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view */
    public final fxb0 m13393x84b0f291() {
        return (fxb0) this.f5362G1.getValue();
    }

    public final MainLayoutContentContainerView getNowPlayingViewAttachmentsContainer() {
        return (MainLayoutContentContainerView) this.f5403w1.getValue();
    }

    public final MainLayoutContentContainerView getNowPlayingViewContainer() {
        return (MainLayoutContentContainerView) this.f5402v1.getValue();
    }

    public final uek0 getNowPlayingViewMode() {
        qr60 qr60Var = f5355R1[0];
        return (uek0) this.f5363H1.f61172a;
    }

    /* JADX INFO: renamed from: getNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view */
    public final Boolean m13394x7583c6de() {
        qr60 qr60Var = f5355R1[1];
        return (Boolean) this.f5364I1.f61172a;
    }

    public final View getNowPlayingViewRegionCollapsed() {
        return (View) this.f5406z1.getValue();
    }

    public final View getNowPlayingViewRegionExpanded() {
        return (View) this.f5405y1.getValue();
    }

    public final Set<ViewGroup> getNowPlayingViews() {
        return (Set) this.f5356A1.getValue();
    }

    public final wxb0 getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view() {
        return this.f5360E1.m97176c();
    }

    public final r1m0 getOverlayTouchDispatcher() {
        return this.overlayTouchDispatcher;
    }

    public final tkm0 getPageSurroundingsProperty() {
        qr60 qr60Var = f5355R1[2];
        return (tkm0) this.f5369N1.f61172a;
    }

    public final MainLayoutContentContainerView getResponseAgentContainer() {
        return (MainLayoutContentContainerView) this.f5399s1.getValue();
    }

    public final View getSidePanelBackground() {
        return (View) this.f5384d1.getValue();
    }

    public final Guideline getSidePanelGuideline() {
        return (Guideline) this.f5385e1.getValue();
    }

    public final Barrier getSnackbarBarrierBottom() {
        return (Barrier) this.f5397q1.getValue();
    }

    public final View getSnackbarContainer() {
        return (View) this.f5396p1.getValue();
    }

    public final View getStatusBarPlaceholder() {
        return (View) this.f5386f1.getValue();
    }

    public final MainLayoutContentContainerView getThinkingAgentContainer() {
        return (MainLayoutContentContainerView) this.f5400t1.getValue();
    }

    public final TooltipContainer getTooltipContainer() {
        return (TooltipContainer) this.f5398r1.getValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        MainLayoutGradientView bottomGradient;
        super.onFinishInflate();
        twb0 twb0Var = this.f5359D1;
        setTag(R.id.main_layout_insets_tag, twb0Var.f224404d);
        getFragmentContainer().setTag(R.id.local_main_layout_insets_tag, (wqi0) twb0Var.f224404d.f29481c);
        getFragmentContainer().m13404xc2149698(new tvb0(this, 2));
        if (!((Boolean) this.f5367L1.getValue()).booleanValue() && (bottomGradient = getBottomGradient()) != null) {
            ViewGroup.LayoutParams layoutParams = bottomGradient.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            h6j h6jVar = (h6j) layoutParams;
            h6jVar.f88149k = R.id.fragment_container_bottom_overlap_barrier;
            bottomGradient.setLayoutParams(h6jVar);
            bottomGradient.setBottomColor(-16777216);
        }
        getSnackbarContainer().setTag(R.id.snackbarContainerTag_noInsets, Boolean.TRUE);
        getSnackbarContainer().setTag(R.id.snackbarContainerTag_centered, Boolean.valueOf(this.mode == qvb0.f192959b));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        qr60[] qr60VarArr = twb0.f224399j;
        twb0 twb0Var = this.f5359D1;
        MainLayout mainLayout = twb0Var.f224401a;
        if (mainLayout.getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view().f255999a) {
            twb0Var.f224408h.m39516c(qr60VarArr[3], twb0Var, Integer.valueOf(twb0Var.m81667c().f53851d));
        } else {
            twb0Var.f224406f.m39516c(qr60VarArr[1], twb0Var, Integer.valueOf(mainLayout.getFragmentContainerInsetBottom().getMeasuredHeight()));
            twb0Var.f224407g.m39516c(qr60VarArr[2], twb0Var, Integer.valueOf(mainLayout.getFragmentContainerBottomOverlapTouchEventConsumer().getMeasuredHeight()));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null) {
            rvb0 rvb0Var = parcelable instanceof rvb0 ? (rvb0) parcelable : null;
            if (rvb0Var != null) {
                if (m13394x7583c6de() == null) {
                    m13395x8e99e752(rvb0Var.f203044b);
                }
                super.onRestoreInstanceState(rvb0Var.f203043a);
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new rvb0(super.onSaveInstanceState(), m13394x7583c6de());
    }

    public final void setNowPlayingViewMode(uek0 uek0Var) {
        this.f5363H1.m39516c(f5355R1[0], this, uek0Var);
    }

    /* JADX INFO: renamed from: setNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view */
    public final void m13395x8e99e752(Boolean bool) {
        this.f5364I1.m39516c(f5355R1[1], this, bool);
    }

    public final void setOverlayTouchDispatcher(r1m0 r1m0Var) {
        this.overlayTouchDispatcher = r1m0Var;
    }

    public final void setOverlayTouchPassthroughActive(boolean z) {
        zxb0 zxb0Var = this.f5360E1;
        zxb0Var.f287275f.m39516c(zxb0.f287269i[3], zxb0Var, Boolean.valueOf(z));
    }

    public final void setPageSurroundingsProperty(tkm0 tkm0Var) {
        this.f5369N1.m39516c(f5355R1[2], this, tkm0Var);
    }
}
