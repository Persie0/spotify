package com.spotify.betamax.player;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.car.app.model.Alert;
import androidx.media3.p003ui.SubtitleView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p204p.b0m;
import p204p.bf50;
import p204p.cvo0;
import p204p.d7p0;
import p204p.dac1;
import p204p.dvb;
import p204p.eac1;
import p204p.edb;
import p204p.eh00;
import p204p.g6f;
import p204p.gh00;
import p204p.kac1;
import p204p.l1u0;
import p204p.lac1;
import p204p.mac1;
import p204p.na6;
import p204p.nac1;
import p204p.ncz0;
import p204p.o0m;
import p204p.oa9;
import p204p.ocz0;
import p204p.rvw0;
import p204p.tcz0;
import p204p.u1x0;
import p204p.v8k;
import p204p.wj50;
import p204p.wsv0;
import p204p.x09;
import p204p.zu3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0018)B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0004\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020!H\u0016¢\u0006\u0004\b.\u0010$J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020!H\u0016¢\u0006\u0004\b0\u0010$J\u0017\u00103\u001a\u00020\u001a2\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0004\b3\u00104R*\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b:\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010,R$\u0010C\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010K\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010O\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010$R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010_\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u00020!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010N\u001a\u0004\ba\u0010P\"\u0004\bb\u0010$R*\u0010g\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010N\u001a\u0004\be\u0010P\"\u0004\bf\u0010$R*\u0010k\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bh\u0010N\u001a\u0004\bi\u0010P\"\u0004\bj\u0010$R*\u0010o\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010N\u001a\u0004\bm\u0010P\"\u0004\bn\u0010$R^\u0010x\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u001a0p\u0012\u0004\u0012\u00020\u001a\u0018\u00010p2 \u0010L\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u001a0p\u0012\u0004\u0012\u00020\u001a\u0018\u00010p8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR*\u0010|\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010N\u001a\u0004\bz\u0010P\"\u0004\b{\u0010$R+\u0010\u0080\u0001\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010N\u001a\u0004\b~\u0010P\"\u0004\b\u007f\u0010$R,\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R,\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R2\u0010\u0098\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0091\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R2\u0010\u009c\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0091\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u0093\u0001\u001a\u0006\b\u009a\u0001\u0010\u0095\u0001\"\u0006\b\u009b\u0001\u0010\u0097\u0001R2\u0010 \u0001\u001a\u000b\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0091\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u0093\u0001\u001a\u0006\b\u009e\u0001\u0010\u0095\u0001\"\u0006\b\u009f\u0001\u0010\u0097\u0001R\u001d\u0010¦\u0001\u001a\u00030¡\u00018\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R'\u0010©\u0001\u001a\u00020X2\u0006\u0010L\u001a\u00020X8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b§\u0001\u0010Z\u001a\u0005\b¨\u0001\u0010\\R\u001a\u0010\u00ad\u0001\u001a\u0005\u0018\u00010ª\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001¨\u0006´\u0001"}, m24212d2 = {"Lcom/spotify/betamax/player/VideoSurfaceView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/TextureView;", "textureView", "Landroid/view/SurfaceView;", "surfaceView", "Landroid/widget/ProgressBar;", "throbber", "Landroidx/media3/ui/SubtitleView;", "exoPlayerSubtitleView", "Lp/kac1;", "priority", "(Landroid/content/Context;Landroid/view/TextureView;Landroid/view/SurfaceView;Landroid/widget/ProgressBar;Landroidx/media3/ui/SubtitleView;Lp/kac1;)V", "getSurfaceView", "()Landroid/view/SurfaceView;", "getTextureView", "()Landroid/view/TextureView;", "Lp/mac1;", "scaleType", "Lp/w2a1;", "setScaleType", "(Lp/mac1;)V", "Lp/cvo0;", "predicate", "setPlayablePredicate", "(Lp/cvo0;)V", "", x09.f256832d, "setBufferingThrobberEnabled", "(Z)V", "Lp/dac1;", "callback", "setVideoSurfaceCallback", "(Lp/dac1;)V", "Lp/lac1;", "listener", "setOnPredicateChangedListener", "(Lp/lac1;)V", "isBuffering", "setIsBuffering", "isJoining", "setIsJoining", "Landroid/os/Handler;", "handler", "setHandler", "(Landroid/os/Handler;)V", "R0", "Lp/lac1;", "getListener", "()Lp/lac1;", "setListener", "getListener$annotations", "()V", "Lp/eac1;", "W0", "Lp/eac1;", "getConfiguration", "()Lp/eac1;", "setConfiguration", "(Lp/eac1;)V", "configuration", "Landroid/view/Surface;", "X0", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "setSurface", "(Landroid/view/Surface;)V", "surface", "value", "Y0", "Z", "isFullscreen", "()Z", "setFullscreen", "Z0", "Lp/kac1;", "getPriority", "()Lp/kac1;", "setPriority", "(Lp/kac1;)V", "", "a1", "Ljava/lang/String;", "getPlaybackId", "()Ljava/lang/String;", "setPlaybackId", "(Ljava/lang/String;)V", "playbackId", "b1", "getSupportsSurfaceView", "setSupportsSurfaceView", "supportsSurfaceView", "c1", "getUseSurfaceView", "setUseSurfaceView", "useSurfaceView", "d1", "getEnableVideoScreenRecording", "setEnableVideoScreenRecording", "enableVideoScreenRecording", "e1", "getRenderAsOverlay", "setRenderAsOverlay", "renderAsOverlay", "Lkotlin/Function1;", "Landroidx/media3/exoplayer/ExoPlayer;", "f1", "Lp/gh00;", "getExoPlayer", "()Lp/gh00;", "setExoPlayer", "(Lp/gh00;)V", "exoPlayer", "g1", "getUseExoPlayerSubtitleViewStyling", "setUseExoPlayerSubtitleViewStyling", "useExoPlayerSubtitleViewStyling", "h1", "getCanPrefetchSeekFrames", "setCanPrefetchSeekFrames", "canPrefetchSeekFrames", "Lp/tcz0;", "i1", "Lp/tcz0;", "getSeekFramePrefetcher", "()Lp/tcz0;", "setSeekFramePrefetcher", "(Lp/tcz0;)V", "seekFramePrefetcher", "Lp/ocz0;", "j1", "Lp/ocz0;", "getSeekFrameLoader", "()Lp/ocz0;", "setSeekFrameLoader", "(Lp/ocz0;)V", "seekFrameLoader", "Lkotlin/Function0;", "k1", "Lp/eh00;", "getOnScrubStart", "()Lp/eh00;", "setOnScrubStart", "(Lp/eh00;)V", "onScrubStart", "l1", "getOnScrubEnd", "setOnScrubEnd", "onScrubEnd", "m1", "getOnFirstFrameRendered", "setOnFirstFrameRendered", "onFirstFrameRendered", "Lp/d7p0;", "n1", "Lp/d7p0;", "getOnRenderedFirstFrameListener", "()Lp/d7p0;", "onRenderedFirstFrameListener", "r1", "getCurrentRenderedSubtitlesText", "currentRenderedSubtitlesText", "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "()Landroid/graphics/SurfaceTexture;", "surfaceTexture", "Landroid/util/Size;", "getDisplaySize", "()Landroid/util/Size;", "displaySize", "getExoPlayerSubtitleView", "()Landroidx/media3/ui/SubtitleView;", "src_main_java_com_spotify_betamax_player-player"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public class VideoSurfaceView extends FrameLayout {

    /* JADX INFO: renamed from: s1 */
    public static final /* synthetic */ int f3040s1 = 0;

    /* JADX INFO: renamed from: L0 */
    public Handler f3041L0;

    /* JADX INFO: renamed from: M0 */
    public int f3042M0;

    /* JADX INFO: renamed from: N0 */
    public int f3043N0;

    /* JADX INFO: renamed from: O0 */
    public ImageView f3044O0;

    /* JADX INFO: renamed from: P0 */
    public ImageView f3045P0;

    /* JADX INFO: renamed from: Q0 */
    public Bitmap f3046Q0;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public lac1 listener;

    /* JADX INFO: renamed from: S0 */
    public boolean f3048S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f3049T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f3050U0;

    /* JADX INFO: renamed from: V0 */
    public final oa9 f3051V0;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public eac1 configuration;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public Surface surface;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public boolean isFullscreen;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    public kac1 priority;

    /* JADX INFO: renamed from: a */
    public TextureView f3056a;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    public String playbackId;

    /* JADX INFO: renamed from: b */
    public Matrix f3058b;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    public boolean supportsSurfaceView;

    /* JADX INFO: renamed from: c */
    public SurfaceView f3060c;

    /* JADX INFO: renamed from: c1, reason: from kotlin metadata */
    public boolean useSurfaceView;

    /* JADX INFO: renamed from: d */
    public ViewStub f3062d;

    /* JADX INFO: renamed from: d1, reason: from kotlin metadata */
    public boolean enableVideoScreenRecording;

    /* JADX INFO: renamed from: e */
    public boolean f3064e;

    /* JADX INFO: renamed from: e1, reason: from kotlin metadata */
    public boolean renderAsOverlay;

    /* JADX INFO: renamed from: f */
    public SubtitleView f3066f;

    /* JADX INFO: renamed from: f1, reason: from kotlin metadata */
    public gh00 exoPlayer;

    /* JADX INFO: renamed from: g */
    public ProgressBar f3068g;

    /* JADX INFO: renamed from: g1, reason: from kotlin metadata */
    public boolean useExoPlayerSubtitleViewStyling;

    /* JADX INFO: renamed from: h */
    public cvo0 f3070h;

    /* JADX INFO: renamed from: h1, reason: from kotlin metadata */
    public boolean canPrefetchSeekFrames;

    /* JADX INFO: renamed from: i */
    public dac1 f3072i;

    /* JADX INFO: renamed from: i1, reason: from kotlin metadata */
    public tcz0 seekFramePrefetcher;

    /* JADX INFO: renamed from: j1, reason: from kotlin metadata */
    public ocz0 seekFrameLoader;

    /* JADX INFO: renamed from: k1, reason: from kotlin metadata */
    public eh00 onScrubStart;

    /* JADX INFO: renamed from: l1, reason: from kotlin metadata */
    public eh00 onScrubEnd;

    /* JADX INFO: renamed from: m1, reason: from kotlin metadata */
    public eh00 onFirstFrameRendered;

    /* JADX INFO: renamed from: n1 */
    public final nac1 f3078n1;

    /* JADX INFO: renamed from: o1 */
    public ncz0 f3079o1;

    /* JADX INFO: renamed from: p1 */
    public final String f3080p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f3081q1;

    /* JADX INFO: renamed from: r1, reason: from kotlin metadata */
    public String currentRenderedSubtitlesText;

    /* JADX INFO: renamed from: t */
    public mac1 f3083t;

    public VideoSurfaceView(Context context) {
        super(context);
        this.f3083t = mac1.ASPECT_FIT;
        this.f3041L0 = new Handler(Looper.getMainLooper());
        this.f3048S0 = true;
        this.f3051V0 = new oa9(this, 4);
        kac1 kac1Var = kac1.MEDIUM;
        this.priority = kac1Var;
        this.supportsSurfaceView = true;
        this.enableVideoScreenRecording = true;
        this.f3078n1 = new nac1(this);
        this.f3080p1 = "video_surface_view_seek_frame_tag";
        this.currentRenderedSubtitlesText = "";
        m4020b(context, kac1Var);
    }

    private final Size getDisplaySize() {
        int iWidth;
        int iHeight;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            iWidth = bounds.width();
            iHeight = bounds.height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            iWidth = i;
            iHeight = i2;
        }
        return new Size(iWidth, iHeight);
    }

    private final SubtitleView getExoPlayerSubtitleView() {
        if (this.f3066f == null) {
            this.f3066f = (SubtitleView) LayoutInflater.from(getContext()).inflate(R.layout.subtitle_view, (ViewGroup) this, false);
            m4023e();
            addView(this.f3066f);
        }
        SubtitleView subtitleView = this.f3066f;
        wj50.m88279p(subtitleView);
        return subtitleView;
    }

    public static /* synthetic */ void getListener$annotations() {
    }

    private final SurfaceTexture getSurfaceTexture() {
        TextureView textureView = this.f3056a;
        if (textureView != null) {
            return textureView.getSurfaceTexture();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int[] m4019a(int i, int i2) {
        long jRound;
        long jRound2;
        double d = ((double) this.f3043N0) / ((double) this.f3042M0);
        double d2 = ((double) i) * d;
        int iRound = (int) Math.round(d2);
        mac1 mac1Var = mac1.ASPECT_FIT;
        mac1 mac1Var2 = mac1.ASPECT_FILL_DISPLAY_AR;
        mac1 mac1Var3 = mac1.ASPECT_FILL;
        if (i2 > iRound) {
            mac1 mac1Var4 = this.f3083t;
            if (mac1Var4 == mac1Var3 || mac1Var4 == mac1Var2) {
                jRound2 = Math.round(((double) i2) / d);
                i = (int) jRound2;
            } else if (mac1Var4 == mac1Var) {
                jRound = Math.round(d2);
                i2 = (int) jRound;
            }
        } else {
            mac1 mac1Var5 = this.f3083t;
            if (mac1Var5 == mac1Var3 || mac1Var5 == mac1Var2) {
                jRound = Math.round(d2);
                i2 = (int) jRound;
            } else if (mac1Var5 == mac1Var) {
                jRound2 = Math.round(((double) i2) / d);
                i = (int) jRound2;
            }
        }
        return new int[]{i, i2};
    }

    /* JADX INFO: renamed from: b */
    public final void m4020b(Context context, kac1 kac1Var) {
        this.priority = kac1Var;
        this.f3058b = new Matrix();
        LayoutInflater.from(context).inflate(R.layout.video_surface_view, (ViewGroup) this, true);
        this.f3062d = (ViewStub) findViewById(R.id.video_view_stub);
        this.f3068g = (ProgressBar) findViewById(R.id.throbber);
        this.f3045P0 = (ImageView) findViewById(R.id.frozen_frame);
        this.f3044O0 = (ImageView) findViewById(R.id.seek_frame);
        SubtitleView subtitleView = this.f3066f;
        if (subtitleView != null) {
            subtitleView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4021c() {
        this.currentRenderedSubtitlesText = "";
        getExoPlayerSubtitleView().setCues(null);
        getExoPlayerSubtitleView().setVisibility(0);
        dac1 dac1Var = this.f3072i;
        if (dac1Var != null) {
            dac1Var.mo28349c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4022d(o0m o0mVar) {
        wsv0 wsv0Var = o0mVar.f160426a;
        eac1 eac1Var = this.configuration;
        String strM43753y0 = "";
        if (eac1Var == null || !((v8k) eac1Var).m84923b()) {
            this.currentRenderedSubtitlesText = "";
            return;
        }
        if (!wsv0Var.isEmpty()) {
            List listM43727j0 = g6f.m43727j0(wsv0Var);
            ArrayList arrayList = new ArrayList();
            Iterator it = listM43727j0.iterator();
            while (it.hasNext()) {
                CharSequence charSequence = ((b0m) it.next()).f21967a;
                if (charSequence != null) {
                    arrayList.add(charSequence);
                }
            }
            strM43753y0 = g6f.m43753y0(arrayList, "\n", null, null, null, 62);
        }
        this.currentRenderedSubtitlesText = strM43753y0;
        getExoPlayerSubtitleView().setCues(wsv0Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m4023e() {
        dvb dvbVar;
        SubtitleView subtitleView = this.f3066f;
        if (subtitleView != null) {
            Object systemService = getContext().getSystemService("captioning");
            CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
            Typeface typefaceM82233b = u1x0.m82233b(getContext(), R.font.spotify_mix_ui_regular);
            if (captioningManager == null || !captioningManager.isEnabled()) {
                dvbVar = new dvb(-1, -16777216, 0, 0, -1, typefaceM82233b);
            } else {
                CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
                int i = userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1;
                int i2 = userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216;
                int i3 = userStyle.hasWindowColor() ? userStyle.windowColor : 0;
                int i4 = userStyle.hasEdgeType() ? userStyle.edgeType : 0;
                int i5 = userStyle.hasEdgeColor() ? userStyle.edgeColor : -1;
                Typeface typeface = userStyle.getTypeface();
                dvbVar = new dvb(i, i2, i3, i4, i5, typeface == null ? typefaceM82233b : typeface);
            }
            subtitleView.setStyle(dvbVar);
            subtitleView.setApplyEmbeddedStyles(this.useExoPlayerSubtitleViewStyling);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4024f() {
        if (this.f3048S0) {
            boolean z = this.f3049T0;
            oa9 oa9Var = this.f3051V0;
            if (z || this.f3050U0) {
                this.f3041L0.postDelayed(oa9Var, 800L);
            } else {
                this.f3041L0.removeCallbacks(oa9Var);
                this.f3041L0.post(new oa9(this, 5));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4025g(boolean z) {
        SurfaceView surfaceView;
        ViewStub viewStub;
        boolean z2 = this.f3064e;
        if (!z2 && (viewStub = this.f3062d) != null) {
            if (z) {
                viewStub.setLayoutResource(R.layout.video_surface_view_surface);
                ViewStub viewStub2 = this.f3062d;
                View viewInflate = viewStub2 != null ? viewStub2.inflate() : null;
                this.f3060c = viewInflate instanceof SurfaceView ? (SurfaceView) viewInflate : null;
            } else {
                viewStub.setLayoutResource(R.layout.video_surface_view_texture);
                ViewStub viewStub3 = this.f3062d;
                View viewInflate2 = viewStub3 != null ? viewStub3.inflate() : null;
                this.f3056a = viewInflate2 instanceof TextureView ? (TextureView) viewInflate2 : null;
            }
            this.f3062d = null;
            this.f3064e = true;
        } else if (z2) {
            if (z && this.f3060c == null) {
                View view = this.f3056a;
                if (view != null) {
                    removeView(view);
                }
                this.f3056a = null;
                SurfaceView surfaceView2 = (SurfaceView) LayoutInflater.from(getContext()).inflate(R.layout.video_surface_view_surface, (ViewGroup) this, false);
                this.f3060c = surfaceView2;
                addView(surfaceView2, 0);
            } else if (!z && this.f3056a == null) {
                View view2 = this.f3060c;
                if (view2 != null) {
                    removeView(view2);
                }
                this.f3060c = null;
                TextureView textureView = (TextureView) LayoutInflater.from(getContext()).inflate(R.layout.video_surface_view_texture, (ViewGroup) this, false);
                this.f3056a = textureView;
                addView(textureView, 0);
            }
        }
        if (!z) {
            TextureView textureView2 = this.f3056a;
            if (textureView2 != null) {
                textureView2.setVisibility(0);
            }
            SurfaceView surfaceView3 = this.f3060c;
            if (surfaceView3 != null) {
                surfaceView3.setVisibility(8);
                return;
            }
            return;
        }
        if (this.useSurfaceView && this.renderAsOverlay && (surfaceView = this.f3060c) != null) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        SurfaceView surfaceView4 = this.f3060c;
        if (surfaceView4 != null) {
            surfaceView4.setSecure(true ^ getEnableVideoScreenRecording());
        }
        SurfaceView surfaceView5 = this.f3060c;
        if (surfaceView5 != null) {
            surfaceView5.setVisibility(0);
        }
        TextureView textureView3 = this.f3056a;
        if (textureView3 != null) {
            textureView3.setVisibility(8);
        }
    }

    public final boolean getCanPrefetchSeekFrames() {
        return this.canPrefetchSeekFrames;
    }

    public final eac1 getConfiguration() {
        return this.configuration;
    }

    public final String getCurrentRenderedSubtitlesText() {
        return this.currentRenderedSubtitlesText;
    }

    public boolean getEnableVideoScreenRecording() {
        return this.enableVideoScreenRecording;
    }

    public final gh00 getExoPlayer() {
        return this.exoPlayer;
    }

    public final lac1 getListener() {
        return this.listener;
    }

    public final eh00 getOnFirstFrameRendered() {
        return this.onFirstFrameRendered;
    }

    public final d7p0 getOnRenderedFirstFrameListener() {
        return this.f3078n1;
    }

    public final eh00 getOnScrubEnd() {
        return this.onScrubEnd;
    }

    public final eh00 getOnScrubStart() {
        return this.onScrubStart;
    }

    public final String getPlaybackId() {
        return this.playbackId;
    }

    public final kac1 getPriority() {
        return this.priority;
    }

    public final boolean getRenderAsOverlay() {
        return this.renderAsOverlay;
    }

    public final ocz0 getSeekFrameLoader() {
        return this.seekFrameLoader;
    }

    public final tcz0 getSeekFramePrefetcher() {
        return this.seekFramePrefetcher;
    }

    public boolean getSupportsSurfaceView() {
        return this.supportsSurfaceView;
    }

    public final Surface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: getSurfaceView, reason: from getter */
    public SurfaceView getF3060c() {
        return this.f3060c;
    }

    /* JADX INFO: renamed from: getTextureView, reason: from getter */
    public TextureView getF3056a() {
        return this.f3056a;
    }

    public final boolean getUseExoPlayerSubtitleViewStyling() {
        return this.useExoPlayerSubtitleViewStyling;
    }

    public final boolean getUseSurfaceView() {
        return this.useSurfaceView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3064e) {
            return;
        }
        this.f3041L0.post(new zu3(this, 20));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        SurfaceView surfaceView;
        super.onLayout(z, i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i9 = i3 - i;
        int paddingRight = i9 - getPaddingRight();
        int i10 = i4 - i2;
        int paddingBottom = i10 - getPaddingBottom();
        int iM38556e = edb.m38556e(paddingRight, paddingLeft, 2, paddingLeft);
        int iM38556e2 = edb.m38556e(paddingBottom, paddingTop, 2, paddingTop);
        ProgressBar progressBar = this.f3068g;
        if (progressBar == null) {
            wj50.m88260d0("throbber");
            throw null;
        }
        int measuredWidth = progressBar.getMeasuredWidth() / 2;
        ProgressBar progressBar2 = this.f3068g;
        if (progressBar2 == null) {
            wj50.m88260d0("throbber");
            throw null;
        }
        int measuredHeight = progressBar2.getMeasuredHeight() / 2;
        ProgressBar progressBar3 = this.f3068g;
        if (progressBar3 == null) {
            wj50.m88260d0("throbber");
            throw null;
        }
        progressBar3.layout(iM38556e - measuredWidth, iM38556e2 - measuredHeight, iM38556e + measuredWidth, iM38556e2 + measuredHeight);
        if (this.useSurfaceView && this.f3060c != null && this.f3042M0 > 0 && this.f3043N0 > 0) {
            int iOrdinal = this.f3083t.ordinal();
            if (iOrdinal == 0) {
                int[] iArrM4019a = m4019a(i9, i10);
                i5 = iArrM4019a[0];
                i6 = iArrM4019a[1];
                i7 = (i9 - i5) / 2;
                i8 = (i10 - i6) / 2;
                surfaceView = this.f3060c;
                if (surfaceView != null) {
                    surfaceView.layout(i7, i8, i5 + i7, i6 + i8);
                }
            } else if (iOrdinal == 1) {
                SurfaceView surfaceView2 = this.f3060c;
                if (surfaceView2 != null) {
                    surfaceView2.layout(0, 0, i9, i10);
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int[] iArrM4019a2 = m4019a(i9, i10);
                i5 = iArrM4019a2[0];
                i6 = iArrM4019a2[1];
                i7 = (i9 - i5) / 2;
                i8 = (i10 - i6) / 2;
                surfaceView = this.f3060c;
                if (surfaceView != null) {
                    surfaceView.layout(i7, i8, i5 + i7, i6 + i8);
                }
            } else {
                int[] iArrM4019a3 = m4019a(i9, i10);
                int i11 = iArrM4019a3[0];
                int i12 = iArrM4019a3[1];
                int i13 = (i9 - i11) / 2;
                int i14 = (i10 - i12) / 2;
                SurfaceView surfaceView3 = this.f3060c;
                if (surfaceView3 != null) {
                    surfaceView3.layout(i13, i14, i11 + i13, i12 + i14);
                }
            }
        }
        Size displaySize = getDisplaySize();
        int width = displaySize.getWidth();
        int height = displaySize.getHeight();
        if (width > 0 && height > 0) {
            float f = 1;
            z2 = Math.abs(f - (((float) getWidth()) / ((float) width))) < 0.075f && Math.abs(f - (((float) getHeight()) / ((float) height))) < 0.075f;
        }
        this.isFullscreen = z2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x0155  */
    /* JADX WARN: Code duplicated, block: B:85:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0167  */
    /* JADX WARN: Code duplicated, block: B:92:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x008a, please report this as an issue */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size;
        int i3;
        int i4;
        int iMin;
        int iMin2;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount;
        TextureView textureView;
        Matrix matrix;
        Matrix matrix2;
        TextureView textureView2;
        TextureView textureView3;
        View childAt;
        ImageView imageView;
        int i9 = this.f3042M0;
        if (i9 == 0 && this.f3043N0 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        double d = ((double) this.f3043N0) / ((double) i9);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i10 = this.f3083t.f141558a;
        int size2 = Alert.DURATION_SHOW_INDEFINITELY;
        if (mode == Integer.MIN_VALUE) {
            int i11 = i10 | 1;
            size = View.MeasureSpec.getSize(i);
            i3 = i11;
        } else if (mode != 1073741824) {
            i3 = i10 | 1;
            size = Integer.MAX_VALUE;
        } else {
            i3 = i10 | 2;
            size = 0;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                i4 = i3 | 8;
                size2 = 0;
            }
            if (i4 == 21) {
                iMin = Math.min(this.f3042M0, size);
                iMin2 = Math.min(this.f3043N0, size2);
            } else if (i4 != 22) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = Math.min((int) Math.round(((double) iMin) * d), size2);
            } else if (i4 != 25) {
                iMin2 = View.MeasureSpec.getSize(i2);
                iMin = Math.min((int) Math.round(((double) iMin2) / d), size);
            } else if (i4 == 26) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 == 37) {
                iMin = Math.min(this.f3042M0, size);
                iMin2 = Math.min(this.f3043N0, size2);
            } else if (i4 == 38) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = Math.min(this.f3043N0, size2);
            } else if (i4 == 41) {
                iMin = Math.min(this.f3042M0, size);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 == 42) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 == 53) {
                iMin = Math.min(this.f3042M0, size);
                iMin2 = Math.min(this.f3043N0, size2);
            } else if (i4 == 54) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = Math.min(this.f3043N0, size2);
            } else if (i4 == 57) {
                iMin = Math.min(this.f3042M0, size);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 == 58) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 != 69) {
                iMin = Math.min(this.f3042M0, size);
                iMin2 = Math.min(this.f3043N0, size2);
            } else if (i4 != 70) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = Math.min(this.f3043N0, size2);
            } else if (i4 != 73) {
                iMin = Math.min(this.f3042M0, size);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 != 74) {
                na6.m63965m("Invalid combination: " + Integer.toHexString(i4));
                iMin = 0;
                iMin2 = 0;
            } else {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = View.MeasureSpec.getSize(i2);
            }
            int[] iArrM4019a = m4019a(iMin, iMin2);
            i5 = iArrM4019a[0];
            i6 = iArrM4019a[1];
            i7 = (iMin - i5) / 2;
            i8 = (iMin2 - i6) / 2;
            childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                childAt = getChildAt(i12);
                imageView = this.f3044O0;
                if (imageView != null) {
                    wj50.m88260d0("seekFrameView");
                    throw null;
                }
                if (!wj50.m88271j(childAt, imageView) || childAt == this.f3066f) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iMin2, Integer.MIN_VALUE));
                }
            }
            if (!this.useSurfaceView) {
                textureView = this.f3056a;
                if (textureView != null) {
                    textureView.getTransform(this.f3058b);
                }
                matrix = this.f3058b;
                if (matrix != null) {
                    matrix.setScale(i5 / iMin, i6 / iMin2);
                }
                matrix2 = this.f3058b;
                if (matrix2 != null) {
                    matrix2.postTranslate(i7, i8);
                }
                textureView2 = this.f3056a;
                if (textureView2 != null) {
                    textureView2.setTransform(this.f3058b);
                }
                textureView3 = this.f3056a;
                if (textureView3 != null) {
                    textureView3.invalidate();
                }
            }
            setMeasuredDimension(iMin, iMin2);
        }
        size2 = View.MeasureSpec.getSize(i2);
        i4 = i3 | 4;
        if (i4 == 21) {
            iMin = Math.min(this.f3042M0, size);
            iMin2 = Math.min(this.f3043N0, size2);
        } else if (i4 != 22) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = Math.min((int) Math.round(((double) iMin) * d), size2);
        } else if (i4 != 25) {
            iMin2 = View.MeasureSpec.getSize(i2);
            iMin = Math.min((int) Math.round(((double) iMin2) / d), size);
        } else if (i4 == 26) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 == 37) {
            iMin = Math.min(this.f3042M0, size);
            iMin2 = Math.min(this.f3043N0, size2);
        } else if (i4 == 38) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = Math.min(this.f3043N0, size2);
        } else if (i4 == 41) {
            iMin = Math.min(this.f3042M0, size);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 == 42) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 == 53) {
            iMin = Math.min(this.f3042M0, size);
            iMin2 = Math.min(this.f3043N0, size2);
        } else if (i4 == 54) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = Math.min(this.f3043N0, size2);
        } else if (i4 == 57) {
            iMin = Math.min(this.f3042M0, size);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 == 58) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 != 69) {
            iMin = Math.min(this.f3042M0, size);
            iMin2 = Math.min(this.f3043N0, size2);
        } else if (i4 != 70) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = Math.min(this.f3043N0, size2);
        } else if (i4 != 73) {
            iMin = Math.min(this.f3042M0, size);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 != 74) {
            na6.m63965m("Invalid combination: " + Integer.toHexString(i4));
            iMin = 0;
            iMin2 = 0;
        } else {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = View.MeasureSpec.getSize(i2);
        }
        int[] iArrM4019a2 = m4019a(iMin, iMin2);
        i5 = iArrM4019a2[0];
        i6 = iArrM4019a2[1];
        i7 = (iMin - i5) / 2;
        i8 = (iMin2 - i6) / 2;
        childCount = getChildCount();
        while (i12 < childCount) {
            childAt = getChildAt(i12);
            imageView = this.f3044O0;
            if (imageView != null) {
                wj50.m88260d0("seekFrameView");
                throw null;
            }
            if (wj50.m88271j(childAt, imageView)) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824));
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824));
            }
        }
        if (!this.useSurfaceView) {
            textureView = this.f3056a;
            if (textureView != null) {
                textureView.getTransform(this.f3058b);
            }
            matrix = this.f3058b;
            if (matrix != null) {
                matrix.setScale(i5 / iMin, i6 / iMin2);
            }
            matrix2 = this.f3058b;
            if (matrix2 != null) {
                matrix2.postTranslate(i7, i8);
            }
            textureView2 = this.f3056a;
            if (textureView2 != null) {
                textureView2.setTransform(this.f3058b);
            }
            textureView3 = this.f3056a;
            if (textureView3 != null) {
                textureView3.invalidate();
            }
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        tcz0 tcz0Var;
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.canPrefetchSeekFrames || (tcz0Var = this.seekFramePrefetcher) == null) {
            return;
        }
        ((rvw0) tcz0Var).m76503s(i, i2);
    }

    public final void setBufferingThrobberEnabled(boolean enabled) {
        this.f3048S0 = enabled;
        if (enabled) {
            return;
        }
        ProgressBar progressBar = this.f3068g;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            wj50.m88260d0("throbber");
            throw null;
        }
    }

    public final void setCanPrefetchSeekFrames(boolean z) {
        this.canPrefetchSeekFrames = z;
        if (!z) {
            tcz0 tcz0Var = this.seekFramePrefetcher;
            if (tcz0Var != null) {
                ((rvw0) tcz0Var).m76505u();
                return;
            }
            return;
        }
        tcz0 tcz0Var2 = this.seekFramePrefetcher;
        if (tcz0Var2 != null) {
            ((rvw0) tcz0Var2).m76504t(getWidth(), getHeight());
        }
    }

    public final void setConfiguration(eac1 eac1Var) {
        this.configuration = eac1Var;
    }

    public void setEnableVideoScreenRecording(boolean z) {
        SurfaceView surfaceView;
        this.enableVideoScreenRecording = z;
        if (!this.useSurfaceView || (surfaceView = this.f3060c) == null) {
            return;
        }
        surfaceView.setSecure(!getEnableVideoScreenRecording());
    }

    public final void setExoPlayer(gh00 gh00Var) {
        this.exoPlayer = gh00Var;
        if (this.useSurfaceView && gh00Var != null) {
            gh00Var.invoke(new bf50(this, 5));
        }
    }

    public final void setFullscreen(boolean z) {
        this.isFullscreen = z;
    }

    public final void setHandler(Handler handler) {
        this.f3041L0 = handler;
    }

    public void setIsBuffering(boolean isBuffering) {
        this.f3049T0 = isBuffering;
        m4024f();
    }

    public void setIsJoining(boolean isJoining) {
        this.f3050U0 = isJoining;
        m4024f();
    }

    public final void setListener(lac1 lac1Var) {
        this.listener = lac1Var;
    }

    public final void setOnFirstFrameRendered(eh00 eh00Var) {
        this.onFirstFrameRendered = eh00Var;
    }

    public final void setOnPredicateChangedListener(lac1 listener) {
        this.listener = listener;
    }

    public final void setOnScrubEnd(eh00 eh00Var) {
        this.onScrubEnd = eh00Var;
    }

    public final void setOnScrubStart(eh00 eh00Var) {
        this.onScrubStart = eh00Var;
    }

    public final void setPlayablePredicate(cvo0 predicate) {
        this.f3070h = predicate;
    }

    public final void setPlaybackId(String str) {
        this.playbackId = str;
    }

    public final void setPriority(kac1 kac1Var) {
        this.priority = kac1Var;
    }

    public final void setRenderAsOverlay(boolean z) {
        SurfaceView surfaceView;
        this.renderAsOverlay = z;
        if (this.useSurfaceView && z && (surfaceView = this.f3060c) != null) {
            surfaceView.setZOrderMediaOverlay(true);
        }
    }

    public final void setScaleType(mac1 scaleType) {
        gh00 gh00Var;
        if (this.f3083t != scaleType) {
            this.f3083t = scaleType;
            if (this.useSurfaceView && (gh00Var = this.exoPlayer) != null) {
                gh00Var.invoke(new bf50(this, 5));
            }
            requestLayout();
        }
    }

    public final void setSeekFrameLoader(ocz0 ocz0Var) {
        this.seekFrameLoader = ocz0Var;
    }

    public final void setSeekFramePrefetcher(tcz0 tcz0Var) {
        this.seekFramePrefetcher = tcz0Var;
    }

    public void setSupportsSurfaceView(boolean z) {
        this.supportsSurfaceView = z;
    }

    public final void setSurface(Surface surface) {
        this.surface = surface;
    }

    public final void setUseExoPlayerSubtitleViewStyling(boolean z) {
        this.useExoPlayerSubtitleViewStyling = z;
        m4023e();
    }

    public final void setUseSurfaceView(boolean z) {
        if (getSupportsSurfaceView() || !z) {
            this.useSurfaceView = z;
            m4025g(z);
        }
    }

    public final void setVideoSurfaceCallback(dac1 callback) {
        this.f3072i = callback;
    }

    @Override // android.view.View
    public final String toString() {
        String strM84922a;
        eac1 eac1Var = this.configuration;
        return (eac1Var == null || (strM84922a = ((v8k) eac1Var).m84922a()) == null) ? super.toString() : strM84922a;
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3083t = mac1.ASPECT_FIT;
        this.f3041L0 = new Handler(Looper.getMainLooper());
        this.f3048S0 = true;
        this.f3051V0 = new oa9(this, 4);
        kac1 kac1Var = kac1.MEDIUM;
        this.priority = kac1Var;
        this.supportsSurfaceView = true;
        this.enableVideoScreenRecording = true;
        this.f3078n1 = new nac1(this);
        this.f3080p1 = "video_surface_view_seek_frame_tag";
        this.currentRenderedSubtitlesText = "";
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, l1u0.f128802a, 0, 0);
        try {
            int i = typedArrayObtainStyledAttributes.getInt(0, 1);
            for (kac1 kac1Var2 : kac1.values()) {
                if (kac1Var2.f120863a == i) {
                    kac1Var = kac1Var2;
                    break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m4020b(context, kac1Var);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public VideoSurfaceView(Context context, TextureView textureView, SurfaceView surfaceView, ProgressBar progressBar, SubtitleView subtitleView, kac1 kac1Var) {
        super(context);
        this.f3083t = mac1.ASPECT_FIT;
        this.f3041L0 = new Handler(Looper.getMainLooper());
        this.f3048S0 = true;
        this.f3051V0 = new oa9(this, 4);
        this.supportsSurfaceView = true;
        this.enableVideoScreenRecording = true;
        this.f3078n1 = new nac1(this);
        this.f3080p1 = "video_surface_view_seek_frame_tag";
        this.currentRenderedSubtitlesText = "";
        this.f3056a = textureView;
        this.f3060c = surfaceView;
        this.f3068g = progressBar;
        this.f3066f = subtitleView;
        this.priority = kac1Var;
        this.f3058b = new Matrix();
        setUseSurfaceView(surfaceView != null && textureView == null);
        this.f3045P0 = new ImageView(context);
    }
}
