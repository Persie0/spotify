package p204p;

import android.content.Intent;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.music.SpotifyMainActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class s8j0 {

    /* JADX INFO: renamed from: a */
    public final Object f206655a;

    /* JADX INFO: renamed from: b */
    public final Object f206656b;

    /* JADX INFO: renamed from: c */
    public final Object f206657c;

    /* JADX INFO: renamed from: d */
    public final Object f206658d;

    /* JADX INFO: renamed from: e */
    public final Object f206659e;

    /* JADX INFO: renamed from: f */
    public final Object f206660f;

    /* JADX INFO: renamed from: g */
    public final Object f206661g;

    /* JADX INFO: renamed from: h */
    public final Object f206662h;

    /* JADX INFO: renamed from: i */
    public final Object f206663i;

    /* JADX INFO: renamed from: j */
    public final Object f206664j;

    /* JADX INFO: renamed from: k */
    public final Object f206665k;

    /* JADX INFO: renamed from: l */
    public final Object f206666l;

    /* JADX INFO: renamed from: m */
    public final Object f206667m;

    /* JADX INFO: renamed from: n */
    public final Object f206668n;

    /* JADX INFO: renamed from: o */
    public final Object f206669o;

    /* JADX INFO: renamed from: p */
    public final Object f206670p;

    public /* synthetic */ s8j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        this.f206655a = obj;
        this.f206656b = obj2;
        this.f206657c = obj3;
        this.f206658d = obj4;
        this.f206659e = obj5;
        this.f206660f = obj6;
        this.f206661g = obj7;
        this.f206662h = obj8;
        this.f206663i = obj9;
        this.f206664j = obj10;
        this.f206665k = obj11;
        this.f206666l = obj12;
        this.f206667m = obj13;
        this.f206668n = obj14;
        this.f206669o = obj15;
        this.f206670p = obj16;
    }

    /* JADX INFO: renamed from: a */
    public void m77514a(Intent intent) {
        String stringExtra;
        if (intent.getBooleanExtra("extra_deeplink_navigation_logged", false) || (stringExtra = intent.getStringExtra("extra_deeplink_navigation_reference")) == null) {
            return;
        }
        ((w6j0) this.f206668n).m87294e(cgg1.m32716n(stringExtra));
        intent.putExtra("extra_deeplink_navigation_logged", true);
    }

    /* JADX INFO: renamed from: b */
    public CallbackRouter m77515b() {
        return (CallbackRouter) ((i4t0) this.f206657c).get();
    }

    /* JADX INFO: renamed from: c */
    public luk m77516c() {
        return (luk) ((i4t0) this.f206658d).get();
    }

    public s8j0(SpotifyMainActivity spotifyMainActivity, SpotifyMainActivity spotifyMainActivity2, kin0 kin0Var, ld41 ld41Var, hc80 hc80Var, u010 u010Var, hr81 hr81Var, v5j0 v5j0Var, z9j0 z9j0Var, e3j0 e3j0Var, wvp wvpVar, k430 k430Var, twy twyVar, yt3 yt3Var, vw90 vw90Var, iv91 iv91Var, w6j0 w6j0Var) {
        this.f206655a = spotifyMainActivity2;
        this.f206656b = kin0Var;
        this.f206657c = u010Var;
        this.f206658d = hr81Var;
        this.f206659e = v5j0Var;
        this.f206660f = z9j0Var;
        this.f206661g = e3j0Var;
        this.f206662h = wvpVar;
        this.f206663i = k430Var;
        this.f206664j = twyVar;
        this.f206665k = yt3Var;
        this.f206666l = vw90Var;
        this.f206667m = iv91Var;
        this.f206668n = w6j0Var;
        this.f206669o = new ni8(new ye90(this, 16), ld41Var, new w0i0(this, 28));
        this.f206670p = new ybi0(this, 17);
        spotifyMainActivity.f42736Y.add(new o8j0(this));
        v5j0Var.f237525e.add(new p8j0(this));
        hc80Var.getLifecycle().mo31986a(new q8j0(this));
    }
}
