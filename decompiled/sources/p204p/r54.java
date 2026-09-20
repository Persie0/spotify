package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f195950a;

    /* JADX INFO: renamed from: b */
    public final boolean f195951b;

    /* JADX INFO: renamed from: c */
    public final boolean f195952c;

    /* JADX INFO: renamed from: d */
    public final boolean f195953d;

    /* JADX INFO: renamed from: e */
    public final boolean f195954e;

    /* JADX INFO: renamed from: f */
    public final boolean f195955f;

    /* JADX INFO: renamed from: g */
    public final boolean f195956g;

    /* JADX INFO: renamed from: h */
    public final boolean f195957h;

    /* JADX INFO: renamed from: i */
    public final int f195958i;

    /* JADX INFO: renamed from: j */
    public final boolean f195959j;

    /* JADX INFO: renamed from: k */
    public final bji f195960k;

    /* JADX INFO: renamed from: l */
    public final wg61 f195961l;

    public r54(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, boolean z9, bji bjiVar) {
        this.f195950a = z;
        this.f195951b = z2;
        this.f195952c = z3;
        this.f195953d = z4;
        this.f195954e = z5;
        this.f195955f = z6;
        this.f195956g = z7;
        this.f195957h = z8;
        this.f195958i = i;
        this.f195959j = z9;
        this.f195960k = bjiVar;
        this.f195961l = new wg61(new o54(this, 2));
    }

    /* JADX INFO: renamed from: a */
    public final r54 m74786a() {
        return (r54) this.f195961l.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m74787b() {
        r54 r54VarM74786a = m74786a();
        return r54VarM74786a != null ? r54VarM74786a.m74787b() : this.f195950a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m74788c() {
        r54 r54VarM74786a = m74786a();
        return r54VarM74786a != null ? r54VarM74786a.m74788c() : this.f195951b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m74789d() {
        r54 r54VarM74786a = m74786a();
        return r54VarM74786a != null ? r54VarM74786a.m74789d() : this.f195952c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m74790e() {
        r54 r54VarM74786a = m74786a();
        return r54VarM74786a != null ? r54VarM74786a.m74790e() : this.f195953d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m74791f() {
        r54 r54VarM74786a = m74786a();
        return r54VarM74786a != null ? r54VarM74786a.m74791f() : this.f195954e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m74792g() {
        r54 r54VarM74786a = m74786a();
        return r54VarM74786a != null ? r54VarM74786a.m74792g() : this.f195955f;
    }

    /* JADX INFO: renamed from: h */
    public final int m74793h() {
        r54 r54VarM74786a = m74786a();
        return r54VarM74786a != null ? r54VarM74786a.m74793h() : this.f195958i;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m74794i() {
        r54 r54VarM74786a = m74786a();
        return r54VarM74786a != null ? r54VarM74786a.m74794i() : this.f195959j;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m74795j() {
        r54 r54VarM74786a = m74786a();
        return r54VarM74786a != null ? r54VarM74786a.m74795j() : this.f195956g;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m74796k() {
        r54 r54VarM74786a = m74786a();
        return r54VarM74786a != null ? r54VarM74786a.m74796k() : this.f195957h;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_categories_page", "android-feature-notificationsettings", m74787b()), new k8a("enable_category_details_page", "android-feature-notificationsettings", m74788c()), new k8a("enable_group_categories_page", "android-feature-notificationsettings", m74789d()), new k8a("enable_language_selection_row", "android-feature-notificationsettings", m74790e()), new k8a("enable_podcast_nen_settings_page", "android-feature-notificationsettings", m74791f()), new k8a("flatten_social_notification_preferences", "android-feature-notificationsettings", m74792g()), new k8a("is_permission_card_enabled", "android-feature-notificationsettings", m74795j()), new k8a("is_permission_dialog_enabled", "android-feature-notificationsettings", m74796k()), new k8a("nen_opt_in_position", "android-feature-notificationsettings", m74793h(), 0, 11), new k8a("preferences_show_comments_category", "android-feature-notificationsettings", m74794i()));
    }

    public r54(bji bjiVar) {
        this(false, false, false, false, false, false, false, false, 11, false, bjiVar);
    }
}
