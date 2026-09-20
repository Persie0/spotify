package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ia4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f100138a;

    /* JADX INFO: renamed from: b */
    public final boolean f100139b;

    /* JADX INFO: renamed from: c */
    public final boolean f100140c;

    /* JADX INFO: renamed from: d */
    public final boolean f100141d;

    /* JADX INFO: renamed from: e */
    public final boolean f100142e;

    /* JADX INFO: renamed from: f */
    public final boolean f100143f;

    /* JADX INFO: renamed from: g */
    public final bji f100144g;

    /* JADX INFO: renamed from: h */
    public final wg61 f100145h;

    public ia4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bji bjiVar) {
        this.f100138a = z;
        this.f100139b = z2;
        this.f100140c = z3;
        this.f100141d = z4;
        this.f100142e = z5;
        this.f100143f = z6;
        this.f100144g = bjiVar;
        this.f100145h = new wg61(new ga4(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public final ia4 m50005a() {
        return (ia4) this.f100145h.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m50006b() {
        ia4 ia4VarM50005a = m50005a();
        return ia4VarM50005a != null ? ia4VarM50005a.m50006b() : this.f100138a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m50007c() {
        ia4 ia4VarM50005a = m50005a();
        return ia4VarM50005a != null ? ia4VarM50005a.m50007c() : this.f100139b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m50008d() {
        ia4 ia4VarM50005a = m50005a();
        return ia4VarM50005a != null ? ia4VarM50005a.m50008d() : this.f100140c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m50009e() {
        ia4 ia4VarM50005a = m50005a();
        return ia4VarM50005a != null ? ia4VarM50005a.m50009e() : this.f100141d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m50010f() {
        ia4 ia4VarM50005a = m50005a();
        return ia4VarM50005a != null ? ia4VarM50005a.m50010f() : this.f100142e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m50011g() {
        ia4 ia4VarM50005a = m50005a();
        return ia4VarM50005a != null ? ia4VarM50005a.m50011g() : this.f100143f;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("episode_preview_enabled", "android-lib-assisted-curation", m50006b()), new k8a("episode_search_preview_enabled", "android-lib-assisted-curation", m50007c()), new k8a("preview_enabled", "android-lib-assisted-curation", m50008d()), new k8a("search_preview_enabled", "android-lib-assisted-curation", m50009e()), new k8a("suggested_prompts_enabled", "android-lib-assisted-curation", m50010f()), new k8a("use_improved_cards_sort_order", "android-lib-assisted-curation", m50011g()));
    }

    public ia4(bji bjiVar) {
        this(true, true, true, true, false, false, bjiVar);
    }
}
