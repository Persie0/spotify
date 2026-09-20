package p204p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.localfiles.localfilesmonorepo.AddedLocalFile;
import com.spotify.localfiles.localfilesmonorepo.AudioMimeIntentChecker;
import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;

/* JADX INFO: loaded from: classes7.dex */
public final class vba0 implements ap80, lx41 {

    /* JADX INFO: renamed from: a */
    public final Intent f239449a;

    /* JADX INFO: renamed from: b */
    public final kv91 f239450b;

    /* JADX INFO: renamed from: c */
    public final u190 f239451c;

    /* JADX INFO: renamed from: d */
    public final LocalFilesFeature f239452d;

    /* JADX INFO: renamed from: e */
    public final aca0 f239453e;

    /* JADX INFO: renamed from: f */
    public final luk f239454f;

    /* JADX INFO: renamed from: g */
    public final r2h0 f239455g;

    /* JADX INFO: renamed from: h */
    public di41 f239456h;

    /* JADX INFO: renamed from: i */
    public boolean f239457i;

    public vba0(Intent intent, kv91 kv91Var, u190 u190Var, LocalFilesFeature localFilesFeature, aca0 aca0Var, luk lukVar, st91 st91Var) {
        this.f239449a = intent;
        this.f239450b = kv91Var;
        this.f239451c = u190Var;
        this.f239452d = localFilesFeature;
        this.f239453e = aca0Var;
        this.f239454f = lukVar;
        this.f239455g = new r2h0(st91Var, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m85126d(vba0 vba0Var, AddedLocalFile addedLocalFile, ibk ibkVar) {
        tba0 tba0Var;
        if (ibkVar instanceof tba0) {
            tba0Var = (tba0) ibkVar;
            int i = tba0Var.f218808c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tba0Var.f218808c = i - Integer.MIN_VALUE;
            } else {
                tba0Var = new tba0(vba0Var, ibkVar);
            }
        } else {
            tba0Var = new tba0(vba0Var, ibkVar);
        }
        Object objM76981v = tba0Var.f218806a;
        int i2 = tba0Var.f218808c;
        if (i2 == 0) {
            bga.m29073P(objM76981v);
            long j = wba0.f249726a;
            g3a0 g3a0Var = new g3a0(vba0Var, addedLocalFile, null, 6);
            tba0Var.f218808c = 1;
            objM76981v = s1h1.m76981v(j, g3a0Var, tba0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76981v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76981v);
        }
        Boolean bool = (Boolean) objM76981v;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    @Override // p204p.lx41
    /* JADX INFO: renamed from: e */
    public final void mo32993e(Bundle bundle) {
        this.f239457i = bundle != null ? bundle.getBoolean("local_files_add_and_play_has_triggered") : false;
    }

    @Override // p204p.lx41
    /* JADX INFO: renamed from: f */
    public final void mo32994f(Bundle bundle) {
        bundle.putBoolean("local_files_add_and_play_has_triggered", this.f239457i);
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: m */
    public final void mo26658m() {
        String dataString;
        if (this.f239457i) {
            return;
        }
        AudioMimeIntentChecker audioMimeIntentChecker = AudioMimeIntentChecker.INSTANCE;
        Intent intent = this.f239449a;
        if (audioMimeIntentChecker.isAudioMimeIntent(intent) && (dataString = intent.getDataString()) != null) {
            di41 di41Var = this.f239456h;
            fbk fbkVar = null;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            this.f239456h = x0h1.m89578u(kk40.m56661c(this.f239454f), null, 0, new i090(this, dataString, fbkVar, 25), 3);
        }
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: n */
    public final void mo26659n() {
        di41 di41Var = this.f239456h;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }
}
