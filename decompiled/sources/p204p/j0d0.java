package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class j0d0 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final qj4 f107424a;

    /* JADX INFO: renamed from: b */
    public final wf4 f107425b;

    /* JADX INFO: renamed from: c */
    public final Set f107426c = Collections.singleton(gn80.MARTINI);

    /* JADX INFO: renamed from: d */
    public final Set f107427d = Collections.singleton(pr2.f180476d);

    public j0d0(qj4 qj4Var, wf4 wf4Var) {
        this.f107424a = qj4Var;
        this.f107425b = wf4Var;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f107426c;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return szc0.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        Parcelable parcelableExtra = intent.getParcelableExtra("martini-launch-parameters");
        d0d0 d0d0Var = parcelableExtra instanceof d0d0 ? (d0d0) parcelableExtra : null;
        if (d0d0Var == null) {
            d0d0Var = a0d0.f11063a;
        }
        String str = e301Var.f55571a;
        boolean booleanExtra = intent.getBooleanExtra("martini-open-with-keyboard", false);
        boolean booleanExtra2 = intent.getBooleanExtra("martini-start-dictation", false);
        String stringExtra = intent.getStringExtra("martini-input-placeholder");
        String stringExtra2 = intent.getStringExtra("martini-prompt");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("martini-chat-suggestions");
        Parcelable parcelableExtra2 = intent.getParcelableExtra("martini-intent-groups");
        return new h0d0(d0d0Var, str, booleanExtra, booleanExtra2, stringExtra, stringExtra2, stringArrayListExtra, parcelableExtra2 instanceof h400 ? (h400) parcelableExtra2 : null, intent.getBooleanExtra("martini-show-history", false), intent.getBooleanExtra("martini-resume-playback-after-tts", false), intent.getStringExtra("martini-cta-suggestion-text"), intent.getIntExtra("martini-cta-suggestion-insertion-index", 0), dd41Var.m35716n("experienceName"), dd41Var.m35716n("variant"));
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        return new wzq0(true);
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: f */
    public final Set mo28839f() {
        return this.f107427d;
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Martini Page";
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        return this.f107424a.m72889a() || this.f107425b.m87961s();
    }
}
