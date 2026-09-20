package com.spotify.android.permissionsimpl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p204p.anm0;
import p204p.bme;
import p204p.bnm0;
import p204p.cbm0;
import p204p.dme;
import p204p.el4;
import p204p.f710;
import p204p.fnm0;
import p204p.ja5;
import p204p.na6;
import p204p.p69;
import p204p.qan0;
import p204p.ran0;
import p204p.wj50;
import p204p.xgg1;
import p204p.xoc1;
import p204p.zam0;
import p204p.ze0;
import p204p.zon0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m24212d2 = {"Lcom/spotify/android/permissionsimpl/PermissionsRequestActivity;", "Landroid/app/Activity;", "", "Lp/anm0;", "Lp/dme;", "<init>", "()V", "p/kwg1", "src_main_java_com_spotify_android_permissionsimpl-permissionsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@SuppressLint({"Registered"})
public final class PermissionsRequestActivity extends Activity implements anm0, dme {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f2945d = 0;

    /* JADX INFO: renamed from: a */
    public ran0 f2946a;

    /* JADX INFO: renamed from: b */
    public boolean f2947b = true;

    /* JADX INFO: renamed from: c */
    public final bme f2948c = new bme();

    @Override // p204p.dme
    /* JADX INFO: renamed from: V */
    public final void mo3255V(zam0 zam0Var, fnm0 fnm0Var) {
        this.f2948c.mo3255V(zam0Var, fnm0Var);
    }

    @Override // p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return new bnm0(f710.m40939g(xgg1.m90662N1("REQUESTPERMISSIONS", "requestpermissions", 1597, "requestpermissions"), xoc1.f263905I2.m86091c(), 4));
    }

    @Override // p204p.dme
    /* JADX INFO: renamed from: n */
    public final void mo3256n(zam0 zam0Var, fnm0 fnm0Var) {
        this.f2948c.mo3256n(zam0Var, fnm0Var);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String[] stringArrayExtra;
        super.onCreate(bundle);
        if (bundle != null || (stringArrayExtra = getIntent().getStringArrayExtra("REQUESTED_PERMISSIONS")) == null) {
            return;
        }
        na6.m63960h("empty permissions list", !(stringArrayExtra.length == 0));
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("permission_rationale", "") : null;
        boolean booleanExtra = getIntent().getBooleanExtra("permission_rationale_always_show", false);
        for (String str : stringArrayExtra) {
            wj50.m88279p(str);
            booleanExtra |= ze0.m95955u0(this, str);
        }
        if (!booleanExtra || string == null || string.length() == 0) {
            ze0.m95954t0(this, stringArrayExtra, 49374);
            return;
        }
        setContentView(R.layout.empty_layout);
        setFinishOnTouchOutside(false);
        qan0 qan0Var = new qan0(this, R.style.Theme_Glue_Dialog_ToS);
        qan0Var.f274913b = true;
        qan0Var.f274916e = string;
        ja5 ja5Var = new ja5(16, this, stringArrayExtra);
        qan0Var.f274917f = getResources().getText(R.string.ok_with_exclamation_mark);
        qan0Var.f274918g = ja5Var;
        qan0Var.f274920i = new zon0(this, stringArrayExtra);
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90662N1 = xgg1.m90662N1("DIALOG_REQUESTPERMISSIONS_SHOWRATIONALE", "dialog/requestpermissions/showrationale", 475, "dialog");
        fnm0 fnm0VarM86091c = xoc1.f263905I2.m86091c();
        qan0Var.f186905j = this;
        qan0Var.f186906k = cbm0VarM90662N1;
        qan0Var.f186907l = fnm0VarM86091c;
        ran0 ran0VarM72474i = qan0Var.m72474i();
        this.f2946a = ran0VarM72474i;
        ran0VarM72474i.show();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ran0 ran0Var = this.f2946a;
        if (ran0Var == null || !ran0Var.isShowing()) {
            return;
        }
        this.f2947b = false;
        ran0 ran0Var2 = this.f2946a;
        wj50.m88279p(ran0Var2);
        ran0Var2.dismiss();
        this.f2946a = null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        el4 el4Var = new el4(strArr, iArr);
        Intent intent = new Intent();
        intent.putExtra("permission_result", el4Var);
        setResult(-1, intent);
        finish();
    }

    @Override // p204p.dme
    /* JADX INFO: renamed from: p */
    public final p69 mo3257p() {
        return this.f2948c.f28511a;
    }
}
