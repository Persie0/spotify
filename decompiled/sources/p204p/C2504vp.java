package p204p;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: p.vp */
/* JADX INFO: loaded from: classes18.dex */
public final class C2504vp extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SharedPreferences f243559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f243560b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2504vp(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        super(0);
        this.f243559a = sharedPreferences;
        this.f243560b = onSharedPreferenceChangeListener;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        SharedPreferences sharedPreferences = this.f243559a;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.f243560b);
        }
        return w2a1.f247311a;
    }
}
