package p204p;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: p.wp */
/* JADX INFO: loaded from: classes18.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2543wp implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sir0 f253628a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1786dq f253629b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SharedPreferences f253630c;

    public SharedPreferencesOnSharedPreferenceChangeListenerC2543wp(sir0 sir0Var, C1786dq c1786dq, SharedPreferences sharedPreferences) {
        this.f253628a = sir0Var;
        this.f253629b = c1786dq;
        this.f253630c = sharedPreferences;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f253628a.mo30231j(this.f253629b.m36593d(this.f253630c));
    }
}
