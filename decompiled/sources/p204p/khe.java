package p204p;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class khe implements ctx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122632a;

    /* JADX INFO: renamed from: b */
    public final Activity f122633b;

    public /* synthetic */ khe(int i, Activity activity) {
        this.f122632a = i;
        this.f122633b = activity;
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: a */
    public final dtx0 mo33851a(ViewGroup viewGroup) {
        switch (this.f122632a) {
            case 0:
                View viewInflate = LayoutInflater.from(this.f122633b).inflate(R.layout.button_clear_search_history, viewGroup, false);
                wj50.m88279p(viewInflate);
                return new lhe(viewInflate, (Button) viewInflate.findViewById(R.id.clear_search_history_button), 0);
            default:
                View viewInflate2 = LayoutInflater.from(this.f122633b).inflate(R.layout.button_see_all, viewGroup, false);
                wj50.m88279p(viewInflate2);
                return new lhe(viewInflate2, (Button) viewInflate2.findViewById(R.id.see_all_button), 1);
        }
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: b */
    public final Class mo33852b() {
        switch (this.f122632a) {
            case 0:
                return ypx0.class;
            default:
                return pqx0.class;
        }
    }

    @Override // p204p.ctx0
    /* JADX INFO: renamed from: c */
    public final int mo33853c() {
        switch (this.f122632a) {
            case 0:
                return 10;
            default:
                return 9;
        }
    }
}
