package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zho implements ye50 {

    /* JADX INFO: renamed from: f */
    public static final fv31 f282983f;

    /* JADX INFO: renamed from: g */
    public static final fv31 f282984g;

    /* JADX INFO: renamed from: h */
    public static final fv31 f282985h;

    /* JADX INFO: renamed from: i */
    public static final fv31 f282986i;

    /* JADX INFO: renamed from: j */
    public static final fv31 f282987j;

    /* JADX INFO: renamed from: a */
    public final hv31 f282988a;

    /* JADX INFO: renamed from: b */
    public final p69 f282989b = new p69();

    /* JADX INFO: renamed from: c */
    public final p69 f282990c = new p69();

    /* JADX INFO: renamed from: d */
    public final p69 f282991d = new p69();

    /* JADX INFO: renamed from: e */
    public final p69 f282992e = new p69();

    static {
        si5 si5Var = fv31.f73628b;
        f282983f = si5Var.m78183U("data_saver_mode_user_enabled");
        f282984g = si5Var.m78183U("data_saver_mode_include_android");
        f282985h = si5Var.m78183U("data_saver_mode_android_enabled");
        f282986i = si5Var.m78183U("data_saver_video_podcasts_audio_only_enabled");
        f282987j = si5Var.m78183U("data_saver_mode:streaming_quality_user_value");
    }

    public zho(hv31 hv31Var) {
        this.f282988a = hv31Var;
    }

    /* JADX INFO: renamed from: a */
    public final p69 m96174a() {
        p69 p69Var = this.f282990c;
        if (!p69Var.m69192c()) {
            p69Var.accept(Boolean.valueOf(this.f282988a.mo48713h(f282984g, true)));
        }
        return p69Var;
    }

    /* JADX INFO: renamed from: b */
    public final p69 m96175b() {
        p69 p69Var = this.f282989b;
        if (!p69Var.m69192c()) {
            p69Var.accept(Boolean.valueOf(this.f282988a.mo48713h(f282983f, false)));
        }
        return p69Var;
    }

    /* JADX INFO: renamed from: c */
    public final p69 m96176c() {
        p69 p69Var = this.f282992e;
        if (!p69Var.m69192c()) {
            p69Var.accept(Boolean.valueOf(this.f282988a.mo48713h(f282986i, false)));
        }
        return p69Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m96177d(boolean z) {
        lv31 lv31VarEdit = this.f282988a.edit();
        lv31VarEdit.m60048a(f282984g, z);
        lv31VarEdit.m60054g();
        this.f282990c.accept(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: e */
    public final void m96178e(boolean z) {
        lv31 lv31VarEdit = this.f282988a.edit();
        lv31VarEdit.m60048a(f282983f, z);
        lv31VarEdit.m60054g();
        this.f282989b.accept(Boolean.valueOf(z));
    }
}
