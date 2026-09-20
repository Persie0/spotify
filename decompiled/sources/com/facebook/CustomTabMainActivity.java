package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p204p.aba0;
import p204p.axi0;
import p204p.ebm;
import p204p.edb;
import p204p.fbm;
import p204p.n0b1;
import p204p.nbm;
import p204p.o4a;
import p204p.p2l;
import p204p.p8y;
import p204p.tz40;
import p204p.vk9;
import p204p.vpj;
import p204p.xvb;
import p204p.y8a0;
import p204p.yjg1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f1653c = 0;

    /* JADX INFO: renamed from: a */
    public boolean f1654a = true;

    /* JADX INFO: renamed from: b */
    public o4a f1655b;

    /* JADX INFO: renamed from: a */
    public final void m1425a(Intent intent, int i) {
        Bundle bundle;
        o4a o4aVar = this.f1655b;
        if (o4aVar != null) {
            aba0.m25342a(this).m25345d(o4aVar);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                Uri uri = Uri.parse(stringExtra);
                bundle = n0b1.m63346E(uri.getQuery());
                bundle.putAll(n0b1.m63346E(uri.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent intentM27415e = axi0.m27415e(getIntent(), bundle, null);
            if (intentM27415e != null) {
                intent = intentM27415e;
            }
            setResult(i, intent);
        } else {
            setResult(i, axi0.m27415e(getIntent(), null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        int i;
        vk9 vk9Var;
        boolean z;
        Uri uriM63361a;
        super.onCreate(bundle);
        if ("CustomTabActivity.action_customTabRedirect".equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_action")) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
        String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
        String stringExtra3 = getIntent().getStringExtra("CustomTabMainActivity.extra_targetApp");
        int[] iArrM38551G = edb.m38551G(2);
        int length = iArrM38551G.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = 1;
                break;
            }
            i = iArrM38551G[i2];
            if (y8a0.m93101f(i).equals(stringExtra3)) {
                break;
            } else {
                i2++;
            }
        }
        if (ebm.f57962a[edb.m38547C(i)] == 1) {
            vk9Var = new tz40(stringExtra, bundleExtra);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            if (stringExtra.equals("oauth")) {
                uriM63361a = n0b1.m63361a(yjg1.m93924p(), "oauth/authorize", bundleExtra);
            } else {
                uriM63361a = n0b1.m63361a(yjg1.m93924p(), p8y.m69346d() + "/dialog/" + stringExtra, bundleExtra);
            }
            if (!p2l.f173365a.contains(vk9Var)) {
                try {
                    vk9Var.f242171b = uriM63361a;
                } catch (Throwable th) {
                    p2l.m68953a(vk9Var, th);
                }
            }
        } else {
            vk9Var = new vk9(stringExtra, bundleExtra);
        }
        if (p2l.f173365a.contains(vk9Var)) {
            z = false;
        } else {
            try {
                ReentrantLock reentrantLock = fbm.f67855d;
                reentrantLock.lock();
                nbm nbmVar = fbm.f67854c;
                fbm.f67854c = null;
                reentrantLock.unlock();
                vpj vpjVarM92223k = new xvb(nbmVar).m92223k();
                ((Intent) vpjVarM92223k.f243701b).setPackage(stringExtra2);
                try {
                    vpjVarM92223k.m86160d(this, (Uri) vk9Var.f242171b);
                    z = true;
                } catch (ActivityNotFoundException unused) {
                    z = false;
                }
            } catch (Throwable th2) {
                p2l.m68953a(vk9Var, th2);
            }
        }
        this.f1654a = false;
        if (!z) {
            setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
            finish();
        } else {
            o4a o4aVar = new o4a(this, 9);
            this.f1655b = o4aVar;
            aba0.m25342a(this).m25343b(o4aVar, new IntentFilter("CustomTabActivity.action_customTabRedirect"));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ("CustomTabMainActivity.action_refresh".equals(intent.getAction())) {
            aba0.m25342a(this).m25344c(new Intent("CustomTabActivity.action_destroy"));
            m1425a(intent, -1);
        } else if ("CustomTabActivity.action_customTabRedirect".equals(intent.getAction())) {
            m1425a(intent, -1);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f1654a) {
            m1425a(null, 0);
        }
        this.f1654a = true;
    }
}
