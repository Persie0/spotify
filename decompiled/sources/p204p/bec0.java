package p204p;

import android.view.View;
import android.view.WindowInsets;
import com.spotify.music.R;
import com.spotify.puffin.setup.setupflow.manualselect.p136ui.ManualSelectView;

/* JADX INFO: loaded from: classes2.dex */
public final class bec0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ManualSelectView f26329a;

    public bec0(ManualSelectView manualSelectView) {
        this.f26329a = manualSelectView;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i = swd1.m79536g(null, windowInsets).f214650a.mo51806g(527).f53851d;
        c7j c7jVar = new c7j();
        ManualSelectView manualSelectView = this.f26329a;
        c7jVar.m31736f(manualSelectView);
        c7jVar.m31738h(R.id.devices_recyclerview, 4, 0, 4, i);
        c7jVar.m31738h(R.id.cant_find_headphones_button, 4, 0, 4, i);
        c7jVar.m31733b(manualSelectView);
        return windowInsets;
    }
}
