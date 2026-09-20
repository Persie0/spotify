package p204p;

import android.view.View;
import android.widget.Button;
import com.spotify.puffin.sharedui.views.DisconnectedView;

/* JADX INFO: loaded from: classes10.dex */
public final class u8t0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final DisconnectedView f228015a;

    /* JADX INFO: renamed from: b */
    public final Button f228016b;

    public u8t0(DisconnectedView disconnectedView, Button button) {
        this.f228015a = disconnectedView;
        this.f228016b = button;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f228015a;
    }
}
