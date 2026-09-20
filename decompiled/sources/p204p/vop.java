package p204p;

import android.content.Context;
import android.view.View;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vop implements l8a0 {

    /* JADX INFO: renamed from: a */
    public final View f243516a;

    /* JADX INFO: renamed from: b */
    public final Context f243517b;

    public vop(Context context, View view) {
        na6.m63956d(context, "Don't pass null context to constructor");
        na6.m63956d(view, "Don't pass null views to constructor");
        this.f243517b = context;
        this.f243516a = view;
    }

    @Override // p204p.l8a0
    /* JADX INFO: renamed from: a */
    public final void mo58464a() {
        this.f243516a.setVisibility(0);
    }

    @Override // p204p.l8a0
    /* JADX INFO: renamed from: b */
    public final long mo58465b() {
        return this.f243517b.getResources().getInteger(R.integer.loading_view_delay_before_showing_throbber);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vop) && ((vop) obj).f243516a == this.f243516a;
    }

    public final int hashCode() {
        return this.f243516a.hashCode();
    }
}
