package p204p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: classes5.dex */
public final class gv3 implements sys0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SingleEmitter f84599b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iys0 f84600c;

    public /* synthetic */ gv3(SingleEmitter singleEmitter, iys0 iys0Var, int i) {
        this.f84598a = i;
        this.f84599b = singleEmitter;
        this.f84600c = iys0Var;
    }

    @Override // p204p.sys0
    public final iys0 create(uys0 uys0Var) {
        switch (this.f84598a) {
            case 0:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-audiobook-playerlistener:should_refresh_capping_state_on_player_error", true)));
                return (hv3) this.f84600c;
            case 1:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-boombox-settings:crossfade_enabled", true)));
                return (yx3) this.f84600c;
            case 2:
                this.f84599b.onSuccess(Integer.valueOf(uys0Var.mo47706b(144000000, 300000000, 144000000, "android-cal-rollout-service:minimum_gearhead_version")));
                return (fy3) this.f84600c;
            case 3:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-feature-kidsmode:debug_is_in_kids_mode", false)));
                return (c54) this.f84600c;
            case 4:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-feature-nowplaying-queue-bottom-sheet:enable_mft_plus_queue", false)));
                return (w54) this.f84600c;
            case 5:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-gen-alpha:use_kids_view_get_children", false)));
                return (b94) this.f84600c;
            case 6:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-genalpha-limitedexperienceindicator:enabled", false)));
                return (d94) this.f84600c;
            case 7:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-media-session:restrict_playing_state_when_connect_car_is_active", false)));
                return (eh4) this.f84600c;
            case 8:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-player-settings-automix:automix_enabled", true)));
                return (ol4) this.f84600c;
            case 9:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-shuffle-settings-algorithm:settings_item_visible", false)));
                return (hp4) this.f84600c;
            case 10:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-video:allow_showing_music_videos_setting", false)));
                return (tt4) this.f84600c;
            case 11:
                this.f84599b.onSuccess((vh5) uys0Var.mo47705a("apps-music-features-remoteconfiguration:button_color", vh5.BLUE));
                return (zh5) this.f84600c;
            case 12:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("listening-activity:visibility_indicator_enabled", false)));
                return (ze90) this.f84600c;
            default:
                this.f84599b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("settings-quickaccess:show_quick_access_settings_in_settings", false)));
                return (vc01) this.f84600c;
        }
    }
}
