package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class swr implements pjv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wwr f214709a;

    public swr(wwr wwrVar) {
        this.f214709a = wwrVar;
    }

    @Override // p204p.pjv0
    /* JADX INFO: renamed from: a */
    public final void mo32996a(View view) {
        view.setAlpha(1.0f);
        view.setClickable(true);
        view.setLongClickable(true);
    }

    @Override // p204p.pjv0
    /* JADX INFO: renamed from: b */
    public final void mo32997b(View view) {
        wwr wwrVar = this.f214709a;
        wwrVar.m89214e(view, wwrVar.f255825f, wwrVar.f255826g);
    }
}
