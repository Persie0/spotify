package p204p;

import android.view.ViewGroup;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class jrd extends bz90 {

    /* JADX INFO: renamed from: a */
    public final b5n f115143a;

    /* JADX INFO: renamed from: b */
    public final kv91 f115144b;

    /* JADX INFO: renamed from: c */
    public final lt91 f115145c;

    public jrd(b5n b5nVar, kv91 kv91Var, lt91 lt91Var) {
        this.f115143a = b5nVar;
        this.f115144b = kv91Var;
        this.f115145c = lt91Var;
    }

    @Override // p204p.bz90
    /* JADX INFO: renamed from: a */
    public final void mo30980a(dkv0 dkv0Var, yt90 yt90Var, String str) {
        st90 st90Var = (st90) yt90Var;
        ((hrd) dkv0Var).f94412U0.setValue(new dzc(st90Var.f213861b, str, st90Var.f213864e, st90Var.f213862c, st90Var.f213863d));
    }

    @Override // p204p.bz90
    /* JADX INFO: renamed from: b */
    public final dkv0 mo30981b(ViewGroup viewGroup, gh00 gh00Var) {
        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.chat_section_height);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, dimensionPixelSize));
        return new hrd(composeView, this.f115143a.m28176a(), new ird(0, viewGroup), this.f115144b, this.f115145c);
    }
}
