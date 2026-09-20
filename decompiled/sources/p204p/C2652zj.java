package p204p;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.nsd.NsdManager;
import android.os.StatFs;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.badge.badgegroup.BadgeGroupView;
import com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.buttons.SecondaryButtonView;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;
import com.spotify.music.R;
import java.io.File;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: p.zj */
/* JADX INFO: loaded from: classes11.dex */
public final class C2652zj extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f283308b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2652zj(Context context, int i) {
        super(0);
        this.f283307a = i;
        this.f283308b = context;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        long blockCount;
        int i = this.f283307a;
        int i2 = 0;
        Context context = this.f283308b;
        switch (i) {
            case 0:
                return lzj.m60387w(context, R.color.encore_accessory);
            case 1:
                return Boolean.valueOf(lzj.m60353c(context, "android.permission.RECORD_AUDIO") == 0);
            case 2:
                return context.getString(R.string.kallax_prompted_by);
            case 3:
                return new fcr0("#FF535353", "#000000", context.getString(R.string.gradient_background_default_content_description));
            case 4:
                return Float.valueOf(context.getResources().getDimension(R.dimen.encore_bell_button_size));
            case 5:
                File fileM71565Y = pxy.m71565Y(context.getCacheDir(), "coil_cache");
                hp60 hp60Var = ywy.f277076a;
                String str = tbn0.f218907b;
                tbn0 tbn0VarM72504e = qbn0.m72504e(fileM71565Y);
                try {
                    StatFs statFs = new StatFs(fileM71565Y.getAbsolutePath());
                    blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / ((long) 50);
                    break;
                } catch (IllegalArgumentException unused) {
                    blockCount = 5242880;
                }
                long jMax = Math.max(Math.min(blockCount, 52428800L), 5242880L);
                if (jMax > 0) {
                    return new cvu0(jMax, hp60Var, tbn0VarM72504e);
                }
                throw new IllegalArgumentException("size must be > 0.");
            case 6:
                return Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) > 0.0f);
            case 7:
                Drawable drawable = context.getDrawable(R.drawable.encore_icon_check_alt_fill_24);
                if (drawable != null) {
                    drawable.mutate().setTint(context.getColor(R.color.green_light));
                }
                return drawable;
            case 8:
                return context.getDrawable(R.drawable.episode_row_shape_circle_mark_as_played);
            case 9:
                return Boolean.valueOf(!context.getPackageManager().queryIntentActivities(new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL"), 65536).isEmpty());
            case 10:
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.equalizer_picker_layout, (ViewGroup) null, false);
                int i3 = R.id.bottom_label;
                TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.bottom_label);
                if (textView != null) {
                    i3 = R.id.equalizer_view;
                    EqualizerView equalizerView = (EqualizerView) vie1.m85629k(viewInflate, R.id.equalizer_view);
                    if (equalizerView != null) {
                        i3 = R.id.label_barrier;
                        if (((Barrier) vie1.m85629k(viewInflate, R.id.label_barrier)) != null) {
                            i3 = R.id.top_label;
                            TextView textView2 = (TextView) vie1.m85629k(viewInflate, R.id.top_label);
                            if (textView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                tcw tcwVar = new tcw(constraintLayout, textView, equalizerView, textView2);
                                nap.m64024q(-1, -1, constraintLayout);
                                return tcwVar;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
            case 11:
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.inverted_primary_button_auto_download_layout, (ViewGroup) null, false);
                PrimaryButtonView primaryButtonView = (PrimaryButtonView) vie1.m85629k(viewInflate2, R.id.button);
                if (primaryButtonView == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(R.id.button)));
                }
                FrameLayout frameLayout = (FrameLayout) viewInflate2;
                zl50 zl50Var = new zl50(frameLayout, primaryButtonView);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return zl50Var;
            case 12:
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.inverted_secondary_button_auto_download_layout, (ViewGroup) null, false);
                SecondaryButtonView secondaryButtonView = (SecondaryButtonView) vie1.m85629k(viewInflate3, R.id.button);
                if (secondaryButtonView == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(R.id.button)));
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate3;
                dm50 dm50Var = new dm50(constraintLayout2, secondaryButtonView);
                nap.m64024q(-1, -2, constraintLayout2);
                return dm50Var;
            case 13:
                return new g9b0(new t2n(context));
            case 14:
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setAnimateParentHierarchy(false);
                frameLayout2.setLayoutTransition(layoutTransition);
                p3h1.m69032r(frameLayout2, new w0q(frameLayout2, i2));
                return frameLayout2;
            case 15:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.play_progress_width));
            case 16:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.play_progress_margin));
            case 17:
                View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.toggle_row_equalizer_layout, (ViewGroup) null, false);
                int i4 = R.id.title;
                EncoreTitleView encoreTitleView = (EncoreTitleView) vie1.m85629k(viewInflate4, R.id.title);
                if (encoreTitleView != null) {
                    i4 = R.id.toggle;
                    SwitchCompat switchCompat = (SwitchCompat) vie1.m85629k(viewInflate4, R.id.toggle);
                    if (switchCompat != null) {
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate4;
                        yx71 yx71Var = new yx71(constraintLayout3, encoreTitleView, switchCompat);
                        nap.m64024q(-1, -2, constraintLayout3);
                        return yx71Var;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i4)));
            case 18:
                return new C2012je(context);
            case 19:
                View viewInflate5 = LayoutInflater.from(context).inflate(R.layout.wheel_control_view, (ViewGroup) null, false);
                int i5 = R.id.wheel_control_arrow;
                if (((ImageView) vie1.m85629k(viewInflate5, R.id.wheel_control_arrow)) != null) {
                    i5 = R.id.wheel_control_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) vie1.m85629k(viewInflate5, R.id.wheel_control_recycler_view);
                    if (recyclerView != null) {
                        i5 = R.id.wheel_control_selected_label;
                        TextView textView3 = (TextView) vie1.m85629k(viewInflate5, R.id.wheel_control_selected_label);
                        if (textView3 != null) {
                            ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate5;
                            ard1 ard1Var = new ard1(constraintLayout4, recyclerView, textView3, constraintLayout4);
                            nap.m64024q(-1, -2, constraintLayout4);
                            return ard1Var;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(i5)));
            case 20:
                return new C2012je(context);
            case 21:
                BadgeGroupView badgeGroupView = new BadgeGroupView(this.f283308b, null, 0, 6, null);
                badgeGroupView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                WeakHashMap weakHashMap = mec1.f142677a;
                badgeGroupView.setId(View.generateViewId());
                return badgeGroupView;
            case 22:
                PlayProgressBarView playProgressBarView = new PlayProgressBarView(this.f283308b, null, 0, 6, null);
                WeakHashMap weakHashMap2 = mec1.f142677a;
                playProgressBarView.setId(View.generateViewId());
                return playProgressBarView;
            case 23:
                return new C2012je(context);
            case 24:
                return new C2012je(context);
            case 25:
                return new C2012je(context);
            case 26:
                Object systemService = context.getSystemService("servicediscovery");
                NsdManager nsdManager = systemService instanceof NsdManager ? (NsdManager) systemService : null;
                if (nsdManager == null) {
                    na6.m63969q(new jff0("Expected Context.NSD_SERVICE but was missing", null));
                }
                return nsdManager;
            case 27:
                return iqg1.m51375q(R.color.white, context, vc41.ADDFOLLOW);
            case 28:
                return iqg1.m51375q(R.color.encore_accessory_green, context, vc41.CHECK);
            default:
                return new thf1(context.getApplicationContext(), null, thf1.f220419l, n35.f149933k, sj10.f209710c);
        }
    }
}
