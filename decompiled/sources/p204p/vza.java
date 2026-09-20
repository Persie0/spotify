package p204p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class vza extends AbstractC2115m5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f246423a;

    /* JADX INFO: renamed from: b */
    public final Object f246424b;

    public /* synthetic */ vza(Object obj, int i) {
        this.f246423a = i;
        this.f246424b = obj;
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f246423a) {
            case 2:
                t6j0 t6j0Var = (t6j0) this.f246424b;
                w6j0 w6j0Var = t6j0Var.f217566a;
                Iterator it = t6j0Var.f217567b.iterator();
                while (it.hasNext()) {
                    ((n8j0) it.next()).mo58673b(bundle);
                }
                Intent intent = activity.getIntent();
                wj50.m88279p(intent);
                if (bundle == null && wj50.m88271j(intent.getAction(), "android.intent.action.MAIN") && (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory("android.intent.category.LEANBACK_LAUNCHER"))) {
                    w6j0Var.m87294e(t2j0.f216577a);
                    break;
                } else if (bundle == null && wj50.m88271j(intent.getAction(), "android.intent.action.VIEW") && intent.getData() != null) {
                    ComponentName component = intent.getComponent();
                    if ("com.spotify.music.SpotifyMainActivity".equals(component != null ? component.getClassName() : null) && intent.getScheme() != null) {
                        if (wj50.m88271j(intent.getScheme(), pka1.f178421b) || wj50.m88271j(intent.getScheme(), "http") || wj50.m88271j(intent.getScheme(), "spotify")) {
                            String stringExtra = intent.getStringExtra("extra_deeplink_navigation_reference");
                            if (stringExtra == null || stringExtra.length() == 0) {
                                String string = UUID.randomUUID().toString();
                                intent.putExtra("extra_deeplink_navigation_reference", string);
                                w6j0Var.m87294e(new s2j0(string));
                                intent.putExtra("extra_deeplink_navigation_logged", true);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        switch (this.f246423a) {
            case 0:
                ((wza) this.f246424b).f256544b.remove(activity.getLocalClassName());
                break;
            case 3:
                if (activity instanceof cwf) {
                    d631 d631Var = (d631) this.f246424b;
                    pc0 pc0Var = d631Var.f45561a;
                    qr60[] qr60VarArr = d631.f45560f;
                    qr60 qr60Var = qr60VarArr[0];
                    pc0Var.m39516c(qr60VarArr[0], d631Var, g6f.m43696J0((List) pc0Var.f61172a, activity));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [p.gh00, p.qe70] */
    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        switch (this.f246423a) {
            case 0:
                ((wza) this.f246424b).f256544b.add(activity.getLocalClassName());
                break;
            case 3:
                d631 d631Var = (d631) this.f246424b;
                pc0 pc0Var = d631Var.f45561a;
                if (activity instanceof cwf) {
                    qr60[] qr60VarArr = d631.f45560f;
                    qr60 qr60Var = qr60VarArr[0];
                    pc0Var.m39516c(qr60VarArr[0], d631Var, g6f.m43701O0(activity, (List) pc0Var.f61172a));
                    d631Var.f45564d.invoke(activity);
                    break;
                }
                break;
        }
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f246423a) {
            case 2:
                Iterator it = ((t6j0) this.f246424b).f217567b.iterator();
                while (it.hasNext()) {
                    ((n8j0) it.next()).mo58675d(bundle);
                }
                break;
        }
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        switch (this.f246423a) {
            case 1:
                ((g1s) ((er70) this.f246424b).get()).onActivityStarted(activity);
                break;
        }
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        switch (this.f246423a) {
            case 1:
                ((g1s) ((er70) this.f246424b).get()).onActivityStopped(activity);
                break;
        }
    }
}
